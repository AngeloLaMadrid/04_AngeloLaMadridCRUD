package Vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    /*VARIABLES PARA MOVER EL JFRAME*/
    int MouseX,MouseY;
    
    /*INGRESAR USUARIO Y CONTRASEÑA Y CONECTAR CON LA BASE DE DATOS*/
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt txt1 = new TextPrompt("Ingresa el usuario", TxtUser);
        TextPrompt txt2 = new TextPrompt("Ingresa la contraseña", TxtPass);
        Button_Ocultar.setVisible(false);
        Conectar();
    }
    
/*
    CREAR NUEVO USUARIO/LOGICA
    INSERT INTO `loginusuario` (`NOMUSU`, `PASSUSU`) VALUES ('pio123', 'pio123');
 */
    
    public Connection Conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbteam04prototipo","root","admin");
        } catch (SQLException e) {
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nVerificar el codigo.");
        }
        return con;
    }
    
    public void loginUsuario() {
        Connection con1 = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String NOMUSU = TxtUser.getText();
        String PASSUSU = TxtPass.getText();
        if (NOMUSU.equals("") || PASSUSU.equals("")) {
            JOptionPane.showMessageDialog(this, "Uno o mas campos estan vacios.");
        } else {
            try {
                con1 = Conectar();
                pst = con1.prepareStatement("select NOMUSU, PASSUSU from login where NOMUSU='" + NOMUSU
                        + "' and PASSUSU ='" + PASSUSU + "'");
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.dispose();
                    new Home().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Datos incorrectos.");
                }
            } catch (SQLException e) {
                System.err.print(e.toString());
                JOptionPane.showMessageDialog(this, "Ocurrio un error inesperado.\nVerificar el codigo.");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BarraTitulo = new javax.swing.JPanel();
        B_Close = new javax.swing.JPanel();
        Button_Close = new javax.swing.JLabel();
        B_Min = new javax.swing.JPanel();
        Button_Minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IconUser = new javax.swing.JLabel();
        IconPassword = new javax.swing.JLabel();
        Button_Ver = new javax.swing.JLabel();
        Button_Ocultar = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        TITULO = new javax.swing.JLabel();
        Panel_Iniciar = new javax.swing.JPanel();
        Button_Login = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonSalir1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

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

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraTitulo.setBackground(new java.awt.Color(102, 102, 102));
        BarraTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B_Close.setBackground(new java.awt.Color(102, 102, 102));
        B_Close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        B_Close.add(Button_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        BarraTitulo.add(B_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        B_Min.setBackground(new java.awt.Color(102, 102, 102));
        B_Min.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        B_Min.add(Button_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        BarraTitulo.add(B_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Login");
        BarraTitulo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 20));

        PanelPrincipal.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        IconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_32.png"))); // NOI18N
        PanelPrincipal.add(IconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 40));

        IconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lock_32.png"))); // NOI18N
        PanelPrincipal.add(IconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 40));

        Button_Ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eye_20.png"))); // NOI18N
        Button_Ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_VerMouseClicked(evt);
            }
        });
        PanelPrincipal.add(Button_Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        Button_Ocultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Hide_20.png"))); // NOI18N
        Button_Ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_OcultarMouseClicked(evt);
            }
        });
        PanelPrincipal.add(Button_Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        TxtUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtUser.setForeground(new java.awt.Color(102, 102, 102));
        TxtUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtUser.setToolTipText("");
        TxtUser.setBorder(null);
        TxtUser.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        TxtUser.setName(""); // NOI18N
        TxtUser.setSelectionColor(new java.awt.Color(204, 204, 204));
        TxtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUserFocusLost(evt);
            }
        });
        TxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserActionPerformed(evt);
            }
        });
        TxtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtUserKeyTyped(evt);
            }
        });
        PanelPrincipal.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 330, -1));

        TxtPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtPass.setForeground(new java.awt.Color(102, 102, 102));
        TxtPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TxtPass.setBorder(null);
        TxtPass.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        TxtPass.setMargin(new java.awt.Insets(30, 6, 2, 6));
        TxtPass.setSelectionColor(new java.awt.Color(204, 204, 204));
        TxtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPassFocusLost(evt);
            }
        });
        TxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPassActionPerformed(evt);
            }
        });
        TxtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPassKeyTyped(evt);
            }
        });
        PanelPrincipal.add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 335, 330, -1));

        TITULO.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO.setText("Bienvenido");
        PanelPrincipal.add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 570, -1));

        Panel_Iniciar.setBackground(new java.awt.Color(51, 51, 51));
        Panel_Iniciar.setToolTipText("");
        Panel_Iniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Login.setBackground(new java.awt.Color(51, 51, 51));
        Button_Login.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Button_Login.setForeground(new java.awt.Color(204, 204, 204));
        Button_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Button_Login.setText("Ingresar");
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
        Panel_Iniciar.add(Button_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        PanelPrincipal.add(Panel_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 270, 40));
        PanelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 460, 0));

        jButtonSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/UsuarioIconGrande - copia (1).png"))); // NOI18N
        jButtonSalir1.setContentAreaFilled(false);
        jButtonSalir1.setMaximumSize(new java.awt.Dimension(100, 100));
        jButtonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir1ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(jButtonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, 160));
        PanelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 317, 330, -1));
        PanelPrincipal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 330, -1));

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        MouseX = evt.getX();
        MouseY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X-MouseX, Y-MouseY);
    }//GEN-LAST:event_formMouseDragged

    private void jButtonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalir1ActionPerformed

    private void TxtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPassKeyTyped
        if(TxtPass.getText().length() == 32){
            evt.consume();
        }
    }//GEN-LAST:event_TxtPassKeyTyped

    private void TxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPassActionPerformed

    private void TxtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPassFocusLost

    }//GEN-LAST:event_TxtPassFocusLost

    private void TxtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPassFocusGained

    }//GEN-LAST:event_TxtPassFocusGained

    private void TxtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUserKeyTyped
        if(TxtUser.getText().length() == 30){
            evt.consume();
        }
    }//GEN-LAST:event_TxtUserKeyTyped

    private void TxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserActionPerformed

    private void TxtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUserFocusLost

    }//GEN-LAST:event_TxtUserFocusLost

    private void TxtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUserFocusGained

    }//GEN-LAST:event_TxtUserFocusGained

    private void Button_OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_OcultarMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            TxtPass.setEchoChar('•');
            Button_Ocultar.setVisible(false);
            Button_Ver.setVisible(true);
        }
    }//GEN-LAST:event_Button_OcultarMouseClicked

    private void Button_VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_VerMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            TxtPass.setEchoChar((char)0);
            Button_Ocultar.setVisible(true);
            Button_Ver.setVisible(false);
        }
    }//GEN-LAST:event_Button_VerMouseClicked

    private void Button_MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseExited
        B_Min.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_Button_MinimizeMouseExited

    private void Button_MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseEntered
        B_Min.setBackground(Color.lightGray);
    }//GEN-LAST:event_Button_MinimizeMouseEntered

    private void Button_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_MinimizeMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            this.setState(Login.ICONIFIED);
        }
    }//GEN-LAST:event_Button_MinimizeMouseClicked

    private void Button_CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseExited
        B_Close.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_Button_CloseMouseExited

    private void Button_CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseEntered
        B_Close.setBackground(Color.red);
    }//GEN-LAST:event_Button_CloseMouseEntered

    private void Button_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_CloseMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            System.exit(0);
        }
    }//GEN-LAST:event_Button_CloseMouseClicked

    private void Button_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseExited
        Panel_Iniciar.setBackground(new Color(51,51,51));
        Button_Login.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_Button_LoginMouseExited

    private void Button_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseEntered
        Panel_Iniciar.setBackground(new Color(232,107,38));
        Button_Login.setForeground(Color.black);
    }//GEN-LAST:event_Button_LoginMouseEntered

    private void Button_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_LoginMouseClicked
        if(MouseEvent.BUTTON1 == evt.getButton()){
            loginUsuario();
        }
    }//GEN-LAST:event_Button_LoginMouseClicked

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel B_Close;
    private javax.swing.JPanel B_Min;
    private javax.swing.JPanel BarraTitulo;
    private javax.swing.JLabel Button_Close;
    private javax.swing.JLabel Button_Login;
    private javax.swing.JLabel Button_Minimize;
    private javax.swing.JLabel Button_Ocultar;
    private javax.swing.JLabel Button_Ver;
    private javax.swing.JLabel IconPassword;
    private javax.swing.JLabel IconUser;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel Panel_Iniciar;
    private javax.swing.JLabel TITULO;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
