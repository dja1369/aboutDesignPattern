
class NonThreadSafeSingleton private constructor(value: String) {
    val name: String = value
    companion object {
        private var instance: NonThreadSafeSingleton? = null

        fun getInstance(value: String): NonThreadSafeSingleton {
            if (instance == null) {
                instance = NonThreadSafeSingleton(value = value)
            }
            return instance!!
        }
    }
}

fun testGivenValue(){
    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("boo")
    println(singleton.name)    // boo
}

class TestThread: Runnable {
    override fun run() {
        testGivenValue()
    }
}

fun main() {
//    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton()  // Error

    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("ho")
    val singleton2: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("bo")

    println(singleton.name)    // ho
    println(singleton2.name)   // ho
    Thread(TestThread()).start()
}
