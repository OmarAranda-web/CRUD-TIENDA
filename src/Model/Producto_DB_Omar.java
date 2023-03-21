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
public class Producto_DB_Omar {
    Connection con;//Tener una conexion a la base de datos
    Conexion_Omar cn= new Conexion_Omar() ;//Esta es para entablar conexion con la base, desde la clase Conexion
    PreparedStatement ps;//Sirve para ejecutar los comandos SQL, para call, inserts, updates y deletes
    ResultSet rs;//Obtiene los datos de la base de datos este se ocupa para selects
    
    public ArrayList <SetGet> listar_Productos_Om (){
        ArrayList <SetGet> lista = new ArrayList<>();
        String sql="select * from omar_producto";
        try {
            con=cn.getConection();
            ps=con.prepareCall(sql);
            rs=ps.executeQuery();
            while(rs.next()){//Entre haya mas datos se llenara cada registro de la tabla del Frame Marca
                SetGet registroProd_Om = new SetGet();
                registroProd_Om.setClave(rs.getString("OMAR_CLAVE_PRODUCTO"));
                registroProd_Om.setNombre(rs.getString("OMAR_NOMBRE_PRODUCTO"));
                registroProd_Om.setDescripcion(rs.getString("OMAR_DESCRIPCION_PRODUCTO"));
                registroProd_Om.setNomCorto(rs.getString("OMAR_NOMBRE_CORTO_PRODUCTO"));
                registroProd_Om.setPrecio(rs.getFloat("OMAR_PRECIO_ACTUAL_PRODUCTO"));
                registroProd_Om.setExistencias(rs.getFloat("OMAR_EXITENCIAS_PRODUCTO"));
                registroProd_Om.setStockMin(rs.getFloat("OMAR_STOCK_MIN_PRODUCTO"));
                registroProd_Om.setStockMax(rs.getFloat("OMAR_STOCK_MAX_PRODUCTO"));
                registroProd_Om.setContNeto(rs.getString("OMAR_CONTENIDO_NETO_PRODUCTO"));
                registroProd_Om.setDescuento(rs.getFloat("OMAR_DESCUENTO_PRODUCTO"));
                registroProd_Om.setId_pres(rs.getInt("OMAR_ID_PRESENTACION"));
                registroProd_Om.setId_fam(rs.getInt("OMAR_ID_FAMILIA"));
                registroProd_Om.setId_mar(rs.getInt("OMAR_ID_MARCA"));
                lista.add(registroProd_Om);
            }
            
        } catch (Exception e) {
            System.out.println("Error lista Producto:"+e);
            
        }
        return lista;
    }
    
    public boolean registrarProducto(String clave_prod,String nom_Prod, String descrip_prod, String nomCor_prod, float precio_prod, float exiten_prod, float stockMin_prod, float stockMax_prod, String contNet_prod, float desc_prod, String id_prese, String id_fami, String id_marc){
        String sql="CALL omar_inserta_producto (?,?,?,?,?,?,?,?,?,?,?,?,?)";//Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(1, clave_prod);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la venta
            ps.setString(2, nom_Prod);
            ps.setString(3, descrip_prod);
            ps.setString(4, nomCor_prod);
            ps.setFloat(5, precio_prod);
            ps.setFloat(6, exiten_prod);
            ps.setFloat(7, stockMin_prod);
            ps.setFloat(8, stockMax_prod);
            ps.setString(9, contNet_prod);
            ps.setFloat(10, desc_prod);
            ps.setString(11, id_prese);
            ps.setString(12, id_fami);
            ps.setString(13, id_marc);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error agregar producto: "+e);
           return false;
        }
    }
    
    public void consulPres(JComboBox cmboxPres){
        String sql="SELECT OMAR_DESCRIPCION_PRESENTACION from omar_presentacion";//La llamada squl al respectivo campo a la tabla presentacion para colocar la descripocio
        try {
            con=cn.getConection();//Conexion
            ps=con.prepareStatement(sql);//Preparamos nuestro sql
            rs=ps.executeQuery();//Ejecutamos
            while(rs.next()){
                cmboxPres.addItem(rs.getString("OMAR_DESCRIPCION_PRESENTACION"));//Llenamos cada linea del Combo box de presentacion con la consulta anterimente hecha
            }
        } catch (Exception e) {
            System.out.println("Error lista presentacion: " + e);//Excepcion
        }
    }
    
    public String consulPresId(int id_pres){
        String sql="SELECT OMAR_DESCRIPCION_PRESENTACION from omar_presentacion where OMAR_ID_PRESENTACION='"+id_pres+"'";//Sql para solicitar la ID de presentacion 
        try {
            con=cn.getConection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String presentacion =rs.getString("OMAR_DESCRIPCION_PRESENTACION");//Mandamos la direccion id para utilizarla depues en las actualizaciones y agregar
                return presentacion;
            }else{
                return "";
            }
        } catch (Exception e) {
            System.out.println("Error consulta id presentacion"+e);
            return "";
        }
    }
    
    public void consulFami(JComboBox cmboxFami){
        String sql="SELECT OMAR_DESCRIPCION_FAMILIA from omar_familia";//La llamada squl al respectivo campo a la tabla familia para colocar la familia
        try {
            con=cn.getConection();//Conexion
            ps=con.prepareStatement(sql);//Preparamos nuestro sql
            rs=ps.executeQuery();//Ejecutamos
            while(rs.next()){
                cmboxFami.addItem(rs.getString("OMAR_DESCRIPCION_FAMILIA"));//Llenamos cada linea del Combo box de presentacion con la consulta anterimente hecha
            }
        } catch (Exception e) {
            System.out.println("Error lista familia: " + e);//Excepcion
        }
    }
    
    public String consulFamiId(int id_fami){
        String sql="SELECT OMAR_DESCRIPCION_FAMILIA from omar_familia where OMAR_ID_FAMILIA='"+id_fami+"'";//Sql para solicitar la ID de presentacion 
       
        try {
            con=cn.getConection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
               String familia=rs.getString("OMAR_DESCRIPCION_FAMILIA");//Mandamos la direccion id para utilizarla depues en las actualizaciones y agregar
                return familia; 
            }else{
                return "";
            }
            
        } catch (Exception e) {
            System.out.println("Error consulta id familia"+e);
            return "";
        }
        
    }
    
    public void consulMarca(JComboBox cmboxMarc){
        String sql="SELECT OMAR_NOMBRE_MARCA from omar_marca";//La llamada squl al respectivo campo a la tabla presentacion para colocar la descripocio
        try {
            con=cn.getConection();//Conexion
            ps=con.prepareStatement(sql);//Preparamos nuestro sql
            rs=ps.executeQuery();//Ejecutamos
            while(rs.next()){
                cmboxMarc.addItem(rs.getString("OMAR_NOMBRE_MARCA"));//Llenamos cada linea del Combo box de presentacion con la consulta anterimente hecha
            }
        } catch (Exception e) {
            System.out.println("Error lista marca: " + e);//Excepcion
        }
    }
    
    public String consulMarcaId(int id_marc){
        String sql="SELECT OMAR_NOMBRE_MARCA from omar_marca where OMAR_ID_MARCA='"+id_marc+"'";//Sql para solicitar la ID de presentacion 
       
        try {
            con=cn.getConection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                String marca=rs.getString("OMAR_NOMBRE_MARCA");//Mandamos la direccion id para utilizarla depues en las actualizaciones y agregar
                return marca;
            }else{
                return "";
            }
              
        } catch (Exception e) {
            System.out.println("Error consulta id marca"+e);
            return "";
        }
        
    }
    
    public boolean actualizarProducto(String clave_prod,String nom_Prod, String descrip_prod, String nomCor_prod, float precio_prod, float exiten_prod, float stockMin_prod, float stockMax_prod, String contNet_prod, float desc_prod){
        String sql="UPDATE omar_producto set OMAR_NOMBRE_PRODUCTO=?,OMAR_DESCRIPCION_PRODUCTO=?,OMAR_NOMBRE_CORTO_PRODUCTO=?,OMAR_PRECIO_ACTUAL_PRODUCTO=?,OMAR_EXITENCIAS_PRODUCTO=?,"
                + "OMAR_STOCK_MIN_PRODUCTO=?,OMAR_STOCK_MAX_PRODUCTO=?,OMAR_CONTENIDO_NETO_PRODUCTO=?,OMAR_DESCUENTO_PRODUCTO=? "
                + "Where OMAR_CLAVE_PRODUCTO=?";
                //Llamamos a procedimiento almacenado, y el signo de interrogacion sirve de parametro para mandar a llamar algo especifico
        try {
            con=cn.getConection();//Este se encargara de entablar la conexion
            ps=con.prepareStatement(sql);//prepara para ejecutar el squl declarado en la parte arriba
            ps.setString(10, clave_prod);//El 1 es el numero de signos de inerrogacion que son los parametros que se enviaran, en este caso uno el descripcion de la venta
            ps.setString(1, nom_Prod);
            ps.setString(2, descrip_prod);
            ps.setString(3, nomCor_prod);
            ps.setFloat(4, precio_prod);
            ps.setFloat(5, exiten_prod);
            ps.setFloat(6, stockMin_prod);
            ps.setFloat(7, stockMax_prod);
            ps.setString(8, contNet_prod);
            ps.setFloat(9, desc_prod);
            //ps.setString(11, id_prese);
            //ps.setString(12, id_fami);
            //ps.setString(13, id_marc);
            ps.execute();//Ejecuta el procedimiento
            return true;
            
        } catch (Exception e) {
            System.out.println("Error agregar producto: "+e);
           return false;
        }
    }
}
