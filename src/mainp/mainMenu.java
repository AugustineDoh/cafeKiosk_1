package mainp;

import javax.swing.*;
import java.awt.*;
import mainp.menuPanel;

public class mainMenu extends JFrame {

    public mainMenu(){
    setSize(400,800);
    menuPanel menuP = new menuPanel();
    add(menuP);
    setVisible(true);


    }


}
