public class CartItem {
    String itemName;
    int quantity;
    double price;

    public CartItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
    public void addToCart(){
        System.out.println("Adding " + quantity + " of " + itemName + " to cart at price $" + price);
        double totalPrice = quantity * price;
        System.out.println("Total price for this item: $" + totalPrice);
    }   
    public void removeFromCart(){
        System.out.println("Removing " + quantity + " of " + itemName + " from cart.");
        
    }
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 1, 999.99);
        item1.addToCart();
        item1.removeFromCart();
    }
}
