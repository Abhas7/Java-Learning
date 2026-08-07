public class ShoppingCart {
    private String[] products;

    public void add(String product) {

    } 

    public void checkout() {

    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("Iphone"); 
        cart.add("Ipad");
        cart.add("Ipod");
        cart.add("Marker");
    
        cart.checkout();
    }

}
