public class Passengers implements Passenger{
    PassengerAdopter passengerAdopter;
    @Override
    public void doWork(String name, String Work) {
        if(Work.equalsIgnoreCase("maintenance")){
            System.out.println(name+" did the maintenance");
        }
        else if(Work.equalsIgnoreCase("poisoning")||Work.equalsIgnoreCase("humanjob")){
            passengerAdopter = new PassengerAdopter(Work);
            passengerAdopter.doWork(name, Work);
        }
        else{
            System.out.println("This work cannot be done!");
        }
    }
}
