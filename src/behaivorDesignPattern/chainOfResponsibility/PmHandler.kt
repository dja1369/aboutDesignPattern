package src.behaivorDesignPattern.chainOfResponsibility

class PmHandler: AbstractHandler() {
    override fun handle(request: String): String {
        return if (request =="PM") {
            "PM is handled by PmHandler"
        } else {
            println("PmHandler can't handle $request")
            super.handle(request)
        }
    }

}