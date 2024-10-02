public class HouseKeeping implements HotelService {
    private String roomNumber;

    public HouseKeeping(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String serveClient() {
        return "Housekeeping is on the way to clean room " + roomNumber + ".";
    }

    public String cleanRoom() {
        return serveClient();
    }
}