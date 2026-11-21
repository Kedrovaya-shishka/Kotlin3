// Задание 21.3, вариант 21

import java.time.Year

private fun readInt(prompt: String): Int {
    while (true) {
        print(prompt)
        readlnOrNull()?.trim()?.toIntOrNull()?.takeIf { it > 0 }?.let { return it }
        println("Введите положительное целое число")
    }
}

fun calculateQ(apartments: Int, yearBuilt: Int, currentYear: Int = Year.now().value): Int =
    apartments + 2 * (currentYear - yearBuilt)

fun calculateQp(Q: Int, district: String): Double =
    if (district.trim().lowercase() == "центр") 2.0 * Q else 0.5 * Q

fun main() {
    println("=== Оценка дома ===")
    val houseNumber = readInt("Номер дома: ")
    val apartments  = readInt("Число квартир: ")
    val yearBuilt   = readInt("Год сооружения: ")

    val Q = calculateQ(apartments, yearBuilt)
    println("\nДом №$houseNumber: квартир = $apartments, год = $yearBuilt")
    println("Q = $Q")

    println()
    print("Район (центр / окраина): ")
    val district = readlnOrNull().orEmpty().trim()

    val Qp = calculateQp(Q, district)
    println("Qp = %.2f".format(Qp))
}
