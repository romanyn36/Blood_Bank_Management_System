
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class staff1_log extends javax.swing.JFrame {
    Connection c;
    public staff1_log() {
        initComponents();
         try {
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "root");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "error");
        }
         icon();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        b_back = new javax.swing.JButton();
        b_id = new javax.swing.JTextField();
        b_pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_sign = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bkood Bank");
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_back.setText("back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });
        jPanel2.add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, 40));

        b_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_idActionPerformed(evt);
            }
        });
        jPanel2.add(b_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, 30));
        jPanel2.add(b_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 130, 30));

        jLabel2.setBackground(new java.awt.Color(255, 51, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("username ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        b_sign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_sign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/if_login_173049.png"))); // NOI18N
        b_sign.setText("  sign in");
        b_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_signActionPerformed(evt);
            }
        });
        jPanel2.add(b_sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1900, 1900));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
    new f2_select().setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_b_backActionPerformed

    private void b_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_idActionPerformed

    private void b_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_signActionPerformed
     try {       
            String idd=b_id.getText();
            String pass=b_pass.getText();
            PreparedStatement st=c.prepareStatement("select * from staff where id=? and  password =?");
                    st.setString(1, idd);
                    st.setString(2, pass);
               ResultSet rs=st.executeQuery();
                  if(rs.next()) 
                  {
                      dispose();
                      new staff2_main().setVisible(true);
                      this.setVisible(false);
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(this, "failed to log \nin check your id and password and try again ", "error", JOptionPane.ERROR_MESSAGE);
                  }
                   
            
            
        } catch (SQLException ex) {
            Logger.getLogger(staff1_log.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    
    }//GEN-LAST:event_b_signActionPerformed
void icon(){
    setIconImage(Toolkit .getDefaultToolkit().getImage(getClass().getResource("iccon.png")));
}
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
            java.util.logging.Logger.getLogger(staff1_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff1_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff1_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff1_log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff1_log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_back;
    private javax.swing.JTextField b_id;
    private javax.swing.JPasswordField b_pass;
    private javax.swing.JButton b_sign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
