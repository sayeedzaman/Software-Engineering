

public class CarFaactory extends AbstractFactory{
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
        return null;
    }

    @Override
    public CarCompanies getCar(String loc) {
        if (loc == null) return null;
        if (loc.equalsIgnoreCase("Asia")) {
            return (CarCompanies) new Toyota();
        } else if (loc.equalsIgnoreCase("Europe")) {
            return new BMW();
        } else if (loc.equalsIgnoreCase("UnitedStates")) {
            return new Tesla();
        }
        return null;
    }
}
