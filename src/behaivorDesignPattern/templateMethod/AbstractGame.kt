package src.behaivorDesignPattern.templateMethod

abstract class AbstractGame {
    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()
}