package MetaMarket;

import MetaMarket.GUI.UserInput;
//import MetaMarket.GUI.DisplayInput;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    UserInput inputPanel = new UserInput();


    public Main(){
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        this.setLayout(null);
        this.setSize(1200,800);
        this.setTitle("My Shift Report");
        contentPane.add(inputPanel.getUserInput());
        contentPane.add(inputPanel.getDisplayInput());


        this.setVisible(true);
    }

    public static void main(String[] args) {
	    Main application = new Main();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
