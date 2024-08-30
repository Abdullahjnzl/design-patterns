package structural.bridge;

// Concrete implementation 1
public class EmailDelivery implements DeliveryMethod {
    @Override
    public void deliver(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
