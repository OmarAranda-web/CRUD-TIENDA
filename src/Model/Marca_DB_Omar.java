
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author omara
 */
//Esta clase se encargara de mandar a llamar los procedimientos almacenados en la base de datos.
public class Marca_DB_Omar {
    
        Connection con;//Tener una conexion a la base de datos
        Conexion_Omar cn= new Conexion_Omar() ;//Esta es para entablar conexion con la base, desde la clase Conexion
        PreparedStatement ps;//Sirve para ejecutar los comandos SQL, para call, inserts, updates y deletes
        ResultSet rs;//Obtiene los datos de la base de datos este se ocupa para selects
    
    //Este metodo booleano nos servira para registrar una marca por medio del procedimiento almacenado en base de datos.    
    public boolean registrarMarca(String marca){
        String sql="CALL omar_inserta_marca (?)";//Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, marca);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el nombre a insertar
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
           return false;
        }
      
    }
    
    public ArrayList <SetGet> listar_Marcas_Om (){
        //ArrayList <Marca> lista_Marcas_Om=new ArrayList();
        ArrayList <SetGet> lista = new ArrayList<>();
        String sql="select * from omar_marca";
        try {
            con=cn.getConection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Entre haya mas datos se llenara cada registro de la tabla del Frame Marca
                SetGet registroMar_Om = new SetGet();
                registroMar_Om.setId(rs.getInt("OMAR_ID_MARCA"));
                registroMar_Om.setNombre(rs.getString("OMAR_NOMBRE_MARCA"));
                registroMar_Om.setStatus(rs.getString("OMAR_STATUS"));
                lista.add(registroMar_Om);
            }
            
        } catch (Exception e) {
            System.out.println("Error lista marcas:"+e);
            
        }
        return lista;
    }
    
    public boolean estatusMarca(int id_marca, String status_marca){
        String sql="UPDATE omar_marca set OMAR_STATUS=? where OMAR_ID_MARCA=?";
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, status_marca);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran
            ps.setInt(2, id_marca);//Este es para la marca
            ps.execute();//Ejecuta el procedimiento
            return true;
        } catch (Exception e) {
            System.out.println("Error estatus Marca:"+e );
            return  false;
        }
    }
    
    public boolean actualizarMarca(String nombreMarca, int idMarca){
        String sql="UPDATE omar_marca set OMAR_NOMBRE_MARCA=? where OMAR_ID_MARCA=?";
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, nombreMarca);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran
            ps.setInt(2, idMarca);//Este es para la marca
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error estatus Marca:"+e );
            return false;
        }
    }
}
