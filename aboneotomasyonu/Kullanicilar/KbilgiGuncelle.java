package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.VTBaglantisi;
import java.sql.SQLException;


/**
 *
 * @author PartheniaNora
 */
public class KbilgiGuncelle extends javax.swing.JFrame {

    public KbilgiGuncelle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblkadi = new javax.swing.JLabel();
        lblkid = new javax.swing.JLabel();
        txtkadi = new javax.swing.JTextField();
        txtkid = new javax.swing.JTextField();
        btnguncelle = new javax.swing.JButton();
        lblgeridon = new javax.swing.JLabel();
        lblnot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Kullanıcı Bilgilerini Güncelleme");

        lblkadi.setText("Yeni Kullanıcı Adı:");

        lblkid.setText("Kullanıcı ID:");

        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });

        lblgeridon.setText("Geri Dön");
        lblgeridon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgeridonMouseClicked(evt);
            }
        });

        lblnot.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblnot.setText("Not: sadece \"Kullanıcı adı\"nızı değiştirebilirsiniz...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeridon)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnguncelle)
                        .addComponent(txtkid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblnot)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblkadi)
                                .addComponent(lblkid))
                            .addGap(36, 36, 36)
                            .addComponent(txtkadi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeridon))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkadi)
                    .addComponent(txtkadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkid)
                    .addComponent(txtkid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnguncelle)
                .addGap(26, 26, 26)
                .addComponent(lblnot)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblgeridonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeridonMouseClicked

        KullaniciIslemleri ac = new KullaniciIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeridonMouseClicked

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
        try {
            String kadi = txtkadi.getText();
            int kid = Integer.parseInt(txtkid.getText());
            
            VTBaglantisi.KullaniciGuncelle(kadi, kid);
            
        } catch (SQLException e) {
            System.out.println(e); 
        }
        txtkadi.setText(""); //butona tıklanıldığında txtleri silmesi için yazdık her bir text için ayrı yazılır.
        txtkid.setText("");
        
    }//GEN-LAST:event_btnguncelleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new KbilgiGuncelle().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeridon;
    private javax.swing.JLabel lblkadi;
    private javax.swing.JLabel lblkid;
    private javax.swing.JLabel lblnot;
    private javax.swing.JTextField txtkadi;
    private javax.swing.JTextField txtkid;
    // End of variables declaration//GEN-END:variables
}
