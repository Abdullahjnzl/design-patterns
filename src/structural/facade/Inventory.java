package structural.facade;

class Inventory {
    public boolean checkStock(String item, int quantity) {
        System.out.println("Checking stock for " + quantity + " " + item + "(s).");
        // Assume stock is available
        return true;
    }

    public void updateStock(String item, int quantity) {
        System.out.println("Updating stock for " + quantity + " " + item + "(s).");
    }
}