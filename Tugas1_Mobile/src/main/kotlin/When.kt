fun main() {
    val day = 2

    val result = when (day) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"

        else -> "Invalid day."
    }
    println(result)

}