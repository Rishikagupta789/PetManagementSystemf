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
public class Veteran extends javax.swing.JFrame {

    /**
     * Creates new form Veteran
     */
    public Veteran() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        firstnametext = new javax.swing.JTextField();
        phonenumbertext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lastnametext = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addresstext = new javax.swing.JTextField();
        submitbttn = new javax.swing.JButton();
        emailtext = new javax.swing.JTextField();
        experience = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        veterinarybttn = new javax.swing.JButton();
        ownerbttn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordtext = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        experiences = new javax.swing.JComboBox<>();
        closebttn2 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        show = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setBackground(new java.awt.Color(118, 195, 201));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 168, 183));
        jLabel3.setText("PET MANAGMENT SYSTEM");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(108, 168, 183));
        jLabel11.setText("Veterinary Details");

        firstname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstname.setText("First Name:");

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("Email:");

        phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phonenumber.setText("Phone Number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Last Name:");

        address.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        address.setText("Address:");

        submitbttn.setText("Submit");
        submitbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbttnActionPerformed(evt);
            }
        });

        experience.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        experience.setText("Experience:");

        jPanel1.setBackground(new java.awt.Color(181, 151, 151));
        jPanel1.setForeground(new java.awt.Color(118, 201, 201));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ownerbttn))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veterinarybttn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(veterinarybttn)
                .addGap(37, 37, 37)
                .addComponent(ownerbttn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/output-onlinegiftools (1).gif"))); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setText("Password:");

        experiences.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 Months", "1Year", "2Years", "3Years", "4years" }));

        closebttn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-close-40.png"))); // NOI18N
        closebttn2.setBorder(null);
        closebttn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebttn2ActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setText("UserName:");

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitbttn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGap(18, 18, 18)
                                .addComponent(show)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(address))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(experiences, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(phonenumbertext, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addresstext, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(lastnametext, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(emailtext))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(closebttn2)))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closebttn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname)
                    .addComponent(firstnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lastnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address)
                            .addComponent(addresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username)
                            .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonenumber)
                            .addComponent(phonenumbertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email)
                            .addComponent(emailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(experience)
                            .addComponent(experiences, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password)
                            .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitbttn)
                        .addGap(33, 33, 33))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void submitbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbttnActionPerformed
        // TODO add your handling code here:
        String firstname = firstnametext.getText();
        String lastname = lastnametext.getText();
          String username = usernametext.getText();
        String email = emailtext.getText();
        String address = addresstext.getText();
        String phone = phonenumbertext.getText();
          String password = new String(passwordtext.getPassword());
          String experience=(String)experiences.getSelectedItem();
          if(firstname.equals("")){
              JOptionPane.showMessageDialog(this, "Please Enter the FirstName!!");
              if (lastname.equals("")){
                    JOptionPane.showMessageDialog(this, "Please Enter the LastName!!");
              }
               if (username.equals("")){
                    JOptionPane.showMessageDialog(this, "Please Enter the UserName!!");
              }
               if (email.equals("")){
                    JOptionPane.showMessageDialog(this, "Please Enter the Email!!");
              }
               if (address.equals("")){
                    JOptionPane.showMessageDialog(this, "Please Enter the Address!!");
              }
               if (phone.equals("")){
                    JOptionPane.showMessageDialog(this, "Please Enter the PhoneNumber!!");
              }
               if (password.equals("")){
                    JOptionPane.showMessageDialog(this, "Password Is Required!!");
              }
          }
               else{
                     JOptionPane.showMessageDialog(this, "Success!!"); 
               }
         
          try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petmanagmentsystem","root","nitch24");
            Statement stmt=con.createStatement();
            JOptionPane.showMessageDialog(null, "Connected succesfully");
            
           stmt.executeUpdate("insert into petmanagmentsystem.veterinary(id,Firstname,Lastname,Email,Address,phone,Experience,Password,Username)values(0,'"+firstname+"','"+lastname+"','"+email+"','"+address+"','"+phone+"','"+experience+"','"+password+"','"+username+"')");
           JOptionPane.showMessageDialog(null, "added sucessfully");
           this.setVisible(false);
           new UserVeterinaary().setVisible(true);

            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error adding veteran");
        }
        
         
    }//GEN-LAST:event_submitbttnActionPerformed

    private void closebttn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebttn2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closebttn2ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
        if(show.isSelected()){
            passwordtext.setEchoChar((char)0);
        }
        else{
            passwordtext.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

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
            java.util.logging.Logger.getLogger(Veteran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veteran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veteran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veteran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veteran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addresstext;
    private javax.swing.JButton closebttn2;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel experience;
    private javax.swing.JComboBox<String> experiences;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnametext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnametext;
    private javax.swing.JButton ownerbttn;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JTextField phonenumbertext;
    private javax.swing.JCheckBox show;
    private javax.swing.JButton submitbttn;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernametext;
    private javax.swing.JButton veterinarybttn;
    // End of variables declaration//GEN-END:variables
}
