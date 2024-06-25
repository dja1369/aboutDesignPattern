package src.behaivorDesignPattern.commnad

fun main() {
    val account = Account("John Doe", 1000)
    val deposit = DepositCommand(account, 100)
    val withdrawal = WithdrawalCommand(account, 200)

    val transaction = TransactionManager()
    try{
        transaction.executeCommand(deposit)
        for (i in 1..10) {
            transaction.executeCommand(withdrawal)
        }
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
    println("Owner: ${account.getOwner}")
    println("Final balance: ${account.getBalance}")

}