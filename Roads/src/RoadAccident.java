public abstract class RoadAccident implements IRoadAccident {
    String AccidentVehicleType;
    String City;
    int AccidentTotal;

    public RoadAccident(String AccidentVehicleType, String City, int AccidentTotal)
    {
        this.AccidentVehicleType=AccidentVehicleType;
        this.City=City;
        this.AccidentTotal=AccidentTotal;

    }

    @Override
    public String getAccidentVehicleType(){
        return AccidentVehicleType;
    }
    @Override
    public String getCity(){
        return City;
    }
    @Override
    public int getAccidentTotal(){
        return AccidentTotal;
    }
    public abstract void printAccidentReport();
}


