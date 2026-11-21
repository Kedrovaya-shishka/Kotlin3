// Задание 21.2, вариант 21

private fun readDouble(prompt: String): Double {
    while (true) {
        print(prompt)
        readlnOrNull()?.trim()?.replace(',', '.')?.toDoubleOrNull()?.let { return it }
        println("Введите вещественное число")
    }
}

fun solveLinear(a: Double, b: Double, c: Double): Double? {
    if (a == 0.0) return null
    return (c - b) / a
}

fun main() {
    println("=== Корень уравнения ax + b = c ===")
    val a = readDouble("Введите a: ")
    val b = readDouble("Введите b: ")
    val c = readDouble("Введите c: ")
    val x = solveLinear(a, b, c)
    if (x == null) {
        println("Уравнение не имеет решения (a = 0)")
    } else {
        println("x = %.4f".format(x))
    }
}
