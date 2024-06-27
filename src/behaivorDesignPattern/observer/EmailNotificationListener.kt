package src.behaivorDesignPattern.observer

class EmailNotificationListener: EventListener{
    override fun update(eventType: EventType, data: String) {
        println("Email to notify: $data")
    }
}