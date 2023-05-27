
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class signup extends javax.swing.JFrame {
    private Connection c;
    public signup() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "root");
          
        }catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "connection error");
        }
        icon();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_continue = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_fname = new javax.swing.JTextField();
        b_lname = new javax.swing.JTextField();
        b_number = new javax.swing.JTextField();
        pass_pa2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pass_pa1 = new javax.swing.JPasswordField();
        b_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        hhn = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_age = new javax.swing.JTextField();
        b_addres = new javax.swing.JTextField();
        ch_blood = new javax.swing.JComboBox<>();
        ghg = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        diseases1 = new javax.swing.JRadioButton();
        diseases2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 130, 50));

        b_continue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_continue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/if_Close_53010.png"))); // NOI18N
        b_continue.setText("  sign up");
        b_continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_continueActionPerformed(evt);
            }
        });
        jPanel1.add(b_continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Confirm Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 210, 50));

        b_fname.setText(" ");
        b_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fnameActionPerformed(evt);
            }
        });
        jPanel1.add(b_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, 30));

        b_lname.setText(" ");
        b_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_lnameActionPerformed(evt);
            }
        });
        jPanel1.add(b_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 160, 30));

        b_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_numberActionPerformed(evt);
            }
        });
        jPanel1.add(b_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 170, 30));
        jPanel1.add(pass_pa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 40));

        pass_pa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_pa1ActionPerformed(evt);
            }
        });
        jPanel1.add(pass_pa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 170, 30));

        b_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_emailActionPerformed(evt);
            }
        });
        jPanel1.add(b_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("age");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, -1));

        hhn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hhn.setText("blood group");
        jPanel1.add(hhn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));
        jPanel1.add(b_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 170, 30));

        b_addres.setText(" ");
        jPanel1.add(b_addres, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 170, 30));

        ch_blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel1.add(ch_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 30));

        ghg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ghg.setText("gender");
        jPanel1.add(ghg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r1.setSelected(true);
        r1.setText("male ");
        jPanel1.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 70, -1));

        r2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        r2.setText("female");
        jPanel1.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 80, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/if_Close_53010.png"))); // NOI18N
        jButton1.setText("   back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, -1));

        buttonGroup2.add(diseases1);
        diseases1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diseases1.setSelected(true);
        diseases1.setText("YES");
        diseases1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseases1ActionPerformed(evt);
            }
        });
        jPanel1.add(diseases1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 80, -1));

        buttonGroup2.add(diseases2);
        diseases2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diseases2.setText("NO");
        jPanel1.add(diseases2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 70, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Do you have contagious diseases?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        background.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 709, Short.MAX_VALUE)
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
    private void b_continueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_continueActionPerformed
        try {
             if(b_fname.getText().equals("") || b_lname.getText().equals("")||b_number.getText().equals("")|| b_email.getText().equals("")||b_age.getText().equals("")|| b_addres.getText().equals("") )
            {
              JOptionPane.showMessageDialog(this, "please fill all fields");
            }
            else
              {
                    String ch="";
                    PreparedStatement st=c.prepareStatement("insert into donor(donor_first_name,donor_last_name,donor_blood_type,donor_number,donor_email,donor_address,donor_age,donor_gender ,donor.pass) values(?,?,?,?,?,?,?,?,?)");                 
                    st.setString(1, b_fname.getText());
                    st.setString(2, b_lname.getText());
                    ch=ch_blood.getSelectedItem().toString();
                    st.setString(3, ch);
                    st.setString(4, b_number.getText());
                    st.setString(5, b_email.getText());
                    st.setString(6, b_addres.getText());
                    st.setString(7, b_age.getText());
                    String mm="";
                    if(r1.isSelected())
                        mm=r1.getText();
                    else
                        mm=r2.getText();
                    st.setString(8, mm);
                    st.setString(9, pass_pa1.getText());
                    if(diseases1.isSelected())
                    {
                        JOptionPane.showMessageDialog(this, "sorry \n you can't donate if you have contagious diseases \n thanks for your trying");
                        f3_donor a=new f3_donor();
                        a.setVisible(true);
                        this.setVisible(false);
                    }//end disease check
                  else
                   {
                    if(pass_pa2.getText().equals(pass_pa1.getText()) &&!pass_pa1.getText().equals("") )
                    {              
                        int nn=0;
                        PreparedStatement _update=c.prepareStatement("select*from blood_type where blood_type='"+ch+"'");
                        ResultSet rx=_update.executeQuery();
                        if(rx.next())
                               nn=rx.getInt(2)+1;
                        PreparedStatement up=c.prepareStatement("update blood_type set available_number='"+nn+"' where blood_type='"+ch+"';");
                        up.executeUpdate();                   
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(this, "process complete");
                        f6_specia a= new f6_specia();
                        a.setVisible(true);
                        this.setVisible(false);    
                  }//end check pass
                else
                     JOptionPane.showMessageDialog(this, "password should be identical and not empty ", "error", JOptionPane.ERROR_MESSAGE);
             }//end else disease check
        }//end check fields filled     
        }//try end 
        catch (SQLException ex) {
         
          Logger.getLogger(staff5_users.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_b_continueActionPerformed

    private void b_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_numberActionPerformed

    private void pass_pa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_pa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_pa1ActionPerformed

    private void b_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_lnameActionPerformed

    private void diseases1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseases1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseases1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        f3_donor a=new f3_donor();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_emailActionPerformed

    private void b_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fnameActionPerformed

    }//GEN-LAST:event_b_fnameActionPerformed


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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_addres;
    private javax.swing.JTextField b_age;
    private javax.swing.JButton b_continue;
    private javax.swing.JTextField b_email;
    private javax.swing.JTextField b_fname;
    private javax.swing.JTextField b_lname;
    private javax.swing.JTextField b_number;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> ch_blood;
    private javax.swing.JRadioButton diseases1;
    private javax.swing.JRadioButton diseases2;
    private javax.swing.JLabel ghg;
    private javax.swing.JLabel hhn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPasswordField pass_pa1;
    private javax.swing.JPasswordField pass_pa2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    // End of variables declaration//GEN-END:variables
}
