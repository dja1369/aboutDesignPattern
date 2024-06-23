package src.structureDesignPattern.flyweight

class FlyweightFactory {
    private val flyweights = mutableMapOf<Any, Flyweight>()
    fun getFlyweight(value: Any): Flyweight {
        return flyweights.getOrPut(value) { Flyweight(value) }
    }
    fun getAllFlyweights(): MutableMap<Any, Flyweight> {
        return flyweights
    }
}