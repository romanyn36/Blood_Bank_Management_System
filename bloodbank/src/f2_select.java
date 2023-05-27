
import java.awt.Toolkit;

public class f2_select extends javax.swing.JFrame {
    public f2_select() {
        initComponents();
        setLocationRelativeTo(null);
        icon();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_rec = new javax.swing.JButton();
        b_donor = new javax.swing.JButton();
        b_staff1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_rec.setBackground(new java.awt.Color(255, 255, 255));
        b_rec.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_rec.setText("Recipient");
        b_rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recActionPerformed(evt);
            }
        });
        jPanel1.add(b_rec, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 210, 40));

        b_donor.setBackground(new java.awt.Color(255, 255, 255));
        b_donor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_donor.setText("Donor");
        b_donor.setBorder(null);
        b_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_donorActionPerformed(evt);
            }
        });
        jPanel1.add(b_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 210, 40));

        b_staff1.setBackground(new java.awt.Color(255, 255, 255));
        b_staff1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b_staff1.setText("back");
        b_staff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_staff1ActionPerformed(evt);
            }
        });
        jPanel1.add(b_staff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("staff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void icon(){
    setIconImage(Toolkit .getDefaultToolkit().getImage(getClass().getResource("iccon.png")));
}
    private void b_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_donorActionPerformed
        f3_donor a=new f3_donor();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_donorActionPerformed

    private void b_recActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_recActionPerformed
        f7_recipents a=new f7_recipents();
         a.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_b_recActionPerformed

    private void b_staff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_staff1ActionPerformed
        new f1_main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_b_staff1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new staff1_log().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(f2_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2_select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_donor;
    private javax.swing.JButton b_rec;
    private javax.swing.JButton b_staff1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
