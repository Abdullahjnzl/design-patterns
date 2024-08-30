package structural.bridge;

// The abstraction
public abstract class Notification {
    protected DeliveryMethod deliveryMethod;

    protected Notification(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public abstract void send(String message, String recipient);
}