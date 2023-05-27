
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class f7_recipents extends javax.swing.JFrame {
   Connection c;
    public f7_recipents() {
        initComponents();
        setLocationRelativeTo(null);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ch_gblood = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_first = new javax.swing.JTextField();
        b_last = new javax.swing.JTextField();
        b_number = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        l_numbag = new javax.swing.JLabel();
        b_numbag = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Select your blood group");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        ch_gblood.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ch_gblood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        ch_gblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_gbloodActionPerformed(evt);
            }
        });
        jPanel1.add(ch_gblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 130, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("last name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("first name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, -1));

        b_first.setText(" ");
        jPanel1.add(b_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 130, 30));
        jPanel1.add(b_last, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 130, 30));

        b_number.setText(" ");
        b_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_numberActionPerformed(evt);
            }
        });
        jPanel1.add(b_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("phone number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        l_numbag.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l_numbag.setText("bags number ");
        jPanel1.add(l_numbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, -1));
        jPanel1.add(b_numbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 130, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jLabel3.setText(" ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void ch_gbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_gbloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ch_gbloodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
            if(b_first.getText().equals("") || b_last.getText().equals("")||b_number.getText().equals("")|| b_numbag.getText().equals(""))
            {
              JOptionPane.showMessageDialog(this, "please fill all fields");
            }
           else{
               PreparedStatement st=c.prepareStatement("insert into recieptence(recieptence_first_name,recieptence_last_name,recieptence_number,blood_type2,blood_bags ) values (?,?,?,?,?);");
                st.setString(1, b_first.getText());
                st.setString(2, b_last.getText());
                st.setString(3,b_number.getText() );
                String b;
                 b=ch_gblood.getSelectedItem().toString();
                st.setString(4, b);
                int  x=Integer.parseInt(b_numbag.getText());
                st.setInt(5, x);
                PreparedStatement blod_update=c.prepareStatement("select*from blood_type where blood_type='"+b+"'");
                 ResultSet rr=blod_update.executeQuery();
                 isDigit (b_numbag.getText());
                if(rr.next()  ){
                    if(rr.getInt(2)>=x)
                    {    
                        JOptionPane.showMessageDialog(this, "process complete ");
                         st.executeUpdate();
                         int nn=0;
                         PreparedStatement _update=c.prepareStatement("select*from blood_type where blood_type='"+b+"'");
                         ResultSet rx=_update.executeQuery();
                         if(rx.next())
                               nn=rx.getInt(2)-x;
                          PreparedStatement up=c.prepareStatement("update blood_type set available_number='"+nn+"' where blood_type='"+b+"';");
                          up.executeUpdate();
                          f1_main a=new f1_main();
                          a.setVisible(true);
                          this.setVisible(false);
                     }//end if check amount of blood
                    else{
                         JOptionPane.showMessageDialog(this, " sorry \n this amount unavailiable \n ");
                       }//end else amount of blood
               
           
           
           }//end of check fields
            }//end of try
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
         
            
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed
public boolean isDigit (String a)
{
    boolean f=true;
    try {
        int n=Integer.parseInt(a);
    } catch (IllegalArgumentException r) {
       f=false;
JOptionPane.showMessageDialog(this, " sorry \n tromany \n ");
    }
    return f;
}
    private void b_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_numberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        f2_select a=new f2_select();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(f7_recipents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f7_recipents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f7_recipents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f7_recipents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f7_recipents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_first;
    private javax.swing.JTextField b_last;
    private javax.swing.JTextField b_numbag;
    private javax.swing.JTextField b_number;
    private javax.swing.JComboBox<String> ch_gblood;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_numbag;
    // End of variables declaration//GEN-END:variables
}
