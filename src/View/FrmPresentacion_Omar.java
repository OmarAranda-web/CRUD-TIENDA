package View;

import Model.Presentacion_DB_Omar;
import Model.SetGet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class FrmPresentacion_Omar extends javax.swing.JFrame {
    DefaultTableModel modTabPresenOmar = new DefaultTableModel();
    SetGet conexionPresentacionO = new SetGet();
    Presentacion_DB_Omar ejecuInstrucOmar = new Presentacion_DB_Omar();
    int id_presentacion;
    public FrmPresentacion_Omar() {
        initComponents();
        mostrarPresenOm();
    }
    private void mostrarPresenOm(){
        ArrayList <SetGet> frmLista_Presenta_Om=ejecuInstrucOmar.listar_Presentacion_Om();//Obtenemos nuestras presentaciones de la base de datos
        modTabPresenOmar = (DefaultTableModel) tablePre.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_Presenta[] = new Object [3];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_Presenta_Om.size();i++){
            llenar_Presenta [0]=frmLista_Presenta_Om.get(i).getId();
            llenar_Presenta [1]=frmLista_Presenta_Om.get(i).getNombre();
            llenar_Presenta [2]=frmLista_Presenta_Om.get(i).getStatus();
            modTabPresenOmar.addRow(llenar_Presenta);//Añadimos una fila de presentacion con todos los datos de la presentacion
        }
        tablePre.setModel(modTabPresenOmar);//Mandamos el modelo lleno a la tabla
    }
    
    private void limpiarTabla(){
        for(int i=0; i<modTabPresenOmar.getRowCount();i++){
            modTabPresenOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAgrePresentacion = new javax.swing.JTextField();
        btnAgregarPresentacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePre = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtActualizarPresentacion = new javax.swing.JTextField();
        jCmbEstatusPre = new javax.swing.JComboBox<>();
        btnActualizarPre = new javax.swing.JButton();
        btnEstatusPre = new javax.swing.JButton();
        btnRegresarPre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tabla Presentacion");

        jLabel2.setText("Ingrese Presentacion");

        btnAgregarPresentacion.setText("Agregar");
        btnAgregarPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPresentacionActionPerformed(evt);
            }
        });

        tablePre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Presentacion", "Estatus"
            }
        ));
        tablePre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePreMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePre);

        jLabel3.setText("Elemento a modificar");

        jCmbEstatusPre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        jCmbEstatusPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbEstatusPreActionPerformed(evt);
            }
        });

        btnActualizarPre.setText("Actulizar");
        btnActualizarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPreActionPerformed(evt);
            }
        });

        btnEstatusPre.setText("Cambiar Estatus");
        btnEstatusPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstatusPreActionPerformed(evt);
            }
        });

        btnRegresarPre.setText("Regresar");
        btnRegresarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarPreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAgrePresentacion))
                        .addGap(55, 55, 55)
                        .addComponent(btnAgregarPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtActualizarPresentacion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCmbEstatusPre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizarPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstatusPre, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(btnRegresarPre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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
                    .addComponent(txtAgrePresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPresentacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtActualizarPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnActualizarPre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbEstatusPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstatusPre)
                    .addComponent(btnRegresarPre))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarPreActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarPreActionPerformed

    private void btnAgregarPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPresentacionActionPerformed
        String presentaAgregar = txtAgrePresentacion.getText().toString();//Guardamos la marca agregar a una variable
        if(presentaAgregar.equals("")){
        }else{
        ejecuInstrucOmar.registrarPresenta(presentaAgregar);//Mandamos a llamar la instancia ejecutar Intruccion, el cual manda a llamar el metodo registrar marca
        limpiarTabla();//Limpiamos la tabla
        mostrarPresenOm();//Cragamos la tabla con el mnesaje nuevo 
        txtAgrePresentacion.setText("");//Limpiamos la caja de texo
        }
    }//GEN-LAST:event_btnAgregarPresentacionActionPerformed

    private void btnActualizarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPreActionPerformed
        String descripcion_Presen = txtActualizarPresentacion.getText().toString();
        ejecuInstrucOmar.actualizarPresenta(descripcion_Presen, id_presentacion);
        limpiarTabla();
        mostrarPresenOm();
        txtActualizarPresentacion.setText("");
    }//GEN-LAST:event_btnActualizarPreActionPerformed

    private void jCmbEstatusPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbEstatusPreActionPerformed
        
    }//GEN-LAST:event_jCmbEstatusPreActionPerformed

    private void tablePreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePreMouseClicked
        int fila=tablePre.rowAtPoint(evt.getPoint());
        id_presentacion=(int) tablePre.getValueAt(fila,0);
        txtActualizarPresentacion.setText(tablePre.getValueAt(fila,1).toString());
        jCmbEstatusPre.setSelectedItem(tablePre.getValueAt(fila,2));
    }//GEN-LAST:event_tablePreMouseClicked

    private void btnEstatusPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstatusPreActionPerformed
       String statuspresen=jCmbEstatusPre.getSelectedItem().toString();
        ejecuInstrucOmar.estatusPresen(id_presentacion, statuspresen);
        limpiarTabla();
        mostrarPresenOm();
    }//GEN-LAST:event_btnEstatusPreActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPresentacion_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPresentacion_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPresentacion_Omar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPre;
    private javax.swing.JButton btnAgregarPresentacion;
    private javax.swing.JButton btnEstatusPre;
    private javax.swing.JButton btnRegresarPre;
    private javax.swing.JComboBox<String> jCmbEstatusPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePre;
    private javax.swing.JTextField txtActualizarPresentacion;
    private javax.swing.JTextField txtAgrePresentacion;
    // End of variables declaration//GEN-END:variables
}
