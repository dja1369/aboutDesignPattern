package src.structureDesignPattern.bridge

fun main() {
    val radioRemote: Remote = RemoteController(Radio())
    radioRemote.power()
    radioRemote.volumeUp()
    radioRemote.channelUp()
    radioRemote.power()
//    remote.volumeDown()   // Error: Device is not enabled

    val tvRemote = RemoteController(TV())
    tvRemote.power()
    tvRemote.volumeUp()
    tvRemote.channelUp()
    tvRemote.power()
//    tvRemote.volumeDown()   // Error: Device is not enabled
}