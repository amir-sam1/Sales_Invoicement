package actions;
import Model.InvoiceHeader;
import Model.InvoiceHeaderJTableModel;
import Model.InvoiceLine;
import Model.InvoiceLineJTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import sales.SaveLineDialog;
import sales.createNewInvoice;
import sales.start;

public class buttons_action {
    private start frame;
    private DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // day - month - year

    public buttons_action(start frame) {this.frame = frame;}

    public void displayNewInvoiceDialog() {
        frame.setNewInvoiceDialog(new createNewInvoice(frame));
        frame.getNewInvoiceDialog().setVisible(true);
    }

    public void insertButtonInDialog() {
        String customerNameDialogString = frame.getNewInvoiceDialog().getCustomerNameJText().getText();
        String dateDialogString = frame.getNewInvoiceDialog().getInvoiceDateJText().getText();

        frame.getNewInvoiceDialog().setVisible(false);
        frame.getNewInvoiceDialog().dispose();
        frame.setNewInvoiceDialog(null);

        try {
            Date dateDialog = dateFormat.parse(dateDialogString);
            int invoiceNumber = getNextInvoiceNumberDialog();
            InvoiceHeader invoiceHeader = new InvoiceHeader(invoiceNumber, customerNameDialogString, dateDialog);
            frame.getInvoicesHeaderList().add(invoiceHeader);
            frame.getInvoiceHeaderJTableModel().fireTableDataChanged();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(frame, "Wrong date format", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        displayInvoices();
    }

    public int getNextInvoiceNumberDialog() {
        int max = 0;
        for (InvoiceHeader header : frame.getInvoicesHeaderList()) {
            if (header.getInvoiceNumber() > max) {
                max = header.getInvoiceNumber();
            }
        }
        return max + 1;
    }

    public void displayInvoices() {
        System.out.println("===========================");
        for (InvoiceHeader header : frame.getInvoicesHeaderList()) {
            System.out.println(header);
        }
        System.out.println("===========================");
    }

    public void cancelButtonInDialog() {
        frame.getNewInvoiceDialog().setVisible(false);
        frame.getNewInvoiceDialog().dispose();
        frame.setNewInvoiceDialog(null);
    }

    public void deleteInvoiceButton() {
        int invoiceIndex = frame.getInvoiceJTable().getSelectedRow();
        InvoiceHeader header = frame.getInvoiceHeaderJTableModel().getInvoicesHeaderList().get(invoiceIndex);
        frame.getInvoiceHeaderJTableModel().getInvoicesHeaderList().remove(invoiceIndex);
        frame.getInvoiceHeaderJTableModel().fireTableDataChanged();
        frame.setInvoiceLineJTableModel(new InvoiceLineJTableModel(new ArrayList<InvoiceLine>()));
        frame.getInvoiceItem().setModel(frame.getInvoiceLineJTableModel());
        frame.getInvoiceLineJTableModel().fireTableDataChanged();
        frame.getCustomerName().setText("");
        frame.getInvoiceDate().setText("");
        frame.getInvoiceNumber().setText("");
        frame.getInvoiceTotal().setText("");
    }

    public void displaySaveButtonNewLineDialog() {
        frame.setSaveLineDialog(new SaveLineDialog(frame));
        frame.getSaveLineDialog().setVisible(true);
    }

    public void okButtonNewLineInDialog() {

        int itemNumber = InvoiceHeaderJTableModel.ItemNumberInt;
        String itemNameString = frame.getSaveLineDialog().getItemNameJText().getText();
        String itemCountString = frame.getSaveLineDialog().getItemCountJText().getText();
        String itemPriceString = frame.getSaveLineDialog().getItemPriceJText().getText();

        frame.getSaveLineDialog().setVisible(false);
        frame.getSaveLineDialog().dispose();
        frame.setSaveLineDialog(null);

        int itemCountInt = Integer.parseInt(itemCountString);
        double itemPriceDouble = Double.parseDouble(itemPriceString);
        int headerIndexInt = frame.getInvoiceJTable().getSelectedRow();
        InvoiceHeader invoice = frame.getInvoiceHeaderJTableModel().getInvoicesHeaderList().get(headerIndexInt);

        InvoiceLine invoiceLine = new InvoiceLine(itemNumber, itemNameString, itemPriceDouble, itemCountInt, invoice);
        invoice.addInvoiceLine(invoiceLine);
        frame.getInvoiceLineJTableModel().fireTableDataChanged();
        frame.getInvoiceHeaderJTableModel().fireTableDataChanged();
        frame.getInvoiceTotal().setText("" + invoice.getInvoiceTotal());
        displayInvoices();
    }

    public void cancelButtonNewLineInDialog() {
        frame.getSaveLineDialog().setVisible(false);
        frame.getSaveLineDialog().dispose();
        frame.setSaveLineDialog(null);
    }

    public void cancelButton() {
        int lineIndex = frame.getInvoiceItem().getSelectedRow();
        InvoiceLine line = frame.getInvoiceLineJTableModel().getInvoicesLinesList().get(lineIndex);
        frame.getInvoiceLineJTableModel().getInvoicesLinesList().remove(lineIndex);
        frame.getInvoiceLineJTableModel().fireTableDataChanged();
        frame.getInvoiceHeaderJTableModel().fireTableDataChanged();
        frame.getInvoiceTotal().setText("" + line.getInvoiceHeader().getInvoiceTotal());
    }
}
