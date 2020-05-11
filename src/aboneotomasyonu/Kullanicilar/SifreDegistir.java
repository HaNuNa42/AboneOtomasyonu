
package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.VTBaglantisi;


/**
 *
 * @author PartheniaNora
 */
public class SifreDegistir extends javax.swing.JFrame {

    public SifreDegistir() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblmevcut = new javax.swing.JLabel();
        lblyeni = new javax.swing.JLabel();
        txtkid = new javax.swing.JTextField();
        txtmevcut = new javax.swing.JTextField();
        btnguncelle = new javax.swing.JButton();
        lblgeri = new javax.swing.JLabel();
        lblkid = new javax.swing.JLabel();
        txtyeni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Şifre Güncelleme");

        lblmevcut.setText("Mevcut Şifrenizi Giriniz: ");

        lblyeni.setText("Yeni Şifrenizi Giriniz:");

        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });

        lblgeri.setText("Geri Dön");
        lblgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgeriMouseClicked(evt);
            }
        });

        lblkid.setText("Kullanıcı ID'nizi Giriniz:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblkid)
                    .addComponent(lblmevcut)
                    .addComponent(lblyeni))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnguncelle)
                    .addComponent(txtmevcut, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtkid)
                    .addComponent(txtyeni))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkid))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmevcut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmevcut))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyeni)
                    .addComponent(txtyeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnguncelle)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed
         try {
            int kid = Integer.parseInt(txtkid.getText());
            String mevcut = txtmevcut.getText();
            String yeni = txtyeni.getText();

            VTBaglantisi.SifreGuncelle(kid, mevcut, yeni);
            
        }
         catch (Exception e) {
            System.out.println(e);
        }
         txtkid.setText("");
         txtmevcut.setText("");
         txtyeni.setText("");
    }//GEN-LAST:event_btnguncelleActionPerformed

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
       
        KullaniciIslemleri ac = new KullaniciIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreDegistir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguncelle;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblkid;
    private javax.swing.JLabel lblmevcut;
    private javax.swing.JLabel lblyeni;
    private javax.swing.JTextField txtkid;
    private javax.swing.JTextField txtmevcut;
    private javax.swing.JTextField txtyeni;
    // End of variables declaration//GEN-END:variables
}
