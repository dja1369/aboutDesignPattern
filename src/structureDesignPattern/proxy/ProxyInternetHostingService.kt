package src.structureDesignPattern.proxy

class ProxyInternetHostingService: Internet {
    private val internetList: MutableList<InternetHostingService> = mutableListOf()
    val allConnectInternet: String
        get() = "All InternetList: ${internetList.map { it.publicInternet!! }}"
    override fun connectTo(serverHost: String): String {
        val interHostingService = internetList.firstOrNull { it.publicInternet == serverHost }
            ?: InternetHostingService().apply {
                internetList.add(this)
            }
        return interHostingService.connectTo(serverHost)
        }
    }

