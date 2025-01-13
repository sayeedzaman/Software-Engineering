public class PassengerAdopter implements Passenger{
    ImposterPassenger imposterPassenger;

    public PassengerAdopter(String work){
        if(work.equalsIgnoreCase("poisoning")){
            imposterPassenger  = new Imposter();
        }
        else if(work.equalsIgnoreCase("humanJob")){
            imposterPassenger = new Imposter();
        }

    }
    @Override
    public void doWork(String name, String Work) {
        if(Work.equalsIgnoreCase("poisoning")){
            imposterPassenger.doMonsterJob(name);
        }
        else if(Work.equalsIgnoreCase("humanJob")){
            imposterPassenger.doHumanJob(name);
        }
    }
}
