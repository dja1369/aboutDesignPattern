package src.behaivorDesignPattern.chainOfResponsibility

fun main() {
    val devHandler = DevHandler()
    val pmHandler = PmHandler()
    val designHandler = DesignHandler()
    var query = "Design"
    devHandler.setNext(pmHandler).setNext(designHandler)
    println(devHandler.handle(query))
    println("=====================================")
    query = "PM"
    println(devHandler.handle(query))
    println("=====================================")
    query = "Missing"
    println(devHandler.handle(query))
}