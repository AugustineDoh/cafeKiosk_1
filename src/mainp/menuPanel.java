package mainp;

import javax.swing.*;
import java.awt.*;

public class menuPanel extends JPanel {

    public menuPanel(){
        setBounds(0,0,400,600);
        setBackground(Color.orange);
        setLayout(null);
        JButton CoffeeBtn = new JButton("Coffee");
        CoffeeBtn.setBounds(0,0,100,100);
        add(CoffeeBtn);
        JButton DrinkBtn = new JButton("Drink");
        DrinkBtn.setBounds(100,0,100,100);
        add(DrinkBtn);
        JButton BakeryBtn = new JButton("Bakery");
        BakeryBtn.setBounds(200,0,100,100);
        add(BakeryBtn);
        JButton ProductBtn = new JButton("Product");
        ProductBtn.setBounds(300,0,100,100);
        add(ProductBtn);


        JButton CartBtn = new JButton("Cart");
        CartBtn.setBounds(100,700,200,60);
        add(CartBtn);


        setVisible(true);
    }
}
