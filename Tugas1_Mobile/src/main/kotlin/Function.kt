fun myFunction(nama: String, qty: Int) {
    println(nama + " sebanyak " + qty)
}
fun myFunction(a: Int, b: Int) = a * b
fun main() {
    myFunction("apel", 17)
    myFunction("mangga", 20)
    myFunction("jeruk", 19)

    var result = myFunction(12, 5)
    println(result)
}