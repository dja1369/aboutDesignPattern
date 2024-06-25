package src.behaivorDesignPattern.commnad

class WithdrawalCommand(
    private val account: Account,
    private val amount: Int
): Command {
    override fun execute() {
        account.withdraw(amount)
    }

    override fun undo() {
        account.deposit(amount)
    }
}