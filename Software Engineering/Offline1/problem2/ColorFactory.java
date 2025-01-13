
public class ColorFactory extends AbstractFactory{
    @Override
    public CarCompanies getCar(String loc) {
        return null;
    }

    @Override
    public Color getCol(String car) {
        if(car == null) return null;
        else if(car.equalsIgnoreCase("BMW")){
            return new Black();
        }
        else if (car.equalsIgnoreCase("Toyota")){
            return new Red();
        }
        else if(car.equalsIgnoreCase("Tesla")){
            return new White();
        }
            return null;
    }

    @Override
    public Engine getEngine(String car) {
        return null;
    }

    @Override
    public DriveTrains getDrives(String car) {
        return null;
    }
}
