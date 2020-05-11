
package aboneotomasyonu.Musteriler;


import aboneotomasyonu.VTBaglantisi;

/**
 *
 * @author PartheniaNora
 */
public class MusteriEkle extends javax.swing.JFrame {

    
    public MusteriEkle() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblad = new javax.swing.JLabel();
        lblsoyad = new javax.swing.JLabel();
        lblunvan = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        lblmail = new javax.swing.JLabel();
        lblfirma = new javax.swing.JLabel();
        lbladres = new javax.swing.JLabel();
        btnekle = new javax.swing.JButton();
        txtadi = new javax.swing.JTextField();
        txtsoyadi = new javax.swing.JTextField();
        txtunvan = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtfirma = new javax.swing.JTextField();
        txtadres = new javax.swing.JTextField();
        lblgeri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Abone / Müşteri Ekleme");

        lblad.setText("Adı:");

        lblsoyad.setText("Soyadı:");

        lblunvan.setText("Unvanı:");

        lbltel.setText("Telefonu:");

        lblmail.setText("E-posta:");

        lblfirma.setText("Firma:");

        lbladres.setText("Adres:");

        btnekle.setText("Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
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
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbladres)
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnekle)
                            .addComponent(txtadi)
                            .addComponent(txtsoyadi)
                            .addComponent(txtunvan)
                            .addComponent(txttel)
                            .addComponent(txtmail)
                            .addComponent(txtfirma)
                            .addComponent(txtadres, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblad)
                            .addComponent(lblunvan)
                            .addComponent(lblsoyad)
                            .addComponent(lbltel)
                            .addComponent(lblmail)
                            .addComponent(lblfirma))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblad)
                    .addComponent(txtadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoyad)
                    .addComponent(txtsoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblunvan)
                    .addComponent(txtunvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltel)
                    .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmail)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfirma)
                    .addComponent(txtfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtadres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladres))
                .addGap(18, 18, 18)
                .addComponent(btnekle)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
    
        try {
            String ad = txtadi.getText();
            String soyad = txtsoyadi.getText();
            String unvan = txtunvan.getText();
            String telefon = txttel.getText();
            String eposta = txtmail.getText();
            String firma = txtfirma.getText();
            String adres = txtadres.getText();

            VTBaglantisi.MusteriEkle(ad, soyad, unvan, telefon, eposta ,firma, adres);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        txtadi.setText("");
        txtsoyadi.setText("");
        txtunvan.setText("");
        txttel.setText("");
        txtmail.setText("");
        txtfirma.setText("");
        txtadres.setText("");
    }//GEN-LAST:event_btnekleActionPerformed

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
       
        MusteriIslemleri ac = new MusteriIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriEkle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnekle;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lbladres;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblfirma;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblsoyad;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lblunvan;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextField txtadres;
    private javax.swing.JTextField txtfirma;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtsoyadi;
    private javax.swing.JTextField txttel;
    private javax.swing.JTextField txtunvan;
    // End of variables declaration//GEN-END:variables
}
