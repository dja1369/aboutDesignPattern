package src.creationDesignPattern.builder

object Director {
    fun constructAutoCar(builder: Builder): Car {
        builder.setEngine(AutoEngine())
        builder.setWheels(Wheels())
        builder.setNavigator(Navigator())
        return builder.build()
    }
    fun constructManualCar(builder: Builder): Car {
        builder.setEngine(ManualEngine())
        builder.setWheels(Wheels())
        builder.setNavigator(Navigator())
        return builder.build()
    }
}