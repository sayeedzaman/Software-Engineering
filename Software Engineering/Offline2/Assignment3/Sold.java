public class Sold implements State{

    VendingMachine vm;

    Sold(VendingMachine vm ){
        this.vm = vm;
    }
    @Override
    public void insertMoney() {
        System.out.println("You have inserted  money");
        //vm.setState(vm.getHasOrder());
    }

    @Override
    public void lessMoney() {
        System.out.println("you cannot give money ");
    }

    @Override
    public void accurateAmount() {
        System.out.println("you cannot give money ");
    }

    @Override
    public void moreMoney() {
        System.out.println("you cannot give money ");

    }
}
