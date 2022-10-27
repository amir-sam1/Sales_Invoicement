package actions;
import Model.InvoiceHeader;
import Model.InvoiceLine;
import Model.InvoiceLineJTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import sales.close;
import sales.loadFile;
import sales.savefile;
import sales.start;

public class ImplementsListner implements ActionListener, ListSelectionListener {
    private start frame;
    private DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    close menuBarItemsAction;
    buttons_action buttonsAction;
    loadFile loadFileMenuBarAction;
    savefile saveFileMenuBarAction;
    close closeFileMenuBarAction;


    public ImplementsListner(start frame) {
        this.frame = frame;
        this.buttonsAction = new buttons_action(frame);
        this.loadFileMenuBarAction = new loadFile(frame);
        this.saveFileMenuBarAction = new savefile(frame);
        this.closeFileMenuBarAction = new close(frame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "LoadFile":
            {
                try {
                    loadFileMenuBarAction.loadFileMenuBar();
                    break;
                } catch (Exception ex) {
                    Logger.getLogger(ImplementsListner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "SaveFile" : {
                try {
                    saveFileMenuBarAction.saveFileMenuBar();
                    break;
                } catch (Exception ex) {
                    Logger.getLogger(ImplementsListner.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "CloseFile" : closeFileMenuBarAction.closeFileMenuBar(); break;
            case "CreateNewInvoiceButton" : buttonsAction.displayNewInvoiceDialog(); break;
            case "DeleteInvoiceButton" : buttonsAction.deleteInvoiceButton(); break;
            case "SaveButton" : buttonsAction.displaySaveButtonNewLineDialog(); break;
            case "CancelButton" : buttonsAction.cancelButton(); break;
            case "InsertButtonInDialog" : buttonsAction.insertButtonInDialog(); break;
            case "CancelButtonInDialog": buttonsAction.cancelButtonInDialog(); break;
            case "createLineOK" : buttonsAction.okButtonNewLineInDialog(); break;
            case "createLineCancel" : buttonsAction.cancelButtonNewLineInDialog(); break;
            default : throw new AssertionError();
        }
    }

    private void rowSelected_InvoiceTable() {

        int selectedRowIndex_InvoiceTable = frame.getInvoiceJTable().getSelectedRow();

        if (selectedRowIndex_InvoiceTable >= 0) { // row >= 0 cause don't work with negative

            // effect on data in the top right side
            InvoiceHeader row = frame.getInvoiceHeaderJTableModel().getInvoicesHeaderList().get(selectedRowIndex_InvoiceTable);
            frame.getCustomerName().setText(row.getCustomerName());
            frame.getInvoiceDate().setText(dateFormat.format(row.getInvoiceDate()));
            frame.getInvoiceNumber().setText("" + row.getInvoiceNumber());
            frame.getInvoiceTotal().setText("" + row.getInvoiceTotal());
            ArrayList<InvoiceLine> lines = row.getInvoiceLines();

            // line table model
            frame.setInvoiceLineJTableModel(new InvoiceLineJTableModel(lines));
            frame.getInvoiceItem().setModel(frame.getInvoiceLineJTableModel());
            frame.getInvoiceLineJTableModel().fireTableDataChanged();
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        rowSelected_InvoiceTable();
    }
}

