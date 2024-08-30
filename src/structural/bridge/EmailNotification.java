package structural.bridge;

// Refined abstraction for Email Notification
public class EmailNotification extends Notification {
    public EmailNotification(DeliveryMethod deliveryMethod) {
        super(deliveryMethod);
    }

    @Override
    public void send(String message, String recipient) {
        deliveryMethod.deliver(message, recipient);
    }
}
