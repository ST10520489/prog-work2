public class RoadAccidentReport extends RoadAccident {
    public RoadAccidentReport(String AccidentVehicleType, String City, int AccidentTotal) {
        super(AccidentVehicleType, City, AccidentTotal);
    }

    @Override
    public void printAccidentReport() {
        System.out.println("Vehicle Type: " + getAccidentVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Accident Total: " + getAccidentTotal());

    }
}
