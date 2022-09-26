
package gestion_de_taxi;
import java.sql.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        PanelLogin.setBorder(borderpanel);
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
         Border bordertext =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
         txtUsername.setBorder(bordertext);
         txtPassword.setBorder(bordertext);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblregister = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(397, 324));
        setMinimumSize(new java.awt.Dimension(397, 324));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setBackground(new java.awt.Color(153, 153, 153));
        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setOpaque(true);
        PanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, -1));

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
        PanelLogin.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 20, -1));

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
        PanelLogin.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 20, -1));

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 92, 260, 30));

        btnLogin.setBackground(new java.awt.Color(0, 255, 153));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 195, 320, 40));

        lblregister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblregister.setForeground(new java.awt.Color(255, 0, 0));
        lblregister.setText(">> pase de compte ? créer une");
        lblregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblregisterMouseClicked(evt);
            }
        });
        getContentPane().add(lblregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 250, 220, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnLoginMouseExited

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

    private void lblregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblregisterMouseClicked
        Register register = new Register();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblregisterMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     Login();
    }//GEN-LAST:event_btnLoginActionPerformed
       public void Login(){
             if(check())
           JOptionPane.showMessageDialog(null,"Enter Usrearname et Password","Login",JOptionPane.ERROR_MESSAGE);
        
       else{
           PreparedStatement ps;
           ResultSet rs;
           String Username=txtUsername.getText();
           String Password= String.valueOf( txtPassword.getPassword());
           String query ="select * from gestion_taxi.Users where Username=? and Password=? ";
           try{
               ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,Username );
                ps.setString(2,Password );
                rs=ps.executeQuery();
                if(rs.next()){
              Project project  =  new Project();
               project.setVisible(true);
              project.setLocationRelativeTo(null);
             this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null," Nom ou mot de passe incorrect","Informations erronées",JOptionPane.ERROR_MESSAGE);
                    viderchamps();
                }
                
           }catch (Exception ex){
               JOptionPane.showMessageDialog(null," la connection avec la base donee et error");
               
           }
       }
           
       }
    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtUsername.getText().equals("") )
            txtPassword.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !String.valueOf(txtPassword.getPassword()).equals("") )
            Login();
    }//GEN-LAST:event_txtPasswordKeyTyped
      private boolean check(){
         return(txtUsername.getText().equals("")||String.valueOf( txtPassword.getPassword()).equals("")) ; 
      }
       public void viderchamps() {
       
        txtUsername.setText("");
        txtPassword.setText("");
        txtUsername.requestFocus();
       }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              Login login= new Login();
               login.setVisible(true);
               login.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblregister;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
