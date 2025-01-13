public class Toyota implements CarCompanies{
    private String car;
    private String Manufacturer;
    Toyota(){
        car="Toyota";
        Manufacturer = "Japan";
    }

    @Override
    public String getCarName() {
        return  car;
    }

    @Override
    public String getLocation() {
        return Manufacturer;
    }
}
