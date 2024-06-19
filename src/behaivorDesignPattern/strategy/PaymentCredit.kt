package src.behaivorDesignPattern.strategy

class PaymentCredit: Payment{
    override fun pay(amount: Int): String {
        return "Paid $amount using credit card"
    }
}