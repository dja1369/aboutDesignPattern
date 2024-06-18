package src.structureDesignPattern.bridge

class TV(
    private var on: Boolean = false,
    private var volume: Int = 50,
    private var channel: Int = 1
): Device {
    override fun isEnabled(): Boolean = on

    override fun enable() {
        on = true
    }

    override fun disable() {
        on = false
    }

    override fun getVolume(): Int = volume

    override fun setVolume(percent: Int) {
        volume = percent
    }

    override fun getChannel(): Int = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }
}
