package MetaMarket.TableStuff;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;

import static java.awt.SystemColor.textHighlight;

/**
 * Created by astaver on 1/1/2017.
 */
public class ZebraStripe extends DefaultTableCellRenderer {
    //private static final Color STRIPE = UIManager.getColor("textHighlight");

    private static final Color STRIPE = new Color(0.99607843f, 0.8156863f, 0.9098039f);
    private static final Color WHITE = UIManager.getColor("Table.background");

    private final JCheckBox ckb = new JCheckBox();

    public ZebraStripe(){
        setOpaque(true);
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        JComponent c = (JComponent)super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if (!isSelected)
        {
            if (row % 2 == 0)
            {
                c.setBackground(WHITE);
            }
            else
            {
                c.setBackground(STRIPE);
            }
        }

        if (value instanceof Boolean) { // Boolean
            ckb.setSelected(((Boolean) value));
            ckb.setHorizontalAlignment(JLabel.CENTER);
            ckb.setBackground(super.getBackground());
            if (isSelected || hasFocus) {
                ckb.setBackground(table.getSelectionBackground());
            }
            return ckb;
        }


        return c;
    }

}



