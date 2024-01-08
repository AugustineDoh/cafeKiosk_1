package Items;

public class Item {
    String name;
    double price;
    int item_code;
    public Item(String name, double price, int item_code){
        this.name=name;
        this.price=price;
        this.item_code=item_code;
    }

    public String getName(){
        return this.name;
    }

}
