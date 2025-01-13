import java.util.Scanner;

public class VMMain {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(5, 100);
        while (vm.getCount() != 0) {
            System.out.println("Your inserted amount ");
            Scanner scn = new Scanner(System.in);
            int returnedMoney = 0;
            int givenAmount = scn.nextInt();
            vm.insertMoney();
            while (givenAmount < vm.price) {
                //vm.lessMoney();
                //System.out.println("r");
                returnedMoney = vm.price - givenAmount;
                System.out.println("You need to pay more " + returnedMoney);
                System.out.println(givenAmount);
                givenAmount += scn.nextInt();
               // System.out.println(givenAmount);

            }
            if (givenAmount > vm.price) {
                vm.releaseProduct();
                returnedMoney = givenAmount - vm.price;
                System.out.println("Your " + returnedMoney + " Amount is returned");
            } else {
                vm.releaseProduct();
            }

            System.out.println("Product in The Vending Machine : "+ vm.getCount());
        }
    }
}
