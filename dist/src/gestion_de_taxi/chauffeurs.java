
package gestion_de_taxi;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class chauffeurs extends javax.swing.JFrame {
DefaultTableModel model = new  DefaultTableModel();
    
    public chauffeurs() {
        initComponents();
        Table();
         Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        panelchauffeurs.setBorder(borderpanel);
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
         Border bordertext =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white);
         txtcin.setBorder(bordertext);
         txtpermis.setBorder(bordertext);
         txtnom.setBorder(bordertext);
         txtprenom.setBorder(bordertext);
         txtadresser.setBorder(bordertext);
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelchauffeurs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        txtadresser = new javax.swing.JTextField();
        txtcin = new javax.swing.JTextField();
        txtpermis = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtchercher = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        Modifier = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnEnregistreur = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 556));
        setMinimumSize(new java.awt.Dimension(851, 556));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelchauffeurs.setBackground(new java.awt.Color(153, 153, 153));
        panelchauffeurs.setMaximumSize(new java.awt.Dimension(100, 100));
        panelchauffeurs.setMinimumSize(new java.awt.Dimension(100, 100));
        panelchauffeurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE CHAUFFEURS");
        jLabel1.setOpaque(true);
        panelchauffeurs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 330, -1));

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
        panelchauffeurs.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

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
        panelchauffeurs.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        getContentPane().add(panelchauffeurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        txtadresser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtadresserKeyTyped(evt);
            }
        });
        getContentPane().add(txtadresser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 30));

        txtcin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcinKeyTyped(evt);
            }
        });
        getContentPane().add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 30));

        txtpermis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpermisActionPerformed(evt);
            }
        });
        txtpermis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpermisKeyTyped(evt);
            }
        });
        getContentPane().add(txtpermis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 30));

        txtprenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprenomKeyTyped(evt);
            }
        });
        getContentPane().add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("N° CIN :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("N°  permis :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Nom :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Prenom :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Adresser :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 850, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Chercher un Chuffeurs :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        txtchercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchercherActionPerformed(evt);
            }
        });
        getContentPane().add(txtchercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 580, 40));

        btnValider.setBackground(new java.awt.Color(0, 255, 153));
        btnValider.setText("Valider");
        btnValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValiderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValiderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValiderMouseExited(evt);
            }
        });
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });
        getContentPane().add(btnValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 270, 40));

        btnSupprimer.setBackground(new java.awt.Color(0, 255, 153));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseExited(evt);
            }
        });
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 200, 40));

        Modifier.setBackground(new java.awt.Color(0, 255, 153));
        Modifier.setText("Modifier");
        Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModifierMouseExited(evt);
            }
        });
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });
        getContentPane().add(Modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, 40));

        btnFermer.setBackground(new java.awt.Color(0, 255, 153));
        btnFermer.setText("Fermer");
        btnFermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFermerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFermerMouseExited(evt);
            }
        });
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 190, 40));

        btnAjouter.setBackground(new java.awt.Color(0, 255, 153));
        btnAjouter.setText("Ajouter");
        btnAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAjouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAjouterMouseExited(evt);
            }
        });
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 200, 40));

        btnEnregistreur.setBackground(new java.awt.Color(0, 255, 153));
        btnEnregistreur.setText("Enregistreur");
        btnEnregistreur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnregistreurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnregistreurMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnregistreurMouseExited(evt);
            }
        });
        getContentPane().add(btnEnregistreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 200, 40));

        btnActualiser.setBackground(new java.awt.Color(0, 255, 153));
        btnActualiser.setText("Actualiser");
        btnActualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualiserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualiserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualiserMouseExited(evt);
            }
        });
        getContentPane().add(btnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 190, 40));

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

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void txtpermisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpermisActionPerformed
       
    }//GEN-LAST:event_txtpermisActionPerformed

    private void txtcinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcinKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtcin.getText().equals("") )
            txtpermis.requestFocus();
        
    }//GEN-LAST:event_txtcinKeyTyped

    private void txtpermisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpermisKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtpermis.getText().equals("") )
            txtnom.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtpermisKeyTyped

    private void txtnomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtnom.getText().equals("") )
            txtprenom.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtnomKeyTyped

    private void txtprenomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprenomKeyTyped
       char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtprenom.getText().equals("") )
            txtadresser.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtprenomKeyTyped

    private void txtchercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchercherActionPerformed
        //
    }//GEN-LAST:event_txtchercherActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
     Ajouter();       
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
     
    }//GEN-LAST:event_tableMouseClicked

    private void btnFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseClicked
        chauffeurs.super.dispose();
         Project project =new Project ();
         project.setVisible(true);
         project.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFermerMouseClicked

    private void btnFermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseEntered
       btnFermer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnFermerMouseEntered

    private void btnFermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseExited
       btnFermer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnFermerMouseExited

    private void btnAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseEntered
       btnAjouter.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnAjouterMouseEntered

    private void btnAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseExited
     btnAjouter.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnAjouterMouseExited

    private void ModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseEntered
      Modifier.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_ModifierMouseEntered

    private void ModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMouseExited
        Modifier.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_ModifierMouseExited

    private void btnEnregistreurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseEntered
       btnEnregistreur.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnEnregistreurMouseEntered

    private void btnEnregistreurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseExited
        btnEnregistreur.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnEnregistreurMouseExited

    private void btnSupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseEntered
        btnSupprimer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnSupprimerMouseEntered

    private void btnSupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseExited
       btnSupprimer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnSupprimerMouseExited

    private void btnValiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseEntered
       btnValider .setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnValiderMouseEntered

    private void btnValiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseExited
     btnValider.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnValiderMouseExited

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
      PreparedStatement ps;
           ResultSet rs;
           if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Chauffeur",JOptionPane.ERROR_MESSAGE);
 
        else{
            String cin=txtcin.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();
            String numero_permis =txtpermis.getText();
            String Adresser=txtadresser.getText();
             String query ="Update gestion_taxi.chauffeurs set numero_permis=?, nom=? , prenom=? , Adresser =?  WHERE  CIN = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
                 ps.setString(1,numero_permis );
             ps.setString(2,nom );
                ps.setString(3,prenom );
                 ps.setString(4,Adresser );
                  ps.setString(5, cin);
                  
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre chauffeurs modifier","modifier",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre CIN n'a pas modifier","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }    
    }//GEN-LAST:event_ModifierActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
      int i=table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) table.getModel();
       txtcin.setText(model.getValueAt(i,0).toString());
        txtpermis.setText(model.getValueAt(i,1).toString());
       txtnom.setText(model.getValueAt(i,2).toString());
         txtprenom.setText(model.getValueAt(i,3).toString());
          txtadresser.setText(model.getValueAt(i,4).toString());       
    }//GEN-LAST:event_tableMouseReleased

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
       PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Chauffeurs",JOptionPane.ERROR_MESSAGE);
 
        else{
            String cin=txtcin.getText();
         
             String query ="delete from gestion_taxi.chauffeurs   WHERE  CIN = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               
                  ps.setString(1, cin);
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre Chauffeurs SUPPRIMER","SUPPRIMER",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre Chauffeurs  n'a pas SUPPRIMER","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }    
                          
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
      
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseClicked
        if(checke())
           JOptionPane.showMessageDialog(null,"Enter les information svp","chaffeurs",JOptionPane.ERROR_MESSAGE);
              
        else{
        
        String[] client={"CIN","numero_permis","nom","prenom","Adresser"};
          String[] afficher =new String[5];
          DefaultTableModel model = new  DefaultTableModel(null,client);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="SELECT * FROM gestion_taxi.chauffeurs WHERE  CIN ='"+txtchercher.getText()+"'";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("CIn");
              afficher[1] =rs.getString("numero_permis");
              afficher[2] =rs.getString("nom"); 
              afficher[3] =rs.getString("prenom");
              afficher[4] =rs.getString("Adresser");
              model.addRow(afficher);
            }
            table.setModel(model);
            
              
          } catch (Exception e) {
          }}
      
    }//GEN-LAST:event_btnValiderMouseClicked

    private void btnActualiserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseClicked
        viderchamps();
        Table();
    }//GEN-LAST:event_btnActualiserMouseClicked

    private void btnActualiserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseEntered
       btnActualiser.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnActualiserMouseEntered

    private void btnActualiserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseExited
        btnActualiser.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnActualiserMouseExited

    private void btnEnregistreurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseClicked
        String path="";
         JFileChooser j= new JFileChooser();
         j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         int x=j.showSaveDialog(this);
         if(x==JFileChooser.APPROVE_OPTION){
             path=j.getSelectedFile().getPath();
             }
         
         Document doc = new Document();
          try {
              PdfWriter.getInstance(doc, new FileOutputStream (path+"Chauffeurs.pdf"));
              
              doc.open();
              
              PdfPTable tbl=new PdfPTable(5);
              
               tbl.addCell("CIN");
              tbl.addCell("numero_permis");
              tbl.addCell("nom");
              tbl.addCell("prenom");
              tbl.addCell("Adresser");
              
              
              for (int i =0; i<table.getRowCount();i++){
                  String CIN=table.getValueAt(i,0).toString();
                  String numero_permis=table.getValueAt(i,1).toString();
                  String nom =table.getValueAt(i,2).toString();
                  String prenom=table.getValueAt(i,3).toString();
                  String Adresser=table.getValueAt(i,4).toString();
                  
                  tbl.addCell(CIN);
                  tbl.addCell(numero_permis);
                  tbl.addCell(nom);
                  tbl.addCell(prenom);
                  tbl.addCell(Adresser);
                  
              }
              doc.add(tbl);
              
              
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          } catch (DocumentException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          doc.close();
    }//GEN-LAST:event_btnEnregistreurMouseClicked

    private void txtadresserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtadresserKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtadresser.getText().equals("") )
            Ajouter();
            
    }//GEN-LAST:event_txtadresserKeyTyped

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           chauffeurs   f    =  new chauffeurs();
           f.setVisible(true);
           f.setLocationRelativeTo(null);
            }
        });
    }
    private boolean check(){
         return(txtnom.getText().equals("")|| txtprenom.getText().equals("")||txtadresser.getText().equals("")) ; 
      }
    public boolean checke(){
         return txtchercher.getText().equals("");
    }
        public void viderchamps() {
        txtcin.setText("");
        txtnom.setText("");
        txtprenom.setText("");
        txtpermis.setText("");
        txtadresser.setText("");
        
        
        txtcin.requestFocus();
    }
    public void  Ajouter(){
             PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Chauffeur",JOptionPane.ERROR_MESSAGE);
 
        else{
        
            String cin=txtcin.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();
            String numero_permis =txtpermis.getText();
            String Adresser=txtadresser.getText();
             String query ="INSERT INTO gestion_taxi.chauffeurs (CIN,numero_permis,nom,prenom,Adresser) Values (?,?,?,?,?) ";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,cin );
                ps.setString(2,numero_permis);
                ps.setString(3,nom );
                 ps.setString(4,prenom);
                  ps.setString(5,Adresser );
                  viderchamps();
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre chauffeurs est ajouter une base donne","Ajouter",JOptionPane.ERROR_MESSAGE);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre chauffeure  n'a pas ajouter une base donne","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
             }    
            
        }
    public void Table(){
          
          String[] client={"CIN","numero_permis","nom","prenom","Adresser"};
          String[] afficher =new String[5];
          DefaultTableModel model = new  DefaultTableModel(null,client);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="select* from gestion_taxi.chauffeurs ";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("CIn");
              afficher[1] =rs.getString("numero_permis");
              afficher[2] =rs.getString("nom"); 
              afficher[3] =rs.getString("prenom");
              afficher[4] =rs.getString("Adresser");
              model.addRow(afficher);
            }
            table.setModel(model);
            
              
          } catch (Exception e) {
          }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modifier;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistreur;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JPanel panelchauffeurs;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtadresser;
    private javax.swing.JTextField txtchercher;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpermis;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
