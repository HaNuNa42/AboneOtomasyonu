
package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.Musteriler.MusteriIslemleri;
import aboneotomasyonu.Kullanicilar.KullaniciGirisi;
/**
 *
 * @author PartheniaNora
 */
public class KullaniciPaneli extends javax.swing.JFrame {

    public KullaniciPaneli() {
        initComponents();
    }
    
    
  //  lblkullanici.setText("merhaba" + txtkullanici.getText() + "hoşgeldiniz...");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblkullanici = new javax.swing.JLabel();
        lblbaslik = new javax.swing.JLabel();
        btnmusteri = new javax.swing.JButton();
        btnkullanici = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblkullanici.setText("jLabel1");

        lblbaslik.setText("Kullanıcı Paneline Hoşgeldiniz...");

        btnmusteri.setText("Abone / Müşteri İşlemleri");
        btnmusteri.setName(""); // NOI18N
        btnmusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmusteriActionPerformed(evt);
            }
        });

        btnkullanici.setText("Kullanıcı İşlemleri");
        btnkullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkullaniciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblkullanici)
                .addGap(71, 71, 71)
                .addComponent(lblbaslik)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblkullanici))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmusteriActionPerformed
        
        MusteriIslemleri ac = new MusteriIslemleri();
        ac.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnmusteriActionPerformed

    private void btnkullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkullaniciActionPerformed
        
        KullaniciIslemleri ac = new KullaniciIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkullaniciActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkullanici;
    private javax.swing.JButton btnmusteri;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblkullanici;
    // End of variables declaration//GEN-END:variables
}
