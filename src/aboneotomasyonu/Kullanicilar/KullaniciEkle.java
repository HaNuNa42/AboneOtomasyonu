package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.VTBaglantisi;
import javax.swing.*;

public class KullaniciEkle extends javax.swing.JFrame {

    public KullaniciEkle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblkadi = new javax.swing.JLabel();
        lbladi = new javax.swing.JLabel();
        lblsoyadi = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        btnekle = new javax.swing.JButton();
        txtkadi = new javax.swing.JTextField();
        txtadi = new javax.swing.JTextField();
        txtsoyadi = new javax.swing.JTextField();
        txtsifre = new javax.swing.JTextField();
        lblbaslik = new javax.swing.JLabel();
        lblgeri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblkadi.setText("Kullanıcı Adı:");

        lbladi.setText("Adı:");

        lblsoyadi.setText("Soyadı:");

        lblsifre.setText("Şifre:");

        btnekle.setText("Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        lblbaslik.setText("Yeni Kullanıcı Ekle ");

        lblgeri.setText("Geri Dön");
        lblgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgeriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblkadi)
                    .addComponent(lbladi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsoyadi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsifre, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnekle)
                    .addComponent(txtkadi)
                    .addComponent(txtadi)
                    .addComponent(txtsoyadi)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkadi)
                    .addComponent(txtkadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladi)
                    .addComponent(txtadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoyadi)
                    .addComponent(txtsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsifre)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnekle)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
        
        KullaniciIslemleri ac = new KullaniciIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed

        try {
            String ad = txtadi.getText();
            String soyad = txtsoyadi.getText();
            String kadi = txtkadi.getText();
            String sifre = txtsifre.getText();

            VTBaglantisi.KullaniciEkle(ad, soyad, kadi, sifre);
            System.out.println("kayıt oluşturuldu! sisteme giriş yapabilirsiniz...");
           
        } catch (Exception e) {
            System.out.println("kayıt oluşturulmadı");
            JOptionPane.showConfirmDialog(null, "kayıt oluşturulmadı", "Abone / Müşteri Otomasyonu", JOptionPane.PLAIN_MESSAGE);
        }
        
        txtadi.setText(""); //butona tıklanıldığında txtleri silmesi için yazdık her bir text için ayrı yazılır.
        txtsoyadi.setText("");
        txtkadi.setText("");
        txtsifre.setText("");
       
    }//GEN-LAST:event_btnekleActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnekle;
    private javax.swing.JLabel lbladi;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblkadi;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JLabel lblsoyadi;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextField txtkadi;
    private javax.swing.JTextField txtsifre;
    private javax.swing.JTextField txtsoyadi;
    // End of variables declaration//GEN-END:variables
}
