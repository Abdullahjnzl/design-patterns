package structural.bridge;

// Concrete implementation 2
public class SMSDelivery implements DeliveryMethod {
    @Override
    public void deliver(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
