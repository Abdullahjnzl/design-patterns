package structural.decorator;

// Concrete Decorators
public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending email notification: " + getMessage());
    }
}
