public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String serveClient() {
        return "Vehicle " + plateNumber + " has been handed to the valet for parking.";
    }

    public String pickUpVehicle() {
        return serveClient();
    }
}