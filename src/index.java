
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author patan
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
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
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-window-close-icon.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 44)); // NOI18N
        jLabel2.setText("Welcome to Online ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 44)); // NOI18N
        jLabel3.setText("Exam Portal ... ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, -1, -1));

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));
        kGradientPanel1.setkEndColor(new java.awt.Color(232, 162, 49));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 228, 184));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentIcon.png"))); // NOI18N
        kGradientPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 30)); // NOI18N
        jLabel5.setText("Student");
        kGradientPanel1.add(jLabel5);

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 414, -1, -1));

        kGradientPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 2));
        kGradientPanel2.setkEndColor(new java.awt.Color(232, 162, 49));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 228, 184));
        kGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel2MouseClicked(evt);
            }
        });
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Cambria", 3, 30)); // NOI18N
        jLabel7.setText("Admin");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/administrator-icon.png"))); // NOI18N
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 90, 82));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 418, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new studentDetails().setVisible(true);
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void kGradientPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel2MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new LoginAdmin2().setVisible(true);
    }//GEN-LAST:event_kGradientPanel2MouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
