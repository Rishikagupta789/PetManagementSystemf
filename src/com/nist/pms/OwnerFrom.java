/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nist.pms;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rishika Gupta
 */
public class OwnerFrom extends javax.swing.JFrame {

    /**
     * Creates new form Front
     */
    public OwnerFrom() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        veterinarybttn = new javax.swing.JButton();
        ownerbttn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        passwordtext = new javax.swing.JPasswordField();
        closebttn = new javax.swing.JButton();
        loginbttn = new javax.swing.JButton();
        signupbttn = new javax.swing.JButton();
        show = new javax.swing.JCheckBox();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/output-onlinegiftools (1).gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(181, 151, 151));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/logo.jpg"))); // NOI18N

        veterinarybttn.setBackground(new java.awt.Color(181, 151, 151));
        veterinarybttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veterinarybttn.setForeground(new java.awt.Color(0, 0, 0));
        veterinarybttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-veterinary-25.png"))); // NOI18N
        veterinarybttn.setText("Veterinary");
        veterinarybttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veterinarybttnActionPerformed(evt);
            }
        });

        ownerbttn.setBackground(new java.awt.Color(181, 151, 151));
        ownerbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ownerbttn.setForeground(new java.awt.Color(0, 0, 0));
        ownerbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-pet-25.png"))); // NOI18N
        ownerbttn.setText("Owner");
        ownerbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerbttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ownerbttn)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(veterinarybttn)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ownerbttn)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(veterinarybttn)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 168, 183));
        jLabel3.setText("PET MANAGMENT SYSTEM");

        username.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        username.setText("Username:");

        password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password.setText("Passsword:");

        closebttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-close-40.png"))); // NOI18N
        closebttn.setBorder(null);
        closebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebttnActionPerformed(evt);
            }
        });

        loginbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginbttn.setText("Login");
        loginbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbttnActionPerformed(evt);
            }
        });

        signupbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signupbttn.setText("SignUp");
        signupbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbttnActionPerformed(evt);
            }
        });

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-eye-30.png"))); // NOI18N
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(show)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(closebttn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(signupbttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginbttn)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closebttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupbttn)
                    .addComponent(loginbttn))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebttnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closebttnActionPerformed

    private void veterinarybttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veterinarybttnActionPerformed
        // TODO add your handling code here:
        Veteranform vet = new Veteranform();
        vet.setVisible(true);
        this.hide();
    }//GEN-LAST:event_veterinarybttnActionPerformed

    private void ownerbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerbttnActionPerformed
        // TODO add your handling code here:
        OwnerFrom own = new OwnerFrom();
        own.setVisible(true);
        this.hide();
    }//GEN-LAST:event_ownerbttnActionPerformed

    private void loginbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbttnActionPerformed
        // TODO add your handling code here:
        if(usernametext.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Please Enter Username");
        }

        else if(String.valueOf(passwordtext.getPassword()).length()==0){
            JOptionPane.showMessageDialog(null,"Please Enter Password");
        }

        else{
            String sql ="select * from owner where Username = ? and Password =? ";
            try {Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/petmanagmentsystem","root","nitch24");
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, usernametext.getText());
                stmt.setString(2, new String(passwordtext.getPassword()));

                ResultSet rs = stmt.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Login Success !");
                   String Id = String.valueOf(rs.getInt("id"));
                   Getandset u = new Getandset();
                   u.setId(Id);
                    String id = String.valueOf(rs.getInt("id"));
                    this.setVisible(false);
                    Owneruser ou = new Owneruser();
                    
                    new Owneruser().setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");

                }

                con.close();
                
//                Owneruserdisplay obj = new Owneruserdisplay();
//                obj.session(usernametext.getText().toString());

            } catch (Exception e) {
                System.out.println(e);
    }//GEN-LAST:event_loginbttnActionPerformed
        }
    }
    private void signupbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbttnActionPerformed
        // TODO add your handling code here:
        Owner own = new Owner();
        own.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupbttnActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if(show.isSelected()){
            passwordtext.setEchoChar((char)0);
        }
        else{
            passwordtext.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(OwnerFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbttn;
    private javax.swing.JButton ownerbttn;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JCheckBox show;
    private javax.swing.JButton signupbttn;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernametext;
    private javax.swing.JButton veterinarybttn;
    // End of variables declaration//GEN-END:variables
}
        
        
