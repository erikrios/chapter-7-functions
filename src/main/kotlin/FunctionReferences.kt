fun main() {
    listOf(1, 2, 3, 4).map(::addTwo)
}
fun addTwo(x: Int) = x  + 2