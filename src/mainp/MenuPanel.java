package mainp;

import menuTables.*;
import cart.Cart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MenuPanel extends JPanel {
    public static Cart cart;
    public MenuPanel(){
        cart = new Cart();
        setBounds(0,0,400,600);
        setBackground(Color.orange);
        setLayout(null);
        List<Table> tables;
        tables = new ArrayList<>();

        CoffeeTable CTable = new CoffeeTable();
        DrinkTable DTable = new DrinkTable();
        BakeryTable BTable = new BakeryTable();
        ProductTable PTable = new ProductTable();
        tables.add(CTable);
        tables.add(DTable);
        tables.add(BTable);
        tables.add(PTable);


        int x=0;
        for(Table table : tables){
            add(table);
            JButton TableBtn = new JButton(table.getTableName());
            TableBtn.setBounds(x,0,100,100);
            TableBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    for(Table discloseTable: tables) {
                        discloseTable.setVisible(false);
                    }
                    table.setVisible(true);
                }
            });
            x+=100;
            add(TableBtn);
      }




        JButton CoffeeBtn = new JButton("Coffee");
        CoffeeBtn.setBounds(0,0,100,100);
        CoffeeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CTable.setVisible(true);
            }
        });
        add(CoffeeBtn);

        JButton DrinkBtn = new JButton("Drink");
        DrinkBtn.setBounds(100,0,100,100);
        DrinkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(DrinkBtn);
        JButton BakeryBtn = new JButton("Bakery");
        BakeryBtn.setBounds(200,0,100,100);
        BakeryBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(BakeryBtn);


        JButton ProductBtn = new JButton("Product");
        ProductBtn.setBounds(300,0,100,100);
        ProductBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(ProductBtn);


        JButton CartBtn = new JButton("Cart");
        CartBtn.setBounds(100,700,200,60);
        add(CartBtn);


        setVisible(true);
    }
}
