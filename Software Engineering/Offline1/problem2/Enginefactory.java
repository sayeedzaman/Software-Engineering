public class Enginefactory extends AbstractFactory{

    @Override
    public CarCompanies getCar(String loc) {
        return null;
    }

    @Override
    public Color getCol(String car) {
        return null;
    }

    @Override
    public Engine getEngine(String car) {
        if(car == null) return null;
        else if(car.equalsIgnoreCase("Toyota")) {
            return new HydrogenFuelEngine();
        }
        else if(car.equalsIgnoreCase("Tesla")||car.equalsIgnoreCase("BMW")){
            return new ElectricEngine();
        }
        return null;
    }

    @Override
    public DriveTrains getDrives(String car) {
        return null;
    }
}
