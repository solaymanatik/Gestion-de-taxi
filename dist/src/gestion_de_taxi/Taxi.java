
package gestion_de_taxi;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.sql.*;
import java.time.Clock;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Taxi extends javax.swing.JFrame {
    
    
    public Taxi() {
         initComponents();
         combobex1();
         combobex2();
         combobex4();
         Table();
        

        Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        panelTaxi.setBorder(borderpanel);
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
          Border bordertxt =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
         txttaxi.setBorder(bordertxt);
         txtmatricul.setBorder(bordertxt);
          txttaxi1.setBorder(bordertxt);
        comPoint.setSelectedItem(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTaxi = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxcategorie = new javax.swing.JComboBox<>();
        comRegion = new javax.swing.JComboBox<>();
        comProvince = new javax.swing.JComboBox<>();
        comPoint = new javax.swing.JComboBox<>();
        txttaxi = new javax.swing.JTextField();
        txtmatricul = new javax.swing.JTextField();
        txttaxi1 = new javax.swing.JTextField();
        commatricule = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabletaxi = new javax.swing.JTable();
        btnFermer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnEnregistreur = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnValider = new javax.swing.JButton();
        txtchercher = new javax.swing.JTextField();
        btnActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(893, 560));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTaxi.setBackground(new java.awt.Color(153, 153, 153));
        panelTaxi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE TAXI");
        jLabel1.setOpaque(true);
        panelTaxi.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 240, -1));

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
        panelTaxi.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

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
        panelTaxi.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        getContentPane().add(panelTaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("N° Immatriculation  ( Exemple : 5683 - A- 47)");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Categorie");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("N° Taxi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Region");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Province ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Point d'attache");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        ComboBoxcategorie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(ComboBoxcategorie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 30));

        comRegion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comRegionItemStateChanged(evt);
            }
        });
        comRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comRegionMouseClicked(evt);
            }
        });
        comRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comRegionActionPerformed(evt);
            }
        });
        getContentPane().add(comRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 190, 30));

        comProvince.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comProvinceItemStateChanged(evt);
            }
        });
        comProvince.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comProvinceMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comProvinceMouseReleased(evt);
            }
        });
        comProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comProvinceActionPerformed(evt);
            }
        });
        getContentPane().add(comProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 190, 30));

        comPoint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comPointMouseReleased(evt);
            }
        });
        comPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comPointActionPerformed(evt);
            }
        });
        getContentPane().add(comPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 190, 30));

        txttaxi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttaxiKeyTyped(evt);
            }
        });
        getContentPane().add(txttaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 180, 30));

        txtmatricul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculActionPerformed(evt);
            }
        });
        txtmatricul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatriculKeyTyped(evt);
            }
        });
        getContentPane().add(txtmatricul, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, 30));

        txttaxi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttaxi1KeyTyped(evt);
            }
        });
        getContentPane().add(txttaxi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 180, 30));

        getContentPane().add(commatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 30));

        Tabletaxi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabletaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabletaxiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabletaxi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 980, 120));

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
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 150, 40));

        btnModifier.setBackground(new java.awt.Color(0, 255, 153));
        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModifierMouseExited(evt);
            }
        });
        getContentPane().add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 150, 40));

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
        getContentPane().add(btnAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 40));

        btnSupprimer.setBackground(new java.awt.Color(0, 255, 153));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSupprimerMouseExited(evt);
            }
        });
        getContentPane().add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 150, 40));

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
        getContentPane().add(btnEnregistreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Chercher un Taxi :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, -1));

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
        getContentPane().add(btnValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 230, 50));
        getContentPane().add(txtchercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 590, 40));

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
        getContentPane().add(btnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 150, 40));

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

    private void txtmatriculActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculActionPerformed

    }//GEN-LAST:event_txtmatriculActionPerformed

    private void comRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comRegionMouseClicked
    
    }//GEN-LAST:event_comRegionMouseClicked

    private void comProvinceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comProvinceMouseClicked
        
    }//GEN-LAST:event_comProvinceMouseClicked

    private void comRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comRegionActionPerformed
            combobex3();
    }//GEN-LAST:event_comRegionActionPerformed

    private void comProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comProvinceActionPerformed
       combobex5();
      
    }//GEN-LAST:event_comProvinceActionPerformed

    private void comPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comPointActionPerformed
        // TODO add your handling code here:
                // combobex5();combobex5
    }//GEN-LAST:event_comPointActionPerformed

    private void comProvinceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comProvinceMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comProvinceMouseReleased

    private void comPointMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comPointMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_comPointMouseReleased

    private void comProvinceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comProvinceItemStateChanged
       
    }//GEN-LAST:event_comProvinceItemStateChanged

    private void comRegionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comRegionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comRegionItemStateChanged

    private void btnFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseClicked
        Taxi.super.dispose();
         Project project =new Project ();
         project.setVisible(true);
         project.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFermerMouseClicked

    private void btnAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseEntered
        btnAjouter.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnAjouterMouseEntered

    private void btnAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseExited
         btnAjouter.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnAjouterMouseExited

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

    private void btnEnregistreurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseEntered
        btnEnregistreur.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnEnregistreurMouseEntered

    private void btnEnregistreurMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnregistreurMouseExited
        btnEnregistreur.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnEnregistreurMouseExited

    private void btnFermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseEntered
       btnFermer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnFermerMouseEntered

    private void btnFermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseExited
        btnFermer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnFermerMouseExited

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        Ajouter();
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        PreparedStatement ps;
           ResultSet rs;
           if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
             String categorie =ComboBoxcategorie.getSelectedItem().toString();
            String Region=comRegion.getSelectedItem().toString();
            String Provine =comProvince.getSelectedItem().toString();
            String Point =comPoint.getSelectedItem().toString();
            String numero1 =txtmatricul.getText();
            String alphbi = commatricule.getSelectedItem().toString();
            String numero2=txttaxi.getText();
            String numerotaxi=txttaxi1.getText();
             String query ="Update gestion_taxi.taxi set  Categorie=? , Region=? , province=? , point_dachat=? , numero1=?, alphabet=?, numero2=?  WHERE  numero_taxi = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
                   ps.setString(1,categorie);
                ps.setString(2,Region );
                ps.setString(3,Provine );
                 ps.setString(4,Point );
                  ps.setString(5,numero1 );
                  ps.setString(6,alphbi );
                  ps.setString(7,numero2);
                  ps.setString(8,numerotaxi );
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre taxi modifier","modifier",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre numero_taxi  n'a pas modifier","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }    
    }//GEN-LAST:event_btnModifierMouseClicked

    private void TabletaxiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabletaxiMouseReleased
         int i=Tabletaxi.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) Tabletaxi.getModel();
      ComboBoxcategorie .setSelectedItem(model.getValueAt(i,0).toString());
       comRegion.setSelectedItem(model.getValueAt(i,1).toString());
         comProvince.setSelectedItem(model.getValueAt(i,2).toString());
          comPoint.setSelectedItem(model.getValueAt(i,3).toString());
           txtmatricul.setText(model.getValueAt(i,4).toString());
            commatricule.setSelectedItem(model.getValueAt(i,5).toString());
             txttaxi.setText(model.getValueAt(i,6).toString());
             txttaxi1.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_TabletaxiMouseReleased

    private void btnSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseClicked
       PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
            String numero_taxi=txttaxi1.getText();
         
             String query ="delete from gestion_taxi.taxi   WHERE  numero_taxi = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               
                  ps.setString(1, numero_taxi);
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre Taxi SUPPRIMER","SUPPRIMER",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre Taxi  n'a pas SUPPRIMER","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }  
    }//GEN-LAST:event_btnSupprimerMouseClicked

    private void btnValiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseEntered
        btnValider.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnValiderMouseEntered

    private void btnValiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseExited
         btnValider.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnValiderMouseExited

    private void btnValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseClicked
           if(checke())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
              
        else{
        String[] Taxi={"Categorie","Region","province","point_dachat","numero1","alphabet","numero2","numero_taxi"};
          String[] afficher =new String[8];
          DefaultTableModel model = new  DefaultTableModel(null,Taxi);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="SELECT * FROM gestion_taxi.taxi WHERE  numero_taxi ='"+txtchercher.getText()+"'";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("Categorie");
              afficher[1] =rs.getString("Region");
              afficher[2] =rs.getString("province"); 
              afficher[3] =rs.getString("point_dachat");
              afficher[4] =rs.getString("numero1");
              afficher[5] =rs.getString("alphabet");
              afficher[6] =rs.getString("numero2");             
              afficher[7] =rs.getString("numero_taxi");
              model.addRow(afficher);
            }
            Tabletaxi.setModel(model);
            
              
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
              PdfWriter.getInstance(doc, new FileOutputStream (path+"Taxi.pdf"));
              
              doc.open();
              
              PdfPTable tbl=new PdfPTable(8);
              
               tbl.addCell("Categorie");
              tbl.addCell("Region");
              tbl.addCell("province");
              tbl.addCell("point_dachat");
              tbl.addCell("numero1");
              tbl.addCell("alphabet");
              tbl.addCell("numero2");
              tbl.addCell("numero_taxi");
              
              
              for (int i =0; i<Tabletaxi.getRowCount();i++){
                  String Categorie=Tabletaxi.getValueAt(i,0).toString();
                  String Region=Tabletaxi.getValueAt(i,1).toString();
                  String province=Tabletaxi.getValueAt(i,2).toString();
                  String point_dachat=Tabletaxi.getValueAt(i,3).toString();
                  String numero1=Tabletaxi.getValueAt(i,4).toString();
                  String alphabet=Tabletaxi.getValueAt(i,5).toString();
                  String numero2 =Tabletaxi.getValueAt(i,6).toString();
                  String numero_taxi =Tabletaxi.getValueAt(i,7).toString();
                  
                  tbl.addCell(Categorie);
                  tbl.addCell(Region);
                  tbl.addCell(province);
                  tbl.addCell(point_dachat);
                  tbl.addCell(numero1);
                  tbl.addCell(alphabet);
                  tbl.addCell(numero2);
                  tbl.addCell(numero_taxi);
              }
              doc.add(tbl);
              
              
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          } catch (DocumentException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          doc.close();
    }//GEN-LAST:event_btnEnregistreurMouseClicked

    private void txtmatriculKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculKeyTyped
         char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && ! txtmatricul.getText().equals("") )
          txttaxi.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtmatriculKeyTyped

    private void txttaxiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttaxiKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && ! txttaxi.getText().equals("") )
          txttaxi1.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txttaxiKeyTyped

    private void txttaxi1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttaxi1KeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && ! txttaxi1.getText().equals("") )
          Ajouter();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txttaxi1KeyTyped

    public void combobex1(){
        
        try {
           PreparedStatement ps;
           ResultSet rs;
            String query ="select * from gestion_taxi.categorie ";
             ps=ConnectionBD.getConnection().prepareStatement(query);
             rs=ps.executeQuery();
             while(rs.next()){
                 String laball=rs.getString("laballe");
                 ComboBoxcategorie.addItem(laball);
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void combobex2(){
        
        try {
           PreparedStatement ps;
           ResultSet rs;
            String query ="select * from gestion_taxi.region ";
             ps=ConnectionBD.getConnection().prepareStatement(query);
             rs=ps.executeQuery();
             while(rs.next()){
                 String nam=rs.getString("libelle");
                 comRegion.addItem(nam); 
             } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void combobex3(){
      comProvince.removeAllItems();
        try {
           PreparedStatement ps;
           ResultSet rs;
            String query ="SELECT  P.libelle FROM gestion_taxi.province P INNER JOIN gestion_taxi.region R on R.id_region = P.id_region WHERE r.libelle = ?;";
             ps=ConnectionBD.getConnection().prepareStatement(query);
             ps.setString(1, comRegion.getSelectedItem().toString());
             rs=ps.executeQuery();
             while(rs.next()){
              String nam=rs.getString("libelle");
               comProvince.addItem(nam);
                               
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Provice made the error");
        }
    }
     public void combobex4(){
        
        try {
           PreparedStatement ps;
           ResultSet rs;
            String query ="select * from gestion_taxi.matrculations ";
             ps=ConnectionBD.getConnection().prepareStatement(query);
             rs=ps.executeQuery();
             while(rs.next()){
                 String laball=rs.getString("alphabet");
                 commatricule.addItem(laball);
             }
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void combobex5(){
         comPoint.removeAllItems();
        try {
           PreparedStatement ps;
           ResultSet rs;
            String query ="SELECT P.libelle FROM gestion_taxi.point P INNER JOIN gestion_taxi.province R on R.id_province = P.id_province WHERE R.libelle = ? ";
             ps=ConnectionBD.getConnection().prepareStatement(query);
             ps.setString(1, comProvince.getSelectedItem().toString());
             rs=ps.executeQuery();
             
             while(rs.next()){
                String nam=rs.getString("libelle");
               comPoint.addItem(nam);
             }
             
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
     public boolean checke(){
         return txtchercher.getText().equals("");
     }
      private boolean check(){
         return(txtmatricul.getText().equals("")|| txttaxi.getText().equals("")||txttaxi1.getText().equals("")) ; 
      }
       public void viderchamps() {
        txtmatricul.setText("");
        txttaxi.setText("");
        txttaxi1.setText("");
        
        
        ComboBoxcategorie.requestFocus();
    }
        public void Table(){
          
          String[] Taxi={"Categorie","Region","province","point_dachat","numero1","alphabet","numero2","numero_taxi"};
          String[] afficher =new String[8];
          DefaultTableModel model = new  DefaultTableModel(null,Taxi);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="select* from gestion_taxi.taxi ";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("Categorie");
              afficher[1] =rs.getString("Region");
              afficher[2] =rs.getString("province"); 
              afficher[3] =rs.getString("point_dachat");
              afficher[4] =rs.getString("numero1");
              afficher[5] =rs.getString("alphabet");
              afficher[6] =rs.getString("numero2");             
              afficher[7] =rs.getString("numero_taxi");
              model.addRow(afficher);
            }
            Tabletaxi.setModel(model);
            
              
          } catch (Exception e) {
          }
      }
       
         public void  Ajouter(){
            PreparedStatement ps;
            ResultSet rs;
             if(check())
                JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
             String categorie =ComboBoxcategorie.getSelectedItem().toString();
            String Region=comRegion.getSelectedItem().toString();
            String Provine =comProvince.getSelectedItem().toString();
            String Point =comPoint.getSelectedItem().toString();
            String numero1 =txtmatricul.getText();
            String alphbi = commatricule.getSelectedItem().toString();
            String numero2=txttaxi.getText();
            String numerotaxi=txttaxi1.getText();
            
             String query ="INSERT INTO gestion_taxi.taxi (Categorie,Region,province,point_dachat,numero1,alphabet,numero2,numero_taxi) Values (?,?,?,?,?,?,?,?) ";
             try { 
               ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,categorie);
                ps.setString(2,Region );
                ps.setString(3,Provine );
                 ps.setString(4,Point );
                  ps.setString(5,numero1 );
                  ps.setString(6,alphbi );
                  ps.setString(7,numero2);
                  ps.setString(8,numerotaxi );
                  
                  viderchamps();
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre Taxi est ajouter une base donne","Ajouter",JOptionPane.ERROR_MESSAGE);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre Taxi  n'a pas ajouter une base donne","Erreur",JOptionPane.ERROR_MESSAGE);
                  viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
             }    
            
        }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             Taxi taxi=   new Taxi();
             taxi.setVisible(true);
             taxi.setLocationRelativeTo(null);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxcategorie;
    private javax.swing.JTable Tabletaxi;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistreur;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox<String> comPoint;
    private javax.swing.JComboBox<String> comProvince;
    private javax.swing.JComboBox<String> comRegion;
    private javax.swing.JComboBox<String> commatricule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    private javax.swing.JPanel panelTaxi;
    private javax.swing.JTextField txtchercher;
    private javax.swing.JTextField txtmatricul;
    private javax.swing.JTextField txttaxi;
    private javax.swing.JTextField txttaxi1;
    // End of variables declaration//GEN-END:variables
}
