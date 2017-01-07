package MetaMarket.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Date;

import MetaMarket.GUI.UserInput;
/**
 * Created by astaver on 12/31/2016.
 */
public class Buttons extends JButton {


    public static JButton createLogButton() {
        JButton logJButton = new JButton();
        logJButton.setBounds(10, 455, 135, 23);
        logJButton.setText("Log Shift Report");
        logJButton.setBackground(Color.PINK);
        return logJButton;
    }


    public static JButton createUpdateButton() {
        JButton updateJButton = new JButton();
        updateJButton.setBounds(155, 455, 135, 23);
        updateJButton.setText("Update");
        updateJButton.setBackground(Color.PINK);
        return updateJButton;
    }


}


