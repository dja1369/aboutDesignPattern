package src.structureDesignPattern.proxy

interface Internet {
    fun connectTo(serverHost: String): String
}