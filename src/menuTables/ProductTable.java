package menuTables;

import Items.Product;

public class ProductTable extends Table{
    public ProductTable(){
        super("Product");

        this.addProduct(new Product("Coffeebean",3000,401));


        this.makeButtons();
    }
}
