/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbolayoutcatering;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Febo
 */
import DB.query;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class daftar extends javax.swing.JFrame {

    /**
     * Creates new form daftar
     */
    public static String NamaUser;
    public static String EmailUser;
    public static String nomorUser;
    public static String alamatUser;
    public static String idUser;

    private query theQuery;

    public daftar() throws SQLException {
        initComponents();
        theQuery = new query();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Alamat = new javax.swing.JTextField();
        nomor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, -1));

        nama.setFont(new java.awt.Font("Multicolore ", 0, 11)); // NOI18N
        nama.setBorder(null);
        nama.setOpaque(false);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 240, 30));

        email.setFont(new java.awt.Font("Multicolore ", 0, 11)); // NOI18N
        email.setBorder(null);
        email.setOpaque(false);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 30));

        jPasswordField1.setBorder(null);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 240, 30));

        jPasswordField2.setBorder(null);
        jPasswordField2.setOpaque(false);
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 230, 30));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 180, 50));

        Alamat.setBorder(null);
        Alamat.setOpaque(false);
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 220, 30));

        nomor.setBorder(null);
        nomor.setOpaque(false);
        nomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomorKeyTyped(evt);
            }
        });
        getContentPane().add(nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 220, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desain/daftar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new menu().setVisible(true);
        dispose();
        this.idUser = id.getText();
        this.NamaUser = nama.getText();
        this.EmailUser = email.getText();
        this.alamatUser = Alamat.getText();
        this.nomorUser = nomor.getText();

        if (idUser.isEmpty()) {
            theQuery.insertUser(NamaUser, nomorUser, EmailUser, alamatUser);
            System.out.println("simpan");
        } else {
            System.out.println("update");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        nama.setToolTipText("Nama lengkap anda");
    }//GEN-LAST:event_namaActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailKeyTyped

    private void nomorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomorKeyTyped
        char nomor = evt.getKeyChar();
        if (!(Character.isDigit(nomor))
                || (nomor == KeyEvent.VK_BACK_SPACE)
                || (nomor == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(this, "masukkan nomor dengan awalan 62");
            evt.consume();
        }
    }//GEN-LAST:event_nomorKeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
//        if (jPasswordField1 <8) { 
//            
//        }
        JOptionPane.showMessageDialog(this, "masukkan minimal 8 digit password");
        //   evt.consume();        
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        JOptionPane.showMessageDialog(this, "masukkan sesuai password sebelumnya");
        evt.consume();
    }//GEN-LAST:event_jPasswordField2KeyTyped

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
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new daftar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(daftar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nomor;
    // End of variables declaration//GEN-END:variables
}
