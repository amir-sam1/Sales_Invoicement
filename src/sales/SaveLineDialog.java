package sales;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SaveLineDialog extends JDialog{
    private JLabel itemNameJLabel;
    private JTextField itemNameJText;

    private JLabel itemCountJLabel;
    private JTextField itemCountJText;

    private JLabel itemPriceJLabel;
    private JTextField itemPriceJText;

    private JButton okJB;
    private JButton cancelJB;

    public SaveLineDialog(start frame) {

        setTitle("Create New Line");
        setLocation(300, 300);

        itemNameJText = new JTextField(20);
        itemNameJLabel = new JLabel("Item Name");

        itemCountJText = new JTextField(20);
        itemCountJLabel = new JLabel("Item Count");

        itemPriceJText = new JTextField(20);
        itemPriceJLabel = new JLabel("Item Price");

        okJB = new JButton("OK");
        okJB.setActionCommand("createLineOK");
        okJB.addActionListener(frame.getListner());

        cancelJB = new JButton("Cancel");
        cancelJB.setActionCommand("createLineCancel");
        cancelJB.addActionListener(frame.getListner());

        setLayout(new GridLayout(4, 2));

        add(itemNameJLabel);
        add(itemNameJText);
        add(itemCountJLabel);
        add(itemCountJText);
        add(itemPriceJLabel);
        add(itemPriceJText);
        add(okJB);
        add(cancelJB);

        pack();
    }

    public JTextField getItemNameJText() {return itemNameJText;}

    public JTextField getItemCountJText() {return itemCountJText;}

    public JTextField getItemPriceJText() {return itemPriceJText;}
}
