package src.behaivorDesignPattern.observer

fun main() {
    // init
    val eventManagerOne = EventManager()
    val eventManagerTwo = EventManager()

    val appOne = ContentApp(eventManagerOne)
    val appTwo = ContentApp(eventManagerTwo)

    val logNotificationListener = LogNotificationListener()
    val emailNotificationListener = EmailNotificationListener()

    // app1 register Email
    eventManagerOne.subscribe(EventType.COMMENT, emailNotificationListener)
    eventManagerOne.subscribe(EventType.LIKE, emailNotificationListener)

    // app2 register All
    eventManagerTwo.subscribe(EventType.COMMENT, logNotificationListener)
    eventManagerTwo.subscribe(EventType.COMMENT, emailNotificationListener)
    eventManagerTwo.subscribe(EventType.LIKE, logNotificationListener)
    eventManagerTwo.subscribe(EventType.LIKE, emailNotificationListener)

    // action
    appOne.createComment()
    appOne.createLike()
    println("====================================")

    appTwo.createComment()
    appTwo.createLike()

}