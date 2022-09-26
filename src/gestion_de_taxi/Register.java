
package gestion_de_taxi;
import java.sql.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
         Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        PanelRegister.setBorder(borderpanel);
        Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
         Border bordertext =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white);
         txtName.setBorder(bordertext);
         txtUsername.setBorder(bordertext);
         txtPassword.setBorder(bordertext);
         txtConfirm.setBorder(bordertext);
         txtPhone.setBorder(bordertext);
         txtMail.setBorder(bordertext);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lbllogin = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(470, 530));
        setMinimumSize(new java.awt.Dimension(470, 530));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegister.setBackground(new java.awt.Color(153, 153, 153));
        PanelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setOpaque(true);
        PanelRegister.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 40));

        lblclose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclose.setText("X");
        lblclose.setPreferredSize(new java.awt.Dimension(17, 17));
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcloseMouseExited(evt);
            }
        });
        PanelRegister.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 20, -1));

        lblmin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmin.setText("-");
        lblmin.setPreferredSize(new java.awt.Dimension(17, 17));
        lblmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminMouseExited(evt);
            }
        });
        PanelRegister.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, -1));

        getContentPane().add(PanelRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        Phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Phone.setForeground(new java.awt.Color(0, 0, 204));
        Phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phone.setText("Phone :");
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mail :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailKeyTyped(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 260, 30));

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 260, 30));

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 260, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 260, 30));

        btnRegister.setBackground(new java.awt.Color(0, 255, 153));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 375, 330, 40));

        lbllogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbllogin.setForeground(new java.awt.Color(255, 0, 0));
        lbllogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogin.setText("Vous avez déja un compte ? connexion ");
        lbllogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblloginMouseClicked(evt);
            }
        });
        getContentPane().add(lbllogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 300, 20));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 172, 260, 30));

        txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmKeyTyped(evt);
            }
        });
        getContentPane().add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseEntered
        Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
         lblclose.setBorder(borderlabel);
        lblclose.setForeground(Color.white);
    }//GEN-LAST:event_lblcloseMouseEntered

    private void lblcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseExited
        Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
         lblclose.setBorder(borderlabel);
        lblclose.setForeground(Color.black);
    }//GEN-LAST:event_lblcloseMouseExited

    private void lblminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseEntered
        Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
         lblmin.setBorder(borderlabel);
        lblmin.setForeground(Color.white);
    }//GEN-LAST:event_lblminMouseEntered

    private void lblminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseExited
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
         lblmin.setBorder(borderlabel);
        lblmin.setForeground(Color.black);
    }//GEN-LAST:event_lblminMouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
         System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
       btnRegister.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        btnRegister.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void lblloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblloginMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblloginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       Register();
    }//GEN-LAST:event_btnRegisterActionPerformed
    public void Register(){
        if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Register",JOptionPane.ERROR_MESSAGE);
 
        else{
            String Name=txtName.getText();
            String Username=txtUsername.getText();
            String Password=String.valueOf( txtPassword.getPassword());
            String Confirm=String.valueOf( txtConfirm.getPassword());
            String Phone=txtPhone.getText();
            String Mail=txtMail.getText();
            if(!Password(Password, Confirm)){
              JOptionPane.showMessageDialog(null,"Le mot de passe ne correspond pas","Password",JOptionPane.ERROR_MESSAGE);  
              viderchamps();
            }else{
               PreparedStatement ps;
                String query ="INSERT INTO gestion_taxi.Users (Name,Username,Password,Phone,Mail) Values (?,?,?,?,?) ";
                try {
                    ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,Name );
                ps.setString(2,Username );
                ps.setString(3,Password );
                ps.setString(4,Phone );
                ps.setString(5,Mail );
                viderchamps();
                
               if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre compte a créé","Succès",JOptionPane.ERROR_MESSAGE);  
                 viderchamps();
               }
               else{
                   JOptionPane.showMessageDialog(null,"votre compte n'a pas été créé","Erreur",JOptionPane.ERROR_MESSAGE);
                    viderchamps();
               }
                
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null," la connection avec la base donee et Erreur");
                     viderchamps();
                }
                
            }
        } 
    }
    
    
    
    
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtName.getText().equals("") )
            txtUsername.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtUsername.getText().equals("") )
            txtPassword.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && ! String.valueOf( txtPassword.getPassword()).equals("") )
            txtConfirm.requestFocus();
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !String.valueOf( txtConfirm.getPassword()).equals("") )
            txtPhone.requestFocus();
    }//GEN-LAST:event_txtConfirmKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtPhone.getText().equals("") )
            txtMail.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtMailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtMail.getText().equals("") )
         Register();
    }//GEN-LAST:event_txtMailKeyTyped
  private boolean check(){
         return(txtName.getText().equals("")||txtUsername.getText().equals("")||String.valueOf( txtPassword.getPassword()).equals("")||
                 String.valueOf( txtConfirm.getPassword()).equals("")||txtPhone.getText().equals("")||txtMail.getText().equals("")) ; 
      }
  private boolean Password(String password,String confirm){
       return(password.equals(confirm));
          
      
  }
   public void viderchamps() {
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirm.setText("");
        txtPhone.setText("");
        txtMail.setText("");
        
        txtName.requestFocus();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              Register register =  new Register();
               register.setVisible(true);
               register.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRegister;
    private javax.swing.JLabel Phone;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lbllogin;
    private javax.swing.JLabel lblmin;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
