/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author omara
 */
public class Familia_DB_Omar {
    Connection con;//Tener una conexion a la base de datos
    Conexion_Omar cn= new Conexion_Omar() ;//Esta es para entablar conexion con la base, desde la clase Conexion
    PreparedStatement ps;//Sirve para ejecutar los comandos SQL, para call, inserts, updates y deletes
    ResultSet rs;//Obtiene los datos de la base de datos este se ocupa para selects
    
    public ArrayList <SetGet> listar_Familia_Om (){
        //ArrayList <Marca> lista_Marcas_Om=new ArrayList();
        ArrayList <SetGet> lista = new ArrayList<>();
        String sql="select * from omar_familia";
        try {
            con=cn.getConection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Entre haya mas datos se llenara cada registro de la tabla del Frame Marca
                SetGet registroFam_Om = new SetGet();
                registroFam_Om.setId(rs.getInt("OMAR_ID_FAMILIA"));
                registroFam_Om.setNombre(rs.getString("OMAR_DESCRIPCION_FAMILIA"));
                registroFam_Om.setStatus(rs.getString("OMAR_STATUS_FAMILIA"));
                lista.add(registroFam_Om);
            }
            
        } catch (Exception e) {
            System.out.println("Error lista Familia:"+e);
            
        }
        return lista;
    }
    
    public boolean registrarFamilia(String familia){
        String sql="CALL omar_inserta_familia (?)";//Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, familia);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la familia
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error agregar presentacion: "+e);
           return false;
        }
      
    }
    
    public boolean actualizarFamilia(String descripFamilia, int idFamilia){
        String sql="UPDATE omar_familia set OMAR_DESCRIPCION_FAMILIA=? where OMAR_ID_FAMILIA=?";
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, descripFamilia);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran
            ps.setInt(2, idFamilia);//Este es para el id de la presentacion
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error actualizar Familia:"+e );
            return false;
        }
    }
    
    public boolean estatusFamilia(int id_familia, String status_familia){
        String sql="UPDATE omar_familia set OMAR_STATUS_FAMILIA=? where OMAR_ID_FAMILIA=?";
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, status_familia);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran
            ps.setInt(2, id_familia);//Este es para mandar a la base de datos por medio de sql a la base de datos
            ps.execute();//Ejecuta el procedimiento
            return true;
        } catch (Exception e) {
            System.out.println("Error estatus Familia:"+e );
            return  false;
        }
    }
}
