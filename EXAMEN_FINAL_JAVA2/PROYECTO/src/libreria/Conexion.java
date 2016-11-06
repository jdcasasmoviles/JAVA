package libreria;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    //Variaables de logueo
    public String claveok;
    public String correook;
    public int error1=0;
    public int error2=0;
    public int error3=0;
    
    //Variables para la b.d.
    public Connection con;                                         //Variable que permite conectarme con la base de datos
    public Statement sen;                                          //Con esta variable, para decir que cualquier consulta, update, etc que ejecute va a afectar a la variable con
    public ResultSet datos;                                        //Guardar los valores devueltos por un select
    public ResultSetMetaData meta;                                 //sirve para guardar la estructura de un conjunto de datos
    public int num_campos;
    public String d_mysql="com.mysql.jdbc.Driver";                  //Driver MySQL
    public String c_mysql="jdbc:mysql://localhost/SISTEMA";  //BD MySQL
    public String u_mysql="root";                                   //Usuario MySQL     
    public String p_mysql="root";
    
    public void conectar_mysql(){
        try{
            Class.forName(d_mysql);  //Utilizo el driver
            
            con=DriverManager.getConnection(c_mysql,u_mysql,p_mysql); //Me conecto
            sen=con.createStatement(); 
            JOptionPane.showMessageDialog(null, "Conexion Mysql OK");
        }catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null, "Error en el driver MySQL");
        }catch(SQLException e2){
            JOptionPane.showMessageDialog(null, "Error en la B.D. MySQL");
        }
            
    }
    
    public Connection conexion(){
        try{
            Class.forName(d_mysql);
            con=DriverManager.getConnection(c_mysql,u_mysql,p_mysql);
        }catch(ClassNotFoundException e3){
            JOptionPane.showMessageDialog(null, "Error en el driver");
        }catch(SQLException e4){
            JOptionPane.showMessageDialog(null, "Error en la conexion de B.D. SISTEMA");
        }
        return con;
    }
    
    public ResultSet consulta(String codigo){
        try{
            datos=sen.executeQuery(codigo);//Procesamos la sentencia sql, //Obtengo todas las filas
            meta=datos.getMetaData();//Acceso a los datos de la consulta mediante metodos get 
            num_campos=meta.getColumnCount();//Cuento el numero de columnas 
        }catch(SQLException e3){
            JOptionPane.showMessageDialog(null, "Error en la consulta");
        }
        return datos;
    }
    
    public void salir(){ 
        try{
            sen.close();
            con.close();
        }catch(SQLException e3){
            JOptionPane.showMessageDialog(null, "Error al cerrar la BD");
        }
    }
    public void validar_usuario(String usuario,String clave,String email){
        try{
            sen=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            datos=sen.executeQuery("select * from usuarios where usuario='"+usuario+"'");
            if(datos.next()){
            error1=0;//usuario existe
            claveok=datos.getString("clave");
            correook=datos.getString("Email");
                if(email.equals(correook)){
                error3=0;//email existe
                } else{
               error3=1;//email no existe
               }
                if(clave.equals(claveok)){
                error2=0;//clave ok
                }else{
                error2=1;//clave errada
                }
            }
            else{ error1=1;//usuario no existe
            }
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null,"Error en la consulta");
        }
    
    }
}

