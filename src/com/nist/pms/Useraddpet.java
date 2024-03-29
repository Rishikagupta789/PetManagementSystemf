/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nist.pms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rishika Gupta
 */
public class Useraddpet extends javax.swing.JPanel {

    public Useraddpet() {
        initComponents();
           Addpet();
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
        petbreedtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        malebttn = new javax.swing.JRadioButton();
        femalebttn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        colortext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        costtext = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sellingtext = new javax.swing.JTextField();
        addbttn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(180, 182, 182));
        setMaximumSize(new java.awt.Dimension(1034, 564));
        setMinimumSize(new java.awt.Dimension(1034, 564));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add New Pet");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pet Bread:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Gender:");

        malebttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        malebttn.setForeground(new java.awt.Color(0, 0, 0));
        malebttn.setText("Male");

        femalebttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        femalebttn.setForeground(new java.awt.Color(0, 0, 0));
        femalebttn.setText("Female");
        femalebttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalebttnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Date Of Birth:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Color:");

        colortext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colortextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cost Price:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Selling Price:");

        addbttn.setBackground(new java.awt.Color(182, 182, 182));
        addbttn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbttn.setForeground(new java.awt.Color(0, 0, 0));
        addbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/nist/pms/icons8-add-25.png"))); // NOI18N
        addbttn.setText("Add");
        addbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbttnActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pet Breed", "Color", "DOB", "Cost Price", "Selling Price", "Gender"
            }
        ));
        jScrollPane2.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colortext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(malebttn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femalebttn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(costtext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(petbreedtext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellingtext, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(addbttn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(439, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(petbreedtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(malebttn)
                    .addComponent(femalebttn))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(colortext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(costtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(sellingtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(addbttn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void Addpet() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petmanagmentsystem", "root", "nitch24");
            Statement stmt = con.createStatement();
            String sql = "select * from petmanagmentsystem.addpet";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String petbreed = rs.getString("Petbreed");
                String color = rs.getString("Color");
                String date = rs.getString("Dateofbirth");
                String cost = rs.getString("Cost");
                String sell = rs.getString("Selling");
                String gender = rs.getString("Gender");

                String tbData[] = {id, petbreed, color, date, cost, sell, gender};
                DefaultTableModel tbModel = (DefaultTableModel) table1.getModel();
                tbModel.addRow(tbData);
                

            }

        } catch (Exception ex) {
        }
    }

    private void femalebttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalebttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femalebttnActionPerformed

    private void colortextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colortextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colortextActionPerformed

    private void addbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbttnActionPerformed
        // TODO add your handling code here:
        String petbreed = petbreedtext.getText();
        String color = colortext.getText();
        SimpleDateFormat dformat = new SimpleDateFormat("MMM dd yyyy");
        String d = dformat.format(dob.getDate());
        String cost = costtext.getText();
        String selling = sellingtext.getText();
        String gender;
        if (malebttn.isSelected()) {
            gender = "Male";

        } else {
            gender = "Female";

        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petmanagmentsystem", "root", "nitch24");
            Statement stmt = con.createStatement();
            JOptionPane.showMessageDialog(null, "Connected succesfully");

            stmt.executeUpdate("insert into petmanagmentsystem.addpet(id,Petbreed,Color,Dateofbirth,Cost,Selling,Gender)values(0,'" + petbreed + "','" + color + "','" + d + "','" + cost + "','" + selling + "','" + gender + "')");
            JOptionPane.showMessageDialog(null, "Added Sucessfully");
            DefaultTableModel model1;
            model1 = (DefaultTableModel) table1.getModel();
            model1.setRowCount(0);
            Addpet();

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error Adding New Pet");
        }

    }//GEN-LAST:event_addbttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbttn;
    private javax.swing.JTextField colortext;
    private javax.swing.JTextField costtext;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton femalebttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton malebttn;
    private javax.swing.JTextField petbreedtext;
    private javax.swing.JTextField sellingtext;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
