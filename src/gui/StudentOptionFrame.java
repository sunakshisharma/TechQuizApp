/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Dao.PerformanceDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pojo.Userprofile;

/**
 *
 * @author Sunakshi Sharma
 */
public class StudentOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentOptionFrame
     */
    public StudentOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage("C:/Users/Sunakshi Sharma/OneDrive/Pictures/project/icon.png");
        this.setIconImage(img);
        this.setTitle("online exam application");
        lblUserName.setText("welcome "+ Userprofile.getUserid());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbTakeTest = new javax.swing.JRadioButton();
        rbViewScore = new javax.swing.JRadioButton();
        rbChangePwd = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("online exam student pannel");

        rbTakeTest.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(rbTakeTest);
        rbTakeTest.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbTakeTest.setForeground(new java.awt.Color(255, 153, 0));
        rbTakeTest.setText("take test");
        rbTakeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTakeTestActionPerformed(evt);
            }
        });

        rbViewScore.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(rbViewScore);
        rbViewScore.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbViewScore.setForeground(new java.awt.Color(255, 153, 0));
        rbViewScore.setText("view score");
        rbViewScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbViewScoreActionPerformed(evt);
            }
        });

        rbChangePwd.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(rbChangePwd);
        rbChangePwd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rbChangePwd.setForeground(new java.awt.Color(255, 153, 0));
        rbChangePwd.setText("change password");
        rbChangePwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbChangePwdActionPerformed(evt);
            }
        });

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 153, 0));
        btnDoTask.setText("do task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 153, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sunakshi Sharma\\OneDrive\\Pictures\\project\\stud1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTakeTest)
                            .addComponent(rbViewScore)
                            .addComponent(rbChangePwd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbTakeTest, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(rbViewScore, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(rbChangePwd)
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoTask)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTakeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTakeTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTakeTestActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"logging out ","logout",JOptionPane.CLOSED_OPTION);
        LoginFrame loginfr = new LoginFrame();
        loginfr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void rbViewScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbViewScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbViewScoreActionPerformed

    private void rbChangePwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbChangePwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbChangePwdActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
     if(ValidateInput() == false)
     {
     JOptionPane.showMessageDialog(null, "PLEASE SELECT ANY OPTION !");
     return;
     }
     if(rbTakeTest.isSelected())
     {
     ChoosePaperFrame paper = new ChoosePaperFrame();
     paper.setVisible(true);
     this.dispose();
     }
     else if (rbViewScore.isSelected())
     {
     try
     {
     ArrayList<String> examIdList = PerformanceDao.GetAllExamId(Userprofile.getUserid());
     if(examIdList.size()== 0)
     {
     JOptionPane.showMessageDialog(null, "you have not given any test!");
     return;
     }
     ViewStudentScoreFrame fr = new ViewStudentScoreFrame();
     fr.setVisible(true);
     this.dispose();
     
     }
     catch(SQLException ex)
     {
     JOptionPane.showMessageDialog(null,"Error occured in connection);");
     ex.printStackTrace();
     
     }
     }
     else if(rbChangePwd.isSelected())
     {
     ChangePasswordFrame fr= new ChangePasswordFrame();
     fr.setVisible(true);
     this.dispose();    
     }
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.JButton btnLogout;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JRadioButton rbChangePwd;
    private javax.swing.JRadioButton rbTakeTest;
    private javax.swing.JRadioButton rbViewScore;
    // End of variables declaration//GEN-END:variables

    private boolean ValidateInput() {
       if(rbTakeTest.isSelected()== false && rbViewScore.isSelected()== false && rbChangePwd.isSelected()== false)
           return false;
       return true;
    }
}
