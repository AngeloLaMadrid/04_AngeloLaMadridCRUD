package dao;

import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Paciente;
import services.UtilToSql;

public class Trabajadores extends Conexion implements ICRUD<Paciente>{
// NUMPAC	NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
    @Override
    public void registrar(Paciente trabajadores) throws Exception {
        String sql = "insert into trabajadores (NOMTRA,APETRA,SEXTRA,DNITRA,FNTRA,DIRTRA,NUMCEL) values (?,?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1,trabajadores.getNombre() );
            ps.setString(2,trabajadores.getApellido());
            ps.setString(3,trabajadores.getSexo());
            ps.setString(4,trabajadores.getDni());
            ps.setDate(5, UtilToSql.convert(trabajadores.getNacimiento()));            
            ps.setString(6,trabajadores.getDir());
            ps.setString(7,trabajadores.getCelular());
            ps.executeUpdate();
            ps.close();            
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/registrar: " + e.getMessage());
        }
    }

    @Override
    public void modificar(Paciente trabajadores) throws Exception {
        String sql = "update trabajadores set NOMTRA=?,APETRA=?,SEXTRA=?,DNITRA=?,FNTRA=?,DIRTRA=?,NUMCEL=? where CODTRA=?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1,trabajadores.getNombre() );
            ps.setString(2,trabajadores.getApellido());
            ps.setString(3,trabajadores.getSexo());
            ps.setString(4,trabajadores.getDni());
            ps.setDate(5, UtilToSql.convert(trabajadores.getNacimiento()));
            ps.setString(6,trabajadores.getDir());
            ps.setString(7,trabajadores.getCelular());
            ps.setInt(8,trabajadores.getCodigo());
            ps.executeUpdate();
            ps.close();            
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/modificar: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int codigo) throws Exception {
        String sql = "delete from trabajadores where CODTRA=" + codigo;
        try {
            PreparedStatement ps = this.conectar().prepareCall(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en PacienteImpl/eliminar: " + e.getMessage());
        }
    }

    public void listar (DefaultTableModel modeloTabla, Integer tipo, String dato) throws Exception {
        String sql = "";
        // NUMPAC	NOMPAC	APEPAC	SEXPAC	DNIPAC	FNPAC	DIRPAC	NUMUBI
        try {
            switch (tipo){
                case 1:
                    sql = "select * from trabajadores"; break;
                case 2:
                    sql = "select * from trabajadores where NOMPAC like '%" + dato + "%'"; break;
                case 3:
                    sql = "select * from trabajadores where APEPAC like '%" + dato + "%'"; break;
                case 4:
                    sql = "select * from trabajadores where DNIPAC like '%" + dato + "%'"; break;
            }
            String datos[] = new String[8];
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                for (int i=0; i<8; i++)
                    datos[i] = rs.getString(i+1);
                    modeloTabla.addRow(datos);
            }
            
            st.close();
            rs.close();                    
        } catch (Exception e) {
            
            
        }
    }
   
    
    
}
