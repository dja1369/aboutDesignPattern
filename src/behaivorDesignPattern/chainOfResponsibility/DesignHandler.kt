package src.behaivorDesignPattern.chainOfResponsibility

class DesignHandler: AbstractHandler() {
    override fun handle(request: String): String {
        return if (request == "Design") {
            "Design is handled by DesignHandler"
        }
        else {
            println("DesignHandler can't handle $request")
            super.handle(request)
        }
    }

}