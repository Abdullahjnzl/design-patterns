package structural.facade;

public class OrderFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;
    private Notification notification;

    public OrderFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
        this.notification = new Notification();
    }

    public void placeOrder(String item, int quantity, String paymentMethod, double amount) {
        System.out.println("Placing order for " + quantity + " " + item + "(s).");

        if (inventory.checkStock(item, quantity)) {
            if (payment.processPayment(paymentMethod, amount)) {
                inventory.updateStock(item, quantity);
                shipping.arrangeShipping(item, quantity);
                notification.sendConfirmation("Order placed successfully for " + quantity + " " + item + "(s).");
            } else {
                System.out.println("Payment failed. Order cannot be processed.");
            }
        } else {
            System.out.println("Stock unavailable. Order cannot be processed.");
        }
    }
}
