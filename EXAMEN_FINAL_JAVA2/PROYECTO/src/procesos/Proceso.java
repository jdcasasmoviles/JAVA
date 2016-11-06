package procesos;
import java.sql.*;
import javax.swing.JOptionPane;
import libreria.Conexion;
public class Proceso {
    Conexion lib=new Conexion();
    PreparedStatement sentencia;
    public boolean insertar_cliente(int codigo,String ruc,String empresa,
            int telefono,String contacto){
        try{
            String sql="insert into clientes values(?,?,?,?,?)";
            sentencia=lib.conexion().prepareStatement(sql);
            sentencia.setInt(1,codigo);
            sentencia.setString(2,ruc);
            sentencia.setString(3,empresa);
            sentencia.setInt(4,telefono);
            sentencia.setString(5,contacto);
            sentencia.executeUpdate();
        }catch(SQLException e3){
            JOptionPane.showMessageDialog(null,
                    "Error al insertar registro cliente");
        }
        return true;
    }
   
            
    public boolean insertar_usuario(String apellidos,String nombres,int telefono,String usuario,String email,String clave){
        try{
            String sql="insert into usuarios values(?,?,?,?,?,?)";
            sentencia=lib.conexion().prepareStatement(sql);
            sentencia.setString(1,apellidos);
            sentencia.setString(2,nombres);
            sentencia.setInt(3,telefono);
            sentencia.setString(4,usuario);
            sentencia.setString(5,email);
            sentencia.setString(6,clave);
            sentencia.executeUpdate();
        }catch(SQLException e3){
            JOptionPane.showMessageDialog(null,
                    "Error al insertar registro usuario");
        }
        return true;
    }
}
