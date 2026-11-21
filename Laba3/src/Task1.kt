// Задание 21.1, вариант 21

private fun readDouble(prompt: String): Double {
    while (true) {
        print(prompt)
        readlnOrNull()?.trim()?.replace(',', '.')?.toDoubleOrNull()?.let { return it }
        println("Введите вещественное число")
    }
}

fun sumOfSquares(a: Double, b: Double): Double = a * a + b * b

fun main() {
    println("=== Сумма квадратов чисел ===")
    val a = readDouble("Введите a: ")
    val b = readDouble("Введите b: ")
    println("a² + b² = %.4f".format(sumOfSquares(a, b)))
}
