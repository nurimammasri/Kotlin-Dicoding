fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    println("""
        String result: $stringResult
        Int result: $intResult
    """.trimIndent())
}

fun <T> getResult(args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
    }
}