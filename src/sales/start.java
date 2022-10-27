package sales;
import Model.InvoiceLineJTableModel;
import Model.InvoiceHeader;
import Model.InvoiceHeaderJTableModel;
import actions.ImplementsListner;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.List;

public class start extends javax.swing.JFrame {

    public start() {
        CreateComponent();
        setLocation(200, 60);
    }


    @SuppressWarnings("unchecked")
    // Create_Components
    private void CreateComponent() {

        jText1 = new javax.swing.JLabel();
        jText2 = new javax.swing.JLabel();
        jText3 = new javax.swing.JLabel();
        jText4 = new javax.swing.JLabel();

        LJPanel = new javax.swing.JPanel();
        TJPanle = new javax.swing.JPanel();
        jScroll1 = new javax.swing.JScrollPane();

        invoiceJTable = new javax.swing.JTable();
        invoiceJTable.getSelectionModel().addListSelectionListener(Listner);
        invoiceNumber = new javax.swing.JLabel();
        invoiceTotal = new javax.swing.JLabel();
        invoiceDate = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();

        Bright = new javax.swing.JPanel();
        jScroll2 = new javax.swing.JScrollPane();
        InvoiceItem = new javax.swing.JTable();

        createNewInvoice = new javax.swing.JButton();
        createNewInvoice.addActionListener(Listner);

        deleteInvoice = new javax.swing.JButton();
        deleteInvoice.addActionListener(Listner);

        saveInvoice = new javax.swing.JButton();
        saveInvoice.addActionListener(Listner);

        cancelInvoice = new javax.swing.JButton();
        cancelInvoice.addActionListener(Listner);

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBar = new javax.swing.JMenu();

        loadFile = new javax.swing.JMenuItem();
        loadFile.addActionListener(Listner);

        saveFile = new javax.swing.JMenuItem();
        saveFile.addActionListener(Listner);

        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        closeFile = new javax.swing.JMenuItem();
        closeFile.addActionListener(Listner);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        LJPanel.setBackground(new java.awt.Color(102, 102, 102));
        LJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Table"));
        LJPanel.setForeground(new java.awt.Color(255, 255, 255));
        LJPanel.setPreferredSize(new java.awt.Dimension(360, 470));

        invoiceJTable.setBackground(new java.awt.Color(51, 51, 51));
        invoiceJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        invoiceJTable.setFont(new java.awt.Font("Time", 3, 14)); // NOI18N
        invoiceJTable.setForeground(new java.awt.Color(255, 255, 255));
        invoiceJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScroll1.setViewportView(invoiceJTable);

        javax.swing.GroupLayout LeftSideJPanelLayout = new javax.swing.GroupLayout(LJPanel);
        LJPanel.setLayout(LeftSideJPanelLayout);
        LeftSideJPanelLayout.setHorizontalGroup(
                LeftSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LeftSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(LeftSideJPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScroll1)
                                        .addContainerGap()))
        );
        LeftSideJPanelLayout.setVerticalGroup(
                LeftSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 455, Short.MAX_VALUE)
                        .addGroup(LeftSideJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftSideJPanelLayout.createSequentialGroup()
                                        .addContainerGap(16, Short.MAX_VALUE)
                                        .addComponent(jScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );

        TJPanle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jText1.setFont(new java.awt.Font("Time", 3, 14));
        jText1.setText("Invoice Number");

        jText2.setFont(new java.awt.Font("Time", 3, 14));
        jText2.setText("Invoice Date");

        jText3.setFont(new java.awt.Font("Time", 3, 14));
        jText3.setText("Customer Name");

        jText4.setFont(new java.awt.Font("Time", 3, 14));
        jText4.setText("Invoice Total");

        invoiceNumber.setFont(new java.awt.Font("Time", 3, 14));
        invoiceNumber.setText("0");

        invoiceTotal.setFont(new java.awt.Font("Time", 3, 14));
        invoiceTotal.setText("0.0");

        invoiceDate.setFont(new java.awt.Font("Time", 3, 14));

        customerName.setFont(new java.awt.Font("Time", 3, 14));

        javax.swing.GroupLayout TopRightSideLayout = new javax.swing.GroupLayout(TJPanle);
        TJPanle.setLayout(TopRightSideLayout);
        TopRightSideLayout.setHorizontalGroup(
                TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopRightSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(TopRightSideLayout.createSequentialGroup()
                                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jText1)
                                                        .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(49, 49, 49)
                                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                                        .addComponent(invoiceTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(invoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(invoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopRightSideLayout.setVerticalGroup(
                TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopRightSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jText1)
                                        .addComponent(invoiceNumber))
                                .addGap(18, 18, 18)
                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jText2)
                                        .addComponent(invoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jText3)
                                        .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(TopRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jText4)
                                        .addComponent(invoiceTotal))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bright.setBackground(new java.awt.Color(102, 102, 102));
        Bright.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Items"));
        Bright.setPreferredSize(new java.awt.Dimension(360, 200));

        InvoiceItem.setBackground(new java.awt.Color(51, 51, 51));
        InvoiceItem.setFont(new java.awt.Font("Time", 3, 14)); // NOI18N
        InvoiceItem.setForeground(new java.awt.Color(255, 255, 255));
        InvoiceItem.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
        ));
        jScroll2.setViewportView(InvoiceItem);

        javax.swing.GroupLayout BottomRightSideLayout = new javax.swing.GroupLayout(Bright);
        Bright.setLayout(BottomRightSideLayout);
        BottomRightSideLayout.setHorizontalGroup(
                BottomRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomRightSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        BottomRightSideLayout.setVerticalGroup(
                BottomRightSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottomRightSideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addContainerGap())
        );

        createNewInvoice.setBackground(new java.awt.Color(255, 255, 255));
        createNewInvoice.setForeground(new java.awt.Color(0, 0, 0));
        createNewInvoice.setText("Create New Invoice");
        createNewInvoice.setActionCommand("CreateNewInvoiceButton");
        createNewInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 206, 0)));
        createNewInvoice.setPreferredSize(new java.awt.Dimension(132, 33));
        createNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewInvoiceButtonLeftSIdeActionPerformed(evt);
            }
        });

        deleteInvoice.setBackground(new java.awt.Color(255, 255, 255));
        deleteInvoice.setForeground(new java.awt.Color(0, 0, 0));
        deleteInvoice.setText("Delete Invoice");
        deleteInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 206, 0)));
        deleteInvoice.setPreferredSize(new java.awt.Dimension(132, 33));
        deleteInvoice.setActionCommand("DeleteInvoiceButton");
        deleteInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInvoiceButtonLeftSIdeActionPerformed(evt);
            }
        });

        saveInvoice.setBackground(new java.awt.Color(255, 255, 255));
        saveInvoice.setForeground(new java.awt.Color(0, 0, 0));
        saveInvoice.setText("Add Item");
        saveInvoice.setActionCommand("SaveButton");
        saveInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 206, 0)));
        saveInvoice.setPreferredSize(new java.awt.Dimension(132, 33));
        saveInvoice.setActionCommand("SaveButton");

        cancelInvoice.setBackground(new java.awt.Color(255, 255, 255));
        cancelInvoice.setForeground(new java.awt.Color(5, 5, 5));
        cancelInvoice.setText("Delete Item");
        cancelInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 206, 0)));
        cancelInvoice.setPreferredSize(new java.awt.Dimension(132, 33));
        cancelInvoice.setActionCommand("CancelButton");
        cancelInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonRightSIdeActionPerformed(evt);
            }
        });

        MenuBar.setText("File");

        loadFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadFile.setActionCommand("LoadFile");
        loadFile.setText("Load File");
        loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuBarItemActionPerformed(evt);
            }
        });
        MenuBar.add(loadFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setActionCommand("SaveFile");
        saveFile.setText("Save File");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuBarItemActionPerformed(evt);
            }
        });
        MenuBar.add(saveFile);
        MenuBar.add(jSeparator1);

        closeFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        closeFile.setActionCommand("CloseFile");
        closeFile.setText("Close");
        closeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFileMenuBarItemActionPerformed(evt);
            }
        });
        MenuBar.add(closeFile);

        jMenuBar1.add(MenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TJPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bright, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(deleteInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(saveInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(cancelInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(TJPanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Bright, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(LJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(deleteInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(saveInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cancelInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void loadFileMenuBarItemActionPerformed(java.awt.event.ActionEvent evt) {}
    private void saveFileMenuBarItemActionPerformed(java.awt.event.ActionEvent evt) {}

    private void createNewInvoiceButtonLeftSIdeActionPerformed(java.awt.event.ActionEvent evt) {}
    private void deleteInvoiceButtonLeftSIdeActionPerformed(java.awt.event.ActionEvent evt) {}
    private void closeFileMenuBarItemActionPerformed(java.awt.event.ActionEvent evt) {}

    private void cancelButtonRightSIdeActionPerformed(java.awt.event.ActionEvent evt) {}
    // Variables declaration
    private javax.swing.JPanel Bright;
    private javax.swing.JTable InvoiceItem;
    private javax.swing.JPanel LJPanel;
    private javax.swing.JMenu MenuBar;
    private javax.swing.JPanel TJPanle;
    private javax.swing.JButton cancelInvoice;
    private javax.swing.JMenuItem closeFile;
    private javax.swing.JButton createNewInvoice;
    private javax.swing.JLabel customerName;
    private javax.swing.JButton deleteInvoice;
    private javax.swing.JLabel invoiceDate;
    private javax.swing.JLabel invoiceNumber;
    private javax.swing.JTable invoiceJTable;
    private javax.swing.JLabel invoiceTotal;
    private javax.swing.JLabel jText1;
    private javax.swing.JLabel jText2;
    private javax.swing.JLabel jText3;
    private javax.swing.JLabel jText4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScroll1;
    private javax.swing.JScrollPane jScroll2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem loadFile;
    private javax.swing.JButton saveInvoice;
    private javax.swing.JMenuItem saveFile;
    // End of variables declaration//GEN-END:variables

    private final List<InvoiceHeader> invoicesHeaderList = new ArrayList<>();
    private InvoiceHeaderJTableModel invoiceHeaderJTableModel;
    private InvoiceLineJTableModel invoiceLineJTableModel;
    private createNewInvoice newInvoiceDialog;
    private SaveLineDialog saveLineDialog;
    private final ImplementsListner Listner = new ImplementsListner(this);

    public void setInvoiceHeaderJTableModel(InvoiceHeaderJTableModel invoiceHeaderJTableModel)
    {this.invoiceHeaderJTableModel = invoiceHeaderJTableModel;}

    public void setInvoiceLineJTableModel(InvoiceLineJTableModel invoiceLineJTableModel)
    {this.invoiceLineJTableModel = invoiceLineJTableModel;}

    public void setNewInvoiceDialog(createNewInvoice newInvoiceDialog)
    {this.newInvoiceDialog = newInvoiceDialog;}

    public void setSaveLineDialog(SaveLineDialog saveLineDialog)
    {this.saveLineDialog = saveLineDialog;}

    public JPanel getBright()
    {return Bright;}

    public JTable getInvoiceItem()
    {return InvoiceItem;}

    public JPanel getLJPanel()
    {return LJPanel;}

    public JPanel getTJPanle()
    {return TJPanle;}

    public JButton getCancelInvoice()
    {return cancelInvoice;}

    public JMenuItem getCloseFile()
    {return closeFile;}

    public JButton getCreateNewInvoice()
    {return createNewInvoice;}

    public JLabel getCustomerName()
    {return customerName;}

    public JButton getDeleteInvoice()
    {return deleteInvoice;}

    public JLabel getInvoiceDate()
    {return invoiceDate;}

    public JLabel getInvoiceNumber()
    {return invoiceNumber;}

    public JTable getInvoiceJTable()
    {return invoiceJTable;}

    public JLabel getInvoiceTotal()
    {return invoiceTotal;}

    public JMenuItem getLoadFile()
    {return loadFile;}

    public JButton getSaveInvoice()
    {return saveInvoice;}

    public JMenuItem getSaveFile()
    {return saveFile;}

    public List<InvoiceHeader> getInvoicesHeaderList()
    {return invoicesHeaderList;}

    public InvoiceHeaderJTableModel getInvoiceHeaderJTableModel()
    {return invoiceHeaderJTableModel;}

    public InvoiceLineJTableModel getInvoiceLineJTableModel()
    {return invoiceLineJTableModel;}

    public createNewInvoice getNewInvoiceDialog()
    {return newInvoiceDialog;}

    public SaveLineDialog getSaveLineDialog()
    {return saveLineDialog;}

    public ImplementsListner getListner()
    {return Listner;}

}
