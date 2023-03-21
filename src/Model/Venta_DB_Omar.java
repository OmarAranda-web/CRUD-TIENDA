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
public class Venta_DB_Omar {
    Connection con;//Tener una conexion a la base de datos
    Conexion_Omar cn= new Conexion_Omar() ;//Esta es para entablar conexion con la base, desde la clase Conexion
    PreparedStatement ps;//Sirve para ejecutar los comandos SQL, para call, inserts, updates y deletes
    ResultSet rs;//Obtiene los datos de la base de datos este se ocupa para selects
    
    public ArrayList <SetGet> listar_Venta_Om (){
        //ArrayList <Marca> lista_Marcas_Om=new ArrayList();
        ArrayList <SetGet> lista = new ArrayList<>();
        String sql="select * from omar_venta";
        try {
            con=cn.getConection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Entre haya mas datos se llenara cada registro de la tabla del Frame Marca
                SetGet registroVent_Om = new SetGet();
                registroVent_Om.setId(rs.getInt("OMAR_FOLIO_VENTA"));
                registroVent_Om.setFechaHora(rs.getString("OMAR_FECHA_HORA_VENTA"));
                registroVent_Om.setTotalVen(rs.getFloat("OMAR_TOTAL_VENTA"));
                registroVent_Om.setPrecioVen(rs.getFloat("OMAR_PRECIO_VENTA"));
                registroVent_Om.setDescVen(rs.getFloat("OMAR_DESCUENTO_VENTA"));
                lista.add(registroVent_Om);
            }
            
        } catch (Exception e) {
            System.out.println("Error lista Familia:"+e);
            
        }
        return lista;
    }
    
    public boolean registrarVenta(float total_Ven, float precio_Ven, float desc_Ven){
        String sql="CALL omar_inserta_venta (?,?,?)";//Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setFloat(1, total_Ven);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la venta
            ps.setFloat(2, precio_Ven);
            ps.setFloat(3, desc_Ven);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error agregar venta: "+e);
           return false;
        }
    }
    
        public boolean actualizarVenta(float ac_total_ven, float ac_precio_ven, float ac_desc_ven, int id_ven){
        String sql="UPDATE omar_venta set OMAR_TOTAL_VENTA=?,OMAR_PRECIO_VENTA=?, OMAR_DESCUENTO_VENTA=?  where OMAR_FOLIO_VENTA=?;";
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setFloat(1, ac_total_ven);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran
            ps.setFloat(2, ac_precio_ven);//Este es para el precio de venta 
            ps.setFloat(3, ac_desc_ven);//Descuento que se actualizara
            ps.setFloat(4, id_ven);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error actualizar Venta:"+e );
            return false;
        }
    }
}
