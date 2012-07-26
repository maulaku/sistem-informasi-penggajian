/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LihatGolonganGUI.java
 *
 * Created on 24 Jul 12, 23:24:10
 */
package gui;


import dao.KaryawanDAO;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dhurand
 */
public class LihatKaryawanGUI extends javax.swing.JInternalFrame {

    EntityManager em;
    KaryawanDAO dao;
    /** Creates new form LihatGolonganGUI */
    public LihatKaryawanGUI(EntityManager em) {
        initComponents();
        this.em = em;
        this.binding();
    }
    
    public void binding(){
        dao = new KaryawanDAO(em);
        String[] title = {"NIK","Nama","Golongan","Gender","Alamat"};
        Object[][] data = new Object[dao.getAll().size()][5];
        for (int i = 0; i < dao.getAll().size(); i++) {
            
            data[i][0] = dao.getAll().get(i).getNIK();
            data[i][1] = dao.getAll().get(i).getNama();
            data[i][2] = dao.getAll().get(i).getGolongan();
            data[i][3] = dao.getAll().get(i).getGender();
            data[i][4] = dao.getAll().get(i).getAlamat();
            
        }
        
        DefaultTableModel model = new DefaultTableModel(data, title);
        tabel.setModel(model);
        this.jScrollPane1.setViewportView(tabel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        refresh_btn = new javax.swing.JButton();
        keluar_btn = new javax.swing.JButton();

        setTitle("Lihat Karyawan");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel.setEnabled(false);
        jScrollPane1.setViewportView(tabel);

        refresh_btn.setText("Refresh");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        keluar_btn.setText("Keluar");
        keluar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(refresh_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keluar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh_btn)
                    .addComponent(keluar_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        // TODO add your handling code here:
        this.binding();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void keluar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_btnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_keluar_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar_btn;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}