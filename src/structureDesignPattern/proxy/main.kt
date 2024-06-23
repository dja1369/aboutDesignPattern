package src.structureDesignPattern.proxy

fun main() {
    val proxyInternetHostingService = ProxyInternetHostingService()

    println(proxyInternetHostingService.connectTo("www.google.com"))
    println(proxyInternetHostingService.connectTo("www.google.com"))
    println(proxyInternetHostingService.connectTo("www.naver.com"))
    println(proxyInternetHostingService.connectTo("www.yahoo.com"))
    println(proxyInternetHostingService.connectTo("www.amazon.com"))

    println(proxyInternetHostingService.allConnectInternet)
}