package src.structureDesignPattern.facade

data class IntegerType(
    override val value: Int,
): Types<Int> {
    override fun toString(): String {
        return "IntegerType(value=$value)"
    }
}