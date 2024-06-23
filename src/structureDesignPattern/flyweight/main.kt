package src.structureDesignPattern.flyweight

fun main() {
    val flyweightFactory = FlyweightFactory()
    val flyweight1 = flyweightFactory.getFlyweight("A")
    val flyweight2 = flyweightFactory.getFlyweight("B")
    val flyweight3 = flyweightFactory.getFlyweight("A")
    val flyweight4 = flyweightFactory.getFlyweight(1)
    val flyweight5 = flyweightFactory.getFlyweight(2)
    val flyweight6 = flyweightFactory.getFlyweight(1)
    val flyweight7 = flyweightFactory.getFlyweight(1f)
    val flyweight8 = flyweightFactory.getFlyweight(2f)
    val flyweight9 = flyweightFactory.getFlyweight(1f)

    println(flyweight1 == flyweight2) // false
    println(flyweight1 == flyweight3) // true
    println(flyweight2 == flyweight3) // false
    println(flyweight4 == flyweight5) // false
    println(flyweight4 == flyweight6) // true
    println(flyweight5 == flyweight6) // false
    println(flyweight7 == flyweight8) // false
    println(flyweight7 == flyweight9) // true
    println(flyweight8 == flyweight9) // false

    println(flyweightFactory.getAllFlyweights())
// {A=Flyweight(value=A), B=Flyweight(value=B), 1=Flyweight(value=1), 2=Flyweight(value=2), 1.0=Flyweight(value=1.0), 2.0=Flyweight(value=2.0)}
}