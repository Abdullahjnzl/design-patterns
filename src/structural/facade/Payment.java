package structural.facade;

class Payment {
    public boolean processPayment(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " using " + paymentMethod + ".");
        // Assume payment is successful
        return true;
    }
}