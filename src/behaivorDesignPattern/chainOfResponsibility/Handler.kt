package src.behaivorDesignPattern.chainOfResponsibility

interface Handler {
    fun setNext(handler: Handler): Handler
    fun handle(request: String): String
}