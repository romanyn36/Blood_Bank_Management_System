
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login3 extends javax.swing.JFrame {
    Connection c;
    public login3() {
        initComponents();
        setLocationRelativeTo(null);
         try {
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "root");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "error");
        }
         fillfields();
         icon();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_back = new javax.swing.JButton();
        pass_new = new javax.swing.JPasswordField();
        pass_confirm = new javax.swing.JPasswordField();
        b_num = new javax.swing.JTextField();
        b_age = new javax.swing.JTextField();
        b_email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        b_add = new javax.swing.JTextField();
        b_continue1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("new passowrd");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 180, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("confirm password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 20));

        b_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_back.setText("back");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });
        jPanel1.add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, -1));
        jPanel1.add(pass_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 110, 30));
        jPanel1.add(pass_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 322, 110, 30));

        b_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_numActionPerformed(evt);
            }
        });
        jPanel1.add(b_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 110, 30));
        jPanel1.add(b_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, 30));
        jPanel1.add(b_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("address");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));
        jPanel1.add(b_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 110, 30));

        b_continue1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_continue1.setText("continue");
        b_continue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_continue1ActionPerformed(evt);
            }
        });
        jPanel1.add(b_continue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("update your current data");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        background.setText(" ");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
      login2 a=new login2();
      a.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_b_backActionPerformed
void icon(){
    setIconImage(Toolkit .getDefaultToolkit().getImage(getClass().getResource("iccon.png")));
}
    void fillfields()
{
        try {
            String ar="",ae="";
            PreparedStatement _update=c.prepareStatement("select*from log where ct=1");
            ResultSet rx=_update.executeQuery();
            if(rx.next()){
                ar=rx.getString(1);
                ae=rx.getString(2);
            }
            PreparedStatement st=c.prepareStatement("select*from donor where donor_email=? and pass=?");
            st.setString(1, ar);
            st.setString(2, ae);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                  b_num.setText(rs.getString(5));
                  b_age.setText(rs.getString(8));
                  b_email.setText(rs.getString(6));
                  b_add.setText(rs.getString(7));
                  pass_new.setText(rs.getString(10));
                  pass_confirm.setText(rs.getString(10));
            }
        } catch (SQLException ex) {
            Logger.getLogger(login3.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    private void b_continue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_continue1ActionPerformed
         try {
                String pp="",ch="",ar="",ae="";
             PreparedStatement _update=c.prepareStatement("select*from log where ct=1");
                         ResultSet rx=_update.executeQuery();
                         if(rx.next()){
                               ar=rx.getString(1);
                               ae=rx.getString(2);
                         }
           
            
            
        
            if(pass_new.getText().equals(pass_confirm.getText()))
            {
                pp=pass_confirm.getText();
            String adr=b_add.getText(),em=b_email.getText(),nu=b_num.getText();
            int ag=Integer.parseInt(b_age.getText());
            PreparedStatement up=c.prepareStatement("update donor set donor_email=?,donor_address=? ,donor_age=? ,donor_number=? ,pass=?  where donor_email=? and pass=?;");
            up.setString(1, em);
            up.setString(2, adr);
            up.setInt(3, ag);
            up.setString(4, nu);
            up.setString(5, pp);
            up.setString(6, ar);
            up.setString(7, ae);
   
            up.executeUpdate();
        
            JOptionPane.showMessageDialog(this, "process complete");
              new f6_specia().setVisible(true);
                      
            this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(this, "password must be idintical");
        } catch (SQLException ex) {
            Logger.getLogger(login3.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_b_continue1ActionPerformed

    private void b_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_numActionPerformed

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
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_add;
    private javax.swing.JTextField b_age;
    private javax.swing.JButton b_back;
    private javax.swing.JButton b_continue1;
    private javax.swing.JTextField b_email;
    private javax.swing.JTextField b_num;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_confirm;
    private javax.swing.JPasswordField pass_new;
    // End of variables declaration//GEN-END:variables
}
