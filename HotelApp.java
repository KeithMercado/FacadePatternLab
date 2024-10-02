public class HotelApp {
    public static void main(String[] args) {
        HotelService valet = new Valet("XYZ-345");
        HotelService houseKeeping = new HouseKeeping("404");
        HotelService cart = new Cart(3);

        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        System.out.println(frontDesk.valetService());
        System.out.println(frontDesk.houseKeepingService());
        System.out.println(frontDesk.cartService());
    }
}