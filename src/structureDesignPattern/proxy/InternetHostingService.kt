package src.structureDesignPattern.proxy

class InternetHostingService: Internet {
    private var internet: String? = null
    val publicInternet: String?
        get() = internet

    override fun connectTo(serverHost: String): String {
        internet?.let{
            return "Already connected to $it"
        }
        internet = serverHost
        return "Connecting to $serverHost"
    }
    override fun toString(): String {
        return "InternetHostingService: $internet"
    }

}