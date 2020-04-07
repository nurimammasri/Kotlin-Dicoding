fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    fun printLetter(): String {
        return "First letter is $firstChar and $lastChar for second letter"
    }
    println(printLetter())
}

fun String.getFirstAndLast(): Map<String, Char> {
    return mapOf("first" to 'K', "last" to 'n')
}