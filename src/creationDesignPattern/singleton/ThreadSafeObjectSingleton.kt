object ThreadSafeObjectSingleton {
    private var count = 0
    init {
        println("Singleton instance created")
    }
    fun add(num: Int){
        this.count += num
    }
    fun getCount(): Int{
        return this.count
    }
}
fun main(){
    val obj1 = ThreadSafeObjectSingleton
    val obj2 = ThreadSafeObjectSingleton
//    val obj3 = Singleton()    // Error

    obj1.add(1)
    obj1.add(2)

    println(obj1 === obj2) // true

    println(obj1.getCount()) // 3
    println(obj2.getCount()) // 3
}

