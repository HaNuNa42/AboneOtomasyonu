
package aboneotomasyonu.Kullanicilar;

import aboneotomasyonu.KullaniciGetSet;
import aboneotomasyonu.VTBaglantisi;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Parthenia Nora
 */
public class KtumKayit extends javax.swing.JFrame {

    DefaultTableModel model;
    static Connection bag;
   
    
    public KtumKayit() {
        initComponents();
        
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcikisyap = new javax.swing.JLabel();
        lblbaslik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkullanici = new javax.swing.JTable();
        btngetir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblcikisyap.setText("Geri Dön");
        lblcikisyap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcikisyapMouseClicked(evt);
            }
        });

        lblbaslik.setText("Tüm Kullanıcıları Görüntüleme");

        tblkullanici.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kid", "kadi", "adi", "soyadi", "sifre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblkullanici);

        btngetir.setText("Kullanıcı Kayıtlarını Getir");
        btngetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblbaslik)
                        .addGap(155, 155, 155)
                        .addComponent(lblcikisyap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btngetir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblbaslik))
                    .addComponent(lblcikisyap))
                .addGap(16, 16, 16)
                .addComponent(btngetir)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcikisyapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcikisyapMouseClicked
        KullaniciIslemleri ac = new KullaniciIslemleri();
        ac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcikisyapMouseClicked

    private void btngetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetirActionPerformed
         
        model = (DefaultTableModel)tblkullanici.getModel();
        try {
            VTBaglantisi.KullaniciListele();
            ArrayList<KullaniciGetSet> kgetset = VTBaglantisi.KullaniciListele();
            for(KullaniciGetSet kgs : kgetset) {
                Object[] satirlar = {
                    kgs.getkid(), 
                    kgs.getkadi(), 
                    kgs.getadi(), 
                    kgs.getsoyadi(), 
                    kgs.getsifre() };
                model.addRow(satirlar); 
            }
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btngetirActionPerformed

    
    public static void main(String args[]) {
        
        
 

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KtumKayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngetir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbaslik;
    private javax.swing.JLabel lblcikisyap;
    private javax.swing.JTable tblkullanici;
    // End of variables declaration//GEN-END:variables
}
