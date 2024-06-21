package src.creationDesignPattern.builder

class CarBuilder: Builder {
    private var engine: Engine? = null
    private var wheels: Wheels? = null
    private var navigator: Navigator? = null

    override fun setEngine(engine: Engine): Builder {
        this.engine = engine
        return this
    }

    override fun setWheels(wheels: Wheels): Builder {
        this.wheels = wheels
        return this
    }

    override fun setNavigator(navigator: Navigator): Builder {
        this.navigator = navigator
        return this
    }

    override fun build(): Car {
        return Car(engine!!, wheels!!, navigator!!)
    }
}