public class Tesla implements CarCompanies{
    private String car;
    private String Manufacturer;
    Tesla(){
        car="Tesla";
        Manufacturer = "US";
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
