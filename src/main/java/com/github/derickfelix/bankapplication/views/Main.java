/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.derickfelix.bankapplication.views;

import com.github.derickfelix.bankapplication.util.Auth;
import com.github.derickfelix.bankapplication.views.histories.CustomerRegistration;
import com.github.derickfelix.bankapplication.views.histories.DepositDetails;
import com.github.derickfelix.bankapplication.views.histories.WithdrawalDetails;
import com.github.derickfelix.bankapplication.views.operations.SavingCalculator;
import com.github.derickfelix.bankapplication.views.operations.RegisterCustomer;
import com.github.derickfelix.bankapplication.views.operations.RegisterStaff;
import com.github.derickfelix.bankapplication.views.operations.DepositOperation;
import com.github.derickfelix.bankapplication.views.operations.WithdrawOperation;
import java.net.URL;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author derickfelix
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public Main() {
        initComponents();
        customOperations();
    }

    private void customOperations() {
        lblAuthName.setText(Auth.name());
        if (!Auth.type().equals("admin")) {
            navStaffOp.setVisible(false);
            navDepositOp.setVisible(false);
            navWithdrawalOp.setVisible(false);
            tbtnMakeDeposit.setEnabled(false);
            tbtnMakeWithdrawal.setEnabled(false);
            menuiDeposit.setEnabled(false);
            menuiWithdrawal.setEnabled(false);
            navSavingCalculator.setEnabled(true);
            if (!Auth.type().equals("staff")) {
                navDepositOp.setVisible(true);
                navWithdrawalOp.setVisible(true);
                navCustomerOp.setVisible(false);
                menuiRegistration.setVisible(false);
                navCustomerHis.setVisible(false);
                menuiRegisteredCustomers.setEnabled(false);
                menuiWithdrawalDetails.setEnabled(false);
                tbtnMakeDeposit.setEnabled(true);
                tbtnMakeWithdrawal.setEnabled(true);
                navSavingCalculator.setEnabled(true);
            }
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBarMain = new javax.swing.JToolBar();
        tbtnRegisterCustomer = new javax.swing.JButton();
        tbtnMakeDeposit = new javax.swing.JButton();
        tbtnMakeWithdrawal = new javax.swing.JButton();
        splitPaneMain = new javax.swing.JSplitPane();
        paneNavigate = new javax.swing.JPanel();
        navlbBankOps = new javax.swing.JLabel();
        navCustomerOp = new javax.swing.JButton();
        navStaffOp = new javax.swing.JButton();
        navDepositOp = new javax.swing.JButton();
        navWithdrawalOp = new javax.swing.JButton();
        navlbHistory = new javax.swing.JLabel();
        navCustomerHis = new javax.swing.JButton();
        navWithdrawalHis = new javax.swing.JButton();
        navDepositHis = new javax.swing.JButton();
        navSavingCalculator = new javax.swing.JButton();
        dskPaneDesktop = new javax.swing.JDesktopPane();
        lblAuthName = new javax.swing.JLabel();
        menuBarMain = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuiExit = new javax.swing.JMenuItem();
        menuOperations = new javax.swing.JMenu();
        menuiWithdrawal = new javax.swing.JMenuItem();
        menuiDeposit = new javax.swing.JMenuItem();
        menuiRegistration = new javax.swing.JMenuItem();
        menuHistory = new javax.swing.JMenu();
        menuiRegisteredCustomers = new javax.swing.JMenuItem();
        menuiDepositDetails = new javax.swing.JMenuItem();
        menuiWithdrawalDetails = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Trisoft Bank");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        toolBarMain.setRollover(true);

        tbtnRegisterCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-new-document.png"))); // NOI18N
        tbtnRegisterCustomer.setToolTipText("Register new Customers");
        tbtnRegisterCustomer.setFocusable(false);
        tbtnRegisterCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnRegisterCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnRegisterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnRegisterCustomerActionPerformed(evt);
            }
        });
        toolBarMain.add(tbtnRegisterCustomer);

        tbtnMakeDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/open-archive.png"))); // NOI18N
        tbtnMakeDeposit.setToolTipText("Make your Deposit");
        tbtnMakeDeposit.setFocusable(false);
        tbtnMakeDeposit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnMakeDeposit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnMakeDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnMakeDepositActionPerformed(evt);
            }
        });
        toolBarMain.add(tbtnMakeDeposit);

        tbtnMakeWithdrawal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product-realise.png"))); // NOI18N
        tbtnMakeWithdrawal.setToolTipText("Make your Withdrawal");
        tbtnMakeWithdrawal.setFocusable(false);
        tbtnMakeWithdrawal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbtnMakeWithdrawal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbtnMakeWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnMakeWithdrawalActionPerformed(evt);
            }
        });
        toolBarMain.add(tbtnMakeWithdrawal);

        splitPaneMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        splitPaneMain.setDividerLocation(180);
        splitPaneMain.setDividerSize(7);

        navlbBankOps.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        navlbBankOps.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navlbBankOps.setText("BANK OPERATIONS");

        navCustomerOp.setText("Customer Registration");
        navCustomerOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navCustomerOpActionPerformed(evt);
            }
        });

        navStaffOp.setText("Staff Registration");
        navStaffOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navStaffOpActionPerformed(evt);
            }
        });

        navDepositOp.setText("Deposit");
        navDepositOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navDepositOpActionPerformed(evt);
            }
        });

        navWithdrawalOp.setText("Withdrawal");
        navWithdrawalOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navWithdrawalOpActionPerformed(evt);
            }
        });

        navlbHistory.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        navlbHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navlbHistory.setText("HISTORY");

        navCustomerHis.setText("Customer Registration");
        navCustomerHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navCustomerHisActionPerformed(evt);
            }
        });

        navWithdrawalHis.setText("Withdrawal Details");
        navWithdrawalHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navWithdrawalHisActionPerformed(evt);
            }
        });

        navDepositHis.setText("Deposit Details");
        navDepositHis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navDepositHisActionPerformed(evt);
            }
        });

        navSavingCalculator.setText("Saving Calculator");
        navSavingCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navCalculatorHisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneNavigateLayout = new javax.swing.GroupLayout(paneNavigate);
        paneNavigate.setLayout(paneNavigateLayout);
        paneNavigateLayout.setHorizontalGroup(
            paneNavigateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneNavigateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneNavigateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navlbBankOps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navlbHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navWithdrawalOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navDepositOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navDepositHis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navWithdrawalHis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navCustomerHis, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(navStaffOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navCustomerOp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(navSavingCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneNavigateLayout.setVerticalGroup(
            paneNavigateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneNavigateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navlbBankOps)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navCustomerOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navStaffOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navDepositOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navWithdrawalOp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navSavingCalculator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navlbHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navCustomerHis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navWithdrawalHis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navDepositHis)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        navSavingCalculator.getAccessibleContext().setAccessibleName("Calculator");

        splitPaneMain.setLeftComponent(paneNavigate);
        splitPaneMain.setRightComponent(dskPaneDesktop);

        lblAuthName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAuthName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAuthName.setText("Authenticated user name");

        menuFile.setText("File");

        menuiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuiExit.setText("Exit");
        menuiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiExitActionPerformed(evt);
            }
        });
        menuFile.add(menuiExit);

        menuBarMain.add(menuFile);

        menuOperations.setText("Operations");

        menuiWithdrawal.setText("Withdrawal");
        menuiWithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiWithdrawalActionPerformed(evt);
            }
        });
        menuOperations.add(menuiWithdrawal);

        menuiDeposit.setText("Deposit");
        menuiDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiDepositActionPerformed(evt);
            }
        });
        menuOperations.add(menuiDeposit);

        menuiRegistration.setText("Registration");
        menuiRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiRegistrationActionPerformed(evt);
            }
        });
        menuOperations.add(menuiRegistration);

        menuBarMain.add(menuOperations);

        menuHistory.setText("History");

        menuiRegisteredCustomers.setText("Registered Customers");
        menuiRegisteredCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiRegisteredCustomersActionPerformed(evt);
            }
        });
        menuHistory.add(menuiRegisteredCustomers);

        menuiDepositDetails.setText("Deposit Details");
        menuiDepositDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiDepositDetailsActionPerformed(evt);
            }
        });
        menuHistory.add(menuiDepositDetails);

        menuiWithdrawalDetails.setText("Withdrawal Details");
        menuiWithdrawalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuiWithdrawalDetailsActionPerformed(evt);
            }
        });
        menuHistory.add(menuiWithdrawalDetails);

        menuBarMain.add(menuHistory);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBarMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuthName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(splitPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBarMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(splitPaneMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthName)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void navCustomerOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navCustomerOpActionPerformed
        // Create a new RegisterCustomer Dialog and show it
        new RegisterCustomer(this, true).setVisible(true);
    }//GEN-LAST:event_navCustomerOpActionPerformed

    private void navStaffOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navStaffOpActionPerformed
        // Create a new RegisterStaff Dialog and show it
        new RegisterStaff(this, true).setVisible(true);
    }//GEN-LAST:event_navStaffOpActionPerformed

    private void navDepositOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navDepositOpActionPerformed
        // Create a new Deposit Dialog and show it
        new DepositOperation(this, true).setVisible(true);
    }//GEN-LAST:event_navDepositOpActionPerformed

    private void navWithdrawalOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navWithdrawalOpActionPerformed
        // Create a new Withdrawal Dialog and show it
        new WithdrawOperation(this, true).setVisible(true);
    }//GEN-LAST:event_navWithdrawalOpActionPerformed

    private void navCustomerHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navCustomerHisActionPerformed
        // Create a new CustomerRegistration Dialog and show it
        new CustomerRegistration(this, true).setVisible(true);
    }//GEN-LAST:event_navCustomerHisActionPerformed

    private void navWithdrawalHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navWithdrawalHisActionPerformed
        // Create a new WithdrawalDetails Dialog and show it
        new WithdrawalDetails(this, true).setVisible(true);
    }//GEN-LAST:event_navWithdrawalHisActionPerformed

    private void navDepositHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navDepositHisActionPerformed
        // Create a new DepositDetails Dialog and show it
        new DepositDetails(this, true).setVisible(true);
    }//GEN-LAST:event_navDepositHisActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to close? ", "Select One", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void menuiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiExitActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure you want to close? ", "Select One", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuiExitActionPerformed

    private void menuiWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiWithdrawalActionPerformed
        // Create a new Withdrawal Dialog and show it
        new WithdrawOperation(this, true).setVisible(true);
    }//GEN-LAST:event_menuiWithdrawalActionPerformed

    private void menuiDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiDepositActionPerformed
        // Create a new Deposit Dialog and show it
        new DepositOperation(this, true).setVisible(true);
    }//GEN-LAST:event_menuiDepositActionPerformed

    private void menuiRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiRegistrationActionPerformed
        new CustomerRegistration(this, true).setVisible(true);
    }//GEN-LAST:event_menuiRegistrationActionPerformed

    private void menuiRegisteredCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiRegisteredCustomersActionPerformed
        // Create a new CustomerRegistration Dialog and show it
        new CustomerRegistration(this, true).setVisible(true);
    }//GEN-LAST:event_menuiRegisteredCustomersActionPerformed

    private void menuiDepositDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiDepositDetailsActionPerformed
        // Create a new DepositDetails Dialog and show it
        new DepositDetails(this, true).setVisible(true);
    }//GEN-LAST:event_menuiDepositDetailsActionPerformed

    private void menuiWithdrawalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuiWithdrawalDetailsActionPerformed
        // Create a new WithdrawalDetails Dialog and show it
        new WithdrawalDetails(this, true).setVisible(true);
    }//GEN-LAST:event_menuiWithdrawalDetailsActionPerformed

    private void tbtnRegisterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnRegisterCustomerActionPerformed
        new RegisterCustomer(this, true).setVisible(true);
    }//GEN-LAST:event_tbtnRegisterCustomerActionPerformed

    private void tbtnMakeDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnMakeDepositActionPerformed
        new DepositOperation(this, true).setVisible(true);
    }//GEN-LAST:event_tbtnMakeDepositActionPerformed

    private void tbtnMakeWithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnMakeWithdrawalActionPerformed
        new WithdrawOperation(this, true).setVisible(true);
    }//GEN-LAST:event_tbtnMakeWithdrawalActionPerformed

    private void navCalculatorHisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navCalculatorHisActionPerformed
        new SavingCalculator(this, true).setVisible(true);
    }//GEN-LAST:event_navCalculatorHisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPaneDesktop;
    private javax.swing.JLabel lblAuthName;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHistory;
    private javax.swing.JMenu menuOperations;
    private javax.swing.JMenuItem menuiDeposit;
    private javax.swing.JMenuItem menuiDepositDetails;
    private javax.swing.JMenuItem menuiExit;
    private javax.swing.JMenuItem menuiRegisteredCustomers;
    private javax.swing.JMenuItem menuiRegistration;
    private javax.swing.JMenuItem menuiWithdrawal;
    private javax.swing.JMenuItem menuiWithdrawalDetails;
    private javax.swing.JButton navCustomerHis;
    private javax.swing.JButton navCustomerOp;
    private javax.swing.JButton navDepositHis;
    private javax.swing.JButton navDepositOp;
    private javax.swing.JButton navSavingCalculator;
    private javax.swing.JButton navStaffOp;
    private javax.swing.JButton navWithdrawalHis;
    private javax.swing.JButton navWithdrawalOp;
    private javax.swing.JLabel navlbBankOps;
    private javax.swing.JLabel navlbHistory;
    private javax.swing.JPanel paneNavigate;
    private javax.swing.JSplitPane splitPaneMain;
    private javax.swing.JButton tbtnMakeDeposit;
    private javax.swing.JButton tbtnMakeWithdrawal;
    private javax.swing.JButton tbtnRegisterCustomer;
    private javax.swing.JToolBar toolBarMain;
    // End of variables declaration//GEN-END:variables
}
