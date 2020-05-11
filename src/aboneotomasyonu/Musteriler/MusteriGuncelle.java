
package aboneotomasyonu.Musteriler;

import aboneotomasyonu.VTBaglantisi;
import javax.swing.JOptionPane;

/**
 *
 * @author Parthenia Nora
 */
public class MusteriGuncelle extends javax.swing.JFrame {

    
    public MusteriGuncelle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblad = new javax.swing.JLabel();
        txttel = new javax.swing.JTextField();
        lblsoyad = new javax.swing.JLabel();
        txteposta = new javax.swing.JTextField();
        lbltel = new javax.swing.JLabel();
        txtadres = new javax.swing.JTextField();
        lbleposta = new javax.swing.JLabel();
        lbladres = new javax.swing.JLabel();
        btnguncelle = new javax.swing.JButton();
        txtad = new javax.swing.JTextField();
        txtsoyad = new javax.swing.JTextField();
        lblgeri = new javax.swing.JLabel();
        lblnot = new javax.swing.JLabel();
        lblmid = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Abone / Müşteri Güncelle");

        lblad.setText("Müşteri Adı:");

        lblsoyad.setText("Müşteri Soyadı:");

        lbltel.setText("Müşteri Telefonu:");

        lbleposta.setText("Müşteri E-posta:");

        lbladres.setText("Müşteri İş Adresi:");

        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });

        txtad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadActionPerformed(evt);
            }
        });

        lblgeri.setText("Geri dön");
        lblgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgeriMouseClicked(evt);
            }
        });

        lblnot.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblnot.setText("Not: Kişinin sadece \"telefon, e-posta ve adres\"i değiştirebilirsiniz...");

        lblmid.setText("Müşteri ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnot)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblad)
                            .addComponent(lblsoyad)
                            .addComponent(lbltel)
                            .addComponent(lbleposta)
                            .addComponent(lbladres)
                            .addComponent(lblmid))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtadres, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(btnguncelle)
                            .addComponent(txtad)
                            .addComponent(txtsoyad)
                            .addComponent(txttel)
                            .addComponent(txteposta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtmid))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblad)
                    .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoyad)
                    .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltel)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbleposta)
                    .addComponent(txteposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladres)
                    .addComponent(txtadres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnguncelle)
                .addGap(18, 18, 18)
                .addComponent(lblnot)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
        try {
            int mid = Integer.parseInt(txtmid.getText());
            String ad = txtad.getText();
            String soyad = txtsoyad.getText();
            String adres = txtadres.getText();
            String telefon = txttel.getText();
            String eposta = txteposta.getText();

            VTBaglantisi.MusteriGuncelle(mid,ad,soyad,telefon,eposta,adres);
            
        } catch (Exception e) {
            System.out.println(e); 
        }
        txtmid.setText(""); //butona tıklanıldığında txtleri silmesi için yazdık her bir text için ayrı yazılır.
        txtad.setText("");
        txtsoyad.setText("");
        txtadres.setText("");
        txttel.setText("");
        txteposta.setText("");
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void txtadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadActionPerformed

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
        MusteriIslemleri ac = new MusteriIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriGuncelle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lbladres;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lbleposta;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblmid;
    private javax.swing.JLabel lblnot;
    private javax.swing.JLabel lblsoyad;
    private javax.swing.JLabel lbltel;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txteposta;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtsoyad;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
