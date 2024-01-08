package mainp;

import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu(){
        setSize(400,800);
        MenuPanel menuP = new MenuPanel();
        add(menuP);
        setVisible(true);

    }


}
