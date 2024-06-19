package src.behaivorDesignPattern.strategy

fun main() {
    val order = Order(payment = null)
    val givenCreditAmount = mapOf("credit" to 100)
    val givenCashAmount = mapOf("cash" to 100)

    if (givenCreditAmount.containsKey("credit")) {
        order.setPaymentStrategy(PaymentCredit())
        println(order.payProcess(givenCreditAmount["credit"]!!))
    } else if (givenCashAmount.containsKey("cash")) {
        order.setPaymentStrategy(PaymentCash())
        println(order.payProcess(givenCashAmount["cash"]!!))
    }

    if (givenCashAmount.containsKey("cash")) {
        order.setPaymentStrategy(PaymentCash())
        println(order.payProcess(givenCashAmount["cash"]!!))
    } else if (givenCreditAmount.containsKey("credit")) {
        order.setPaymentStrategy(PaymentCredit())
        println(order.payProcess(givenCreditAmount["credit"]!!))
    }
}