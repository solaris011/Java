public class Product {
    private String name;
    private double price;
    private int quantity;
    
    
    public Product (String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct() {
        // Banana, price 1.1, 13 pcs
        System.out.println(name + ", price " + price + ", " + quantity + " pcs");
    }
}
