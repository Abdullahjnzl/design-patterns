package structural.decorator;

public class SMSNotificationDecorator extends NotificationDecorator {
    public SMSNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void send() {
        decoratedNotification.send();
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending SMS notification: " + getMessage());
    }
}
