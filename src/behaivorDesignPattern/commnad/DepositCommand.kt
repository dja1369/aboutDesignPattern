package src.behaivorDesignPattern.commnad

class DepositCommand(
    private val account: Account,
    private val amount: Int
): Command {
    override fun execute() {
        account.deposit(amount)
    }

    override fun undo() {
        account.withdraw(amount)
    }
}