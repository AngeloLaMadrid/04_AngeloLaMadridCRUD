package Vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SobreNosotros extends javax.swing.JPanel {

   
    public SobreNosotros() {
        initComponents();
//        jLabel5.setText("<html>Ejemplo de<p>salto de línea");
//        jTextField1.setLineWrap(true);
//        jTextField1.setWrapStyleWord(true);
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonLinkLandingPage = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 120, 58));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Coffe Jul’s reaviva la calidez y la magia en un espacio agradable y placentero.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Sobre Nosotros");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Inspirado en conservar la calidad y tradición en postres peruanos y");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("en otras delicias con influencia internacional. ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, -1, 40));

        jButtonLinkLandingPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo_1.png"))); // NOI18N
        jButtonLinkLandingPage.setContentAreaFilled(false);
        jButtonLinkLandingPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLinkLandingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLinkLandingPageActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLinkLandingPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 280, 320));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLinkLandingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLinkLandingPageActionPerformed

        // permite ir al link

        try {
            Desktop.getDesktop().browse(new URI("https://www.figma.com/file/Ok6j3TTiwZyFIcaGWpnQVk/G4_LandingPage-_CoffeeJul's?node-id=0%3A1"));
        } catch (IOException | URISyntaxException e1) {
        }

       
    }//GEN-LAST:event_jButtonLinkLandingPageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoSexo;
    private javax.swing.JButton jButtonLinkLandingPage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
