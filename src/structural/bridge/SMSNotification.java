package structural.bridge;

// Refined abstraction for SMS Notification
public class SMSNotification extends Notification {
    public SMSNotification(DeliveryMethod deliveryMethod) {
        super(deliveryMethod);
    }

    @Override
    public void send(String message, String recipient) {
        deliveryMethod.deliver(message, recipient);
    }
}
