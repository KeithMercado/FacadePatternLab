public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public String serveClient() {
        return "A total of " + numberOfCarts + " luggage cart/s have been requested.";
    }

    public String requestCart() {
        return serveClient();
    }
}