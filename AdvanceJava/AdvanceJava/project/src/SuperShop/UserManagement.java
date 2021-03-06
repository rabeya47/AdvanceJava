/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperShop;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Ali
 */
public class UserManagement extends javax.swing.JFrame {

    /**
     * Creates new form UserManagement
     */
    public UserManagement() {
        initComponents();
        setLocationRelativeTo(null);
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
        purcheslebel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        salelebel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LogoutBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        EmployeeManagement = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FinancialStatusIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purcheslebel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purcheslebel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/product.gif"))); // NOI18N
        purcheslebel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purcheslebelMouseClicked(evt);
            }
        });
        jPanel1.add(purcheslebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 140));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Management System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 920, -1));

        salelebel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salelebel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/redtoly.png"))); // NOI18N
        salelebel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salelebelMouseClicked(evt);
            }
        });
        jPanel1.add(salelebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 204, 150));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));

        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoutBtn.setText("Logout");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 417, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setMinimumSize(new java.awt.Dimension(200, 150));

        EmployeeManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/WhatsApp_Image-removebg-preview.png"))); // NOI18N
        EmployeeManagement.setText("jLabel1");
        EmployeeManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeManagementMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EmployeeManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(EmployeeManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Product House");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 138, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Employee Management System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 312, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sale Department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 125, -1));

        FinancialStatusIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FinancialStatusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/financial-profit.png"))); // NOI18N
        FinancialStatusIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinancialStatusIconMouseClicked(evt);
            }
        });
        jPanel1.add(FinancialStatusIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 140, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Financial Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        setVisible(true);
        new Logout().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void purcheslebelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purcheslebelMouseClicked
        setVisible(true);
        new ProductHouse().setVisible(true);
        dispose();
    }//GEN-LAST:event_purcheslebelMouseClicked

    private void salelebelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salelebelMouseClicked
       setVisible(true);
       new saleDepartment().setVisible(true);
       dispose();  
    }//GEN-LAST:event_salelebelMouseClicked

    private void EmployeeManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeManagementMouseClicked
       setVisible(true);
       new EmployeeManagementSystem().setVisible(true);
       dispose();  
    }//GEN-LAST:event_EmployeeManagementMouseClicked

    private void FinancialStatusIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinancialStatusIconMouseClicked
        new FinancialStatus().setVisible(true);
    }//GEN-LAST:event_FinancialStatusIconMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            //</editor-fold>
            
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new UserManagement().setVisible(true);
                }
            });
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeeManagement;
    private javax.swing.JLabel FinancialStatusIcon;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel purcheslebel;
    private javax.swing.JLabel salelebel;
    // End of variables declaration//GEN-END:variables
}
