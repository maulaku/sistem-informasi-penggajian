/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HapusKaryawanGUI.java
 *
 * Created on 25 Jul 12, 15:36:12
 */
package gui;

import dao.KaryawanDAO;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dhurand
 */
public class HapusKaryawanGUI extends javax.swing.JInternalFrame {

    EntityManager em;
    KaryawanDAO dao;
    /** Creates new form HapusKaryawanGUI */
    public HapusKaryawanGUI(EntityManager em) {
        initComponents();
        this.em = em;
        this.binding();
    }
    
    
    public void binding(){
        dao = new KaryawanDAO(em);
        nik_cmb.removeAllItems();
        for (int i = 0; i < dao.getAll().size(); i++) {
             nik_cmb.addItem(dao.getAll().get(i).getNIK());
            
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nik_cmb = new javax.swing.JComboBox();
        hapus_btn = new javax.swing.JButton();
        keluar_btn = new javax.swing.JButton();

        setTitle("Hapus Karyawan");

        jLabel1.setText("NIK");

        hapus_btn.setText("Hapus");
        hapus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_btnActionPerformed(evt);
            }
        });

        keluar_btn.setText("Keluar");
        keluar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hapus_btn)
                        .addGap(18, 18, 18)
                        .addComponent(keluar_btn))
                    .addComponent(nik_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nik_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus_btn)
                    .addComponent(keluar_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar_btnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_keluar_btnActionPerformed

    private void hapus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_btnActionPerformed
        // TODO add your handling code here:
        dao = new KaryawanDAO(em);
        try {
            
            JOptionPane.showMessageDialog(this, dao.Delete(nik_cmb.getSelectedItem().toString()));
            
            this.binding();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapus_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton keluar_btn;
    private javax.swing.JComboBox nik_cmb;
    // End of variables declaration//GEN-END:variables
}
