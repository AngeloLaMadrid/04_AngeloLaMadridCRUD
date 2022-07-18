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
public class RegistroTrabajadores1 extends javax.swing.JPanel {

   public static String sexo = "M";
    public int tipo = 1; //1: todos, 2:nombre, 3:apellido, 4:dni
    public String dato = ""; // contenido del filtro
    PacienteC controlador;
    DefaultTableModel modeloTabla;
    
    /*VARIABLES PARA MOVER EL JFRAME*/
    int MouseX,MouseY;
    
    public RegistroTrabajadores1() {
        initComponents();
        
        
        
        
        controlador = new PacienteC();
        btnGrupoSex.add(jrdnMasculino);
        btnGrupoSex.add(jrdnFemenino);
        btnGrupoFiltro.add(jrdnApe);
        btnGrupoFiltro.add(jrdnDni);
        btnGrupoFiltro.add(jrdnNom);
        jchkTodos.setSelected(true);
        /*MODIFICADO*/
       try {
           cargarTabla();
       } catch (Exception ex) {
           Logger.getLogger(RegistroTrabajadores1.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSex = new javax.swing.ButtonGroup();
        btnGrupoFiltro = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jrdnMasculino = new javax.swing.JRadioButton();
        jrdnFemenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
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
        jtxtUbigeo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jLabelDNI = new javax.swing.JLabel();
        jtxtDni = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jrdnNom = new javax.swing.JRadioButton();
        jrdnApe = new javax.swing.JRadioButton();
        jrdnDni = new javax.swing.JRadioButton();
        jtxtFiltro = new javax.swing.JTextField();
        jchkTodos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPaciente = new javax.swing.JTable();

        setBackground(new java.awt.Color(231, 120, 58));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 107, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jrdnMasculino.setBackground(new java.awt.Color(232, 107, 38));
        jrdnMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdnMasculino.setForeground(new java.awt.Color(255, 255, 255));
        jrdnMasculino.setText("Masculino");
        jrdnMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jrdnFemenino.setBackground(new java.awt.Color(232, 107, 38));
        jrdnFemenino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrdnFemenino.setForeground(new java.awt.Color(255, 255, 255));
        jrdnFemenino.setText("Femenino");
        jrdnFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnFemeninoActionPerformed(evt);
            }
        });
        jPanel1.add(jrdnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro de clientes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Distrito 1", "Distrito 2", "Distrito 3", "Distrito 4" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 214, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Distrito");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Departamento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Provincia");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincia 1", "Provincia 2", "Provincia 3", "Provincia 4" }));
        jComboBox2.setBorder(null);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 214, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        jComboBox3.setBorder(null);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 214, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dirección");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        jbtnModificar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnModificar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnModificar.setText("Modificar");
        jbtnModificar.setContentAreaFilled(false);
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnModificar.setIconTextGap(10);
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jbtnGuardar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnGuardar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setContentAreaFilled(false);
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnGuardar.setIconTextGap(10);
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jbtnNuevo.setBackground(new java.awt.Color(232, 107, 38));
        jbtnNuevo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setContentAreaFilled(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnNuevo.setIconTextGap(10);
        jbtnNuevo.setInheritsPopupMenu(true);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jbtnEliminar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnEliminar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnEliminar.setIconTextGap(10);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jbtnCancelar.setBackground(new java.awt.Color(232, 107, 38));
        jbtnCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setContentAreaFilled(false);
        jbtnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jbtnCancelar.setIconTextGap(10);
        jPanel1.add(jbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Código:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jlblCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        jlblCodigo.setMaximumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setMinimumSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        jlblCodigo.setRequestFocusEnabled(false);
        jPanel1.add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 20));

        jLabelNac.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelNac.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNac.setText("Nacimiento");
        jPanel1.add(jLabelNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jdcNac.setPreferredSize(new java.awt.Dimension(64, 23));
        jdcNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdcNacKeyTyped(evt);
            }
        });
        jPanel1.add(jdcNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 256, -1));

        jtxtdir.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jtxtdir.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtdir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtdir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdirKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtdir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 214, -1));

        jtxtUbigeo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jtxtUbigeo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtUbigeo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtUbigeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 214, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ubigeo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jtxtNombre.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jtxtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtNombre.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 256, -1));

        jLabelNombre.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jLabelNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jtxtApellido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jtxtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtApellido.setMaximumSize(new java.awt.Dimension(10, 250));
        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 256, -1));

        jLabelDNI.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDNI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDNI.setText("DNI");
        jPanel1.add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jtxtDni.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
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
        jPanel1.add(jtxtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 256, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 330));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(232, 107, 38));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrdnNom.setBackground(new java.awt.Color(232, 107, 38));
        jrdnNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnNom.setForeground(new java.awt.Color(255, 255, 255));
        jrdnNom.setText("Nombre");
        jrdnNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnNomActionPerformed(evt);
            }
        });
        jPanel3.add(jrdnNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, -1, -1));

        jrdnApe.setBackground(new java.awt.Color(232, 107, 38));
        jrdnApe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnApe.setForeground(new java.awt.Color(255, 255, 255));
        jrdnApe.setText("Apellido");
        jrdnApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnApeActionPerformed(evt);
            }
        });
        jPanel3.add(jrdnApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 7, -1, -1));

        jrdnDni.setBackground(new java.awt.Color(232, 107, 38));
        jrdnDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrdnDni.setForeground(new java.awt.Color(255, 255, 255));
        jrdnDni.setText("DNI");
        jrdnDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdnDniActionPerformed(evt);
            }
        });
        jPanel3.add(jrdnDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 8, -1, -1));

        jtxtFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtFiltro.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jtxtFiltroCaretUpdate(evt);
            }
        });
        jtxtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFiltroActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 278, 20));

        jchkTodos.setBackground(new java.awt.Color(232, 107, 38));
        jchkTodos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jchkTodos.setForeground(new java.awt.Color(255, 255, 255));
        jchkTodos.setText("Todos");
        jchkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkTodosActionPerformed(evt);
            }
        });
        jPanel3.add(jchkTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 8, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 800, 40));

        jtblPaciente.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Apellido M.", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblPaciente.setFocusable(false);
        jtblPaciente.setGridColor(new java.awt.Color(204, 204, 204));
        jtblPaciente.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jtblPaciente.getTableHeader().setReorderingAllowed(false);
        jtblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblPacienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblPaciente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 790, 300));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 790, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed

            try {
                PacienteC.limpiar();
                jbtnGuardar.setEnabled(true);
                jbtnCancelar.setEnabled(true);
                jbtnNuevo.setEnabled(false);
            } catch (Exception e) {
            }
        
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jrdnNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnNomActionPerformed
        tipo = 2;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnNomActionPerformed

    private void jrdnApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnApeActionPerformed
        tipo = 3;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnApeActionPerformed

    private void jrdnDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdnDniActionPerformed
        tipo = 4;
        jtxtFiltro.requestFocus();
        jtxtFiltro.setText("");
        jchkTodos.setSelected(false);
    }//GEN-LAST:event_jrdnDniActionPerformed

    private void jtxtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jtxtFiltroCaretUpdate
        try {
            dato = jtxtFiltro.getText();
            cargarTabla();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jtxtFiltroCaretUpdate

    private void jtxtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFiltroActionPerformed

    private void jchkTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkTodosActionPerformed
        try {
            btnGrupoFiltro.clearSelection();
            tipo = 1;
            dato = "";
            jtxtFiltro.setText("");
            cargarTabla();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jchkTodosActionPerformed

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
        if (jtxtDni.getText().length() == 8 && jtxtNombre.getText().length()>1 && jtxtApellido.getText().length()>5 ) {
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
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jtblPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPacienteMousePressed
//        if(usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" "))
//        usrnm.setText("Ingrese el nombre de usuario a buscar");
    }//GEN-LAST:event_jtblPacienteMousePressed

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
    /*TABLA LISTAR*/
    private void cargarTabla() throws Exception {
        String columna[] = new String[]{"Código", "Nombre", "Apellido", "Sexo", "DNI", "Nacimiento", "Dirreción", "Ubigeo"};
        modeloTabla = new DefaultTableModel(null, columna);
        controlador.listar(modeloTabla, tipo, dato);
        jtblPaciente.setModel(modeloTabla);      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupoFiltro;
    private javax.swing.ButtonGroup btnGrupoSex;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelNac;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JCheckBox jchkTodos;
    public static com.toedter.calendar.JDateChooser jdcNac;
    public static javax.swing.JLabel jlblCodigo;
    private javax.swing.JRadioButton jrdnApe;
    private javax.swing.JRadioButton jrdnDni;
    private javax.swing.JRadioButton jrdnFemenino;
    private javax.swing.JRadioButton jrdnMasculino;
    private javax.swing.JRadioButton jrdnNom;
    private javax.swing.JTable jtblPaciente;
    public static javax.swing.JTextField jtxtApellido;
    public static javax.swing.JTextField jtxtDni;
    private javax.swing.JTextField jtxtFiltro;
    public static javax.swing.JTextField jtxtNombre;
    public static javax.swing.JTextField jtxtUbigeo;
    public static javax.swing.JTextField jtxtdir;
    // End of variables declaration//GEN-END:variables
}
