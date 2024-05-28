
class NonThreadSafeSingleton {
    private constructor(value: String) {
        val name = value
    }

    companion object {
        private var instance: NonThreadSafeSingleton? = null

        fun getInstance(): NonThreadSafeSingleton {
            if (instance == null) {
                instance = NonThreadSafeSingleton()
            }
            return instance!
        }
    }
    fun getName(): String {
        return this.name
    }
}

fun test() {
//    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton()  // Error
    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("ho")
    val singleton2: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("bo")

    println(singleton.getName())    // ho
    println(singleton2.getName())   // ho
}

fun testGivenValue(){
    val singleton: NonThreadSafeSingleton = NonThreadSafeSingleton.getInstance("boo")
    println(singleton.getName())    // boo
}

class TestThread: Runnable {
    override fun run() {
        testGivenValue()
    }
}

Thread(TestThread()).start()
test()
