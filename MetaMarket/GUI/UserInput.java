package MetaMarket.GUI;

import MetaMarket.TableStuff.ZebraStripe;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static MetaMarket.GUI.Fields.*;

/**
 * Created by astaver on 12/31/2016.
 */

public class UserInput {

    private final JPanel userInput;
    private final JPanel displayInput;

    public UserInput(){

        //set up panel
        this.userInput = new JPanel();
        userInput.setLayout(null);
        userInput.setBounds(16,16,300,500);
        userInput.setBorder(new TitledBorder("Shift Report"));


        userInput.add(Labels.getUserJLabel());
        //set up select user combo box
        userInput.add(getUserSelection());
        // set up callsReceivedJLabel
        userInput.add(Labels.getCallsReceivedJLabel());
        // set up callsReceivedJTextField
        userInput.add(Fields.getCallsReceivedJTextField());
        // set up ticketsOpenedJLabel
        userInput.add(Labels.getTicketsOpenedJLabel());
        // set up ticketsOpenedJTextField
        userInput.add(getTicketsOpenedJTextField());
        // set up ticketsClosedJLabel
        userInput.add(Labels.getTicketsClosedJLabel());
        // set up ticketsClosedJTextField
        userInput.add(getTicketsClosedJTextField());
        // set up vpnRequestJLabel
        userInput.add(Labels.getVpnRequestsJLabel());
        // set up vpnRequestJTextField
        userInput.add(getVpnRequestsJTextField());
        // set up notesJLabel
        userInput.add(Labels.getNotesJLabel());
        // set up notesJTextArea
        userInput.add(Fields.getNotesJTextArea());

        Object[] row = new Object[8];
        JTable table = new JTable();
        Object[] columns = {"Date", "Representative","Calls","Tickets Opened", "Tickets Closed", "VPN Requests", "FCR"
                ,"Comments"};
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.PINK);
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);



        JButton btnLog = Buttons.createLogButton();
        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy:HH:mm");
                Date today = new Date();
                String date = dateFormat.format(today);


                int openInt = Integer.parseInt(openedString());
                int closeInt = Integer.parseInt(closedString());
                int vpn = Integer.parseInt(vpnString());

                double trueClose = closeInt - vpn;
                double trueOpen = openInt - vpn;
                double fcr =   trueClose/trueOpen;

                NumberFormat defaultFormat = NumberFormat.getPercentInstance();
                defaultFormat.setMinimumFractionDigits(2);

                row[0] = date;
                row[1] = userString();
                row[2] = callsReceivedString();
                row[3] = openedString();
                row[4] = closedString();
                row[5] = vpnString();
                row[6] = defaultFormat.format(fcr);
                row[7] = notesString();

                model.addRow(row);

             }
        });
        userInput.add(btnLog);

        JButton btnUpdate = Buttons.createUpdateButton();
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();

                int openInt = Integer.parseInt(openedString());
                int closeInt = Integer.parseInt(closedString());
                int vpn = Integer.parseInt(vpnString());

                double trueClose = closeInt - vpn;
                double trueOpen = openInt - vpn;
                double fcr =   trueClose/trueOpen;

                NumberFormat defaultFormat = NumberFormat.getPercentInstance();
                defaultFormat.setMinimumFractionDigits(2);

                int i = table.getSelectedRow();

                if (i >= 0){
                    model.setValueAt(date, i, 0);
                    model.setValueAt(userString(), i, 1);
                    model.setValueAt(callsReceivedString(), i , 2);
                    model.setValueAt(openedString(), i , 3);
                    model.setValueAt(closedString(), i , 4);
                    model.setValueAt(vpnString(), i , 5);
                    model.setValueAt(defaultFormat.format(fcr), i, 6);
                    model.setValueAt(notesString(), i , 7);
                }

            }
        });

        userInput.add(btnUpdate);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int i = table.getSelectedRow();

                userSelect.setSelectedItem(model.getValueAt(i, 1));
                callsReceivedJTextField.setText(model.getValueAt(i, 2).toString());
                ticketsOpenedJTextField.setText(model.getValueAt(i, 3).toString());
                ticketsClosedJTextField.setText(model.getValueAt(i, 4).toString());
                vpnRequestsJTextField.setText(model.getValueAt(i, 5).toString());
                notesJTextArea.setText(model.getValueAt(i, 7).toString());

            }
        });
                userInput.add(Labels.getCreditsJLabel());
        //--------------------------------------//

        this.displayInput = new JPanel();
        displayInput.setBounds(330,16,825,700);
        displayInput.setBorder(new TitledBorder("Stuff and things"));
        displayInput.setLayout(new BorderLayout());

        displayInput.setLayout(new BorderLayout());
        displayInput.add(table.getTableHeader(), BorderLayout.PAGE_START);
        displayInput.add(table, BorderLayout.CENTER);

        JScrollPane pane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setSize(825,700);

        displayInput.add(pane);

        table.setDefaultRenderer(Object.class, new ZebraStripe());
        table.setDefaultRenderer(Boolean.class, new ZebraStripe());

    }

    public JPanel getUserInput() {
        return this.userInput;
    }

    public JPanel getDisplayInput(){
        return this.displayInput;
    }

}






