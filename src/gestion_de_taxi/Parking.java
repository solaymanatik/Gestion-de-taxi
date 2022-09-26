
package gestion_de_taxi;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
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
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.table.DefaultTableModel;

public class Parking extends javax.swing.JFrame {

   
    public Parking() {
        initComponents();
        combobex4();
        Table();
         Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        PanelParking.setBorder(borderpanel);
         Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
         Border bordertxt =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
         txtplaces.setBorder(bordertxt);
         txtmatriculation.setBorder(bordertxt);
          txtmatriculation1.setBorder(bordertxt);
          txtmodel.setBorder(bordertxt);
          txtmarque.setBorder(bordertxt);
          txttaxi.setBorder(bordertxt);
          txtchercher.setBorder(bordertxt);
          
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelParking = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttaxi = new javax.swing.JTextField();
        txtplaces = new javax.swing.JTextField();
        txtmatriculation = new javax.swing.JTextField();
        txtmarque = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        commatricule = new javax.swing.JComboBox<>();
        txtmatriculation1 = new javax.swing.JTextField();
        btnModifier = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnEnregistreur = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableparking = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtchercher = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(911, 555));
        setMinimumSize(new java.awt.Dimension(911, 555));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelParking.setBackground(new java.awt.Color(153, 153, 153));
        PanelParking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESRION DE PARKING");
        jLabel1.setOpaque(true);
        PanelParking.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 16, 270, 30));

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
        PanelParking.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

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
        PanelParking.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

        getContentPane().add(PanelParking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("numero places :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("N° Immatriculation  ( Exemple : 5683 - A- 47)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("la marque :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Model :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("numero taxi :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        txttaxi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttaxiKeyTyped(evt);
            }
        });
        getContentPane().add(txttaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 210, 30));

        txtplaces.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplacesKeyTyped(evt);
            }
        });
        getContentPane().add(txtplaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 30));

        txtmatriculation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatriculationKeyTyped(evt);
            }
        });
        getContentPane().add(txtmatriculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 210, 30));

        txtmarque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarqueKeyTyped(evt);
            }
        });
        getContentPane().add(txtmarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 30));

        txtmodel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmodelKeyTyped(evt);
            }
        });
        getContentPane().add(txtmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 210, 30));

        getContentPane().add(commatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 160, 30));

        txtmatriculation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatriculation1KeyTyped(evt);
            }
        });
        getContentPane().add(txtmatriculation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 240, 30));

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
        getContentPane().add(btnModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 160, 40));

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
        getContentPane().add(btnSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 160, 40));

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
        getContentPane().add(btnEnregistreur, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 160, 40));

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
        getContentPane().add(btnFermer, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 180, 40));

        btnAjouter.setBackground(new java.awt.Color(0, 255, 153));
        btnAjouter.setText("Ajouter");
        btnAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjouterMouseClicked(evt);
            }
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
        getContentPane().add(btnAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, 40));

        Tableparking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tableparking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TableparkingMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tableparking);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 920, 130));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Chercher un taxi :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, -1));

        txtchercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchercherActionPerformed(evt);
            }
        });
        getContentPane().add(txtchercher, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 570, 40));

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
        getContentPane().add(btnValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 250, 40));

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
        getContentPane().add(btnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
          this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

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

    private void btnFermerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseEntered
        btnFermer.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnFermerMouseEntered

    private void btnFermerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseExited
       btnFermer.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnFermerMouseExited

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

    private void btnModifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseEntered
        btnModifier.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnModifierMouseEntered

    private void btnModifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseExited
        btnModifier.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnModifierMouseExited

    private void btnAjouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseEntered
       btnAjouter.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnAjouterMouseEntered

    private void btnAjouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseExited
      btnAjouter.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnAjouterMouseExited

    private void btnFermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFermerMouseClicked
        Parking.super.dispose();
         Project project =new Project ();
         project.setVisible(true);
         project.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnFermerMouseClicked

    private void btnAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseClicked
       Ajouter();
    }//GEN-LAST:event_btnAjouterMouseClicked

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
       PreparedStatement ps;
           ResultSet rs;
           if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
             String places =txtplaces.getText();
             String matricule =txtmatriculation.getText();
            String com = commatricule.getSelectedItem().toString();
            String mat=txtmatriculation1.getText();
            String marque=txtmarque.getText();
            String model=txtmodel.getText();
            String numerotaxi=txttaxi.getText();
             String query ="Update gestion_taxi.Parking set  numero_places=?, numero1=? , lettres=? , numero2=? , marque=? , model=?   WHERE numerotaxi=? ";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
                ps.setString(1,places );
                ps.setString(2,matricule );
                 ps.setString(3, com);
                ps.setString(4,mat );
                  ps.setString(5,marque );
                  ps.setString(6,model);
                  ps.setString(7,numerotaxi);
                   
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre Taxi modifier","modifier",JOptionPane.OK_OPTION);
               Table();
                 viderchamps();
                 }else{
                   JOptionPane.showMessageDialog(null,"votre numero taxi n'a pas modifier","Erreur",JOptionPane.ERROR_MESSAGE);
                   viderchamps();
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        viderchamps();
        }
          viderchamps();
             }    
    }//GEN-LAST:event_btnModifierMouseClicked

    private void TableparkingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableparkingMouseReleased
         int i=Tableparking.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) Tableparking.getModel();
       txtplaces.setText(model.getValueAt(i,0).toString());
        txtmatriculation.setText(model.getValueAt(i,1).toString());
         commatricule.setSelectedItem(model.getValueAt(i,2).toString());
          txtmatriculation1.setText(model.getValueAt(i,3).toString());
           txtmarque.setText(model.getValueAt(i,4).toString());
            txtmodel.setText(model.getValueAt(i,5).toString());
             txttaxi.setText(model.getValueAt(i,6).toString());
    }//GEN-LAST:event_TableparkingMouseReleased

    private void btnSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupprimerMouseClicked
        PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
            String places=txtplaces.getText();
         
             String query ="delete from gestion_taxi.Parking   WHERE  numero_places = ?";
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               
                  ps.setString(1, places);
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

    private void txtchercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchercherActionPerformed

    private void btnValiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseEntered
        btnValider.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnValiderMouseEntered

    private void btnValiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseExited
       btnValider.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnValiderMouseExited

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

    private void btnValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseClicked
        if(checke())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Parking",JOptionPane.ERROR_MESSAGE);
              
        else{ 
        
        String[] Parking={"numero_places","numero1","lettres","numero2","marque","model","numerotaxi"};
          
          String[] afficher =new String[7];
          DefaultTableModel model = new  DefaultTableModel(null,Parking);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="select* from gestion_taxi.Parking WHERE  numerotaxi ='"+txtchercher.getText()+"'" ;
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("numero_places");
              afficher[1] =rs.getString("numero1");
              afficher[2] =rs.getString("lettres"); 
              afficher[3] =rs.getString("numero2");
              afficher[4] =rs.getString("marque");
              afficher[5] =rs.getString("model");
              afficher[6] =rs.getString("numerotaxi");             
              model.addRow(afficher);
            }
            Tableparking.setModel(model);
            
              
          } catch (Exception e) {
          }
        }
    }//GEN-LAST:event_btnValiderMouseClicked

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
              PdfWriter.getInstance(doc, new FileOutputStream (path+"Parking.pdf"));
              
              doc.open();
              
              PdfPTable tbl=new PdfPTable(7);
              
               tbl.addCell("numero_places");
              tbl.addCell("numero1");
              tbl.addCell("lettres");
              tbl.addCell("numero2");
              tbl.addCell("marque");
              tbl.addCell("model");
              tbl.addCell("numerotaxi");
              
              
              for (int i =0; i<Tableparking.getRowCount();i++){
                  String numero_places=Tableparking.getValueAt(i,0).toString();
                  String numero1=Tableparking.getValueAt(i,1).toString();
                  String lettres=Tableparking.getValueAt(i,2).toString();
                  String numero2=Tableparking.getValueAt(i,3).toString();
                  String marque=Tableparking.getValueAt(i,4).toString();
                  String model=Tableparking.getValueAt(i,5).toString();
                  String numerotaxi =Tableparking.getValueAt(i,6).toString();
                 
                  
                  tbl.addCell(numero_places);
                  tbl.addCell(numero1);
                  tbl.addCell(lettres);
                  tbl.addCell(numero2);
                  tbl.addCell(marque);
                  tbl.addCell(model);
                  tbl.addCell(numerotaxi);
                  
              }
              doc.add(tbl);
              
              
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          } catch (DocumentException ex) {
              Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          doc.close();
    }//GEN-LAST:event_btnEnregistreurMouseClicked

    private void txtplacesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacesKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtplaces.getText().equals("") )
          txtmatriculation.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtplacesKeyTyped

    private void txtmatriculationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculationKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtmatriculation.getText().equals("") )
          txtmatriculation1.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtmatriculationKeyTyped

    private void txtmatriculation1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatriculation1KeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtmatriculation1.getText().equals("") )
          txtmarque.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtmatriculation1KeyTyped

    private void txtmarqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarqueKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtmarque.getText().equals("") )
          txtmodel.requestFocus();
        if(Character.isDigit(touche))
           evt.consume();
    }//GEN-LAST:event_txtmarqueKeyTyped

    private void txtmodelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodelKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txtmodel.getText().equals("") )
          txttaxi.requestFocus();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txtmodelKeyTyped

    private void txttaxiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttaxiKeyTyped
        char touche=evt.getKeyChar();
        if(touche==KeyEvent.VK_ENTER && !txttaxi.getText().equals("") )
          Ajouter();
        if(Character.isLetter(touche))
           evt.consume();
    }//GEN-LAST:event_txttaxiKeyTyped

    
    
    
    
     public boolean checke(){
         return txtchercher.getText().equals("");
     }
     
     private boolean check(){
         return(txtplaces.getText().equals("")|| txtmatriculation.getText().equals("")||txtmatriculation1.getText().equals("")
          ||txtmodel.getText().equals("")||txttaxi.getText().equals(""))||txtmarque.getText().equals("") ; 
      }
       public void viderchamps() {
        txtplaces.setText("");
        txtmatriculation.setText("");
        txtmatriculation1.setText("");
         txtmarque.setText("");
          txtmodel.setText("");
           txttaxi.setText("");
           
           txtplaces.requestFocus();
       }
       
      public void Table(){
          
          String[] Parking={"numero_places","numero1","lettres","numero2","marque","model","numerotaxi"};
          
          String[] afficher =new String[7];
          DefaultTableModel model = new  DefaultTableModel(null,Parking);
            PreparedStatement ps;
           ResultSet rs;
       
             String query ="select* from gestion_taxi.Parking ";
           try {
               ps=ConnectionBD.getConnection().prepareStatement(query);
              rs=ps.executeQuery();       
            while(rs.next()){
              afficher[0] =rs.getString("numero_places");
              afficher[1] =rs.getString("numero1");
              afficher[2] =rs.getString("lettres"); 
              afficher[3] =rs.getString("numero2");
              afficher[4] =rs.getString("marque");
              afficher[5] =rs.getString("model");
              afficher[6] =rs.getString("numerotaxi");             
              model.addRow(afficher);
            }
            Tableparking.setModel(model);
            
              
          } catch (Exception e) {
          }
      }

       public void  Ajouter(){
             PreparedStatement ps;
           ResultSet rs;
             if(check())
           JOptionPane.showMessageDialog(null,"Enter les information svp","Taxi",JOptionPane.ERROR_MESSAGE);
 
        else{
             String places =txtplaces.getText();
             String matricule =txtmatriculation.getText();
            String com = commatricule.getSelectedItem().toString();
            String mat=txtmatriculation1.getText();
            String marque=txtmarque.getText();
            String model=txtmodel.getText();
            String numerotaxi=txttaxi.getText();
            
             String query ="INSERT INTO gestion_taxi.Parking (numero_places,numero1,lettres,numero2,marque,model,numerotaxi) Values (?,?,?,?,?,?,?) ";
             
             try { ps=ConnectionBD.getConnection().prepareStatement(query);
               ps.setString(1,places);
                ps.setString(2,matricule );
                ps.setString(3,com );
                 ps.setString(4,mat );
                  ps.setString(5,marque );
                  ps.setString(6,model );
                  ps.setString(7,numerotaxi);
                
                  
                  viderchamps();
                  if(ps.executeUpdate()!=0){
               JOptionPane.showMessageDialog(null,"votre Taxi est ajouter une base donne","Ajouter",JOptionPane.ERROR_MESSAGE);
               Table();
               System.out.println("dazr");
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
      
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Parking p= new Parking();
             p.setVisible(true);
             p.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelParking;
    private javax.swing.JTable Tableparking;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregistreur;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox<String> commatricule;
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
    private javax.swing.JTextField txtchercher;
    private javax.swing.JTextField txtmarque;
    private javax.swing.JTextField txtmatriculation;
    private javax.swing.JTextField txtmatriculation1;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtplaces;
    private javax.swing.JTextField txttaxi;
    // End of variables declaration//GEN-END:variables
}
