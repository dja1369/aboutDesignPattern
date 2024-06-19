package src.behaivorDesignPattern.strategy

interface Payment {
    fun pay(amount: Int): String
}