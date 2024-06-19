package src.behaivorDesignPattern.strategy

class Order(
    private var payment: Payment?
) {
    fun setPaymentStrategy(payment: Payment) {
        this.payment = payment
    }
    fun payProcess(amount: Int): String = payment!!.pay(amount)
}