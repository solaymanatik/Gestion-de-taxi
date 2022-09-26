
package gestion_de_taxi;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class Client extends  javax.swing.JFrame {
      DefaultTableModel model = new  DefaultTableModel();
    public Client() {
        initComponents();
        Table();
        Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        panelclient.setBorder(borderpanel);
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
          Border bordertext =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white);
          txtnom.setBorder(bordertext);
          txtprenom.setBorder(bordertext);
          txtemail.setBorder(bordertext);
          txtnumero.setBorder(bordertext);
          txtchercher.setBorder(bordertext);
          txtcin.setBorder(bordertext);
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelclient = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableclients = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtchercher = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnEnregistreur = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        txtcin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        btnActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(851, 545));
        setMinimumSize(new java.awt.Dimension(851, 545));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelclient.setBackground(new java.awt.Color(153, 153, 153));
        panelclient.setMaximumSize(new java.awt.Dimension(850, 100));
        panelclient.setMinimumSize(new java.awt.Dimension(850, 100));
        panelclient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE CLIENT");
        jLabel1.setOpaque(true);
        panelclient.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 250, -1));

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
        panelclient.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

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
        panelclient.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        getContentPane().add(panelclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nom :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Prenom :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Email :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Numero_tel :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        txtnumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 260, 30));

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtemailKeyTyped(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 260, 30));

        txtprenom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtprenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprenomKeyTyped(evt);
            }
        });
        getContentPane().add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 260, 30));

        txtnom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomKeyTyped(evt);
            }
        });
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 260, 30));

        jTableclients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableclients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableclientsMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableclientsMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableclients);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 850, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Chercher un client :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        txtchercher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtchercher.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtchercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 400, 40));

        btnValider.setBackground(new java.awt.Color(0, 255, 153));
        btnValider.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnValider.setText("Valider");
        btnValider.addMouseListener(new java.awt.event.MouseAdapter() {
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
        getContentPane().add(btnValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 440, 40));

        btnAjouter.setBackground(new java.awt.Color(0, 255, 153));
        btnAjouter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        getContentPane().add(btnAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, 40));

        btnEnregistreur.setBackground(new java.awt.Color(0, 255, 153));
        btnEnregistreur.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        getContentPane().add(btnEnregistreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 180, 40));

        btnModifier.setBackground(new java.awt.Color(0, 255, 153));
        btnModifier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierMouseExited(evt);
            }
        });
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 180, 40));

        btnSupprimer.setBackground(new java.awt.Color(0, 255, 153));
        btnSupprimer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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
        getContentPane().add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 180, 40));

        btnFermer.setBackground(new java.awt.Color(0, 255, 153));
        btnFermer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFermerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFermerMouseExited(evt);
            }
        });
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 190, 40));

        txtcin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcinKeyTyped(evt);
            }
        });
        getContentPane().add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 260, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("CIN :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIN", "Nom" }));
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 170, 30));

        btnActualiser.setBackground(new java.awt.Color(0, 255, 153));
        btnActualiser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualiserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualiserMouseExited(evt);
            }
        });
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableclientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableclientsMouseClicked
      
    }//GEN-LAST:event_jTableclientsMouseClicked

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
          Ajouter();
    }//GEN-LAST:event_btnAjouterActionPerformed

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

    private void btnValiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseEntered
        btnValider.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnValiderMouseEntered

    private void btnValiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseExited
         btnValider.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnValiderMouseExited

    private void btnAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseEntered
       btnAjouter.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnAjouterMouseEntered

    private void btnAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseExited
        btnAjouter.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnAjouterMouseExited

    private void btnEnregistreurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseEntered
       btnEnregistreur.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnEnregistreurMouseEntered

    private void btnEnregistreurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseExited
       btnEnregistreur.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnEnregistreurMouseExited

    private void btnModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseEntered
     btnModifier.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnModifierMouseEntered

    private void btnModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseExited
     btnModifier.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnModifierMouseExited

    private void btnSupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseEntered
         btnSupprimer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnSupprimerMouseEntered

    private void btnSupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseExited
        btnSupprimer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnSupprimerMouseExited

    private void btnFermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseEntered
       btnFermer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnFermerMouseEntered

    private void btnFermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseExited
        btnFermer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnFermerMouseExited

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
         Client.super.dispose();
         Project project =new Project ();
         project.setVisible(true);
         project.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFermerActionPerformed

    private void txtcinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcinKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtcin.getText().equals("") )
            txtnom.requestFocus();
    }//GEN-LAST:event_txtcinKeyTyped

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
            txtemail.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtprenomKeyTyped

    private void txtemailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtemail.getText().equals("") )
            txtnumero.requestFocus();
    }//GEN-LAST:event_txtemailKeyTyped

    private void txtnumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroKeyTyped
         char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtnumero.getText().equals("") )
          Ajouter();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtnumeroKeyTyped

    private void jTableclientsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableclientsMouseReleased
       int i=jTableclients.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) jTableclients.getModel();
       txtcin.setText(model.getValueAt(i,0).toString());
        txtnom.setText(model.getValueAt(i,1).toString());
         txtprenom.setText(model.getValueAt(i,2).toString());
          txtemail.setText(model.getValueAt(i,3).toString());
           txtnumero.setText(model.getValueAt(i,4).toString());
       
    }//GEN-LAST:event_jTableclientsMouseReleased

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
         PreparedStatement ps;
           ResultSet rs;
           if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Client",JOptionPane.ERROR_MESSAGE);
 
        else{
            String cin=txtcin.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();
            String email =txtemail.getText();
            String numero=txtnumero.getText();
             String query ="Update gestion_taxi.client set  nom=? , prenom=? , email=? , numero_tel=?  WHERE  CIN = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
                ps.setString(1,nom );
                ps.setString(2,prenom );
                 ps.setString(3,email );
                  ps.setString(4,numero );
                  ps.setString(5, cin);
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre client modifier","modifier",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre CIN  n'a pas modifier","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }    
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Client",JOptionPane.ERROR_MESSAGE);
 
        else{
            String cin=txtcin.getText();
         
             String query ="delete from gestion_taxi.client   WHERE  CIN = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               
                  ps.setString(1, cin);
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre client SUPPRIMER","SUPPRIMER",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre Client  n'a pas SUPPRIMER","Erreur",JOptionPane.ERROR_MESSAGE);
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
         
        if(checke())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Client",JOptionPane.ERROR_MESSAGE);
              
        else{
        String[] client={"CIN","NOM","PRENOM","EMAIL","NUMERO_TEL"};
          String[] afficher =new String[5];
          DefaultTableModel model = new  DefaultTableModel(null,client);
            PreparedStatement ps;
           ResultSet rs;
       
           String query ="SELECT * FROM gestion_taxi.client WHERE  CIN ='"+txtchercher.getText()+"'";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("CIn");
              afficher[1] =rs.getString("nom");
              afficher[2] =rs.getString("prenom"); 
              afficher[3] =rs.getString("email");
              afficher[4] =rs.getString("numero_tel");
             
              model.addRow(afficher);
              
            }  
                 jTableclients.setModel(model);
                 
           
              
          } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null," voter client npa exixte ","Client",JOptionPane.ERROR_MESSAGE);
                 
          }
        }
      
    }//GEN-LAST:event_btnValiderActionPerformed

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
              PdfWriter.getInstance(doc, new FileOutputStream (path+"Taxi.pdf"));
              
              doc.open();
              
              PdfPTable tbl=new PdfPTable(5);
              
              tbl.addCell("CIN");
              tbl.addCell("NOM");
              tbl.addCell("PRENOM");
              tbl.addCell("EMAIL");
              tbl.addCell("NUMERO_TEL");
              
              
              for (int i =0; i<jTableclients.getRowCount();i++){
                  String CIN=jTableclients.getValueAt(i,0).toString();
                  String NOM=jTableclients.getValueAt(i,1).toString();
                  String PRENOM=jTableclients.getValueAt(i,2).toString();
                  String EMAIL=jTableclients.getValueAt(i,3).toString();
                  String NUMERO_TEL=jTableclients.getValueAt(i,4).toString();
                  
                  tbl.addCell(CIN);
                  tbl.addCell(NOM);
                  tbl.addCell(PRENOM);
                  tbl.addCell(EMAIL);
                  tbl.addCell(NUMERO_TEL);
              }
              doc.add(tbl);
              
              
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          } catch (DocumentException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          doc.close();
    }//GEN-LAST:event_btnEnregistreurMouseClicked

    private void btnActualiserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseEntered
       btnActualiser.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnActualiserMouseEntered

    private void btnActualiserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualiserMouseExited
        btnActualiser.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnActualiserMouseExited

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        viderchamps();
        Table();
    }//GEN-LAST:event_btnActualiserActionPerformed
  
    
     private boolean check(){
         return(txtnom.getText().equals("")|| txtprenom.getText().equals("")||txtemail.getText().equals("")||txtnumero.getText().equals("")) ; 
      }
     public boolean checke(){
         return txtchercher.getText().equals("");
     }
        public void viderchamps() {
        txtcin.setText("");
        txtnom.setText("");
        txtprenom.setText("");
        txtemail.setText("");
        txtnumero.setText("");
        
        
        txtcin.requestFocus();
    }
        public void  Ajouter(){
             PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Client",JOptionPane.ERROR_MESSAGE);
 
        else{
        
            String cin=txtcin.getText();
            String nom=txtnom.getText();
            String prenom=txtprenom.getText();
            String email =txtemail.getText();
            String numero=txtnumero.getText();
             String query ="INSERT INTO gestion_taxi.client (CIN,nom,prenom,email,numero_tel) Values (?,?,?,?,?) ";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,cin );
                ps.setString(2,nom );
                ps.setString(3,prenom );
                 ps.setString(4,email );
                  ps.setString(5,numero );
                  viderchamps();
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre client est ajouter une base donne","Ajouter",JOptionPane.ERROR_MESSAGE);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre client  n'a pas ajouter une base donne","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
             }    
            
        }
      public void Table(){
          
          String[] client={"CIN","NOM","PRENOM","EMAIL","NUMERO_TEL"};
          String[] afficher =new String[5];
          DefaultTableModel model = new  DefaultTableModel(null,client);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="select* from gestion_taxi.client ";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("CIn");
              afficher[1] =rs.getString("nom");
              afficher[2] =rs.getString("prenom"); 
              afficher[3] =rs.getString("email");
              afficher[4] =rs.getString("numero_tel");
              model.addRow(afficher);
            }
            jTableclients.setModel(model);
            
              
          } catch (Exception e) {
          }
      }
   
      
      
       public void  chercher(){
          
          String[] client={"CIN","NOM","PRENOM","EMAIL","NUMERO_TEL"};
          String[] afficher =new String[5];
          DefaultTableModel model = new  DefaultTableModel(null,client);
            PreparedStatement ps;
           ResultSet rs;
       
            String query ="select* from gestion_taxi.client whetre  "+combo+"Like '%"+txtchercher.getText()+"%'";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("CIn");
              afficher[1] =rs.getString("nom");
              afficher[2] =rs.getString("prenom"); 
              afficher[3] =rs.getString("email");
              afficher[4] =rs.getString("numero_tel");
              model.addRow(afficher);
            }
            jTableclients.setModel(model);
            
              
          } catch (Exception e) {
           }
      }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Client client=   new Client();
             client.setVisible(true);
              client.setLocationRelativeTo(null);
            }
        });
    }
    public void dipalce(int i){
       i =jTableclients.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) jTableclients.getModel();
       txtcin.setText(model.getValueAt(i,0).toString());
        txtnom.setText(model.getValueAt(i,1).toString());
         txtprenom.setText(model.getValueAt(i,2).toString());
          txtemail.setText(model.getValueAt(i,3).toString());
           txtnumero.setText(model.getValueAt(i,4).toString());
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistreur;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableclients;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JPanel panelclient;
    private javax.swing.JTextField txtchercher;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtprenom;
    // End of variables declaration//GEN-END:variables
}
