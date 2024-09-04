package structural.decorator;

public class LoggingNotificationDecorator extends NotificationDecorator {
    public LoggingNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send() {
        logNotification();
        decoratedNotification.send();
    }

    private void logNotification() {
        System.out.println("Logging notification: " + getMessage());
    }
}