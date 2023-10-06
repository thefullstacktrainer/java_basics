package revision.oops;

public class TourVehicle implements Vehicle {

    private String companyName;
    private String engineType;

    public TourVehicle(String companyName, String engineType) {
        this.companyName = companyName;
        this.engineType = engineType;
    }

    @Override
    public String getCompanyName() {
        return this.companyName;
    }

    @Override
    public String getEngineType() {
        // TODO Auto-generated method stub
        return this.engineType;
    }

    public static void main(String[] args) {
        TourVehicle t1 = new TourVehicle("Benz", "Tour");
        System.out.println(t1.getCompanyName());
        System.out.println(t1.getEngineType());
    }

}
