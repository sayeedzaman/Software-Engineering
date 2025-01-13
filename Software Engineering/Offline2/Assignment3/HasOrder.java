public class HasOrder implements State{
    VendingMachine vm;

    HasOrder (VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void insertMoney() {
        System.out.println("One order is in progress , Please wait ");
    }

    @Override
    public void lessMoney() {
        System.out.println("you cannot give money ");
        vm.setState(vm.getLessMoney());
    }

    @Override
    public void accurateAmount() {
        System.out.println("you cannot give money ");
        vm.setState(vm.getSoldState());
    }

    @Override
    public void moreMoney() {
        System.out.println("you cannot give money ");
        vm.setState(vm.getSoldState());
    }
}
