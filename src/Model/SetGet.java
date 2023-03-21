/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author omara
 */
public class SetGet {
    private int id;
    private String nombre;
    private String status;
    private String fechaHora;
    private float totalVen;
    private float precioVen;
    private float descVen;
    private String clave;
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
    private int folioV;
    private float cantidaVen;

    public int getFolioV() {
        return folioV;
    }

    public void setFolioV(int folioV) {
        this.folioV = folioV;
    }

    public float getCantidaVen() {
        return cantidaVen;
    }

    public void setCantidaVen(float cantidaVen) {
        this.cantidaVen = cantidaVen;
    }
    
    

    public SetGet(int id, String nombre, String status, String fechaHora ,float totalVen, float precioVen, float descVen,String clave,String descripcion,String nomCorto,float precio,float existencias,float stockMin,float stockMax,String contNeto,float descuento,int id_pres,int id_fam,int id_mar, int folioV, float cantidaVen) {
        this.id = id;
        this.nombre = nombre;
        this.status = status;
        this.fechaHora=fechaHora;
        this.totalVen = totalVen;
        this.precioVen = precioVen;
        this.descVen=descVen;
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
        this.folioV=folioV;
        this.cantidaVen=cantidaVen;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomCorto() {
        return nomCorto;
    }

    public void setNomCorto(String nomCorto) {
        this.nomCorto = nomCorto;
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
    
    public SetGet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public void setTotalVen(float totalVen) {
        this.totalVen = totalVen;
    }

    public void setPrecioVen(float precioVen) {
        this.precioVen = precioVen;
    }

    public void setDescVen(float descVen) {
        this.descVen = descVen;
    }
    
    public float getTotalVen() {
        return totalVen;
    }

    public float getPrecioVen() {
        return precioVen;
    }

    public float getDescVen() {
        return descVen;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
}
