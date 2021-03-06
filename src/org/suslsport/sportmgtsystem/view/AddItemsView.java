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
import org.suslsport.sportmgtsystem.ThirdPartyFn.OnlyStringAndWhiteSpace;
import org.suslsport.sportmgtsystem.controller.ItemController;
import org.suslsport.sportmgtsystem.controller.SportController;
import org.suslsport.sportmgtsystem.model.Items;

/**
 *
 * @author RedHunter
 */
public class AddItemsView extends javax.swing.JPanel {

    Main aThis = null;
    String lastId = null;

    /**
     * Creates new form AddItemsView
     */
    public AddItemsView(Main aThis) {
        initComponents();
        this.aThis = aThis;
        // jText_ItemId.setEnabled(false);
        try {
            loadData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddItemsView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddItemsView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadData() throws ClassNotFoundException, SQLException {

        ArrayList<String> allSportsNames = SportController.getAllSportsNames();
        jCombo_SportNames.removeAllItems();
        jCombo_SportNames.addItem("Select a Sport name");
        for (String sportName : allSportsNames) {
            jCombo_SportNames.addItem(sportName);

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

        jLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_ItemName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCombo_SportNames = new javax.swing.JComboBox<>();
        jButton_AddItems = new javax.swing.JButton();
        jButton_AddItems1 = new javax.swing.JButton();

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("Add Items");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Equipment Name                   :");

        jText_ItemName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jText_ItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_ItemNameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Relevant Sport                      :");

        jCombo_SportNames.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCombo_SportNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo_SportNamesActionPerformed(evt);
            }
        });

        jButton_AddItems.setBackground(new java.awt.Color(0, 153, 255));
        jButton_AddItems.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AddItems.setText("Add Item");
        jButton_AddItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddItemsActionPerformed(evt);
            }
        });

        jButton_AddItems1.setBackground(new java.awt.Color(255, 102, 102));
        jButton_AddItems1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AddItems1.setText("Cancel");
        jButton_AddItems1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddItems1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jCombo_SportNames, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jText_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_AddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_AddItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCombo_SportNames, jText_ItemName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo_SportNames, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_AddItems, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_AddItems1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCombo_SportNames, jText_ItemName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel4});

    }// </editor-fold>//GEN-END:initComponents

    private void jCombo_SportNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo_SportNamesActionPerformed
        // TODO add your handling code here:
        if (jCombo_SportNames.getSelectedIndex() > 0) {
            String sportName = jCombo_SportNames.getSelectedItem().toString();
            String relevantSportId = null;
            try {
                relevantSportId = SportController.getRelevantSportId(sportName);

            } catch (ClassNotFoundException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, "E1", "Warning", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, "E2", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            try {
                lastId = ItemController.getLastId(relevantSportId);
                //jText_ItemId.setText(lastId);
            } catch (ClassNotFoundException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, "E3", "Warning", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, "E4", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // JOptionPane.showMessageDialog(null,"You must select an Sport name", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jCombo_SportNamesActionPerformed

    private void jButton_AddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddItemsActionPerformed
        // TODO add your handling code here:
        String itemId = lastId;
        String itemName = jText_ItemName.getText();

        String sportName = jCombo_SportNames.getSelectedItem().toString();

        if (sportName.equals("Select a Sport name")) {
            JOptionPane.showMessageDialog(null, "You must select an Sport name");

        } else if (itemName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the equipment name field");
        } else {
            try {
                String relevantSportId = SportController.getRelevantSportId(sportName);

                Items item = new Items(itemId, itemName, relevantSportId);
                boolean addItemsRes = ItemController.addItems(item);
                if (addItemsRes) {

                    JOptionPane.showMessageDialog(null, "Success");
                    loadData();
                    jText_ItemName.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Error in adding item");
                }

            } catch (ClassNotFoundException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
            } catch (SQLException ex) {
                String message = ex.getMessage();
                JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }


    }//GEN-LAST:event_jButton_AddItemsActionPerformed

    private void jButton_AddItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddItems1ActionPerformed
        // TODO add your handling code here:
        aThis.addItemsView = null;
        aThis.getjPanel_Manage_Sport_Eq().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_AddItems1ActionPerformed

    private void jText_ItemNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_ItemNameKeyPressed
        // TODO add your handling code here:
        OnlyStringAndWhiteSpace.setOnlyStringAndWhiteSpace(jText_ItemName);
    }//GEN-LAST:event_jText_ItemNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddItems;
    private javax.swing.JButton jButton_AddItems1;
    private javax.swing.JComboBox<String> jCombo_SportNames;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jText_ItemName;
    // End of variables declaration//GEN-END:variables
}
