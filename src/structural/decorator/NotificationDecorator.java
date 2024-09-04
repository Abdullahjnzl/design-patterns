package structural.decorator;

// Abstract Decorator
abstract class NotificationDecorator implements Notification {
    protected Notification decoratedNotification;

    public NotificationDecorator(Notification decoratedNotification) {
        this.decoratedNotification = decoratedNotification;
    }

    @Override
    public String getMessage() {
        return decoratedNotification.getMessage();
    }

    @Override
    public void send() {
        decoratedNotification.send();
    }
}
