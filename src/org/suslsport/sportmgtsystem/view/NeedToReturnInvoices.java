/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.suslsport.sportmgtsystem.controller.ItemController;
import org.suslsport.sportmgtsystem.controller.OutFromStockController;
import org.suslsport.sportmgtsystem.model.OutFromStock;

/**
 *
 * @author RedHunter
 */
public class NeedToReturnInvoices extends javax.swing.JPanel {
Main aThis = null;
    /**
     * Creates new form NeedToReturnInvoices
     */
    public NeedToReturnInvoices(Main aThis) {
    
        initComponents();
        this.aThis = aThis;
        jTextField_std_reg_no.setText("ex : 12/AS/CI/041");
        
    try {
        loadData();
        
        
    } catch (SQLException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    }
        
 
    }
   
    public void loadData() throws SQLException, ClassNotFoundException {
        DefaultTableModel dtm = (DefaultTableModel) jTable_Need_to_return.getModel();
        dtm.setRowCount(0);

        ArrayList<OutFromStock> arrayList = OutFromStockController.getNeedToReturn();

        for (OutFromStock viewAllOutThred : arrayList) {
            Object[] b = {viewAllOutThred.getInvoiceId(),viewAllOutThred.getDate(), viewAllOutThred.getStudentId(), viewAllOutThred.getContact(), ItemController.getReleventItemName(viewAllOutThred.getItemId()), viewAllOutThred.getQuantity()};

            dtm.addRow(b);
        }

    }
     public void loadDataAfterSearch(ArrayList<OutFromStock> arrayList) throws SQLException, ClassNotFoundException {
        DefaultTableModel dtm = (DefaultTableModel) jTable_Need_to_return.getModel();
        dtm.setRowCount(0);

        

        for (OutFromStock viewAllOutThred : arrayList) {
            Object[] b = {viewAllOutThred.getDate(), viewAllOutThred.getStudentId(), viewAllOutThred.getContact(), ItemController.getReleventItemName(viewAllOutThred.getItemId()), viewAllOutThred.getQuantity()};

            dtm.addRow(b);
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

        jPanel_Filter_std_id = new javax.swing.JPanel();
        jTextField_Enter_std_name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel_Filter_Date = new javax.swing.JPanel();
        jPanel_Filter_Item_Name = new javax.swing.JPanel();
        jComboBox_Filter_item_name = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Need_to_return = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_std_reg_no = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton_refresh_again = new javax.swing.JButton();
        jButton_receive = new javax.swing.JButton();

        jTextField_Enter_std_name.setText("Enter a Student Id");
        jTextField_Enter_std_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_Enter_std_nameMouseClicked(evt);
            }
        });
        jTextField_Enter_std_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Enter_std_nameActionPerformed(evt);
            }
        });

        jButton2.setText("Filter");

        javax.swing.GroupLayout jPanel_Filter_std_idLayout = new javax.swing.GroupLayout(jPanel_Filter_std_id);
        jPanel_Filter_std_id.setLayout(jPanel_Filter_std_idLayout);
        jPanel_Filter_std_idLayout.setHorizontalGroup(
            jPanel_Filter_std_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Filter_std_idLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField_Enter_std_name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel_Filter_std_idLayout.setVerticalGroup(
            jPanel_Filter_std_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Filter_std_idLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_Filter_std_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Enter_std_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_Filter_DateLayout = new javax.swing.GroupLayout(jPanel_Filter_Date);
        jPanel_Filter_Date.setLayout(jPanel_Filter_DateLayout);
        jPanel_Filter_DateLayout.setHorizontalGroup(
            jPanel_Filter_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jPanel_Filter_DateLayout.setVerticalGroup(
            jPanel_Filter_DateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jComboBox_Filter_item_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enter a Item Name" }));

        javax.swing.GroupLayout jPanel_Filter_Item_NameLayout = new javax.swing.GroupLayout(jPanel_Filter_Item_Name);
        jPanel_Filter_Item_Name.setLayout(jPanel_Filter_Item_NameLayout);
        jPanel_Filter_Item_NameLayout.setHorizontalGroup(
            jPanel_Filter_Item_NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Filter_Item_NameLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jComboBox_Filter_item_name, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel_Filter_Item_NameLayout.setVerticalGroup(
            jPanel_Filter_Item_NameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Filter_Item_NameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jComboBox_Filter_item_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTable_Need_to_return.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice Id", "Date", "Student Reg No", "Contact No", "Item Name", "Quantity"
            }
        ));
        jTable_Need_to_return.setRowHeight(20);
        jTable_Need_to_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Need_to_returnMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable_Need_to_returnMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Need_to_return);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Need To Return Invoices");

        jLabel2.setText("Enter a student reg no :");

        jTextField_std_reg_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_std_reg_noMouseClicked(evt);
            }
        });
        jTextField_std_reg_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_std_reg_noActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton_refresh_again.setBackground(new java.awt.Color(255, 255, 255));
        jButton_refresh_again.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_refresh_again.setText("Refresh");
        jButton_refresh_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refresh_againActionPerformed(evt);
            }
        });

        jButton_receive.setBackground(new java.awt.Color(255, 255, 255));
        jButton_receive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_receive.setText("Received");
        jButton_receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_receiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(531, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_std_reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_refresh_again, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_receive, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))))
                        .addContainerGap(293, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_std_reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_refresh_again, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_receive, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        aThis.needToReturn = null;
        aThis.getjPanel_Invoices().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_Enter_std_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Enter_std_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Enter_std_nameActionPerformed

    private void jTextField_Enter_std_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_Enter_std_nameMouseClicked
        // TODO add your handling code here:
        jTextField_Enter_std_name.setText("");
    }//GEN-LAST:event_jTextField_Enter_std_nameMouseClicked

    private void jTable_Need_to_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Need_to_returnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable_Need_to_returnMouseClicked

    private void jTable_Need_to_returnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Need_to_returnMouseReleased
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTable_Need_to_returnMouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    String stdNo = jTextField_std_reg_no.getText();
    try {
        ArrayList<OutFromStock> searchInvoice = OutFromStockController.searchInvoice(stdNo);
        loadDataAfterSearch(searchInvoice);
        jTextField_std_reg_no.setText("");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_std_reg_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_std_reg_noMouseClicked
        // TODO add your handling code here:
        jTextField_std_reg_no.setText("");
    }//GEN-LAST:event_jTextField_std_reg_noMouseClicked

    private void jTextField_std_reg_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_std_reg_noActionPerformed
    // TODO add your handling code here:
 
    }//GEN-LAST:event_jTextField_std_reg_noActionPerformed

    private void jButton_refresh_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refresh_againActionPerformed
    try {
        // TODO add your handling code here:
        loadData();
    } catch (SQLException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(NeedToReturnInvoices.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton_refresh_againActionPerformed

    private void jButton_receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_receiveActionPerformed
    // TODO add your handling code here:
    int selectedRow = jTable_Need_to_return.getSelectedRow();
    System.out.println(selectedRow);
    Object id = jTable_Need_to_return.getValueAt(selectedRow,0);
    
     Object quantity = jTable_Need_to_return.getValueAt(selectedRow,5);
    String toString = quantity.toString();
    System.out.println(id);System.out.println(quantity);
        Receive receive = new Receive(id,toString);
        receive.setLocationRelativeTo(this);
        receive.setVisible(true);
    
    
  
   

    }//GEN-LAST:event_jButton_receiveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_receive;
    private javax.swing.JButton jButton_refresh_again;
    private javax.swing.JComboBox<String> jComboBox_Filter_item_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_Filter_Date;
    private javax.swing.JPanel jPanel_Filter_Item_Name;
    private javax.swing.JPanel jPanel_Filter_std_id;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Need_to_return;
    private javax.swing.JTextField jTextField_Enter_std_name;
    private javax.swing.JTextField jTextField_std_reg_no;
    // End of variables declaration//GEN-END:variables
}
