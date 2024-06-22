package src.structureDesignPattern.facade

data class StringType(
    override val value: String,
): Types<String> {
    override fun toString(): String {
        return "StringType(value=$value)"
    }
}