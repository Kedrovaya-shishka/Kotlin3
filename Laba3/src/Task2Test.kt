// Тесты к заданию 21.2

fun main() {
    var passed = 0
    var failed = 0

    fun check(name: String, expected: Double?, actual: Double?, eps: Double = 1e-9) {
        if (expected == null && actual == null) {
            println("PASS: $name")
            passed++
        } else if (expected != null && actual != null && Math.abs(expected - actual) < eps) {
            println("PASS: $name")
            passed++
        } else {
            println("FAIL: $name  =>  ожидалось $expected, получено $actual")
            failed++
        }
    }

    println("=== Тесты: корень уравнения ax + b = c ===")
    check("2x + 1 = 5   =>  x = 2",      expected = 2.0,  actual = solveLinear(2.0, 1.0, 5.0))
    check("1x + 0 = 7   =>  x = 7",      expected = 7.0,  actual = solveLinear(1.0, 0.0, 7.0))
    check("3x - 6 = 0   =>  x = 2",      expected = 2.0,  actual = solveLinear(3.0, -6.0, 0.0))
    check("0.5x + 2 = 4 =>  x = 4",      expected = 4.0,  actual = solveLinear(0.5, 2.0, 4.0))
    check("-2x + 4 = 0  =>  x = 2",      expected = 2.0,  actual = solveLinear(-2.0, 4.0, 0.0))
    check("a = 0        =>  нет решения", expected = null, actual = solveLinear(0.0, 3.0, 9.0))
    println()
    println("Результат: $passed пройдено, $failed провалено")
}
