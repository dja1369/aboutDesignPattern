class ThreadSafeClassSingleton private constructor(value: String) {
    private val name: String = value
    companion object{
        private var instance: ThreadSafeClassSingleton? = null

        @Synchronized
        fun getInstance(value: String): ThreadSafeClassSingleton {
            if (instance == null) {
                instance = ThreadSafeClassSingleton(value)
            }
            return instance!!
        }
    }
    fun getName(): String {
        return this.name
    }
}

class ThreadFoo : Runnable {
    override fun run() {
        val singleton = ThreadSafeClassSingleton.getInstance("FOO")
        println(singleton.getName())
    }
}

class ThreadBar : Runnable {
    override fun run() {
        val singleton = ThreadSafeClassSingleton.getInstance("BAR")
        println(singleton.getName())
    }
}

fun main(){
    Thread(ThreadFoo()).start()
    Thread(ThreadBar()).start()
}
