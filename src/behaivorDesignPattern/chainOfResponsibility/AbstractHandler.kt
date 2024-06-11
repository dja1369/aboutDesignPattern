package src.behaivorDesignPattern.chainOfResponsibility

abstract class AbstractHandler: Handler {
    private var nextHandler: Handler? = null
    override fun setNext(handler: Handler): Handler {
        nextHandler = handler
        return nextHandler!!
    }
    override fun handle(request: String): String {
        return if (nextHandler != null) nextHandler!!.handle(request) else "No handler found"
    }
}