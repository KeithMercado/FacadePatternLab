public class FrontDesk {
    private HotelService valet;
    private HotelService houseKeeping;
    private HotelService cart;

    public FrontDesk(HotelService valet, HotelService houseKeeping, HotelService cart) {
        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public String valetService() {
        return valet.serveClient();
    }

    public String houseKeepingService() {
        return houseKeeping.serveClient();
    }

    public String cartService() {
        return cart.serveClient();
    }
}