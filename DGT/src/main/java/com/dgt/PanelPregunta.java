package com.dgt;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class PanelPregunta extends javax.swing.JPanel {
    /**
     * Creates new form PanelPregunta
     */
    public PanelPregunta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        enunciado = new javax.swing.JTextArea();
        imagen = new javax.swing.JLabel();
        btnR1 = new javax.swing.JRadioButton();
        btnR2 = new javax.swing.JRadioButton();
        btnR3 = new javax.swing.JRadioButton();

        buttonGroup1.add(btnR1);
        buttonGroup1.add(btnR2);
        buttonGroup1.add(btnR3);

        enunciado.setEditable(false);
        enunciado.setColumns(20);
        enunciado.setLineWrap(true);
        enunciado.setRows(5);
        enunciado.setWrapStyleWord(true);
        enunciado.setFocusable(false);
        jScrollPane1.setViewportView(enunciado);

        btnR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR1ActionPerformed(evt);
            }
        });

        btnR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnR3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnR2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnR1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(31, 31, 31)
                .addComponent(btnR1)
                .addGap(36, 36, 36)
                .addComponent(btnR2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnR3)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR2ActionPerformed

    }//GEN-LAST:event_btnR2ActionPerformed

    private void btnR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnR1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton btnR1;
    public javax.swing.JRadioButton btnR2;
    public javax.swing.JRadioButton btnR3;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JTextArea enunciado;
    public javax.swing.JLabel imagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
