public class LessMoney implements State {

    VendingMachine vm ;
    LessMoney(VendingMachine vm){
        this.vm = vm;
    }
    @Override
    public void insertMoney() {
        System.out.println("you need to insert correct amount of money");
    }

    @Override
    public void lessMoney() {
        System.out.println("You have again inserted less money");
    }

    @Override
    public void accurateAmount() {
        System.out.println("your produc5t will be delivered");
    }

    @Override
    public void moreMoney() {
        System.out.println("You will get your money back");
    }
}
