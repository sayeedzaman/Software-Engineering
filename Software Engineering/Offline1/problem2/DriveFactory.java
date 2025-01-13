public class DriveFactory extends AbstractFactory{
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
        return null;
    }

    @Override
    public DriveTrains getDrives(String car) {
        if(car == null) return null;
        if(car.equalsIgnoreCase("Tesla")){
            return new AllWheel();
        }
        else if(car.equalsIgnoreCase("BMW")||car.equalsIgnoreCase("Toyota")){
            return new RearWheel();
        }
        return null;
    }
}
