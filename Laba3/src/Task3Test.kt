// Тесты к заданию 21.3

fun main() {
    var passed = 0
    var failed = 0

    fun checkInt(name: String, expected: Int, actual: Int) {
        if (expected == actual) {
            println("PASS: $name")
            passed++
        } else {
            println("FAIL: $name  =>  ожидалось $expected, получено $actual")
            failed++
        }
    }

    fun checkDouble(name: String, expected: Double, actual: Double, eps: Double = 1e-9) {
        if (Math.abs(expected - actual) < eps) {
            println("PASS: $name")
            passed++
        } else {
            println("FAIL: $name  =>  ожидалось $expected, получено $actual")
            failed++
        }
    }

    println("=== Тесты: оценка дома ===")
    checkInt("Q: 50 кв., 2000 г., 2026  =>  102",  expected = 102, actual = calculateQ(50,  2000, 2026))
    checkInt("Q: 10 кв., 2024 г., 2026  =>  14",   expected = 14,  actual = calculateQ(10,  2024, 2026))
    checkInt("Q: 0 кв.,  2026 г., 2026  =>  0",    expected = 0,   actual = calculateQ(0,   2026, 2026))
    checkInt("Q: 100 кв., 1990 г., 2026 =>  172",  expected = 172, actual = calculateQ(100, 1990, 2026))
    println()
    checkDouble("Qp центр:   Q=100 =>  200.0",    expected = 200.0, actual = calculateQp(100, "центр"))
    checkDouble("Qp окраина: Q=100 =>   50.0",    expected = 50.0,  actual = calculateQp(100, "окраина"))
    checkDouble("Qp Центр (регистр): Q=50 => 100.0", expected = 100.0, actual = calculateQp(50, "Центр"))
    checkDouble("Qp пригород: Q=80  =>   40.0",   expected = 40.0,  actual = calculateQp(80,  "пригород"))
    println()
    println("Результат: $passed пройдено, $failed провалено")
}
