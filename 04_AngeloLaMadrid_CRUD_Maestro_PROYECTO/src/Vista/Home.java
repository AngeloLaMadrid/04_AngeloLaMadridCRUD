package Vista;

import java.awt.geom.RectangularShape;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
/*Permite abrir un link*/
import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

    int MouseX, MouseY;

    public Home() {

        initComponents();
        setSize(990, 760);
        setLocationRelativeTo(null);

        /*Mostrar al principio SobreNosotros*/
        SobreNosotros nosotros = new SobreNosotros();
        nosotros.setSize(1130, 641);
        nosotros.setLocation(0, 0);
        mostrar(nosotros);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jbtnLogoHome = new javax.swing.JButton();
        jLabelTxtCoffeeJuls = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Panel_Iniciar = new javax.swing.JPanel();
        Button_Login = new javax.swing.JLabel();
        Panel_Iniciar1 = new javax.swing.JPanel();
        Button_Login1 = new javax.swing.JLabel();
        Panel_Iniciar2 = new javax.swing.JPanel();
        Button_Login2 = new javax.swing.JLabel();
        Panel_Iniciar3 = new javax.swing.JPanel();
        Button_Login3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BarraTitulo = new javax.swing.JPanel();
        BtnClose = new javax.swing.JPanel();
        Button_Close = new javax.swing.JLabel();
        BtnMin = new javax.swing.JPanel();
        Button_Minimize = new javax.swing.JLabel();
        jLblBarraTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(232, 107, 38));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnLogoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UsuarioIconGrande - copia (1).png"))); // NOI18N
        jbtnLogoHome.setContentAreaFilled(false);
        jbtnLogoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLogoHome.setMaximumSize(new java.awt.Dimension(100, 100));
        jbtnLogoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoHomeActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnLogoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 44, -1, 160));

        jLabelTxtCoffeeJuls.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabelTxtCoffeeJuls.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTxtCoffeeJuls.setText("Coffee Jul's");
        jPanel2.add(jLabelTxtCoffeeJuls, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 230, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 270, 135, 6));

        Panel_Iniciar.setBackground(new java.awt.Color(232, 107, 38));
        Panel_Iniciar.setToolTipText("");
        Panel_Iniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Button_Login.setForeground(new java.awt.Color(255, 255, 255));
        Button_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login.setText("PRODUCTO");
        Button_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_LoginMouseExited(evt);
            }
        });
        Panel_Iniciar.add(Button_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, 30));

        jPanel2.add(Panel_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 200, 80));

        Panel_Iniciar1.setBackground(new java.awt.Color(232, 107, 38));
        Panel_Iniciar1.setToolTipText("");
        Panel_Iniciar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login1.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Button_Login1.setForeground(new java.awt.Color(255, 255, 255));
        Button_Login1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login1.setText("INICIO");
        Button_Login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Login1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_Login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_Login1MouseExited(evt);
            }
        });
        Panel_Iniciar1.add(Button_Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 100, 30));

        jPanel2.add(Panel_Iniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 80));

        Panel_Iniciar2.setBackground(new java.awt.Color(232, 107, 38));
        Panel_Iniciar2.setToolTipText("");
        Panel_Iniciar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login2.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Button_Login2.setForeground(new java.awt.Color(255, 255, 255));
        Button_Login2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login2.setText("TRABAJADOR");
        Button_Login2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Login2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Login2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_Login2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_Login2MouseExited(evt);
            }
        });
        Panel_Iniciar2.add(Button_Login2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        jPanel2.add(Panel_Iniciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 80));

        Panel_Iniciar3.setBackground(new java.awt.Color(232, 107, 38));
        Panel_Iniciar3.setToolTipText("");
        Panel_Iniciar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login3.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Button_Login3.setForeground(new java.awt.Color(255, 255, 255));
        Button_Login3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login3.setText("CLIENTE");
        Button_Login3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Login3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Button_Login3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Button_Login3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_Login3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_Login3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_Login3MouseExited(evt);
            }
        });
        Panel_Iniciar3.add(Button_Login3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 80, 30));

        jPanel2.add(Panel_Iniciar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 730));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 790, 730));

        BarraTitulo.setBackground(new java.awt.Color(102, 102, 102));

        BtnClose.setBackground(new java.awt.Color(102, 102, 102));
        BtnClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Close.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Close.setForeground(new java.awt.Color(255, 255, 255));
        Button_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Close.setText("x");
        Button_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_CloseMouseExited(evt);
            }
        });
        BtnClose.add(Button_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        BtnMin.setBackground(new java.awt.Color(102, 102, 102));
        BtnMin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Minimize.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Minimize.setForeground(new java.awt.Color(255, 255, 255));
        Button_Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Minimize.setText("—");
        Button_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_MinimizeMouseExited(evt);
            }
        });
        BtnMin.add(Button_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLblBarraTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLblBarraTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLblBarraTitulo.setText("Menú");
        jLblBarraTitulo.setAlignmentX(0.5F);
        jLblBarraTitulo.setAlignmentY(0.0F);

        javax.swing.GroupLayout BarraTituloLayout = new javax.swing.GroupLayout(BarraTitulo);
        BarraTitulo.setLayout(BarraTituloLayout);
        BarraTituloLayout.setHorizontalGroup(
            BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraTituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLblBarraTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 878, Short.MAX_VALUE)
                .addComponent(BtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        BarraTituloLayout.setVerticalGroup(
            BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraTituloLayout.createSequentialGroup()
                .addGroup(BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BarraTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblBarraTitulo)))
                .addContainerGap())
        );

        getContentPane().add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseClicked
        if (MouseEvent.BUTTON1 == evt.getButton()) {
            System.out.println("CRUD MAESTRO CERRADO");

            System.exit(0);
        }
    }//GEN-LAST:event_Button_CloseMouseClicked

    private void Button_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseEntered
        BtnClose.setBackground(Color.red);
    }//GEN-LAST:event_Button_CloseMouseEntered

    private void Button_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseExited
        BtnClose.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_Button_CloseMouseExited

    private void Button_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseClicked
        if (MouseEvent.BUTTON1 == evt.getButton()) {
            this.setState(Login.ICONIFIED);
        }
    }//GEN-LAST:event_Button_MinimizeMouseClicked

    private void Button_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseEntered
        BtnMin.setBackground(Color.lightGray);
    }//GEN-LAST:event_Button_MinimizeMouseEntered

    private void Button_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseExited
        BtnMin.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_Button_MinimizeMouseExited

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - MouseX, Y - MouseY);
    }//GEN-LAST:event_formMouseDragged

    private void jbtnLogoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoHomeActionPerformed
        RegistroTrabajadores1 nosotros = new RegistroTrabajadores1();
        nosotros.setSize(1130, 641);
        nosotros.setLocation(0, 0);
        mostrar(nosotros);
    }//GEN-LAST:event_jbtnLogoHomeActionPerformed

    private void Button_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseClicked
        getToolkit().beep();
        
    }//GEN-LAST:event_Button_LoginMouseClicked

    private void Button_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseEntered
        Panel_Iniciar.setBackground(new Color(255, 204, 0));
        Button_Login.setForeground(Color.black);
    }//GEN-LAST:event_Button_LoginMouseEntered

    private void Button_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseExited
        Panel_Iniciar.setBackground(new Color(232, 107, 38));
        Button_Login.setForeground(Color.white);
    }//GEN-LAST:event_Button_LoginMouseExited

    private void Button_Login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseClicked
        SobreNosotros nosotros = new SobreNosotros();
        nosotros.setSize(1130, 641);
        nosotros.setLocation(0, 0);
        mostrar(nosotros);
    }//GEN-LAST:event_Button_Login1MouseClicked

    private void Button_Login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseEntered
        Panel_Iniciar1.setBackground(new Color(255, 204, 0));
        Button_Login1.setForeground(Color.black);
    }//GEN-LAST:event_Button_Login1MouseEntered

    private void Button_Login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login1MouseExited
        Panel_Iniciar1.setBackground(new Color(232, 107, 38));
        Button_Login1.setForeground(Color.white);
    }//GEN-LAST:event_Button_Login1MouseExited

    private void Button_Login2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login2MouseClicked
        RegistroTrabajadores productos = new RegistroTrabajadores();
        productos.setSize(600, 552);
        productos.setLocation(0, 0);
        mostrar(productos);

        //
        //                try {
        //            RegistroTrabajador nF = new RegistroTrabajador();
        //            nF.setVisible(true);
        //
        //
        //        } catch (Exception ex) {
        //            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        //        }
        //
        //    RegistroTrabajadores trabajadores = new RegistroTrabajadores();
        //    trabajadores.setSize(600, 552);
        //    trabajadores.setLocation(0, 0);
        //    mostrar (trabajadores);
    }//GEN-LAST:event_Button_Login2MouseClicked

    private void Button_Login2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login2MouseEntered
        Panel_Iniciar2.setBackground(new Color(255, 204, 0));
        Button_Login2.setForeground(Color.black);
    }//GEN-LAST:event_Button_Login2MouseEntered

    private void Button_Login2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login2MouseExited
        Panel_Iniciar2.setBackground(new Color(232, 107, 38));
        Button_Login2.setForeground(Color.white);
    }//GEN-LAST:event_Button_Login2MouseExited

    private void Button_Login3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login3MouseClicked
        getToolkit().beep();
        
    }//GEN-LAST:event_Button_Login3MouseClicked

    private void Button_Login3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login3MouseEntered
        Panel_Iniciar3.setBackground(new Color(255, 204, 0));
        Button_Login3.setForeground(Color.black);
    }//GEN-LAST:event_Button_Login3MouseEntered

    private void Button_Login3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Login3MouseExited
        Panel_Iniciar3.setBackground(new Color(232, 107, 38));
        Button_Login3.setForeground(Color.white);
    }//GEN-LAST:event_Button_Login3MouseExited

    private void Button_Login3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Button_Login3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Login3AncestorAdded

//CAMBIAR LOS COLORES AL DAR CLICK !!!
    void setColor(JPanel panel) {
        panel.setBackground(new Color(163, 75, 27));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(168, 65, 8));
    }

    //Permite colocar jPanels en el BorderLayout
    public void mostrar(Object objeto) {
        jPanel1.removeAll();
        jPanel1.add((Component) objeto, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //Permite ejecutar y ver el jFrame
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraTitulo;
    private javax.swing.JPanel BtnClose;
    private javax.swing.JPanel BtnMin;
    private javax.swing.JLabel Button_Close;
    private javax.swing.JLabel Button_Login;
    private javax.swing.JLabel Button_Login1;
    private javax.swing.JLabel Button_Login2;
    private javax.swing.JLabel Button_Login3;
    private javax.swing.JLabel Button_Minimize;
    private javax.swing.JPanel Panel_Iniciar;
    private javax.swing.JPanel Panel_Iniciar1;
    private javax.swing.JPanel Panel_Iniciar2;
    private javax.swing.JPanel Panel_Iniciar3;
    private javax.swing.JLabel jLabelTxtCoffeeJuls;
    private javax.swing.JLabel jLblBarraTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnLogoHome;
    // End of variables declaration//GEN-END:variables

}
