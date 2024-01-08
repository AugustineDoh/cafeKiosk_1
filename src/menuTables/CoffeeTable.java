package menuTables;

import Items.CoffeeBased;
import Items.Item;
import cart.Cart;


import javax.swing.*;
import java.util.ArrayList;

public class CoffeeTable extends Table {
    public CoffeeTable() {
        super("CoffeeBased");
        this.addProduct(new CoffeeBased("Americano", 1000, 101));
        this.addProduct(new CoffeeBased("Hot coffee", 1000, 101));
        this.addProduct(new CoffeeBased("Iced coffee", 1000, 102));
        this.addProduct(new CoffeeBased("Hot Latte", 2000, 103));
        this.addProduct(new CoffeeBased("Hot cappuccino", 3000, 105));
        this.addProduct(new CoffeeBased("Iced cappuccino", 3000, 106));



        this.makeButtons();

    }
}
