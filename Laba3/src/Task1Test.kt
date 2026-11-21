// Тесты к заданию 21.1

fun main() {
    var passed = 0
    var failed = 0

    fun check(name: String, expected: Double, actual: Double, eps: Double = 1e-9) {
        if (Math.abs(expected - actual) < eps) {
            println("PASS: $name")
            passed++
        } else {
            println("FAIL: $name  =>  ожидалось $expected, получено $actual")
            failed++
        }
    }

    println("=== Тесты: сумма квадратов ===")
    check("3² + 4² = 25",         expected = 25.0,  actual = sumOfSquares(3.0, 4.0))
    check("0² + 0² = 0",          expected = 0.0,   actual = sumOfSquares(0.0, 0.0))
    check("1² + 1² = 2",          expected = 2.0,   actual = sumOfSquares(1.0, 1.0))
    check("(-3)² + (-4)² = 25",   expected = 25.0,  actual = sumOfSquares(-3.0, -4.0))
    check("2.5² + 1.5² = 8.5",    expected = 8.5,   actual = sumOfSquares(2.5, 1.5))
    println()
    println("Результат: $passed пройдено, $failed провалено")
}
