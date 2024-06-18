package src.structureDesignPattern.bridge

class RemoteController(
    private val device: Device
): Remote{
    override fun power() {
        device.apply {
            if(isEnabled()){
                println("${device::class.simpleName} is turning off")
                disable()
            }
            else {
                println("${device::class.simpleName} is turning on")
                enable()
            }
        }
    }

    override fun volumeUp() {
        device.apply {
            check(isEnabled()) { "Device is not enabled" }
            setVolume(getVolume() + 10)
            println("Volume: ${getVolume()}")
        }
    }

    override fun volumeDown() {
        device.apply {
            check(isEnabled()) { "Device is not enabled" }
            setVolume(getVolume() - 10)
            println("Volume: ${getVolume()}")
        }
    }

    override fun channelUp() {
        device.apply {
            check(isEnabled()) { "Device is not enabled" }
            setChannel(getChannel() + 1)
            println("Channel: ${getChannel()}")
        }
    }

    override fun channelDown() {
        device.apply {
            check(isEnabled()) { "Device is not enabled" }
            setChannel(getChannel() - 1)
            println("Channel: ${getChannel()}")
        }
    }
}