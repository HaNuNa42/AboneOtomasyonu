
package aboneotomasyonu.Musteriler;

import aboneotomasyonu.MusteriGetSet;
import aboneotomasyonu.VTBaglantisi;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PartheniaNora
 */
public class MtumKayit extends javax.swing.JFrame {

    DefaultTableModel model;
    static Connection bag;
 
    public MtumKayit() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbaslik = new javax.swing.JLabel();
        btngetir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmusteri = new javax.swing.JTable();
        lblgeri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblbaslik.setText("Tüm Müşterileri Görüntüleme");

        btngetir.setText("Müşteri Kayıtlarını Getir");
        btngetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetirActionPerformed(evt);
            }
        });

        tblmusteri.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblmusteri);
        if (tblmusteri.getColumnModel().getColumnCount() > 0) {
            tblmusteri.getColumnModel().getColumn(0).setResizable(false);
            tblmusteri.getColumnModel().getColumn(1).setResizable(false);
            tblmusteri.getColumnModel().getColumn(2).setResizable(false);
            tblmusteri.getColumnModel().getColumn(3).setResizable(false);
            tblmusteri.getColumnModel().getColumn(4).setResizable(false);
            tblmusteri.getColumnModel().getColumn(5).setResizable(false);
            tblmusteri.getColumnModel().getColumn(6).setResizable(false);
            tblmusteri.getColumnModel().getColumn(7).setResizable(false);
        }

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btngetir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(lblbaslik)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgeri))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbaslik)
                    .addComponent(lblgeri))
                .addGap(12, 12, 12)
                .addComponent(btngetir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetirActionPerformed
        
        model = (DefaultTableModel)tblmusteri.getModel();
        try {
            VTBaglantisi.MusteriListele();
            ArrayList<MusteriGetSet> mgetset = VTBaglantisi.MusteriListele();
            for(MusteriGetSet mgs : mgetset) {
                Object[] satirlar = {
                    mgs.getMid(), 
                    mgs.getAd(), 
                    mgs.getSoyad(), 
                    mgs.getUnvani(), 
                    mgs.getTelefon(),
                    mgs.getEposta(),
                    mgs.getFirma(),
                    mgs.getAdres() };
                model.addRow(satirlar); 
            }
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btngetirActionPerformed

    private void lblgeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblgeriMouseClicked
        MusteriIslemleri ac = new MusteriIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblgeriMouseClicked

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MtumKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngetir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblgeri;
    private javax.swing.JTable tblmusteri;
    // End of variables declaration//GEN-END:variables
}
