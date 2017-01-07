package MetaMarket.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by astaver on 12/31/2016.
 */
public class Fields {

    public static JTextField callsReceivedJTextField, ticketsOpenedJTextField, ticketsClosedJTextField, vpnRequestsJTextField, getNotesJTextArea ;

    public static JComboBox userSelect;

    public static JTextArea notesJTextArea;

    //---------------------------------------------------

    public static JTextField getCallsReceivedJTextField(){
        callsReceivedJTextField = new JTextField();
        callsReceivedJTextField.setBounds(200,70,90,23);
        callsReceivedJTextField.setHorizontalAlignment(JTextField.RIGHT);
        return callsReceivedJTextField;
    }

    public static String callsReceivedString(){
        return callsReceivedJTextField.getText();
    }

    public void setCallsField(JTextField newTextField){
        callsReceivedJTextField = newTextField;
    }

    //---------------------------------------------------
    public static JTextField getTicketsOpenedJTextField(){
        ticketsOpenedJTextField = new JTextField();
        ticketsOpenedJTextField.setBounds(200, 100, 90, 23);
        ticketsOpenedJTextField.setHorizontalAlignment(JTextField.RIGHT);
        //ticketsOpenedJTextField.setColumns(10);
        return ticketsOpenedJTextField;
    }

    public static String openedString(){
        return ticketsOpenedJTextField.getText();
    }

    public void setOpenedField(JTextField newTextField){
        ticketsOpenedJTextField = newTextField;
    }
    //----------------------------------------------------



    public static JTextField getTicketsClosedJTextField(){
        ticketsClosedJTextField = new JTextField();
        ticketsClosedJTextField.setBounds(200,130,90,23);
        ticketsClosedJTextField.setHorizontalAlignment(JTextField.RIGHT);
        return ticketsClosedJTextField;
    }

    public static String closedString(){
        return ticketsClosedJTextField.getText();
    }

    public void setClosedField(JTextField newTextField){
        ticketsClosedJTextField = newTextField;
    }

    //----------------------------------------------------

    public static JTextField getVpnRequestsJTextField(){
        vpnRequestsJTextField = new JTextField();
        vpnRequestsJTextField.setBounds(200, 160, 90, 23);
        vpnRequestsJTextField.setHorizontalAlignment(JTextField.RIGHT);
        return vpnRequestsJTextField;
    }

    public static String vpnString(){
        return vpnRequestsJTextField.getText();
    }

    public void setVPNField(JTextField newTextField){
        vpnRequestsJTextField = newTextField;
    }

    //-----------------------------------------------------

    public static JTextArea getNotesJTextArea(){
        notesJTextArea = new JTextArea();
        notesJTextArea.setBounds(8,250,280,200);
        notesJTextArea.setLineWrap(true);
        notesJTextArea.setWrapStyleWord(true);
        notesJTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
        return notesJTextArea;
    }

    public static String notesString(){
        return notesJTextArea.getText();
    }

    public void setNotesField(JTextArea newTextArea){
        notesJTextArea = newTextArea;
    }

    //-----------------------------------------------------

    public static JComboBox getUserSelection(){

        String[] userStrings = {" ", "Aaron", "Brandon", "Jenni", "Lindsey", "Nathan", "Ryan", "Theresa"};

        userSelect = new JComboBox(userStrings);
        userSelect.setBounds(109,32,180,23);
        userSelect.setBackground(Color.PINK);
        return userSelect;
    }

    public static String userString(){
        return userSelect.getSelectedItem().toString();
    }

    public void setSelect(JComboBox newComboBox){
        userSelect = newComboBox;
    }
}
