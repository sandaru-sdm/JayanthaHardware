/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sdm.jayanthahardware.gui;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.sdm.jayanthahardware.model.MySQL;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;

/**
 *
 * @author MCTech
 */
public class SignIn extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(Splash.class.getName());

    public static int userId = 0;
    public static int UseTypeId = 0;
    
    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        setLoggerFile();
        setResizable(false);
        
        setIconImage(new ImageIcon(getClass().getResource("/com/sdm/jayanthahardware/resources/logo1.png")).getImage());
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jayantha Hardware");

        jLabel1.setFont(new java.awt.Font("Quicksand Book", 1, 14)); // NOI18N
        jLabel1.setText("Username");

        jTextField1.setFont(new java.awt.Font("Quicksand Book", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Quicksand Book", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jButton1.setFont(new java.awt.Font("Quicksand Book", 1, 14)); // NOI18N
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign - In");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sdm/jayanthahardware/resources/logo1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        char passwordArray[] = jPasswordField1.getPassword();
        String password = String.valueOf(passwordArray);
        
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your username", "warning", JOptionPane.WARNING_MESSAGE);
        }else if(password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your password", "warning", JOptionPane.WARNING_MESSAGE);
        }else{
            String username = jTextField1.getText();
            
            try {
                ResultSet resultset = MySQL.search("SELECT * FROM `user` WHERE `username`='"+username+"' AND `password`='"+password+"' AND `user_status_id` = 1");
                if(resultset.next()){
                    //JOptionPane.showMessageDialog(this, "Sign In Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    userId = Integer.parseInt(resultset.getString("id"));
                    UseTypeId = Integer.parseInt(resultset.getString("user_type_id"));
                    
//                    JOptionPane.showMessageDialog(this, "Login Success", "Success", JOptionPane.INFORMATION_MESSAGE);

                    Home home = new Home();
                    
                    if(resultset.getString("user_type_id").equals("2")){
                        Home.jButton10.setEnabled(false);
                        Home.jButton12.setEnabled(false);
                        Home.jTabbedPane1.setEnabledAt(9, false);
                        Home.jTabbedPane1.setEnabledAt(10, false);
                    }
                    
                    home.setVisible(true);
                    this.dispose();
                    
                }else{
                    logger.log(Level.SEVERE, "Invalid username or password");
                    JOptionPane.showMessageDialog(this, "Invalid username or password", "warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

        private void setLoggerFile() {
        try {
            // Use the user's home directory as the base path for logfiles
            String userHome = System.getProperty("user.home");
            File logFolder = new File(userHome, "JayanthaHardware/logfiles");

            // Check if the "logfiles" folder exists, and create it if not
            if (!logFolder.exists()) {
                logFolder.mkdirs();  // mkdirs() will create parent directories if they don't exist
            }

            // Set up a FileHandler to write log messages to a file named "logfiles/invoice_log.txt"
            FileHandler fileHandler = new FileHandler(logFolder.getPath() + File.separator + "signin_log.txt", true);
            fileHandler.setFormatter(new SimpleFormatter() {
                private final String format = "[%1$tF %1$tT] [%2$-7s] %3$s %n";

                @Override
                public synchronized String format(java.util.logging.LogRecord lr) {
                    Object[] params = lr.getParameters();
                    return String.format(format, new java.util.Date(lr.getMillis()), lr.getLevel(),
                            MessageFormat.format(lr.getMessage(), params));
                }
            });

            logger.addHandler(fileHandler);
        } catch (IOException | SecurityException e) {
            // If there is an issue setting up the FileHandler, log the exception to the console
            e.printStackTrace();
        }
    }
}

