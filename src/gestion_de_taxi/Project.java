
package gestion_de_taxi;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class Project extends javax.swing.JFrame {

    
    public Project() {
        initComponents();
         Border borderpanel =BorderFactory.createMatteBorder(3, 3, 3, 3, Color.yellow);
        PanelGestion.setBorder(borderpanel);
        Border borderlabel =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
         lblclose.setBorder(borderlabel);
         lblmin.setBorder(borderlabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGestion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblclose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        btnclient = new javax.swing.JButton();
        btntaxi = new javax.swing.JButton();
        btnchauffeurs = new javax.swing.JButton();
        btnparking = new javax.swing.JButton();
        btnquitter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(618, 537));
        setMinimumSize(new java.awt.Dimension(618, 537));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelGestion.setBackground(new java.awt.Color(153, 153, 153));
        PanelGestion.setMaximumSize(new java.awt.Dimension(620, 100));
        PanelGestion.setMinimumSize(new java.awt.Dimension(620, 100));
        PanelGestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DE TAXI");
        jLabel1.setOpaque(true);
        PanelGestion.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 230, -1));

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
        PanelGestion.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 20));

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
        PanelGestion.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, 20));

        getContentPane().add(PanelGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 80));

        btnclient.setBackground(new java.awt.Color(0, 255, 153));
        btnclient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnclient.setText("GESTION DE CLIENT");
        btnclient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnclientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnclientMouseExited(evt);
            }
        });
        btnclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientActionPerformed(evt);
            }
        });
        getContentPane().add(btnclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 40));

        btntaxi.setBackground(new java.awt.Color(0, 255, 153));
        btntaxi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btntaxi.setText("GESTION DE TAXI");
        btntaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntaxiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntaxiMouseExited(evt);
            }
        });
        btntaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaxiActionPerformed(evt);
            }
        });
        getContentPane().add(btntaxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 40));

        btnchauffeurs.setBackground(new java.awt.Color(0, 255, 153));
        btnchauffeurs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnchauffeurs.setText("GESTION DE CHAUFFEURS");
        btnchauffeurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnchauffeursMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnchauffeursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnchauffeursMouseExited(evt);
            }
        });
        getContentPane().add(btnchauffeurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 40));

        btnparking.setBackground(new java.awt.Color(0, 255, 153));
        btnparking.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnparking.setText("GESTION DE PARKING");
        btnparking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnparkingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnparkingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnparkingMouseExited(evt);
            }
        });
        getContentPane().add(btnparking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 40));

        btnquitter.setBackground(new java.awt.Color(0, 255, 153));
        btnquitter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnquitter.setText("Fermer");
        btnquitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnquitterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnquitterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnquitterMouseExited(evt);
            }
        });
        btnquitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitterActionPerformed(evt);
            }
        });
        getContentPane().add(btnquitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 230, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\21267\\Downloads\\6-removebg-preview.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 500, 240));

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

    private void btnquitterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquitterMouseEntered
         btnquitter.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnquitterMouseEntered

    private void btnquitterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquitterMouseExited
         btnquitter.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnquitterMouseExited

    private void btnclientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclientMouseEntered
         btnclient.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnclientMouseEntered

    private void btnclientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclientMouseExited
        btnclient.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnclientMouseExited

    private void btntaxiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntaxiMouseEntered
        btntaxi.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btntaxiMouseEntered

    private void btntaxiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntaxiMouseExited
        btntaxi.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btntaxiMouseExited

    private void btnchauffeursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchauffeursMouseEntered
        btnchauffeurs.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnchauffeursMouseEntered

    private void btnchauffeursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchauffeursMouseExited
        btnchauffeurs.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnchauffeursMouseExited

    private void btnparkingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnparkingMouseEntered
        btnparking.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_btnparkingMouseEntered

    private void btnparkingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnparkingMouseExited
        btnparking.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_btnparkingMouseExited

    private void btnquitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnquitterMouseClicked

    }//GEN-LAST:event_btnquitterMouseClicked

    private void btnclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientActionPerformed
          Project.super.dispose();
         Client c=new Client();
         c.setVisible(true);
         c.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnclientActionPerformed

    private void btnquitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitterActionPerformed
         Project.super.dispose();
         Login  login= new Login();
         login.setVisible(true);
         login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnquitterActionPerformed

    private void btntaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaxiActionPerformed
         Project.super.dispose();
         Taxi taxi=new Taxi();
         taxi.setVisible(true);
         taxi.setLocationRelativeTo(null);
    }//GEN-LAST:event_btntaxiActionPerformed

    private void btnchauffeursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchauffeursMouseClicked
        Project.super.dispose();
         chauffeurs c=new chauffeurs();
         c.setVisible(true);
         c.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnchauffeursMouseClicked

    private void btnparkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnparkingMouseClicked
        Project.super.dispose();
         Parking p=new Parking();
         p.setVisible(true);
         p.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnparkingMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Project project  =  new Project();
            project.setVisible(true);
             project.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGestion;
    private javax.swing.JButton btnchauffeurs;
    private javax.swing.JButton btnclient;
    private javax.swing.JButton btnparking;
    private javax.swing.JButton btnquitter;
    private javax.swing.JButton btntaxi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblmin;
    // End of variables declaration//GEN-END:variables
}
