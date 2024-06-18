package src.creationDesignPattern.prototype

data class User(
    var name: String,
    val age: Int,
): ProtoType {
    override fun clone(): ProtoType {
        return copy()
    }

    override fun toString(): String {
        return "ShallowUser(name='$name', age=$age)"
    }
}
