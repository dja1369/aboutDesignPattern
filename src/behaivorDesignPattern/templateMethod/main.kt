package src.behaivorDesignPattern.templateMethod

fun main() {
    val game = Baseball()
    game.play()
    println("=====================================")
    val game2 = Football()
    game2.play()
}