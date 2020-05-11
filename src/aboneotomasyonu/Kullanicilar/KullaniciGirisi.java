
package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.VTBaglantisi;

/**
 *
 * @author PartheniaNora
 */
public class KullaniciGirisi extends javax.swing.JFrame {

    
    public KullaniciGirisi() {
       
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhosgeldin = new javax.swing.JLabel();
        lblkullanici = new javax.swing.JLabel();
        lblsifre = new javax.swing.JLabel();
        psssifre = new javax.swing.JPasswordField();
        txtkullanici = new javax.swing.JTextField();
        btngiris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abone / Müşteri Otomasyonu");

        lblhosgeldin.setText("Abone / Müşteri Otomasyonuna Hoş Geldiniz...");

        lblkullanici.setText("Kullanıcı Adı:");

        lblsifre.setText("Şifre:");

        psssifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psssifreActionPerformed(evt);
            }
        });

        btngiris.setText("Giriş");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblkullanici)
                    .addComponent(lblsifre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btngiris)
                    .addComponent(txtkullanici, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(psssifre))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblhosgeldin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblhosgeldin)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblkullanici)
                    .addComponent(txtkullanici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psssifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsifre))
                .addGap(26, 26, 26)
                .addComponent(btngiris)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
      
        VTBaglantisi.baglantiAc();
            try {
                
                String kadi = txtkullanici.getText();
                char[] input = psssifre.getPassword();
                String sifre = new String(input);
                
                VTBaglantisi.kullanicikontrol(kadi, sifre); 
                
                this.dispose(); //bu pencereyi kapatmasını sağlar.
            }
            catch (Exception e) {
                System.out.println(e);
            } 
    }//GEN-LAST:event_btngirisActionPerformed

    private void psssifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psssifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psssifreActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciGirisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiris;
    private javax.swing.JLabel lblhosgeldin;
    private javax.swing.JLabel lblkullanici;
    private javax.swing.JLabel lblsifre;
    private javax.swing.JPasswordField psssifre;
    private javax.swing.JTextField txtkullanici;
    // End of variables declaration//GEN-END:variables
}
