/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Producto_DB_Omar;

import Model.SetGet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class FrmProducto_Omar extends javax.swing.JFrame {

    DefaultTableModel modTabProdOmar = new DefaultTableModel();
    SetGet conexionProdO = new SetGet();
    Producto_DB_Omar ejecuInstrucOmar = new Producto_DB_Omar();
    int id_produ;
    
    public FrmProducto_Omar() {
        initComponents();
        mostrarProdOm();
        ejecuInstrucOmar.consulPres(jComboPresentaProdu);
        ejecuInstrucOmar.consulFami(jComboFamProd);
        ejecuInstrucOmar.consulMarca(jComboMarcaProd);
    }
    private void mostrarProdOm(){
        ArrayList <SetGet> frmLista_Prod_Om=ejecuInstrucOmar.listar_Productos_Om();//Obtenemos nuestras familias de la base de datos
        modTabProdOmar = (DefaultTableModel) tablaProducto.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_Prod[] = new Object [13];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_Prod_Om.size();i++){
            llenar_Prod [0]=frmLista_Prod_Om.get(i).getClave();
            llenar_Prod [1]=frmLista_Prod_Om.get(i).getNombre();
            llenar_Prod [2]=frmLista_Prod_Om.get(i).getDescripcion();
            llenar_Prod [3]=frmLista_Prod_Om.get(i).getNomCorto();
            llenar_Prod [4]=frmLista_Prod_Om.get(i).getPrecio();
            llenar_Prod [5]=frmLista_Prod_Om.get(i).getExistencias();
            llenar_Prod [6]=frmLista_Prod_Om.get(i).getStockMin();
            llenar_Prod [7]=frmLista_Prod_Om.get(i).getStockMax();
            llenar_Prod [8]=frmLista_Prod_Om.get(i).getContNeto();
            llenar_Prod [9]=frmLista_Prod_Om.get(i).getDescuento();
            llenar_Prod [10]=frmLista_Prod_Om.get(i).getId_pres();
            llenar_Prod [11]=frmLista_Prod_Om.get(i).getId_fam();
            llenar_Prod [12]=frmLista_Prod_Om.get(i).getId_mar();
            modTabProdOmar.addRow(llenar_Prod);//Añadimos una fila de familias con todos los datos de la familia
        }
        tablaProducto.setModel(modTabProdOmar);//Mandamos el modelo lleno a la tabla
    }
    
    private void limpiarTabla(){
        for(int i=0; i<modTabProdOmar.getRowCount();i++){
            modTabProdOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
    private void limpiar_campos(){
        txtClavePro.setText("");
        txtNomPro.setText("");
        txtDescriPro.setText("");
        txtNomCorProd.setText("");
        txtPrecioProdu.setText("");
        txtExisProd.setText("");
        txtStockMinPro.setText("");
        txtStockMaxPro.setText("");
        txtContProd.setText("");
        txtDescProd.setText("");
        jComboPresentaProdu.setSelectedIndex(0);
        jComboFamProd.setSelectedIndex(0);
        jComboMarcaProd.setSelectedIndex(0);
    }
    private void limpiar_campos1(){
        txtClavProdAc.setText("");
        txtNomProAc.setText("");
        txtDescriProAc.setText("");
        txtNomCorProdAc.setText("");
        txtPrecioProdu1Ac.setText("");
        txtExisProdAc.setText("");
        txtStockMinProAc.setText("");
        txtStockMaxProAc.setText("");
        txtContProdAc.setText("");
        txtDescProdAc.setText("");
        //jComboPresentaProduAc.setSelectedIndex(0);
        //jComboFamProdAc.setSelectedIndex(0);
        //jComboMarcaProdAc.setSelectedIndex(0);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtClavePro = new javax.swing.JTextField();
        txtNomPro = new javax.swing.JTextField();
        txtDescriPro = new javax.swing.JTextField();
        txtNomCorProd = new javax.swing.JTextField();
        txtPrecioProdu = new javax.swing.JTextField();
        txtExisProd = new javax.swing.JTextField();
        txtStockMinPro = new javax.swing.JTextField();
        txtStockMaxPro = new javax.swing.JTextField();
        txtContProd = new javax.swing.JTextField();
        txtDescProd = new javax.swing.JTextField();
        jComboPresentaProdu = new javax.swing.JComboBox<>();
        jComboFamProd = new javax.swing.JComboBox<>();
        jComboMarcaProd = new javax.swing.JComboBox<>();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNomProAc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDescriProAc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNomCorProdAc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPrecioProdu1Ac = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtExisProdAc = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtStockMinProAc = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtStockMaxProAc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtContProdAc = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDescProdAc = new javax.swing.JTextField();
        btnActualizarProducto = new javax.swing.JButton();
        btnRegresarProd = new javax.swing.JButton();
        txtClavProdAc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tabla de Productos");

        jLabel2.setText("Coloque las espcificaciones del producto");

        jLabel3.setText("Clave");

        jLabel4.setText("Producto");

        jLabel5.setText("Descripcion");

        jLabel6.setText("Nombre ");

        jLabel7.setText("Precio Actual");

        jLabel8.setText("Existencias");

        jLabel9.setText("Stock Min");

        jLabel10.setText("Stock Max");

        jLabel11.setText("Cont.Neto");

        jLabel12.setText("Descueto");

        jLabel13.setText("Presentacion");

        jLabel14.setText("Familia");

        jLabel15.setText("Marca");

        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Producto", "Descripcion", "Nombre Corto", "Precio Actual", "Existencias", "Stock Min", "Stock Max", "Cont.Neto", "Descuento", "Presentacion", "Familia", "Marca"
            }
        ));
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        jLabel16.setText("Clave");

        jLabel17.setText("Producto");

        jLabel18.setText("Descripcion");

        jLabel19.setText("Nombre ");

        jLabel20.setText("Precio Actual");

        jLabel21.setText("Existencias");

        jLabel22.setText("Stock Min");

        jLabel23.setText("Stock Max");

        jLabel24.setText("Cont.Neto");

        jLabel25.setText("Descueto");

        btnActualizarProducto.setText("Atualizar");
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        btnRegresarProd.setText("Regresar");
        btnRegresarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtClavePro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDescriPro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNomCorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addComponent(txtPrecioProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(161, 161, 161)
                                        .addComponent(jLabel6)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtExisProd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStockMinPro))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStockMaxPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(19, 19, 19))
                                    .addComponent(txtContProd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jComboPresentaProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboFamProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(355, 355, 355)
                                                .addComponent(jLabel19)
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel20))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(90, 90, 90)
                                                        .addComponent(jLabel17))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtClavProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(txtNomProAc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtDescriProAc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtNomCorProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(26, 26, 26)
                                                .addComponent(txtPrecioProdu1Ac, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(txtExisProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtStockMinProAc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtStockMaxProAc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel24)
                                                .addGap(19, 19, 19))
                                            .addComponent(txtContProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDescProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(522, 522, 522)
                                        .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnRegresarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(329, 329, 329)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(472, 472, 472))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(502, 502, 502))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtClavePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescriPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomCorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtExisProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtStockMinPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStockMaxPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtContProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDescProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboPresentaProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboFamProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarProducto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNomProAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescriProAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomCorProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioProdu1Ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtExisProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClavProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtStockMinProAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStockMaxProAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescProdAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizarProducto)
                    .addComponent(btnRegresarProd))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        String claveProduAgre = txtClavePro.getText().toString();
        String nompreProduAgre = txtClavePro.getText().toString();
        String descriProdAgre = txtDescriPro.getText().toString();
        String nomCorProdAgre=txtNomCorProd.getText().toString();
        String preciProdAgre=txtPrecioProdu.getText();
        String existProdAgre=txtExisProd.getText();
        String stockMinProdAgre=txtStockMinPro.getText();
        String stockMaxProdAgre=txtStockMaxPro.getText();
        String contNeProdAgre=txtContProd.getText().toString();
        String descProdAgre=txtDescProd.getText();
        String preProAgre=jComboPresentaProdu.getSelectedItem().toString();
        String famiProAgre=jComboFamProd.getSelectedItem().toString();
        String marcProdAgre=jComboMarcaProd.getSelectedItem().toString();
        System.out.println(preProAgre+" "+famiProAgre+" "+marcProdAgre);
        
        
        
        ejecuInstrucOmar.registrarProducto(claveProduAgre,nompreProduAgre , descriProdAgre, nomCorProdAgre, Float.valueOf(preciProdAgre),
                Float.valueOf(existProdAgre), Float.valueOf(stockMinProdAgre), Float.valueOf(stockMaxProdAgre), contNeProdAgre, Float.valueOf(descProdAgre), preProAgre, famiProAgre, marcProdAgre);
        limpiarTabla();
        mostrarProdOm();
        limpiar_campos();
      
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        String claveProduAc = txtClavProdAc.getText().toString();
        String nompreProduAc = txtNomProAc.getText().toString();
        String descriProdAc = txtDescriProAc.getText().toString();
        String nomCorProdAc=txtNomCorProdAc.getText().toString();
        String preciProdAc=txtPrecioProdu1Ac.getText();
        String existProdAc=txtExisProdAc.getText();
        String stockMinProdAc=txtStockMinProAc.getText();
        String stockMaxProdAc=txtStockMaxProAc.getText();
        String contNeProdAc=txtContProdAc.getText().toString();
        String descProdAc=txtDescProdAc.getText();
        //String preProAc=jComboPresentaProduAc.getSelectedItem().toString();
        //String famiProAc=jComboFamProdAc.getSelectedItem().toString();
        //String marcProdAc=jComboMarcaProdAc.getSelectedItem().toString();
        ejecuInstrucOmar.actualizarProducto(claveProduAc,nompreProduAc , descriProdAc, nomCorProdAc, Float.valueOf(preciProdAc),
                Float.valueOf(existProdAc), Float.valueOf(stockMinProdAc), Float.valueOf(stockMaxProdAc), contNeProdAc, Float.valueOf(descProdAc));
        limpiarTabla();
        mostrarProdOm();
        limpiar_campos1();
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnRegresarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarProdActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarProdActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        int fila=tablaProducto.rowAtPoint(evt.getPoint());
        //id_produ=(int) tablaProducto.getValueAt(fila,0);
        txtClavProdAc.setText(tablaProducto.getValueAt(fila, 0).toString());
        txtNomProAc.setText(tablaProducto.getValueAt(fila,1).toString());
        txtDescriProAc.setText(tablaProducto.getValueAt(fila, 2).toString());
        txtNomCorProdAc.setText(tablaProducto.getValueAt(fila, 3).toString());
        txtPrecioProdu1Ac.setText(tablaProducto.getValueAt(fila, 4).toString());
        txtExisProdAc.setText(tablaProducto.getValueAt(fila, 5).toString());
        txtStockMinProAc.setText(tablaProducto.getValueAt(fila, 6).toString());
        txtStockMaxProAc.setText(tablaProducto.getValueAt(fila, 7).toString());
        txtContProdAc.setText(tablaProducto.getValueAt(fila, 8).toString());
        txtDescProdAc.setText(tablaProducto.getValueAt(fila, 9).toString());
        //jComboPresentaProduAc.setSelectedItem(ejecuInstrucOmar.consulPresId((int) tablaProducto.getValueAt(fila,10)));
        //jComboFamProdAc.setSelectedItem(ejecuInstrucOmar.consulFamiId((int) tablaProducto.getValueAt(fila,11)));
        //jComboMarcaProdAc.setSelectedItem(ejecuInstrucOmar.consulMarcaId((int) tablaProducto.getValueAt(fila,12)));
    }//GEN-LAST:event_tablaProductoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmProducto_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto_Omar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnRegresarProd;
    private javax.swing.JComboBox<String> jComboFamProd;
    private javax.swing.JComboBox<String> jComboMarcaProd;
    private javax.swing.JComboBox<String> jComboPresentaProdu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtClavProdAc;
    private javax.swing.JTextField txtClavePro;
    private javax.swing.JTextField txtContProd;
    private javax.swing.JTextField txtContProdAc;
    private javax.swing.JTextField txtDescProd;
    private javax.swing.JTextField txtDescProdAc;
    private javax.swing.JTextField txtDescriPro;
    private javax.swing.JTextField txtDescriProAc;
    private javax.swing.JTextField txtExisProd;
    private javax.swing.JTextField txtExisProdAc;
    private javax.swing.JTextField txtNomCorProd;
    private javax.swing.JTextField txtNomCorProdAc;
    private javax.swing.JTextField txtNomPro;
    private javax.swing.JTextField txtNomProAc;
    private javax.swing.JTextField txtPrecioProdu;
    private javax.swing.JTextField txtPrecioProdu1Ac;
    private javax.swing.JTextField txtStockMaxPro;
    private javax.swing.JTextField txtStockMaxProAc;
    private javax.swing.JTextField txtStockMinPro;
    private javax.swing.JTextField txtStockMinProAc;
    // End of variables declaration//GEN-END:variables
}
