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
import javax.swing.JComboBox;

/**
 *
 * @author omara
 */
public class Detalle_Venta_DB_Omar {
    Connection con;//Tener una conexion a la base de datos
    Conexion_Omar cn= new Conexion_Omar() ;//Esta es para entablar conexion con la base, desde la clase Conexion
    PreparedStatement ps;//Sirve para ejecutar los comandos SQL, para call, inserts, updates y deletes
    ResultSet rs;//Obtiene los datos de la base de datos este se ocupa para selects
    public ArrayList <SetGet> listar_DV_Om (){
        //ArrayList <Marca> lista_Marcas_Om=new ArrayList();
        ArrayList <SetGet> lista = new ArrayList<>();
        String sql="select * from omar_detalle_venta";
        try {
            con=cn.getConection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Entre haya mas datos se llenara cada registro de la tabla del Frame Marca
                SetGet registroDV_Om = new SetGet();
                registroDV_Om.setId(rs.getInt("OMAR_ID_DV"));
                registroDV_Om.setFolioV(rs.getInt("OMAR_FOLIO_VENTA"));
                registroDV_Om.setClave(rs.getString("OMAR_CLAVE_PRODUCTO"));
                registroDV_Om.setCantidaVen(rs.getFloat("OMAR_CANTIDAD_VENTA"));
                registroDV_Om.setPrecioVen(rs.getFloat("OMAR_PRECIO_VENTA"));
                registroDV_Om.setTotalVen(rs.getFloat("OMAR_TOTAL_CP"));
                registroDV_Om.setDescVen(rs.getFloat("OMAR_DESECUENTO_VENTA"));
                lista.add(registroDV_Om);
            }
            
        } catch (Exception e) {
            System.out.println("Error lista Familia:"+e);
            
        }
        return lista;
    }
    
    public void consulFolio(JComboBox cmboxVent){
        String sql="SELECT OMAR_FOLIO_VENTA from omar_venta";//La llamada squl al respectivo campo a la tabla presentacion para colocar la descripocio
        try {
            con=cn.getConection();//Conexion
            ps=con.prepareStatement(sql);//Preparamos nuestro sql
            rs=ps.executeQuery();//Ejecutamos
            while(rs.next()){
                cmboxVent.addItem(rs.getString("OMAR_FOLIO_VENTA"));//Llenamos cada linea del Combo box de presentacion con la consulta anterimente hecha
            }
        } catch (Exception e) {
            System.out.println("Error lista folio venta: " + e);//Excepcion
        }
    }
    public void consulClave(JComboBox cmboxClave){
        String sql="SELECT OMAR_CLAVE_PRODUCTO from omar_producto";//La llamada squl al respectivo campo a la tabla presentacion para colocar la descripocio
        try {
            con=cn.getConection();//Conexion
            ps=con.prepareStatement(sql);//Preparamos nuestro sql
            rs=ps.executeQuery();//Ejecutamos
            while(rs.next()){
                cmboxClave.addItem(rs.getString("OMAR_CLAVE_PRODUCTO"));//Llenamos cada linea del Combo box de presentacion con la consulta anterimente hecha
            }
        } catch (Exception e) {
            System.out.println("Error lista clave: " + e);//Excepcion
        }
    }
    
    public boolean registrarDV(int folioVen,String clave_prod, float cant_ven, float precio_ven, float total_cp, float desc_venta){
        String sql="CALL omar_inserta_DV (?,?,?,?,?,?)";//Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setInt(1, folioVen);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la venta
            ps.setString(2, clave_prod);
            ps.setFloat(3, cant_ven);
            ps.setFloat(4, precio_ven);
            ps.setFloat(5, total_cp);
            ps.setFloat(6, desc_venta);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error agregar DV: "+e);
           return false;
        }
    }
    
    public boolean actualizar_DV(int folioVen,String clave_prod, float cant_ven, float precio_ven, float total_cp, float desc_venta, int id_dv){
        String sql="UPDATE omar_detalle_venta set OMAR_FOLIO_VENTA=?, OMAR_CLAVE_PRODUCTO=?, OMAR_CANTIDAD_VENTA=?,"
                + "OMAR_PRECIO_VENTA=?, OMAR_TOTAL_CP=?, OMAR_DESECUENTO_VENTA=?"
                + "where OMAR_ID_DV=?";
                //Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setInt(1, folioVen);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la venta
            ps.setString(2, clave_prod);
            ps.setFloat(3, cant_ven);
            ps.setFloat(4, precio_ven);
            ps.setFloat(5, total_cp);
            ps.setFloat(6, desc_venta);
            ps.setFloat(7, id_dv);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error actualizar DV: "+e);
           return false;
        }
    }
    
}
