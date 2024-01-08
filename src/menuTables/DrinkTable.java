package menuTables;
import Items.Drink;
public class DrinkTable extends Table{

    public DrinkTable() {
        super("Drink");

        this.addProduct(new Drink("Lemonade",1000,201));
        this.addProduct(new Drink("coke",1000,202));
        this.addProduct(new Drink("tea",1000,203));


        this.makeButtons();
    }
}
