/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class SetGertProducto {
    private String clave;
    private String nombre;
    private String descripcion;
    private String nomCorto;
    private float precio;
    private float existencias;
    private float stockMin;
    private float stockMax;
    private String contNeto;
    private float descuento;
    private int id_pres;
    private int id_fam;
    private int id_mar;
   
    /*public SetGertProducto(String clave,String nombre,String descripcion,String nomCorto,float precio,float existencias,float stockMin,float stockMax,String contNeto,float descuento,int id_pres,int id_fam,int id_mar) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.clave=clave;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.nomCorto=nomCorto;
        this.precio=precio;
        this.existencias=existencias;
        this.stockMin=stockMin;
        this.stockMax=stockMax;
        this.contNeto=contNeto;
        this.descuento=descuento;
        this.id_pres=id_pres;
        this.id_fam=id_fam;
        this.id_mar=id_mar;
    }*/

    public SetGertProducto(String clave,String nombre,String descripcion,String nomCorto,float precio,float existencias,float stockMin,float stockMax,String contNeto,float descuento,int id_pres,int id_fam,int id_mar) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.clave=clave;
        //this.nombre=nombre;
        this.descripcion=descripcion;
        this.nomCorto=nomCorto;
        this.precio=precio;
        this.existencias=existencias;
        this.stockMin=stockMin;
        this.stockMax=stockMax;
        this.contNeto=contNeto;
        this.descuento=descuento;
        this.id_pres=id_pres;
        this.id_fam=id_fam;
        this.id_mar=id_mar;
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String Clave) {
        this.clave = Clave;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public String getnomCorto() {
        return nomCorto;
    }

    public void setnomCorto(String NomCorto) {
        this.nomCorto = NomCorto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getExistencias() {
        return existencias;
    }

    public void setExistencias(float existencias) {
        this.existencias = existencias;
    }

    public float getStockMin() {
        return stockMin;
    }

    public void setStockMin(float stockMin) {
        this.stockMin = stockMin;
    }

    public float getStockMax() {
        return stockMax;
    }

    public void setStockMax(float stockMax) {
        this.stockMax = stockMax;
    }

    public String getContNeto() {
        return contNeto;
    }

    public void setContNeto(String contNeto) {
        this.contNeto = contNeto;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public int getId_pres() {
        return id_pres;
    }

    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }

    public int getId_fam() {
        return id_fam;
    }

    public void setId_fam(int id_fam) {
        this.id_fam = id_fam;
    }

    public int getId_mar() {
        return id_mar;
    }

    public void setId_mar(int id_mar) {
        this.id_mar = id_mar;
    }
    
}
