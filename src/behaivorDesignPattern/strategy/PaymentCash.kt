package src.behaivorDesignPattern.strategy

class PaymentCash: Payment {
    override fun pay(amount: Int): String {
        return "Paid $amount using cash"
    }
}