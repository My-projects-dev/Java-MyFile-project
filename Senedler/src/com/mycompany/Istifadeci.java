/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ELVIN
 */
public class Istifadeci extends javax.swing.JFrame {

    InsertApp con = new InsertApp();
    public Istifadeci() {
        initComponents();
        
        textAd2.setVisible(false);
        textQAd.setVisible(false);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("workfiles.png")));
        this.setTitle("My files");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAxtar = new javax.swing.JButton();
        textAxtar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cedvel = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        textAd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textSifre = new javax.swing.JTextField();
        textSifre2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnDeyisdir = new javax.swing.JButton();
        btnQeyd = new javax.swing.JButton();
        textAd2 = new javax.swing.JTextField();
        textQAd = new javax.swing.JTextField();
        textSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        btnAxtar.setBackground(new java.awt.Color(102, 255, 0));
        btnAxtar.setText("Axtar");
        btnAxtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAxtarActionPerformed(evt);
            }
        });

        cedvel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??stifad????i ad??", "S??lahiyy??t", "??ifr??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cedvel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cedvelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cedvel);
        if (cedvel.getColumnModel().getColumnCount() > 0) {
            cedvel.getColumnModel().getColumn(2).setMinWidth(0);
            cedvel.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("??stifad????i ad??");

        jLabel2.setText("??ifr??");

        jComboBox1.setBackground(new java.awt.Color(153, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "menecer", "??stifad????i" }));

        btnDeyisdir.setBackground(new java.awt.Color(102, 102, 255));
        btnDeyisdir.setText("D??yi??dir");
        btnDeyisdir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeyisdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeyisdirActionPerformed(evt);
            }
        });

        btnQeyd.setBackground(new java.awt.Color(102, 102, 255));
        btnQeyd.setText("Qeydiyyat");
        btnQeyd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQeyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQeydActionPerformed(evt);
            }
        });

        textAd2.setText(" ");

        textSil.setBackground(new java.awt.Color(255, 51, 51));
        textSil.setText("Sil");
        textSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textAxtar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAxtar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSil))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textAd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textQAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(textSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textSifre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(textAd, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDeyisdir, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQeyd, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAxtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAxtar)
                    .addComponent(textSil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeyisdir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQeyd)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAxtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAxtarActionPerformed
        axtar();
    }//GEN-LAST:event_btnAxtarActionPerformed

    
    
    
    
    private void cedvelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedvelMouseClicked
        DefaultTableModel tablo = (DefaultTableModel) cedvel.getModel();
        
        textAd.setText(tablo.getValueAt(cedvel.getSelectedRow(), 0).toString());
        textAd2.setText(tablo.getValueAt(cedvel.getSelectedRow(), 0).toString());
        textSifre.setText(tablo.getValueAt(cedvel.getSelectedRow(), 2).toString());
        textSifre2.setText(tablo.getValueAt(cedvel.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_cedvelMouseClicked

    private void btnDeyisdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeyisdirActionPerformed
        String ad = textAd.getText();
        String ad2 = textAd2.getText();
        String sifre = textSifre.getText();
        String sifre2 = textSifre2.getText();
        String icaze = jComboBox1.getSelectedItem().toString();
        
        if(sifre.equals(sifre2) && !sifre.isBlank()){
            try{
                con.update(ad, sifre, icaze, ad2);
                JOptionPane.showMessageDialog(null,"U??urlu ??m??liyyat","U??urlu",-1);
                        
            }
       
            catch(HeadlessException e){
                JOptionPane.showMessageDialog(null,"M??lumat y??kl??n??rk??n xata ba?? verdi","X??ta",JOptionPane.WARNING_MESSAGE);
                System.out.println(e.getMessage());
            }
            textAd.setText("");
            textAd2.setText("");
            textSifre.setText("");
            textSifre2.setText("");
            axtar();

        }
        else{
            JOptionPane.showMessageDialog(null,"??ifr?? eyni deyil","X??ta",-1);
        }
    }//GEN-LAST:event_btnDeyisdirActionPerformed

    private void btnQeydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQeydActionPerformed
        
        String ad = textAd.getText();
        String sifre = textSifre.getText();
        String sifre2 = textSifre2.getText();
        String icaze = jComboBox1.getSelectedItem().toString();
        
        
        String sql = "SELECT * FROM istifadeci where istifadeci like '"+ad+"'";
        
        
        try (Connection conn = con.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
                  
                  
            while (rs.next()) {
                String istifadeci = rs.getString("istifadeci");
                textQAd.setText(istifadeci);
            }
            
            String tqa = textQAd.getText();
            if(sifre.isBlank()){
                 JOptionPane.showMessageDialog(null,"Xanalar?? doldurun","Diqq??t",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(ad.equals(tqa)){
                    JOptionPane.showMessageDialog(null,"Istifad????i ad?? m??vcuddur","Diqq??t",JOptionPane.INFORMATION_MESSAGE);
            }
            else if(!sifre.equals(sifre2)) {
                    JOptionPane.showMessageDialog(null,"Girdiyiniz ??ifr??l??r f??rqlidir","Diqq??t",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                    try{
                        
                        con.insert(ad, sifre, icaze);
                        JOptionPane.showMessageDialog(null,"U??urlu ??m??liyyat","U??urlu",-1);
                        
                    }
                    catch(HeadlessException e){
                        JOptionPane.showMessageDialog(null,"M??lumat y??kl??n??rk??n xata ba?? verdi","X??ta",JOptionPane.WARNING_MESSAGE);
                        System.out.println(e.getMessage());
                    }
            }
            
            textAd.setText("");
            textAd2.setText("");
            textSifre.setText("");
            textSifre2.setText("");
            axtar();
            
        } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"M??lumat y??kl??n??rk??n xata ba?? verdi","X??ta",-1);
            }
    }//GEN-LAST:event_btnQeydActionPerformed

    private void textSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSilActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Istifadeci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Istifadeci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Istifadeci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Istifadeci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Istifadeci().setVisible(true);
            }
        });
    }
    
    
    public void axtar()
    {
        String axtar = textAxtar.getText();
        DefaultTableModel tablo = (DefaultTableModel) cedvel.getModel();
        int setir = tablo.getRowCount();
        for(int i = setir -1; i>=0; i--)
        {
            tablo.removeRow(i);
        }
        String sql = "SELECT * FROM istifadeci where istifadeci like '%"+axtar+"%'";
        
        
        try (Connection conn = con.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
                  
                  
            while (rs.next()) {
                String istifadeci = rs.getString("istifadeci");
                String selahiyyet = rs.getString("selahiyyet");
                String sifre = rs.getString("sifre");
                      
                tablo.addRow(new Object[]{istifadeci, selahiyyet, sifre});
            }
        } catch (SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null,"M??lumat y??kl??n??rk??n xata ba?? verdi","X??ta",-1);
            }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAxtar;
    private javax.swing.JButton btnDeyisdir;
    private javax.swing.JButton btnQeyd;
    private javax.swing.JTable cedvel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textAd;
    private javax.swing.JTextField textAd2;
    private javax.swing.JTextField textAxtar;
    private javax.swing.JTextField textQAd;
    private javax.swing.JTextField textSifre;
    private javax.swing.JTextField textSifre2;
    private javax.swing.JButton textSil;
    // End of variables declaration//GEN-END:variables
}
