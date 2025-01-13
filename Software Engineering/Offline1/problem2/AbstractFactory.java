abstract class AbstractFactory {
    public abstract CarCompanies getCar(String loc);
    public abstract Color getCol(String car);
    public abstract Engine getEngine(String car);
    public abstract DriveTrains getDrives(String car);
}
