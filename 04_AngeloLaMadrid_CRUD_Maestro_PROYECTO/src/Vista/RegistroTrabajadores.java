package Vista;

import controlador.PacienteC;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*De ayuda

getRootPane()


*/

public class RegistroTrabajadores extends javax.swing.JPanel {

   public static String sexo = "M";
    public int tipo = 1; //1: todos, 2:nombre, 3:apellido, 4:dni
    public String dato = ""; // contenido del filtro
    PacienteC controlador;
    DefaultTableModel modeloTabla;
    
    /*VARIABLES PARA MOVER EL JFRAME*/
    int MouseX,MouseY;
    
    public RegistroTrabajadores() {
        initComponents();
        
        TextPrompt txt1 = new TextPrompt("Ingresar el nombre", jtxtNombre);
        TextPrompt txt2 = new TextPrompt("Ingresar el apellido", jtxtApellido);
        TextPrompt txt3 = new TextPrompt("Ingresar la dirección",jtxtdir );
        TextPrompt txt6 = new TextPrompt("Ingresar el DNI", jtxtDni);
        TextPrompt txt5 = new TextPrompt("Ingresar el número de celular", jtxtCelular);
        
        
        
        controlador = new PacienteC();
        btnGrupoSex.add(jrdnMasculino);
        btnGrupoSex.add(jrdnFemenino);

        /*MODIFICADO*/
       try {
           cargarTabla();
       } catch (Exception ex) {
           Logger.getLogger(RegistroTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSex = new javax.swing.ButtonGroup();
        btnGrupoFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelSexo = new javax.swing.JLabel();
        jrdnMasculino = new javax.swing.JRadioButton();
        jrdnFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelDir = new javax.swing.JLabel();
        jbtnModificar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jlblCodigo = new javax.swing.JLabel();
        jLabelNac = new javax.swing.JLabel();
        jdcNac = new com.toedter.calendar.JDateChooser();
        jtxtdir = new javax.swing.JTextField();
        jtxtCelular = new javax.swing.JTextField();
        jLabelCel = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        jtxtDni = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblPaciente = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSexo.setText("Sexo");
        jLabelSexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSexoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSexoMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        jrdnMasculino.setBackground(new java.awt.Color(255, 204, 0));
        jrdnMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdnMasculino.setText("Masculino");
        jrdnMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrdnMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jrdnMasculinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jrdnMasculinoMouseExited(evt);
            }
        });
        jrdnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 245, -1, -1));

        jrdnFemenino.setBackground(new java.awt.Color(255, 204, 0));
        jrdnFemenino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdnFemenino.setText("Femenino");
        jrdnFemenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jrdnFemenino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jrdnFemeninoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jrdnFemeninoMouseExited(evt);
            }
        });
        jrdnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 245, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setText("Registro de trabajadores");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabelDir.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelDir.setText("Dirección");
        jLabelDir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDirMouseExited(evt);
            }
        });
        jPanel1.add(jLabelDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jbtnModificar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setContentAreaFilled(false);
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnModificar.setEnabled(false);
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnModificar.setIconTextGap(10);
        jbtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseExited(evt);
            }
        });
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 30));

        jbtnGuardar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setAlignmentX(0.5F);
        jbtnGuardar.setContentAreaFilled(false);
        jbtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnGuardar.setIconTextGap(10);
        jbtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnGuardarMouseExited(evt);
            }
        });
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 290, -1, 30));

        jbtnNuevo.setBackground(new java.awt.Color(232, 107, 38));
        jbtnNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/agregar.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setContentAreaFilled(false);
        jbtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnNuevo.setIconTextGap(10);
        jbtnNuevo.setInheritsPopupMenu(true);
        jbtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseExited(evt);
            }
        });
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, 30));

        jbtnEliminar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setEnabled(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnEliminar.setIconTextGap(10);
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseExited(evt);
            }
        });
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 30));

        jbtnCancelar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salir.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setContentAreaFilled(false);
        jbtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnCancelar.setEnabled(false);
        jbtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnCancelar.setIconTextGap(1);
        jbtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCancelarMouseExited(evt);
            }
        });
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Código:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jlblCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jlblCodigo.setMaximumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setMinimumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setRequestFocusEnabled(false);
        jPanel1.add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 20));

        jLabelNac.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelNac.setText("Fech. Nacimiento");
        jLabelNac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNacMouseExited(evt);
            }
        });
        jPanel1.add(jLabelNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 30));

        jdcNac.setPreferredSize(new java.awt.Dimension(64, 23));
        jdcNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdcNacKeyTyped(evt);
            }
        });
        jPanel1.add(jdcNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 214, -1));

        jtxtdir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtxtdir.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtdir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdirKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 214, -1));

        jtxtCelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtxtCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtCelular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCelularKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 214, -1));

        jLabelCel.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelCel.setText("Celular");
        jLabelCel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCelMouseExited(evt);
            }
        });
        jPanel1.add(jLabelCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelNombre.setText("Nombre");
        jLabelNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelNombreMouseExited(evt);
            }
        });
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelApellido.setText("Apellido");
        jLabelApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelApellidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelApellidoMouseExited(evt);
            }
        });
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jtxtApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtxtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtApellido.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 256, -1));

        jLabelDNI.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDNI.setText("DNI");
        jLabelDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDNIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDNIMouseExited(evt);
            }
        });
        jPanel1.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jtxtDni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtxtDni.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDni.setActionCommand("<Not Set>");
        jtxtDni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtDni.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDniActionPerformed(evt);
            }
        });
        jtxtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 256, -1));

        jtxtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtNombre.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 256, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 320));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Sexo", "Departamento", "Provincia", "Distrito", "Direccion"
            }
        ));
        jtblPaciente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jtblPaciente.setFocusable(false);
        jtblPaciente.setGridColor(new java.awt.Color(250, 244, 251));
        jtblPaciente.setOpaque(false);
        jtblPaciente.setRowHeight(29);
        jtblPaciente.setSelectionBackground(new java.awt.Color(255, 204, 0));
        jtblPaciente.setSelectionForeground(new java.awt.Color(232, 107, 38));
        jtblPaciente.setShowHorizontalLines(true);
        jtblPaciente.getTableHeader().setReorderingAllowed(false);
        jtblPaciente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtblPacienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblPacienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblPaciente);
        if (jtblPaciente.getColumnModel().getColumnCount() > 0) {
            jtblPaciente.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, 750, 320));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 790, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed

            try {
                PacienteC.limpiar();
                jbtnGuardar.setEnabled(true);
                jbtnCancelar.setEnabled(true);
                jbtnNuevo.setEnabled(false);
                jlblCodigo.setText("");
            } catch (Exception e) {
            } 
        
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jtblPacienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtblPacienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblPacienteAncestorAdded

    private void jtblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPacienteMouseClicked
                try {
            int fila = jtblPaciente.getSelectedRow();   // verificar si tengo datos en mi tabla
            if (fila >= 0) {
                jbtnModificar.setEnabled(true);
                jbtnEliminar.setEnabled(true);
                jbtnGuardar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
                jlblCodigo.setText(jtblPaciente.getValueAt(fila, 0).toString());
                jtxtNombre.setText(jtblPaciente.getValueAt(fila, 1).toString());
                jtxtApellido.setText(jtblPaciente.getValueAt(fila, 2).toString());
                if (jtblPaciente.getValueAt(fila, 3).toString().equals("M")) {
                    jrdnMasculino.setSelected(true);
                    jrdnFemenino.setSelected(false);
                } else {
                    jrdnMasculino.setSelected(false);
                    jrdnFemenino.setSelected(true);
                }
                jtxtDni.setText(jtblPaciente.getValueAt(fila, 4).toString());
                jdcNac.setDate(Date.valueOf(jtblPaciente.getValueAt(fila, 5).toString()));
                jtxtdir.setText(jtblPaciente.getValueAt(fila, 6).toString());
                jtxtCelular.setText(jtblPaciente.getValueAt(fila, 7).toString());
            }

        } catch (Exception e) {
            System.out.println("Error en PacienteView/jtblPacienteMouseClicked: " + e.getMessage());
        }
    }//GEN-LAST:event_jtblPacienteMouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
                try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar el registro?", "Eliminación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                controlador.eliminar();
                cargarTabla();
                jbtnEliminar.setEnabled(false);
                jbtnModificar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnEliminarActionPerformed: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        if (jtxtDni.getText().length() == 8 && jtxtCelular.getText().length() == 9 &&jtxtNombre.getText().length()>1 && jtxtApellido.getText().length()>5 ) {
        try {
            controlador.registrar();
            JOptionPane.showMessageDialog(getRootPane(), "Registro exitoso", "Registro de Paciente", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
            jbtnGuardar.setEnabled(false);
            jbtnNuevo.setEnabled(true);
        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnGuardarActionPerformed: " + e.getMessage());
        }}
        else{
            
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            getToolkit().beep(); 
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jrdnMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnMasculinoActionPerformed
        if (jrdnMasculino.isSelected() == true)
            sexo = "M";
    }//GEN-LAST:event_jrdnMasculinoActionPerformed

    private void jrdnFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnFemeninoActionPerformed
        if (jrdnFemenino.isSelected() == true)
            sexo = "F";
    }//GEN-LAST:event_jrdnFemeninoActionPerformed

    private void jdcNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdcNacKeyTyped

    }//GEN-LAST:event_jdcNacKeyTyped

    private void jtxtdirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdirKeyTyped
        if (jtxtdir.getText().length() >= 40) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jtxtdirKeyTyped

    private void jtxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoKeyTyped

        //        char c = evt.getKeyChar();
        //        if (!(Character.isAlphabetic(c) || (c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE)) {
            //            evt.consume();
            //            JOptionPane.showMessageDialog(rootPane, "Solo se permiten letras");
            //        }
        //        if(!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar()!= KeyEvent.VK_SPACE ){
            //            evt.consume();
            //        }
        char c = evt.getKeyChar();
        if (!((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(getRootPane(), "Solo letras");
            //            JOptionPane.showMessageDialog(rootPane, "No se permiten caracteres especiales");
        }

        int maximo = 40;
        if (jtxtApellido.getText().length() >= maximo) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(getRootPane(), "Solo se permiten " + maximo + " caracteres");
        }
    }//GEN-LAST:event_jtxtApellidoKeyTyped

    private void jtxtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDniActionPerformed

    private void jtxtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDniKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

        }
        if (jtxtDni.getText().length() >= 8 ){ // limit to 3 characters
            evt.consume();}

        //        if (jtxtDni.length()){}

        //    boolean max = jtxtDni.getText().length() >= 8;
        //    if ( max ){
            //        evt.consume();
            //        getToolkit().beep();
            //    }
        //        char car = evt.getKeyChar();
        //
        //        if (car < '0' || car > '9')
        //            evt.consume();
        //            getToolkit().beep();
    }//GEN-LAST:event_jtxtDniKeyTyped

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
                if (jtxtDni.getText().length() != 8){
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Verificar el campo DNI tenga 8 digitos");}
           if (jtxtCelular.getText().length() != 9){
            getToolkit().beep(); 
            JOptionPane.showMessageDialog(this, "Verificar el campo CELULAR tenga 9 digitos");}
        if (jtxtDni.getText().length() == 8 && jtxtCelular.getText().length() == 9){
        try {
            int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas modificar el registro?", "Modificación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                controlador.modificar();
                cargarTabla();
                JOptionPane.showMessageDialog(getRootPane(), "Actualización exitosa", "Modificación del Paciente", JOptionPane.INFORMATION_MESSAGE);
                jbtnModificar.setEnabled(false);
                jbtnEliminar.setEnabled(false);
                jbtnGuardar.setEnabled(false);
                jbtnNuevo.setEnabled(true);
            }

        } catch (Exception e) {
            System.out.println("Error en PacienteView/jbtnModificar: " + e.getMessage());
        }}
        else{
            
            
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        try {
            jbtnCancelar.setEnabled(false);
            jbtnNuevo.setEnabled(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped

        //        char c = evt.getKeyChar();
        //        if (!(Character.isAlphabetic(c) || (c == java.awt.event.KeyEvent.VK_BACK_SPACE) || c == java.awt.event.KeyEvent.VK_DELETE)) {
            //            evt.consume();
            //            JOptionPane.showMessageDialog(rootPane, "Solo se permiten letras");
            //        }
        //        if(!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar()!= KeyEvent.VK_SPACE ){
            //            evt.consume();
            //        }
        char c = evt.getKeyChar();
        if (!((c < '0') || (c > '9')) && (c != java.awt.event.KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(getRootPane(), "Solo letras");
            //            JOptionPane.showMessageDialog(rootPane, "No se permiten caracteres especiales");
        }

        int maximo = 40;
        if (jtxtApellido.getText().length() >= maximo) {
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(getRootPane(), "Solo se permiten " + maximo + " caracteres");
        }
    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jtxtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCelularKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {

            getToolkit().beep();
            evt.consume();

        }
        if (jtxtCelular.getText().length() >= 9 ){ // limit to 3 characters
            evt.consume();}

        //        if (jtxtDni.length()){}

        //    boolean max = jtxtDni.getText().length() >= 8;
        //    if ( max ){
            //        evt.consume();
            //        getToolkit().beep();
            //    }
        //        char car = evt.getKeyChar();
        //
        //        if (car < '0' || car > '9')
        //            evt.consume();
        //            getToolkit().beep();
    }//GEN-LAST:event_jtxtCelularKeyTyped

    private void jbtnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseExited
                                       
                                        
        jbtnGuardar.setBackground(new Color(232,107,38));
        jbtnGuardar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnGuardarMouseExited

    private void jbtnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnGuardarMouseEntered
//        jbtnGuardar.setBackground(new Color(255,204,0));
        jbtnGuardar.setForeground(new Color(232,107,38));
    
    }//GEN-LAST:event_jbtnGuardarMouseEntered

    private void jbtnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseEntered
//        jbtnNuevo.setBackground(new Color(255,204,0));
        jbtnNuevo.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jbtnNuevoMouseEntered

    private void jbtnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseExited
jbtnNuevo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnNuevoMouseExited

    private void jbtnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseEntered
jbtnCancelar.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jbtnCancelarMouseEntered

    private void jbtnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCancelarMouseExited
jbtnCancelar.setForeground(Color.BLACK);       
    }//GEN-LAST:event_jbtnCancelarMouseExited

    private void jbtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseExited
jbtnModificar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnModificarMouseExited

    private void jbtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseEntered
jbtnModificar.setForeground(new Color(232,107,38));      
    }//GEN-LAST:event_jbtnModificarMouseEntered

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
jbtnEliminar.setForeground(new Color(232,107,38));           // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseExited
jbtnEliminar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnEliminarMouseExited

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jLabelDNIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDNIMouseEntered
        jLabelDNI.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelDNIMouseEntered

    private void jLabelApellidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApellidoMouseEntered
jLabelApellido.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelApellidoMouseEntered

    private void jLabelNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreMouseExited
jLabelNombre.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNombreMouseExited

    private void jLabelNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreMouseEntered
jLabelNombre.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelNombreMouseEntered

    private void jLabelSexoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSexoMouseEntered
jLabelSexo.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelSexoMouseEntered

    private void jLabelDirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDirMouseEntered
jLabelDir.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelDirMouseEntered

    private void jLabelCelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCelMouseEntered
jLabelCel.setForeground(new Color(232,107,38));
    }//GEN-LAST:event_jLabelCelMouseEntered

    private void jLabelNacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNacMouseEntered
jLabelNac.setForeground(new Color(232,107,38));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNacMouseEntered

    private void jLabelApellidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApellidoMouseExited
jLabelApellido.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelApellidoMouseExited

    private void jLabelDNIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDNIMouseExited
jLabelDNI.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelDNIMouseExited

    private void jLabelSexoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSexoMouseExited
jLabelSexo.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelSexoMouseExited

    private void jLabelDirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDirMouseExited
jLabelDir.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelDirMouseExited

    private void jLabelCelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCelMouseExited
jLabelCel.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCelMouseExited

    private void jLabelNacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNacMouseExited
jLabelNac.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNacMouseExited

    private void jrdnMasculinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdnMasculinoMouseExited
jrdnMasculino.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jrdnMasculinoMouseExited

    private void jrdnFemeninoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdnFemeninoMouseExited
jrdnFemenino.setForeground(Color.BLACK);            // TODO add your handling code here:
    }//GEN-LAST:event_jrdnFemeninoMouseExited

    private void jrdnMasculinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdnMasculinoMouseEntered
jrdnMasculino.setForeground(new Color(232,107,38));        // TODO add your handling code here:
    }//GEN-LAST:event_jrdnMasculinoMouseEntered

    private void jrdnFemeninoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrdnFemeninoMouseEntered
jrdnFemenino.setForeground(new Color(232,107,38));        // TODO add your handling code here:
    }//GEN-LAST:event_jrdnFemeninoMouseEntered
    /*TABLA LISTAR*/
    private void cargarTabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Apellido", "Sexo", "DNI", "Nacimiento", "Direción", "Celular"};
        
        modeloTabla = new DefaultTableModel(null, columna);
        controlador.listar(modeloTabla, tipo, dato);
        jtblPaciente.setModel(modeloTabla);      
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoFiltro;
    private javax.swing.ButtonGroup btnGrupoSex;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCel;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelNac;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    public static com.toedter.calendar.JDateChooser jdcNac;
    public static javax.swing.JLabel jlblCodigo;
    private javax.swing.JRadioButton jrdnFemenino;
    private javax.swing.JRadioButton jrdnMasculino;
    private javax.swing.JTable jtblPaciente;
    public static javax.swing.JTextField jtxtApellido;
    public static javax.swing.JTextField jtxtCelular;
    public static javax.swing.JTextField jtxtDni;
    public static javax.swing.JTextField jtxtNombre;
    public static javax.swing.JTextField jtxtdir;
    // End of variables declaration//GEN-END:variables
}
