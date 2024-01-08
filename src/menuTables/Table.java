package menuTables;

import Items.Item;
import cart.Cart;
import mainp.MenuPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Table extends JPanel {
    private List<Item> itemList;
    String name;
    int y = 0;
    int x = 0;
    public Table(String name) {
        this.name = name;
        setBounds(0,100,400,500);
        setLayout(null);
        this.itemList = new ArrayList<>();
    }

    public String getTableName(){
        return name;
    }

    public void addProduct(Item item){
        this.itemList.add(item);
    }

    public void makeButtons(){
        for(Item item : this.itemList){
            JButton btn = new JButton(item.getName());
            btn.setBounds(x,y,80,80);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MenuPanel.cart.addCart(item);
                }
            });
            x+=80;
            if(x>=400){
                y+=80;
                x=0;
            }
            add(btn);


        }

        }

    }

