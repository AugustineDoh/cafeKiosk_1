package menuTables;

import Items.Bakery;

public class BakeryTable extends Table{
    public BakeryTable(){
        super("Bakery");

        this.addProduct(new Bakery("Croissant",2000,301));

        this.makeButtons();
    }
}
