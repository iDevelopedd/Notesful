package Notesful.ui;

import Notesful.User;

public class SignupForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public SignupForm() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bg = new javax.swing.JPanel();
        SignupLabel = new javax.swing.JLabel();
        SignupButton = new javax.swing.JButton();
        UsernameTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ComfirmPasswordLabel = new javax.swing.JLabel();
        ComfirmPasswordField = new javax.swing.JPasswordField();
        QuestionLabel = new javax.swing.JLabel();
        LoginLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notesful");
        setAlwaysOnTop(true);
        setName("SignupFrame"); // NOI18N

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setAutoscrolls(true);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignupLabel.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        SignupLabel.setText("Sign Up");
        bg.add(SignupLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        SignupButton.setText("Sign up");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });
        bg.add(SignupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        bg.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 170, -1));

        UsernameLabel.setText("Username:");
        bg.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        PasswordLabel.setText("Password");
        bg.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));
        bg.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 170, -1));

        ComfirmPasswordLabel.setText("Comfirm Password");
        bg.add(ComfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        bg.add(ComfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, -1));

        QuestionLabel.setText("Have an account?");
        bg.add(QuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        LoginLabel2.setForeground(new java.awt.Color(0, 102, 255));
        LoginLabel2.setText("Login");
        LoginLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginLabel2MouseClicked(evt);
            }
        });
        bg.add(LoginLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(567, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // Sign up button
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void LoginLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginLabel2MouseClicked
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LoginLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ComfirmPasswordField;
    private javax.swing.JLabel ComfirmPasswordLabel;
    private javax.swing.JLabel LoginLabel2;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JButton SignupButton;
    private javax.swing.JLabel SignupLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
