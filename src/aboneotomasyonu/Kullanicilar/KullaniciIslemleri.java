
package aboneotomasyonu.Kullanicilar;

/**
 *
 * @author PartheniaNora
 */
public class KullaniciIslemleri extends javax.swing.JFrame {

    
    public KullaniciIslemleri() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblyeni = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        lblguncelle = new javax.swing.JLabel();
        lblsil = new javax.swing.JLabel();
        lbltumkayit = new javax.swing.JLabel();
        lblgeri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Kullanıcı İşlemleri");

        lblyeni.setText("Yeni Kullanıcı Eklemek için tıklayınız...");
        lblyeni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblyeniMouseClicked(evt);
            }
        });

        lblsifre.setText("Şifrenizi Değiştirmek için tıklayınız...");
        lblsifre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsifreMouseClicked(evt);
            }
        });

        lblguncelle.setText("Kullanıcı Bilgilerinizi Güncellemek için tıklayınız...");
        lblguncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblguncelleMouseClicked(evt);
            }
        });

        lblsil.setText("Kullanıcı Silmek için tıklayınız...");
        lblsil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsilMouseClicked(evt);
            }
        });

        lbltumkayit.setText("Tüm Kullanıcıları Görüntülemek için tıklayınız...");
        lbltumkayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltumkayitMouseClicked(evt);
            }
        });

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
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsifre)
                    .addComponent(lblyeni)
                    .addComponent(lblguncelle)
                    .addComponent(lblsil)
                    .addComponent(lbltumkayit))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(32, 32, 32)
                .addComponent(lblyeni)
                .addGap(18, 18, 18)
                .addComponent(lblsifre)
                .addGap(18, 18, 18)
                .addComponent(lblguncelle)
                .addGap(18, 18, 18)
                .addComponent(lblsil)
                .addGap(18, 18, 18)
                .addComponent(lbltumkayit)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblyeniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblyeniMouseClicked
    
        KullaniciEkle ac = new KullaniciEkle();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblyeniMouseClicked

    private void lblsifreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsifreMouseClicked
        
        SifreDegistir ac = new SifreDegistir();
        ac.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblsifreMouseClicked

    private void lblguncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblguncelleMouseClicked
     
        KbilgiGuncelle ac = new KbilgiGuncelle();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblguncelleMouseClicked

    private void lblsilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsilMouseClicked
        
        KullaniciSil ac = new KullaniciSil();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblsilMouseClicked

    private void lbltumkayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltumkayitMouseClicked
      
        KtumKayit ac = new KtumKayit();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbltumkayitMouseClicked

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
        
        KullaniciPaneli ac = new KullaniciPaneli();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

    
    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblguncelle;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JLabel lblsil;
    private javax.swing.JLabel lbltumkayit;
    private javax.swing.JLabel lblyeni;
    // End of variables declaration//GEN-END:variables
}
