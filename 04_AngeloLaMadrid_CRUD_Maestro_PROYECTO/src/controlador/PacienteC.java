package controlador;

import dao.Trabajadores;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import Vista.RegistroTrabajadores;

// NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
public class PacienteC implements Serializable {

    Paciente pac;
    Trabajadores dao;

    public PacienteC() {
        pac = new Paciente();
        dao = new Trabajadores();
    }

    public void registrar() {
        try {
            setVariables();
            dao.registrar(pac);            
        } catch (Exception e) {
            System.out.println("Error en PacienteC/registrar: " + e.getMessage());
        }
    }
    
    public void modificar(){
        try {
            pac.setCodigo(Integer.parseInt(RegistroTrabajadores.jlblCodigo.getText()));
            setVariables();
            dao.modificar(pac);
        } catch (Exception e) {
            System.out.println("Error en PacienteC/modificar: " + e.getMessage());
        }
    }

    public void eliminar(){
        try {
            pac.setCodigo(Integer.parseInt(RegistroTrabajadores.jlblCodigo.getText()));
            dao.eliminar(pac.getCodigo());
        } catch (Exception e) {
            System.out.println("Error en PacienteC/eliminar: " + e.getMessage());
        }
    }
    public void listar(DefaultTableModel modelo, Integer tipo, String dato) {
        try {
            dao.listar(modelo, tipo, dato);
        } catch (Exception e) {
            System.out.println("Error en PacienteC/listar: " + e.getMessage());
        }
    }

    public void setVariables() {
        try {   
            pac.setNombre(RegistroTrabajadores.jtxtNombre.getText());
            pac.setApellido(RegistroTrabajadores.jtxtApellido.getText());
            pac.setSexo(RegistroTrabajadores.sexo);
            pac.setDni(RegistroTrabajadores.jtxtDni.getText());
            pac.setNacimiento(RegistroTrabajadores.jdcNac.getDate());
            pac.setDir(RegistroTrabajadores.jtxtdir.getText());
            pac.setCelular(RegistroTrabajadores.jtxtCelular.getText());
        } catch (Exception e) {
            System.out.println("Error en PacienteC/setVariables: " + e.getMessage());
        }
    }

    public static void limpiar() {
        try {
//            RegistroTrabajadores.jrdnFemenino.setSelected(false);
//            RegistroTrabajadores.jrdnMasculino.setSelected(false);
            
            RegistroTrabajadores.jtxtNombre.setText("");
            RegistroTrabajadores.jtxtApellido.setText("");
            RegistroTrabajadores.jtxtDni.setText("");
            RegistroTrabajadores.jdcNac.setDate(null);
            RegistroTrabajadores.jtxtdir.setText("");
            RegistroTrabajadores.jtxtCelular.setText("");
        } catch (Exception e) {
            System.out.println("Error en PacienteC/limpiar: " + e.getMessage());
        }
    }

}
