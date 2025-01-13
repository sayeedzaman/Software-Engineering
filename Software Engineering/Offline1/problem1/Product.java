import java.util.LinkedList;

public class Product {
    private LinkedList<String > parts;
    int price=0;
    Product(){
        parts = new LinkedList<String>();

    }
    public void Add(String part){
        Product p = new Product();
        parts.addLast(part);
        price+= p.price;
    }
    public void show(){
        System.out.println("\nProduct completed as below :");
        for(int i = 0; i< parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
