package aboneotomasyonu.Musteriler;

import aboneotomasyonu.Kullanicilar.KullaniciPaneli;

/**
 *
 * @author PartheniaNora
 */
public class MusteriIslemleri extends javax.swing.JFrame {

    public MusteriIslemleri() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblmusteriekle = new javax.swing.JLabel();
        lblmusterisil = new javax.swing.JLabel();
        lblmusteriguncelle = new javax.swing.JLabel();
        lblkayitgor = new javax.swing.JLabel();
        lblmusteriara = new javax.swing.JLabel();
        lblcikis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Abone / Müşteri İşlemleri");

        lblmusteriekle.setText("Abone / Müşteri Eklemek için tıklayınız...");
        lblmusteriekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmusteriekleMouseClicked(evt);
            }
        });

        lblmusterisil.setText("Abone / Müşteri Silmek için tıklayınız...");
        lblmusterisil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmusterisilMouseClicked(evt);
            }
        });

        lblmusteriguncelle.setText("Abone / Müşteri Güncellemek için tıklayınız...");
        lblmusteriguncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmusteriguncelleMouseClicked(evt);
            }
        });

        lblkayitgor.setText("Abone / Müşteri Tüm Kayıtları Görüntülemek için tıklayınız...");
        lblkayitgor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblkayitgorMouseClicked(evt);
            }
        });

        lblmusteriara.setText("Abone / Müşteri Aramak için tıklayınız...");
        lblmusteriara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblmusteriaraMouseClicked(evt);
            }
        });

        lblcikis.setText("Çıkış Yap");
        lblcikis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcikisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcikis)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmusterisil)
                    .addComponent(lblmusteriekle)
                    .addComponent(lblmusteriguncelle)
                    .addComponent(lblmusteriara)
                    .addComponent(lblkayitgor))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblcikis))
                .addGap(29, 29, 29)
                .addComponent(lblmusteriekle)
                .addGap(18, 18, 18)
                .addComponent(lblmusterisil)
                .addGap(18, 18, 18)
                .addComponent(lblmusteriguncelle)
                .addGap(18, 18, 18)
                .addComponent(lblmusteriara)
                .addGap(18, 18, 18)
                .addComponent(lblkayitgor)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblmusteriekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmusteriekleMouseClicked

        MusteriEkle ac = new MusteriEkle();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblmusteriekleMouseClicked

    private void lblmusterisilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmusterisilMouseClicked

        MusteriSil ac = new MusteriSil();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblmusterisilMouseClicked

    private void lblmusteriguncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmusteriguncelleMouseClicked

        MusteriGuncelle ac = new MusteriGuncelle();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblmusteriguncelleMouseClicked

    private void lblmusteriaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblmusteriaraMouseClicked

        MusteriAra ac = new MusteriAra();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblmusteriaraMouseClicked

    private void lblkayitgorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblkayitgorMouseClicked

        MtumKayit ac = new MtumKayit();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblkayitgorMouseClicked

    private void lblcikisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcikisMouseClicked
        KullaniciPaneli ac = new KullaniciPaneli();
        ac.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblcikisMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriIslemleri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblcikis;
    private javax.swing.JLabel lblkayitgor;
    private javax.swing.JLabel lblmusteriara;
    private javax.swing.JLabel lblmusteriekle;
    private javax.swing.JLabel lblmusteriguncelle;
    private javax.swing.JLabel lblmusterisil;
    // End of variables declaration//GEN-END:variables
}
