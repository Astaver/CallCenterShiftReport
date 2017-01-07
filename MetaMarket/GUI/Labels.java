package MetaMarket.GUI;

import javax.swing.*;

/**
 * Created by astaver on 12/31/2016.
 */
public class Labels {

    public static JLabel getUserJLabel(){
        JLabel selectUserJLabel = new JLabel();
        selectUserJLabel.setBounds(8,32,90,23);
        selectUserJLabel.setText("Name: ");
        return selectUserJLabel;
    }

    public static JLabel getCallsReceivedJLabel(){
        JLabel callsReceivedJLabel = new JLabel();
        callsReceivedJLabel.setBounds(8, 70, 150, 23);
        callsReceivedJLabel.setText("Calls Received: ");
        return  callsReceivedJLabel;
    }

    public static JLabel getTicketsOpenedJLabel(){
        JLabel ticketsOpenedJLabel = new JLabel();
        ticketsOpenedJLabel.setBounds(8,100,175,23);
        ticketsOpenedJLabel.setText("Number of Tickets Opened: ");
        return ticketsOpenedJLabel;
    }

    public static JLabel getTicketsClosedJLabel(){
        JLabel ticketsClosedJLabel = new JLabel();
        ticketsClosedJLabel.setBounds(8, 130, 175, 23);
        ticketsClosedJLabel.setText("Number of Tickets Closed: ");
        return ticketsClosedJLabel;
    }

    public static JLabel getVpnRequestsJLabel(){
        JLabel vpnRequestsJLabel = new JLabel();
        vpnRequestsJLabel.setBounds(8, 160, 175, 23);
        vpnRequestsJLabel.setText("VPN Requests Received: ");
        return vpnRequestsJLabel;
    }

    public static JLabel getNotesJLabel(){
        JLabel notesJLabel = new JLabel();
        notesJLabel.setBounds(100,220,175,23);
        notesJLabel.setText("Additional Comments: ");
        return notesJLabel;
    }

    public static JLabel getCreditsJLabel(){
        JLabel credits = new JLabel();
        credits.setBounds(70, 476, 175, 23);
        credits.setText("Developed by Aaron Staver");
        return credits;
    }
}
