fun main() {
    val kendaraan = arrayOf("mitsubisi", "lamborghini", "verari", "toyota")
    kendaraan[2] = "honda"

    if ("lamborghini" in kendaraan) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    for (x in kendaraan) {
        println(x)
    }
    println(kendaraan[2])
    println(kendaraan.size)
}