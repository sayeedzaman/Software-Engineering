
public class FactoryCreator {
    public static AbstractFactory getFactory(String ch){
        if(ch.equalsIgnoreCase("Car")){
            return new CarFaactory();
        }
        else if(ch.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        else if(ch.equalsIgnoreCase("Engine")){
            return new Enginefactory();
        }
        else if (ch.equalsIgnoreCase("Drive")){
            return new DriveFactory();
        }
        return null;
    }

}
