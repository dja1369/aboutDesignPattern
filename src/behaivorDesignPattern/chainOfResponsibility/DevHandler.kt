package src.behaivorDesignPattern.chainOfResponsibility

class DevHandler: AbstractHandler() {
    override fun handle(request: String): String {
        return if (request == "Dev") {
            "Dev is handled By DevHandler"
        } else {
            println("DevHandler can't handle $request")
            super.handle(request)
        }
    }
}