/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modullanjutan;

/**
 *
 * @author HP
 */
public class Modul5 extends javax.swing.JFrame {

    /**
     * Creates new form Modul5
     */
    public Modul5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eNim = new javax.swing.JTextField();
        eNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbAgama = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Rb_Pria = new javax.swing.JRadioButton();
        Rb_Wanita = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        cbMenyanyi = new javax.swing.JCheckBox();
        cbMenari = new javax.swing.JCheckBox();
        cbRenang = new javax.swing.JCheckBox();
        cbBadminton = new javax.swing.JCheckBox();
        cbMemasak = new javax.swing.JCheckBox();
        cbPuisi = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResume = new javax.swing.JTextArea();
        bClear = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bProses = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIM");

        jLabel2.setText("NAMA");

        jLabel3.setText("AGAMA");

        cbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISLAM", "KRISTEN", "PROTESTAN", "HINDU", "BUDHA" }));
        cbAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgamaActionPerformed(evt);
            }
        });

        jLabel4.setText("jenis kelamin");

        Rb_Pria.setText("Pria");

        Rb_Wanita.setText("Wanita");

        jLabel5.setText("HOBY");

        cbMenyanyi.setText("Menyanyi");

        cbMenari.setText("Menari");
        cbMenari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenariActionPerformed(evt);
            }
        });

        cbRenang.setText("Renang");

        cbBadminton.setText("Badminton");
        cbBadminton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBadmintonActionPerformed(evt);
            }
        });

        cbMemasak.setText("Memasak");

        cbPuisi.setText("Puisi");

        areaResume.setColumns(20);
        areaResume.setRows(5);
        jScrollPane1.setViewportView(areaResume);

        bClear.setText("CLEAR");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bExit.setText("EXIT");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bProses.setText("PROSES");
        bProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProsesActionPerformed(evt);
            }
        });

        jLabel6.setText("RESUME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rb_Pria)
                            .addComponent(cbMenyanyi)
                            .addComponent(cbMenari)
                            .addComponent(cbRenang))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bProses))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbMemasak)
                                            .addComponent(cbBadminton)
                                            .addComponent(Rb_Wanita)
                                            .addComponent(cbPuisi))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(5, 5, 5)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eNama))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rb_Pria)
                            .addComponent(Rb_Wanita)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbMenyanyi)
                            .addComponent(cbBadminton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMenari)
                            .addComponent(cbMemasak))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRenang)
                            .addComponent(cbPuisi))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClear)
                    .addComponent(bExit)
                    .addComponent(bProses))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        areaResume.setText(null);
    }//GEN-LAST:event_bClearActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bExitActionPerformed

    private void cbAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAgamaActionPerformed

    private void cbMenariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMenariActionPerformed

    private void cbBadmintonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBadmintonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBadmintonActionPerformed

    private void bProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProsesActionPerformed
        // TODO add your handling code here:
        int IndexCombo;
        String Pilihan;
        char Kelamin;
        String daftarHoby = "";
        IndexCombo = cbAgama.getSelectedIndex();
        Pilihan = (String) cbAgama.getSelectedItem();
        if (Rb_Pria.isSelected()) {
            Kelamin = 'P';
        } else {
            Kelamin = 'W';
        }
        if (cbMenyanyi.isSelected()) {
            daftarHoby += cbMenyanyi.getText() + "";
        }
        if (cbMenari.isSelected()) {
            daftarHoby += cbMenari.getText() + "";
        }
        if (cbRenang.isSelected()) {
            daftarHoby += cbRenang.getText() + "";
        }
        if (cbBadminton.isSelected()) {
            daftarHoby += cbBadminton.getText() + "";
        }
        if (cbMemasak.isSelected()) {
            daftarHoby += cbMemasak.getText() + "";
        }
        if (cbPuisi.isSelected()) {
            daftarHoby += cbPuisi.getText() + "";
        }
        areaResume.setText(
                "NIM :\t" + eNim.getText() + "\n"
                + "NAMA :\t" + eNama.getText() + "\n"
                + "AGAMA :\t" + Pilihan + "\n"
                + "KELAMIN:\t" + Kelamin + "\n"
                + "HOBY :\t" + daftarHoby + "\n"
        );
    }//GEN-LAST:event_bProsesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rb_Pria;
    private javax.swing.JRadioButton Rb_Wanita;
    private javax.swing.JTextArea areaResume;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bProses;
    private javax.swing.JComboBox<String> cbAgama;
    private javax.swing.JCheckBox cbBadminton;
    private javax.swing.JCheckBox cbMemasak;
    private javax.swing.JCheckBox cbMenari;
    private javax.swing.JCheckBox cbMenyanyi;
    private javax.swing.JCheckBox cbPuisi;
    private javax.swing.JCheckBox cbRenang;
    private javax.swing.JTextField eNama;
    private javax.swing.JTextField eNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
