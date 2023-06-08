package myapp;

import config.dbConnector;
import config.hashPASSWORD;
import java.awt.BasicStroke;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import myapp.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
    }
    Color hover = new Color(255, 204, 51);
    Color defbutton = new Color(255, 153, 0);

    Border empty = BorderFactory.createEmptyBorder();

    void buttonBorderAnimation(JPanel panel) {
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    }

    void buttonDefaultColor(JPanel panel) {
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }

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
        register = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        registration = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/ada-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 370, 260));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 320, 370);

        register.setBackground(new java.awt.Color(255, 51, 51));
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 51, 51));
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        register.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 50));

        cancel.setBackground(new java.awt.Color(255, 153, 0));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CANCEL");
        cancel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        register.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        minimize.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        register.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        close.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        register.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        registration.setBackground(new java.awt.Color(255, 51, 51));
        registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrationMouseExited(evt);
            }
        });
        registration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New User? Click Here To Register...");
        registration.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 340, 30));

        register.add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/baba.png"))); // NOI18N
        register.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 170, 100));

        password.setBackground(new java.awt.Color(255, 51, 51));
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N
        register.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 270, 50));

        login.setBackground(new java.awt.Color(255, 153, 0));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LOGIN");
        login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        register.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, 30));

        jPanel1.add(register);
        register.setBounds(320, 0, 340, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
    }//GEN-LAST:event_closeMouseClicked

    private void registrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationMouseClicked
        registrationForms register = new registrationForms();
        this.dispose();
        register.setVisible(true);
    }//GEN-LAST:event_registrationMouseClicked

    private void registrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationMouseEntered
        buttonBorderAnimation(registration);
    }//GEN-LAST:event_registrationMouseEntered

    private void registrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrationMouseExited
        buttonDefaultColor(registration);
    }//GEN-LAST:event_registrationMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
    String user=username.getText().toString();
    String pass=password.getText().toString();
     if(username.getText().isEmpty()||password.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"All fields are Required!");
     }else{
         try{
             String rehashedPassword;
             String hashedpass;
         
          dbConnector db=new dbConnector();        
          ResultSet rs=db.getData("SELECT * FROM `tbl_user` WHERE `u_username`='"+user+"'");
            if(rs.next()){
              hashedpass=rs.getString("u_password");
              rehashedPassword=hashPASSWORD.hashPassword(pass);
            if(user.equals(rs.getString("u_username"))&&hashedpass.equals(rehashedPassword)){
              JOptionPane.showMessageDialog(null,"Success!");
                dashBoard dash=new dashBoard();
                  this.dispose();
                  dash.setVisible(true);   
                  dash.name.setText(user);
              }else{
                 JOptionPane.showMessageDialog(null,"Invalid Account!");  
                 password.setText("");
              }              
         }else{
              System.out.println("No data Found");
          }
      }catch(NoSuchAlgorithmException|SQLException ex){
            System.out.println(""+ex);
         
      }        
     }        
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
    buttonBorderAnimation(login);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       buttonDefaultColor(login);
    }//GEN-LAST:event_loginMouseExited

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel login;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel register;
    private javax.swing.JPanel registration;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}