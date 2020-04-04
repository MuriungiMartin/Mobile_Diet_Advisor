/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dietadvisor;
//DefaultTableCellRenderer centerRenderer=new DefaultTableCellRenderer();
//              centerRenderer.setHorizontalAlignment(JLabel.CENTER);
//              jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

//        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
//          model.setRowCount(0);
//      jTextFieldRegNo.setEditable(true);
//      jButtonSearch.setVisible(true);
//      jButtonNewSearch.setVisible(false);
//

/**
 *
 * @author user
 */
public class index extends javax.swing.JFrame {

    /** Creates new form index */
    public index() {
        initComponents();
       
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
        jButtonDoctor = new javax.swing.JButton();
        jButtonUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setTitle("MIGORI DIET ADVISORY SYSTEM");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDoctor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDoctor.setFont(new java.awt.Font("Tekton Pro", 3, 48)); // NOI18N
        jButtonDoctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/man.png"))); // NOI18N
        jButtonDoctor.setText("DOCTOR");
        jButtonDoctor.setToolTipText("Doctor");
        jButtonDoctor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDoctor.setContentAreaFilled(false);
        jButtonDoctor.setOpaque(true);
        jButtonDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDoctorMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 220, 50));

        jButtonUser.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUser.setFont(new java.awt.Font("Tekton Pro", 3, 48)); // NOI18N
        jButtonUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jButtonUser.setText("USER");
        jButtonUser.setToolTipText("Patient");
        jButtonUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUser.setBorderPainted(false);
        jButtonUser.setContentAreaFilled(false);
        jButtonUser.setOpaque(true);
        jButtonUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUserMouseClicked(evt);
            }
        });
        jButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 180, 60));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0,0,0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LOGO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 165));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 273, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hos.jpeg"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 171, 500, 326));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUserMouseClicked
        patient pp=new patient();
        pp.setLocationRelativeTo(null);
        pp.setVisible(true);
        this.dispose();  
     
    }//GEN-LAST:event_jButtonUserMouseClicked

    private void jButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserActionPerformed

    }//GEN-LAST:event_jButtonUserActionPerformed

    private void jButtonDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDoctorMouseClicked
        Admin admin=new Admin();
        admin.main(null);
        this.dispose();
    }//GEN-LAST:event_jButtonDoctorMouseClicked

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDoctor;
    private javax.swing.JButton jButtonUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
