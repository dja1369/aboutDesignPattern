package src.creationDesignPattern.builder

interface Builder {
    fun setEngine(engine: Engine): Builder
    fun setWheels(wheels: Wheels): Builder
    fun setNavigator(navigator: Navigator): Builder
    fun build(): Car
}