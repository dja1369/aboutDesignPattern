package src.creationDesignPattern.builder

class Navigator {
    private var destination: String = "Current Location Information"

    fun setDestination(destination: String = ""): String {
        if (destination.isEmpty()) return this.destination
        this.destination = destination
        return this.destination
    }

    fun getDestination(): String {
        return this.destination
    }
}