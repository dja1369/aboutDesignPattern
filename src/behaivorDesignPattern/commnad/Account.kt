package src.behaivorDesignPattern.commnad

data class Account(
    private val owner: String,
    private var balance: Int
) {
    val getBalance: Int
        get() = balance
    val getOwner: String
        get() = owner

    fun deposit(amount: Int) {
        balance += amount
        println("$owner deposited $amount. Balance: $balance")
    }

    fun withdraw(amount: Int) {
        if (amount > balance) {
            throw Exception("Insufficient funds")
        }
        balance -= amount
        println("$owner withdrew $amount. Balance: $balance")
    }
}
