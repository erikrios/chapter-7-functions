data class OperatorFunctions(val wrapped: List<Int>) {
    operator fun get(position: Int): Int = wrapped[position]
}

val a = OperatorFunctions(listOf(1, 2, 3))
// a[1] == 2