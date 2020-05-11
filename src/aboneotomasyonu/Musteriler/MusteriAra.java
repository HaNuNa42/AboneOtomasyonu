
package aboneotomasyonu.Musteriler;

import aboneotomasyonu.AramaSonuclari;
import aboneotomasyonu.VTBaglantisi;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PartheniaNora
 */
public class MusteriAra extends javax.swing.JFrame {

    DefaultTableModel model;
    static Connection bag;
    ResultSet rst;
    PreparedStatement prs;
    
    
    public MusteriAra() {
        initComponents();
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        lblad = new javax.swing.JLabel();
        lblsoyad = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        txtsoyad = new javax.swing.JTextField();
        btnara = new javax.swing.JButton();
        lblgeri = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsonuc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Abone / Müşteri Ara");

        lblad.setText("Adı:");

        lblsoyad.setText("Soyadı:");

        btnara.setText("Ara");
        btnara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaraActionPerformed(evt);
            }
        });

        lblgeri.setText("Geri Dön");
        lblgeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblgeriMouseClicked(evt);
            }
        });

        tblsonuc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mid", "ad", "soyad", "unvani", "telefon", "eposta", "firma", "adres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblsonuc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblbaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblgeri)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblad)
                            .addComponent(lblsoyad))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnara)
                            .addComponent(txtsoyad)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblad)
                    .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsoyad)
                    .addComponent(txtsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
        
        MusteriIslemleri ac = new MusteriIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

    private void btnaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaraActionPerformed
        try {
            String ad = txtad.getText();
            String soyad = txtsoyad.getText();
            
           ArrayList<AramaSonuclari> getir = VTBaglantisi.MusteriAra(ad, soyad);
           model = (DefaultTableModel)tblsonuc.getModel(); 
            
           for(AramaSonuclari goster : getir) {
                Object[] satirlar = {
                    goster.getMid(), 
                    goster.getAd(), 
                    goster.getSoyad(), 
                    goster.getUnvani(), 
                    goster.getTelefon(),
                    goster.getEposta(),
                    goster.getFirma(),
                    goster.getAdres() };
                model.addRow(satirlar); }
                      
            System.out.println("yazdırılıyor");
           
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        txtad.setText("");
        txtsoyad.setText("");
        
    }//GEN-LAST:event_btnaraActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriAra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblad;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JLabel lblsoyad;
    private javax.swing.JTable tblsonuc;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtsoyad;
    // End of variables declaration//GEN-END:variables
}
