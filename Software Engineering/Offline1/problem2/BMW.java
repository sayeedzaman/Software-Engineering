public class BMW implements CarCompanies{
    private String car;
    private String Manufacturer;
    BMW(){
        car="BMW";
        Manufacturer = "Germany";
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
