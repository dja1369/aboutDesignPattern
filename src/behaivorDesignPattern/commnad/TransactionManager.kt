package src.behaivorDesignPattern.commnad

class TransactionManager {
    private val transactionLogs = mutableListOf<Command>()

    fun executeCommand(command: Command) {
        try {
            command.execute()
            transactionLogs.add(command)
        } catch (e: Exception) {
            println("Error: ${e.message}")
            rollbackTransaction()
            throw e
        }
    }

    fun rollbackTransaction() {
        while (transactionLogs.isNotEmpty()) {
            val lastCommand = transactionLogs.removeLast()
            try {
                lastCommand.undo()
            } catch (e: Exception) {
                println("Error occurred while undoing command: ${e.message}")
            }
        }
    }
}