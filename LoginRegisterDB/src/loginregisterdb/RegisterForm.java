package loginregisterdb;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Jason.
 */
public class RegisterForm extends JFrame {
    Connection conn;
    PreparedStatement ps = null;

    public RegisterForm() {
        initComponents();
        this.setTitle("Login-Register Form | Register");
        this.setResizable(false);

        rd_male.setSelected(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rd_male = new javax.swing.JRadioButton();
        rd_female = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmb_country = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txt_repassword = new javax.swing.JPasswordField();
        chx_agreement = new javax.swing.JCheckBox();
        btn_register = new javax.swing.JButton();
        btn_backLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Gender");

        rd_male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_male.setText("Male");

        rd_female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rd_female.setText("Female");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Country");

        cmb_country.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmb_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Australia", "Germany", "China", "India", "Indonesia", "Singapore", "Spain", "United Kingdom", "United States" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Username");

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Password");

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Re-Password");

        txt_repassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chx_agreement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chx_agreement.setText("I agree all terms.");

        btn_register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_backLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_backLogin.setText("Back to Login Form");
        btn_backLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(chx_agreement))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rd_male)
                                .addGap(18, 18, 18)
                                .addComponent(rd_female))
                            .addComponent(txt_name)
                            .addComponent(cmb_country, 0, 159, Short.MAX_VALUE)
                            .addComponent(txt_username)
                            .addComponent(txt_password)
                            .addComponent(txt_repassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btn_register))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_backLogin)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rd_male)
                    .addComponent(rd_female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chx_agreement)
                .addGap(18, 18, 18)
                .addComponent(btn_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_backLogin)
                .addContainerGap(19, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        if(validation()){
            if(rd_male.isSelected())
                gender = "male";
            else
                gender = "female";

            conn = Database.getCon();

            try {
                String sql = "INSERT INTO users VALUES(?,?,?,?,?)";

                ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, gender);
                ps.setString(3, country);
                ps.setString(4, uname);
                ps.setString(5, pass);
                ps.execute();

                JOptionPane.showMessageDialog(this, "Success", "Thank You for Register", JOptionPane.INFORMATION_MESSAGE);

                LoginForm login = new LoginForm();
                this.setVisible(false);
                login.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Somethings Wrong", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_backLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backLoginActionPerformed
        LoginForm login = new LoginForm();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btn_backLoginActionPerformed

    private String name, gender, country, uname, pass, repass;
    public boolean validation(){
        name = txt_name.getText();
        country = cmb_country.getSelectedItem().toString();
        uname = txt_username.getText();
        pass = String.valueOf(txt_password.getPassword());
        repass = String.valueOf(txt_repassword.getPassword());

        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Name", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_name.requestFocus();
            return false;
        }
        else if(country.equalsIgnoreCase("Choose")){
            JOptionPane.showMessageDialog(this, "Please Input Country", "Warning!", JOptionPane.WARNING_MESSAGE);
            cmb_country.requestFocus();
            return false;
        }
        else if(uname.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Username", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_username.requestFocus();
            return false;
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(this, "Please Input Password", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_password.requestFocus();
            return false;
        }
        else if(repass.compareTo(pass) != 0){
            JOptionPane.showMessageDialog(this, "Please Input Correct Password", "Warning!", JOptionPane.WARNING_MESSAGE);
            txt_password.requestFocus();
            return false;
        }
        else if(!chx_agreement.isSelected()){
            JOptionPane.showMessageDialog(this, "Please Agrree all Terms & Conditions.", "Warning!", JOptionPane.WARNING_MESSAGE);
            chx_agreement.requestFocus();
            return false;
        }

        return true;
    }

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backLogin;
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox chx_agreement;
    private javax.swing.JComboBox<String> cmb_country;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_repassword;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
