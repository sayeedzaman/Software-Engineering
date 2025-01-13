public class NoOrder implements State{
    VendingMachine vm ;

    NoOrder(VendingMachine vm ){
        this.vm = vm;
    }
    @Override
    public void insertMoney() {
        System.out.println("Your order is in progress ");
        vm.setState(vm.getHasOrder());
    }

    @Override
    public void lessMoney() {
        System.out.println("You need to pay more ");
    }

    @Override
    public void accurateAmount() {

    }

    @Override
    public void moreMoney() {

    }
}
