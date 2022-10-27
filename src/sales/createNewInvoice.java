package sales;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class createNewInvoice extends JDialog  {

    private JLabel invoiceDateJLabel;
    private JTextField invoiceDateJText;
    private JLabel customerNameJLabel;
    private JTextField customerNameJText;
    private JButton insertJB;
    private JButton cancelJB;

    public createNewInvoice(start frame) {

        setTitle("Create New Invoice");
        setLocation(300, 300);

        customerNameJLabel = new JLabel("Customer Name");
        customerNameJText = new JTextField(15);

        invoiceDateJLabel = new JLabel("Invoice Date");
        invoiceDateJText = new JTextField(15);

        insertJB = new JButton("Insert");
        insertJB.setActionCommand("InsertButtonInDialog");
        insertJB.addActionListener(frame.getListner());

        cancelJB = new JButton("Cancel");
        cancelJB.setActionCommand("CancelButtonInDialog");
        cancelJB.addActionListener(frame.getListner());

        setLayout(new GridLayout(3, 2, 15, 15));

        add(customerNameJLabel);
        add(customerNameJText);

        add(invoiceDateJLabel);
        add(invoiceDateJText);

        add(insertJB);
        add(cancelJB);

        pack();
    }



    public JTextField getCustomerNameJText() {return customerNameJText;}

    public JTextField getInvoiceDateJText() {return invoiceDateJText;}
}