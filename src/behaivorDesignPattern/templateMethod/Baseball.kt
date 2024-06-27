package src.behaivorDesignPattern.templateMethod

class Baseball: AbstractGame(){
    override fun initialize() {
        println("Baseball Game Initialized! Start playing.")
    }

    override fun startPlay() {
        println("Baseball Game Started. Enjoy the game!")
    }

    override fun endPlay() {
        println("Baseball Game Finished!")
    }
}