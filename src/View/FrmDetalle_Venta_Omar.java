/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Detalle_Venta_DB_Omar;
import Model.SetGet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class FrmDetalle_Venta_Omar extends javax.swing.JFrame {

    DefaultTableModel modTabDVOmar = new DefaultTableModel();
    SetGet conexionDVdO = new SetGet();
    Detalle_Venta_DB_Omar ejecuInstrucOmar = new Detalle_Venta_DB_Omar();
    int id_DV;
    
    public FrmDetalle_Venta_Omar() {
        initComponents();
        mostrarDVOm();
        ejecuInstrucOmar.consulClave(jComboClave_DV);
        ejecuInstrucOmar.consulFolio(jComboFolioV_DV);
        ejecuInstrucOmar.consulClave(jComboClave_DVac);
        ejecuInstrucOmar.consulFolio(jComboFolioV_DVac);
        
    }
    private void mostrarDVOm(){
        ArrayList <SetGet> frmLista_DV_Om=ejecuInstrucOmar.listar_DV_Om();//Obtenemos nuestras familias de la base de datos
        modTabDVOmar = (DefaultTableModel) tabla_DV.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_DV[] = new Object [7];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_DV_Om.size();i++){
            llenar_DV [0]=frmLista_DV_Om.get(i).getId();
            llenar_DV [1]=frmLista_DV_Om.get(i).getFolioV();
            llenar_DV [2]=frmLista_DV_Om.get(i).getClave();
            llenar_DV [3]=frmLista_DV_Om.get(i).getCantidaVen();
            llenar_DV [4]=frmLista_DV_Om.get(i).getPrecioVen();
            llenar_DV [5]=frmLista_DV_Om.get(i).getTotalVen();
            llenar_DV [6]=frmLista_DV_Om.get(i).getDescVen();
            modTabDVOmar.addRow(llenar_DV);//Añadimos una fila de familias con todos los datos de la familia
        }
        tabla_DV.setModel(modTabDVOmar);//Mandamos el modelo lleno a la tabla
    }
    
    private void limpiarTabla(){
        for(int i=0; i<modTabDVOmar.getRowCount();i++){
            modTabDVOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jComboPresentaProdu = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboFamProd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboFolioV_DV = new javax.swing.JComboBox<>();
        jComboClave_DV = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCantVen_DV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecVen_DV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalCP_DV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDesc_DV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_DV = new javax.swing.JTable();
        btnAgregar_DV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboFolioV_DVac = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboClave_DVac = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCantVen_DVac = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrecVen_DVac = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotalCP_DVac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDesc_DVac = new javax.swing.JTextField();
        btnActualizar_DV1 = new javax.swing.JButton();
        btnRegresar_DV = new javax.swing.JButton();

        jLabel13.setText("Presentacion");

        jComboPresentaProdu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Familia");

        jComboFamProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tabla de Detalles de Ventas");

        jLabel2.setText("Coloque los detalles de venta");

        jLabel3.setText("Folio de Venta");

        jLabel4.setText("Clave del Producto");

        jLabel5.setText("Cantidad de venta");

        jLabel6.setText("Precio de Venta");

        txtPrecVen_DV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecVen_DVActionPerformed(evt);
            }
        });

        jLabel7.setText("Total CP");

        jLabel8.setText("Descuento ");

        tabla_DV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Folio de Venta", "Clave del Producto", "Cantidad Vendida", "Precio de Venta", "Total CP", "Descuento"
            }
        ));
        tabla_DV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_DVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_DV);

        btnAgregar_DV.setText("Agregar");
        btnAgregar_DV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar_DVActionPerformed(evt);
            }
        });

        jLabel9.setText("Folio de Venta");

        jLabel10.setText("Clave del Producto");

        jLabel11.setText("Cantidad de venta");

        jLabel12.setText("Precio de Venta");

        txtPrecVen_DVac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecVen_DVacActionPerformed(evt);
            }
        });

        jLabel15.setText("Total CP");

        jLabel16.setText("Descuento ");

        btnActualizar_DV1.setText("Actualizar");
        btnActualizar_DV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar_DV1ActionPerformed(evt);
            }
        });

        btnRegresar_DV.setText("Regresar");
        btnRegresar_DV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar_DVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jComboFolioV_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboClave_DV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCantVen_DV)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecVen_DV))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txtTotalCP_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDesc_DV))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregar_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboFolioV_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboClave_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCantVen_DVac)
                                    .addComponent(jLabel11))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPrecVen_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtTotalCP_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDesc_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar_DV1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboFolioV_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboClave_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantVen_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecVen_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCP_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc_DV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar_DV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboFolioV_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboClave_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantVen_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecVen_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalCP_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc_DVac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar_DV1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar_DV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecVen_DVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecVen_DVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecVen_DVActionPerformed

    private void txtPrecVen_DVacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecVen_DVacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecVen_DVacActionPerformed

    private void btnRegresar_DVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar_DVActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresar_DVActionPerformed

    private void btnAgregar_DVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar_DVActionPerformed
        
        String folioVenDVAgre=jComboFolioV_DV.getSelectedItem().toString();
        String claveDVAgre=jComboClave_DV.getSelectedItem().toString();
        String cantiVenDVAgre = txtCantVen_DV.getText().toString();
        String precioVeNDVAgre = txtPrecVen_DV.getText().toString();
        String total_CPDVAgre = txtTotalCP_DV.getText().toString();
        String desc_DVAgre=txtDesc_DV.getText().toString();
        
        ejecuInstrucOmar.registrarDV(Integer.valueOf(folioVenDVAgre), claveDVAgre, Float.valueOf(cantiVenDVAgre), Float.valueOf(precioVeNDVAgre), Float.valueOf(total_CPDVAgre), Float.valueOf(desc_DVAgre));
        limpiarTabla();
        mostrarDVOm();
        jComboFolioV_DV.setSelectedIndex(0);
        jComboClave_DV.setSelectedIndex(0);
        txtCantVen_DV.setText("");
        txtPrecVen_DV.setText("");
        txtTotalCP_DV.setText("");
        txtDesc_DV.setText("");
    }//GEN-LAST:event_btnAgregar_DVActionPerformed

    private void tabla_DVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_DVMouseClicked
        int fila=tabla_DV.rowAtPoint(evt.getPoint());
        id_DV=(int) tabla_DV.getValueAt(fila,0);
        jComboFolioV_DVac.setSelectedItem(tabla_DV.getValueAt(fila, 1).toString());
        jComboClave_DVac.setSelectedItem(tabla_DV.getValueAt(fila, 2).toString());
        txtCantVen_DVac.setText(tabla_DV.getValueAt(fila, 3).toString());
        txtPrecVen_DVac.setText(tabla_DV.getValueAt(fila,4).toString());
        txtTotalCP_DVac.setText(tabla_DV.getValueAt(fila, 5).toString());
        txtDesc_DVac.setText(tabla_DV.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_tabla_DVMouseClicked

    private void btnActualizar_DV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar_DV1ActionPerformed
        String folioVenDVAgreAC=jComboFolioV_DVac.getSelectedItem().toString();
        String claveDVAgreAc=jComboClave_DVac.getSelectedItem().toString();
        String cantiVenDVAgreAc = txtCantVen_DVac.getText().toString();
        String precioVeNDVAgreAc = txtPrecVen_DVac.getText().toString();
        String total_CPDVAgreAc = txtTotalCP_DVac.getText().toString();
        String desc_DVAgreAc=txtDesc_DVac.getText().toString();
        
        ejecuInstrucOmar.actualizar_DV(Integer.valueOf(folioVenDVAgreAC), claveDVAgreAc, Float.valueOf(cantiVenDVAgreAc), Float.valueOf(precioVeNDVAgreAc), Float.valueOf(total_CPDVAgreAc), Float.valueOf(desc_DVAgreAc),id_DV);
        limpiarTabla();
        mostrarDVOm();
        jComboFolioV_DVac.setSelectedIndex(0);
        jComboClave_DVac.setSelectedIndex(0);
        txtCantVen_DVac.setText("");
        txtPrecVen_DVac.setText("");
        txtTotalCP_DVac.setText("");
        txtDesc_DVac.setText("");
    }//GEN-LAST:event_btnActualizar_DV1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDetalle_Venta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDetalle_Venta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDetalle_Venta_Omar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar_DV1;
    private javax.swing.JButton btnAgregar_DV;
    private javax.swing.JButton btnRegresar_DV;
    private javax.swing.JComboBox<String> jComboClave_DV;
    private javax.swing.JComboBox<String> jComboClave_DVac;
    private javax.swing.JComboBox<String> jComboFamProd;
    private javax.swing.JComboBox<String> jComboFolioV_DV;
    private javax.swing.JComboBox<String> jComboFolioV_DVac;
    private javax.swing.JComboBox<String> jComboPresentaProdu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_DV;
    private javax.swing.JTextField txtCantVen_DV;
    private javax.swing.JTextField txtCantVen_DVac;
    private javax.swing.JTextField txtDesc_DV;
    private javax.swing.JTextField txtDesc_DVac;
    private javax.swing.JTextField txtPrecVen_DV;
    private javax.swing.JTextField txtPrecVen_DVac;
    private javax.swing.JTextField txtTotalCP_DV;
    private javax.swing.JTextField txtTotalCP_DVac;
    // End of variables declaration//GEN-END:variables
}
