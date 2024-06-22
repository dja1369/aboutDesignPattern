package src.structureDesignPattern.facade

data class FloatType(
    override val value: Float
): Types<Float> {
    override fun toString(): String {
        return "FloatType(value=$value)"
    }
}
