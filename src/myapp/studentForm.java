/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import config.dbConnector;
import internalPages.studentPage;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class studentForm extends javax.swing.JFrame {

    /**
     * Creates new form studentForm
     */
    public studentForm() {
        initComponents();
        
    }
    
    public void close(){
     this.dispose();
     dashBoard dash= new dashBoard();
     dash.setVisible(true);
     studentPage up= new studentPage();
     dash.maindesktop.add(up).setVisible(true);
    }
    
    Color navcolor=new Color (255,153,0);
    Color headcolor=new Color(255,204,51);
    Color bodycolor=new Color (255,51,51);
    
    public String gender;
    public String action;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        st_label = new javax.swing.JLabel();
        st_fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        s_id = new javax.swing.JLabel();
        st_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        st_lname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        st_status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        st_address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        st_contact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        st_email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(610, 370));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("USER FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 0, 250, 40);

        close.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(580, 0, 30, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        add.setBackground(new java.awt.Color(255, 153, 0));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_label.setText("LABEL");
        add.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 20));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 130, 40));

        st_fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_fname.setOpaque(false);
        jPanel1.add(st_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        s_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        s_id.setText("Student I.D:");
        jPanel1.add(s_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 80, 30));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_id.setEnabled(false);
        st_id.setOpaque(false);
        st_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_idActionPerformed(evt);
            }
        });
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 30));

        st_lname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_lname.setOpaque(false);
        jPanel1.add(st_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 200, 30));

        male.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 90, 30));

        female.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Status:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Last Name:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        st_status.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", " " }));
        st_status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(st_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 180, 30));

        st_address.setColumns(20);
        st_address.setRows(5);
        jScrollPane1.setViewportView(st_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 220, 100));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 70, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Contact:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 70, 30));

        st_contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_contact.setOpaque(false);
        st_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_contactActionPerformed(evt);
            }
        });
        jPanel1.add(st_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 220, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("E-mail:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 70, 30));

        st_email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        st_email.setOpaque(false);
        st_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_emailActionPerformed(evt);
            }
        });
        jPanel1.add(st_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 220, 30));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(bodycolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
     close();
    }//GEN-LAST:event_closeMouseClicked

    private void st_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_idActionPerformed

    private void st_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_contactActionPerformed

    private void st_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_emailActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
     if(action.equals("Add")){
        dbConnector dbc=new dbConnector();
       int result=dbc.insertData("INSERT INTO tbl_student(s_fname,s_lname,s_gender,s_address,s_status,s_contact,s_email)VALUES('"+st_fname.getText()+"','"+st_lname.getText()+"','"+gender+"','"+st_address.getText()+"','"+st_status.getSelectedItem()+"','"+st_contact.getText()+"','"+st_email.getText()+"')");
       if(result==1){
           JOptionPane.showMessageDialog(null,"Successfully Save!");
           close();
       }else{
           System.out.println("Saving Data Failed!");
       }
     }else if(action.equals("Update")){
        dbConnector dbc=new dbConnector();
        dbc.updateData("UPDATE tbl_student SET s_fname='"+st_fname.getText()+"',s_lname='"+st_lname.getText()+"',s_gender='"+gender+"',s_address='"+st_address.getText()+"',s_status='"+st_status.getSelectedItem()+"',s_contact='"+st_contact.getText()+"',s_email='"+st_email.getText()+"'"+"WHERE s_id='"+st_id.getText()+"'");
        close();
     }else{
        JOptionPane.showMessageDialog(null,"No Action Selected!"); 
        close();
     }
    }//GEN-LAST:event_addMouseClicked

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
     female.setSelected(false);
     if(male.isSelected()){
         gender="Male";
         
     }else{
         gender=null;
     }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
       male.setSelected(false);
     if(female.isSelected()){
         gender="Female";
         
     }else{
         gender=null;
     }
    }//GEN-LAST:event_femaleActionPerformed

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
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel close;
    public javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton male;
    private javax.swing.JLabel s_id;
    public javax.swing.JTextArea st_address;
    public javax.swing.JTextField st_contact;
    public javax.swing.JTextField st_email;
    public javax.swing.JTextField st_fname;
    public javax.swing.JTextField st_id;
    public javax.swing.JLabel st_label;
    public javax.swing.JTextField st_lname;
    public javax.swing.JComboBox<String> st_status;
    // End of variables declaration//GEN-END:variables
}