fun main() {
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculateResult(valueA, valueB, valueC)
    val resultB = calculateResult(valueA, valueB, null)

    println("""
        ResultA is $resultA
        ResultB is $resultB
    """.trimIndent())
}

fun calculateResult(valueA: Int, valueB: Int, valueC: Int?): Int {
    val nilai = valueC ?: 50
    val result = valueA + (valueB - nilai)
    return result
}