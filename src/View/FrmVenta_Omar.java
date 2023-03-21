package View;

import Model.SetGet;
import Model.Venta_DB_Omar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class FrmVenta_Omar extends javax.swing.JFrame {

    DefaultTableModel modTabVenOmar = new DefaultTableModel();
    SetGet conexionVentaO = new SetGet();
    Venta_DB_Omar ejecuInstrucOmar = new Venta_DB_Omar();
    int id_venta;
    //float total_venta, precio_venta, desc_Venta;
    
    public FrmVenta_Omar() {
        initComponents();
        mostrarVenOm();
    }
    
    private void mostrarVenOm(){
        ArrayList <SetGet> frmLista_Ven_Om=ejecuInstrucOmar.listar_Venta_Om();//Obtenemos nuestras familias de la base de datos
        modTabVenOmar = (DefaultTableModel) tablaVenta.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_Venta[] = new Object [5];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_Ven_Om.size();i++){
            llenar_Venta [0]=frmLista_Ven_Om.get(i).getId();
            llenar_Venta [1]=frmLista_Ven_Om.get(i).getFechaHora();
            llenar_Venta [2]=frmLista_Ven_Om.get(i).getTotalVen();
            llenar_Venta [3]=frmLista_Ven_Om.get(i).getPrecioVen();
            llenar_Venta [4]=frmLista_Ven_Om.get(i).getDescVen();
            modTabVenOmar.addRow(llenar_Venta);//Añadimos una fila de familias con todos los datos de la familia
        }
        tablaVenta.setModel(modTabVenOmar);//Mandamos el modelo lleno a la tabla
    }
    
    private void limpiarTabla(){
        for(int i=0; i<modTabVenOmar.getRowCount();i++){
            modTabVenOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JButton();
        txtTotalVen = new javax.swing.JTextField();
        txtPrecioVen = new javax.swing.JTextField();
        txtDescuentoVen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        txtActualizarToVen = new javax.swing.JTextField();
        txtActualizarPreVen = new javax.swing.JTextField();
        txtActulizarDescVen = new javax.swing.JTextField();
        btnActualizarVen = new javax.swing.JButton();
        btnRegresarVen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tablas de Ventas");

        jLabel2.setText("Agregue venta");

        jLabel3.setText("Total de Venta");

        jLabel4.setText("Precio de Venta");

        jLabel5.setText("Descuento");

        btnAgregarVenta.setText("Agregar");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });

        txtTotalVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVenActionPerformed(evt);
            }
        });

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio de Venta", "Fecha y Hora de Venta", "Total Venta", "Precio Venta", "Descuento Venta"
            }
        ));
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        btnActualizarVen.setText("Actualiizar");
        btnActualizarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVenActionPerformed(evt);
            }
        });

        btnRegresarVen.setText("Regresar");
        btnRegresarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresarVen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(txtTotalVen)
                                .addComponent(jLabel2)
                                .addComponent(txtActualizarToVen, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPrecioVen)
                                        .addComponent(txtActualizarPreVen, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDescuentoVen)
                                                .addComponent(txtActulizarDescVen, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                            .addGap(66, 66, 66)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnAgregarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnActualizarVen, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(214, 214, 214)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescuentoVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarVenta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizarToVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActualizarPreVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActulizarDescVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarVen))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresarVen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVenActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
        String totalVenAgregar = txtTotalVen.getText();//Guardamos la marca agregar a una variable
        String precioVenAgregar = txtPrecioVen.getText();
        String descVenAgregar = txtDescuentoVen.getText();
        if(totalVenAgregar.equals("") || precioVenAgregar.equals("") || descVenAgregar.equals("")){
        }else{
        ejecuInstrucOmar.registrarVenta(Float.valueOf(totalVenAgregar),Float.valueOf(precioVenAgregar),Float.valueOf(descVenAgregar));//Mandamos a llamar la instancia ejecutar Intruccion, el cual manda a llamar el metodo registrar marca
        limpiarTabla();//Limpiamos la tabla
        mostrarVenOm();//Cragamos la tabla con el mensaje nuevo 
        txtTotalVen.setText("");//Limpiamos la caja de texo
        txtPrecioVen.setText("");
        txtDescuentoVen.setText("");
        }
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnActualizarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVenActionPerformed
        String acTotalVen = txtActualizarToVen.getText();
        String acPreVen = txtActualizarPreVen.getText();
        String acDescVen = txtActulizarDescVen.getText();      
        ejecuInstrucOmar.actualizarVenta(Float.valueOf(acTotalVen), Float.valueOf(acPreVen),Float.valueOf(acDescVen), id_venta);
        limpiarTabla();
        mostrarVenOm();
        txtActualizarToVen.setText("");
        txtActualizarPreVen.setText("");
        txtActulizarDescVen.setText("");
    }//GEN-LAST:event_btnActualizarVenActionPerformed

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        int fila=tablaVenta.rowAtPoint(evt.getPoint());
        id_venta=(int) tablaVenta.getValueAt(fila,0);
        txtActualizarToVen.setText(tablaVenta.getValueAt(fila,2).toString());
        txtActualizarPreVen.setText(tablaVenta.getValueAt(fila,3).toString());
        txtActulizarDescVen.setText(tablaVenta.getValueAt(fila,4).toString());
    }//GEN-LAST:event_tablaVentaMouseClicked

    private void btnRegresarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVenActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarVenActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVenta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenta_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta_Omar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarVen;
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnRegresarVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtActualizarPreVen;
    private javax.swing.JTextField txtActualizarToVen;
    private javax.swing.JTextField txtActulizarDescVen;
    private javax.swing.JTextField txtDescuentoVen;
    private javax.swing.JTextField txtPrecioVen;
    private javax.swing.JTextField txtTotalVen;
    // End of variables declaration//GEN-END:variables
}
