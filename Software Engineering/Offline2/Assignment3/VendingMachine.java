public class VendingMachine {
    State SoldOutState;
    State SoldState;
    State NoOrder;
    State HasOrder;
    State LessMoney;

    State state = SoldOutState;
    int count = 0;
    int price = 0;

    VendingMachine(int ProductNumber, int ProductPrice ){
        SoldOutState = new SoldOut(this);
        SoldState = new Sold(this);
        NoOrder = new NoOrder(this);
        HasOrder = new HasOrder(this);
        LessMoney = new LessMoney(this);

        this.count = ProductNumber;
        this.price = ProductPrice;

        if(ProductNumber > 0 ){
            state = NoOrder;
        }
    }
    public void insertMoney(){

        state.insertMoney();
    }
    public void lessMoney(){
        state.lessMoney();
    }
    public void AccurateAmount(){
        state.accurateAmount();
    }
    public void releaseProduct(){
        if(count != 0){
            count --;
        }
        System.out.println("The product has come ");
    }
    public int getCount(){
        return count;
    }

    public void setState(State state ){
        this.state = state;
    }
    public State getSoldOutState() {
        return SoldOutState;
    }

    public State getSoldState() {
        return SoldState;
    }

    public State getNoOrder() {
        return NoOrder;
    }

    public State getHasOrder() {
        return HasOrder;
    }
    public State getLessMoney(){
        return LessMoney;
    }
}
