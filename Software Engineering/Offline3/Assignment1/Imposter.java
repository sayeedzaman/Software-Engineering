public class Imposter implements ImposterPassenger {

    @Override
    public void doHumanJob(String name) {
        //System.out.println(name+"did the job ");
        System.out.println(name+" did it");
    }

    @Override
    public void doMonsterJob(String name) {
        System.out.println(name+" did this maintenance");
    }
}
