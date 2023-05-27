
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class staff6_staff extends javax.swing.JFrame {
    
             Connection c;
             String value,value2;
    public staff6_staff() {
        initComponents();
        setLocationRelativeTo(null);
         try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank", "root", "root");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "error");
        }
      
    
        fillTable();
        icon();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_logout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_table = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        b_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        b_pass = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        cleare = new javax.swing.JButton();
        b_pass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Bank");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_logout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        b_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/if_exit_3226.png"))); // NOI18N
        b_logout.setText("  log out");
        b_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(b_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("staff");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        t_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        t_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(t_table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 350, 220));

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/if_Close_53010.png"))); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 100, 30));
        jPanel1.add(b_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("user name ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 40));

        add.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Add-group-icon.png"))); // NOI18N
        add.setText(" add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 90, 30));
        jPanel1.add(b_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 130, 40));

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Edit-validated-icon.png"))); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 100, 30));

        cleare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cleare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Clear-icon.png"))); // NOI18N
        cleare.setText("rest");
        cleare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleareActionPerformed(evt);
            }
        });
        jPanel1.add(cleare, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 80, -1));

        b_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.jpg"))); // NOI18N
        b_pass1.setText("add");
        jPanel1.add(b_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       staff2_main a=new staff2_main();
       a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
   void fillTable()
   {
       DefaultTableModel dt;
        dt=new DefaultTableModel();
        dt.addColumn("user name");
        dt.addColumn("password");
        try {
           PreparedStatement st=c.prepareStatement("select staff.id,staff.password from staff");
     
            ResultSet rs=st.executeQuery();
            while(rs.next())
            {
                dt.addRow( new Object[] {rs.getString(1),rs.getString(2)});
            } 
            t_table.setModel(dt);
        } catch (SQLException ex) {
            Logger.getLogger(staff5_users.class.getName()).log(Level.SEVERE, null, ex);
        }
     
   
   }
   void add()
   {
        try {
            PreparedStatement st=c.prepareStatement("insert into staff (id,password) values (?,?)");
            st.setString(1, b_user.getText());
            st.setString(2, b_pass.getText());
            st.execute();
        } catch (SQLException ex) {
            Logger.getLogger(staff6_staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        fillTable();
   }
   void update()
   {
        try {
            String cur="";
            if(value==null)
            {
                cur=b_user.getText();
            }
            else
                cur=value;
                PreparedStatement st=c.prepareStatement("update staff set id =? , password=? where id=? ");
                    st.setString(1, b_user.getText());
                    st.setString(2, b_pass.getText());
                    st.setString(3, cur);
                 PreparedStatement check=c.prepareStatement("select * from staff where id=?");
                 check.setString(1, b_user.getText());
                 ResultSet rs=check.executeQuery();
                 if(rs.next() && !cur.equals(b_user.getText()))
                     JOptionPane.showMessageDialog(this, "sorry this username is used ");
                 else 
                 {
                     st.executeUpdate();
                      value=b_user.getText();
                 }
        }
            catch (SQLException ex) 
                {
                     Logger.getLogger(staff6_staff.class.getName()).log(Level.SEVERE, null, ex);
                 }
        
      
         
       fillTable();
   }
   public  boolean isEmpty( ) {
        if (t_table != null && t_table.getModel() != null) {
            return t_table.getModel().getRowCount()<=0?true:false;
        }
        return false;
    }
   void delete(){
        int row = 0 ;
      if(!isEmpty()){          //check table if empty
             row =t_table.getSelectedRow();
             if(row>=0){                        // check if ther is row selected
      
                      try {
                     PreparedStatement st=c.prepareStatement("delete from staff where id=? and password=? "  );
                      st.setString(1, value);
                     st.setString(2, value2);
                     st.execute();
                  }
                      catch (SQLException ex) {
                        Logger.getLogger(staff6_staff.class.getName()).log(Level.SEVERE, null, ex);
                      }
             }
                      else
                     JOptionPane.showMessageDialog(this, "no employees selected \n select to to delete ");
             
      }
      else
      {
          JOptionPane.showMessageDialog(this, "ther is no staff to delete ", value, HEIGHT);
      }
       fillTable();
   }
    private void b_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_logoutActionPerformed
        f1_main a=new f1_main();
      a.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_b_logoutActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                 try {
                     PreparedStatement st=c.prepareStatement(" select * from staff where id=? ;");
                     st.setString(1, b_user.getText());
                     ResultSet rs=st.executeQuery();
                     if(rs.next())
                         JOptionPane.showMessageDialog(this, "sorry this user is used ");
                     else
                         add();  
                  } catch (SQLException ex) {
                     Logger.getLogger(staff6_staff.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }//GEN-LAST:event_addActionPerformed
void icon(){
    setIconImage(Toolkit .getDefaultToolkit().getImage(getClass().getResource("iccon.png")));
}
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update();
    }//GEN-LAST:event_updateActionPerformed

    private void t_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_tableMouseClicked
         int row =t_table.getSelectedRow();
       value=t_table.getModel().getValueAt(row, 0).toString();
        value2=t_table.getModel().getValueAt(row, 1).toString();
       b_user.setText(value);
       b_pass.setText(value2);
    }//GEN-LAST:event_t_tableMouseClicked

    private void cleareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleareActionPerformed
        b_user.setText("");
        b_pass.setText("");
    }//GEN-LAST:event_cleareActionPerformed

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
            java.util.logging.Logger.getLogger(staff5_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff5_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff5_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff5_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff6_staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton b_logout;
    private javax.swing.JTextField b_pass;
    private javax.swing.JLabel b_pass1;
    private javax.swing.JTextField b_user;
    private javax.swing.JButton cleare;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable t_table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
