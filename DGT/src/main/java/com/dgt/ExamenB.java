/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dgt;

import java.awt.Toolkit;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author david
 */
public class ExamenB extends javax.swing.JPanel {
    int cont = 0;   
    
    PreguntasB preguntas = new PreguntasB();
    List<Pregunta> lista = preguntas.getLista();
    int nPreguntas = lista.size()+1;
    Random r = new Random();

    /**
     * Creates new form Pantalla_Examen
     */
    public ExamenB()  {
        initComponents();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);
        buttonGroup1.add(r3);

        refresh();
        

    }
    
    public void refresh(){
        boolean salir = false;
        if(salir==false){
            Pregunta p = lista.get(cont);
            jTextArea2.setText(p.getEnunciado());
            String ref = p.getRef();
            jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Archivos\\mediadgt\\"+ref+".jpg"));
            jLabel2.setText((cont+1)+"/"+(nPreguntas-1));
            r1.setText("a) "+p.getR1());
            r2.setText("b) "+p.getR2());
            r3.setText("c) "+p.getR3());
            if(p.getRd()!=null){
                if(r1.getText().substring(2).equals(p.getRd())){r1.setSelected(true);}
                else if(r2.getText().substring(2).equals(p.getRd())){r2.setSelected(true);}
                else if(r3.getText().substring(2).equals(p.getRd())){r3.setSelected(true);}
            }
            else{buttonGroup1.clearSelection();}
            
        }
    }
    public void finalizar(){
        int contB = 0;
        int contM = 0;
        int contN = 0;
        int total = lista.size();
            for(int a=0;a<lista.size();a++){
                Pregunta p = lista.get(a);
                String rc = p.getRc();
                String rd = p.getRd();
                if(rd != null){
                    if(rd.equals(String.valueOf(rc))){contB++;}
                    else{contM++;}
                }
                else{contN++;}
        }
            String porcentaje = String.valueOf(contB+"0");
            int resp;
            if(Integer.parseInt(porcentaje)<90){
                ImageIcon file = new ImageIcon("C:\\Archivos\\mediadgt\\mal.png");
                resp = JOptionPane.showConfirmDialog(Finalizar, "Aciertos: "+contB+"\nFallos: "+contM+"\nSin responder: "+contN+"\nPorcentaje de acierto: "+porcentaje+"% \n¿Quieres hacer otro test?", "PRUEBA SUSPENSA", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,file);
            }
            else{
                ImageIcon file = new ImageIcon("C:\\Archivos\\mediadgt\\guay.png");
                resp = JOptionPane.showConfirmDialog(Finalizar, "Aciertos: "+contB+"\nFallos: "+contM+"\nSin responder: "+contN+"\nPorcentaje de acierto: "+porcentaje+"% \n¿Quieres hacer otro test?", "PRUEBA APROBADA", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,file);            }
            if(resp==0){
                    this.setVisible(false);
                }
            else{System.exit(0);}
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
        jLabel1 = new javax.swing.JLabel();
        btnsig = new javax.swing.JButton();
        btnant = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        Finalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        btnsig.setText("<--------");
        btnsig.setToolTipText("Anterior pregunta");
        btnsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigActionPerformed(evt);
            }
        });

        btnant.setText("--------->");
        btnant.setToolTipText("Siguente pregunta");
        btnant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnantActionPerformed(evt);
            }
        });

        r1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        r1.setText("jRadioButton1");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        r2.setText("jRadioButton2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r3.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        r3.setText("jRadioButton3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        Finalizar.setText("Finalizar");
        Finalizar.setToolTipText("Finaliza la prueba");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(btnsig)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnant))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(Finalizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Finalizar)
                .addGap(63, 63, 63)
                .addComponent(r1)
                .addGap(57, 57, 57)
                .addComponent(r2)
                .addGap(60, 60, 60)
                .addComponent(r3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsig)
                    .addComponent(btnant)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigActionPerformed
    if(cont>0){
        cont--;
        refresh();
    }        
    }//GEN-LAST:event_btnsigActionPerformed

    private void btnantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnantActionPerformed
    //cambiar 10 por npreguntas
    if(cont<(nPreguntas-1)){
        cont++;
        refresh();
    }
    }//GEN-LAST:event_btnantActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        Pregunta p = lista.get(cont);
        p.setRd(r1.getText().substring(3));
    }//GEN-LAST:event_r1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        Pregunta p = lista.get(cont);
        p.setRd(r3.getText().substring(3));
    }//GEN-LAST:event_r3ActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        finalizar();
    }//GEN-LAST:event_FinalizarActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        Pregunta p = lista.get(cont);
        p.setRd(r2.getText().substring(3));
    }//GEN-LAST:event_r2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton btnant;
    private javax.swing.JButton btnsig;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    // End of variables declaration//GEN-END:variables
}
