/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.suslsport.sportmgtsystem.ThirdPartyFn.OnlyStringAndWhiteSpace;
import org.suslsport.sportmgtsystem.controller.SportController;
import org.suslsport.sportmgtsystem.model.Sport;

/**
 *
 * @author RedHunter
 */
public class AddSportView extends javax.swing.JPanel {
Main aThis =null;
    /**
     * Creates new form SportView
     */
    public AddSportView(Main aThis) {
        initComponents();
        this.aThis = aThis;
        
        jText_sportId.setEnabled(false);
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jText_sportId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_sportName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Add Sport Categorey");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sport Id                                :");

        jText_sportId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jText_sportId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_sportIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Sport Name                           :");

        jText_sportName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jText_sportName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jText_sportNameFocusLost(evt);
            }
        });
        jText_sportName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jText_sportNameInputMethodTextChanged(evt);
            }
        });
        jText_sportName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_sportNameActionPerformed(evt);
            }
        });
        jText_sportName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_sportNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_sportNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_sportNameKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add Sport");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(jText_sportId, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(jText_sportName, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_sportId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_sportName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String sportId = jText_sportId.getText();
        String sportName = jText_sportName.getText();
        
        Sport sport = new Sport(sportId, sportName);
        
        if (!sportId.equals("") && !sportName.equals("")) {
            try {
            boolean addSportResult = SportController.addSport(sport);
            if (addSportResult) {
                jText_sportId.setText("");
                jText_sportName.setText("");
                JOptionPane.showMessageDialog(this, "New sport categoty is added successfully");
            }else{
                JOptionPane.showMessageDialog(this, "Error in adding new Sport cateory");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddSportView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddSportView.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        }else{
            JOptionPane.showMessageDialog(this, "Fill the all fields");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jText_sportIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_sportIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_sportIdActionPerformed

    private void jText_sportNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_sportNameActionPerformed
        // TODO add your handling code here:
        
      
        
        
    }//GEN-LAST:event_jText_sportNameActionPerformed

    private void jText_sportNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jText_sportNameInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_sportNameInputMethodTextChanged

    private void jText_sportNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_sportNameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_sportNameKeyTyped

    private void jText_sportNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_sportNameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_sportNameKeyReleased

    private void jText_sportNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jText_sportNameFocusLost
        // TODO add your handling code here:
         String sName=jText_sportName.getText();
        char[] elements = sName.toCharArray();
        String e1 =Character.toString(elements[0]).toUpperCase();
        String e2 =Character.toString(elements[1]).toUpperCase();
        String e3 =Character.toString(elements[2]).toUpperCase();
        String e4 =Character.toString(elements[3]).toUpperCase();
        
        String newS = e1+e2+e3+e4;
        jText_sportId.setText(newS);
    }//GEN-LAST:event_jText_sportNameFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        aThis.getjPanel_Manage_Sport().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jText_sportNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_sportNameKeyPressed
        // TODO add your handling code here:
        OnlyStringAndWhiteSpace.setOnlyStringAndWhiteSpace(jText_sportName);
    }//GEN-LAST:event_jText_sportNameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jText_sportId;
    private javax.swing.JTextField jText_sportName;
    // End of variables declaration//GEN-END:variables
}
