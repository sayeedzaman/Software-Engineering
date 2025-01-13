import java.io.IOException;

import java.util.Scanner;

public class CarManufacturer {
    public static void main(String[] args) throws NullPointerException {
        Scanner scn = new Scanner(System.in);
        String loc = scn.next();
        AbstractFactory carfactory = FactoryCreator.getFactory("Car");
        CarCompanies car = carfactory.getCar(loc);
        String carname = car.getCarName();
        String manufacturer = car.getLocation();
        System.out.println(carname);
        System.out.println(manufacturer);
        String Color = scn.next();
        AbstractFactory colorfactory = FactoryCreator.getFactory(Color);
        Color col = colorfactory.getCol(carname);
        String color = col.color;
        System.out.println(color);
        String Engine = scn.next();
        AbstractFactory enginefactory = FactoryCreator.getFactory(Engine);
        Engine eng = enginefactory.getEngine(carname);
        String engine = eng.engine;
        System.out.println(engine);
        String drivetrains = scn.next();
        AbstractFactory drivefactory = FactoryCreator.getFactory(drivetrains);
        DriveTrains d = drivefactory.getDrives(carname);
        String drives = d.drive;
        System.out.println(drives);

    }
}
