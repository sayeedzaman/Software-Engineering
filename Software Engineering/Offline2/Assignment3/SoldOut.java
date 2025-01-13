public class SoldOut implements State{
    VendingMachine vm;

    SoldOut(VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void insertMoney() {
        System.out.println("Sorry , We are Out of Product");
    }

    @Override
    public void lessMoney() {
        System.out.println("Sorry , We are Out of Product");
    }

    @Override
    public void accurateAmount() {
        System.out.println("Sorry , We are Out of Product");
    }

    @Override
    public void moreMoney() {
        System.out.println("Sorry , We are Out of Product");

    }
}
