package View;

import Model.Marca_DB_Omar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Model.SetGet;

public class FrmMarca_Omar extends javax.swing.JFrame {
    
    DefaultTableModel modTabMarcaOmar = new DefaultTableModel();
    SetGet conexionMarcaO = new SetGet();
    Marca_DB_Omar ejecuInstrucOmar = new Marca_DB_Omar();
    int id_marca;
    
    public FrmMarca_Omar() {
        initComponents();
        mostrarMarcasOm();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNomMarca = new javax.swing.JTextField();
        btnAgrMarca = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMarca = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnActualizarMarca = new javax.swing.JButton();
        txtActualizarMarca = new javax.swing.JTextField();
        btnCamstaBox = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmBoxStatusMarca = new javax.swing.JComboBox<>();
        btnRegresarMarca = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Tabla de Marcas");
        jLabel1.setToolTipText("");

        txtNomMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomMarcaActionPerformed(evt);
            }
        });

        btnAgrMarca.setText("Agregar");
        btnAgrMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgrMarcaActionPerformed(evt);
            }
        });

        tablaMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MARCA", "ESTATUS"
            }
        ));
        tablaMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMarcaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaMarca);

        jLabel2.setText("Ingrese una Marca");

        btnActualizarMarca.setText("Actualizar");
        btnActualizarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarMarcaActionPerformed(evt);
            }
        });

        txtActualizarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarMarcaActionPerformed(evt);
            }
        });

        btnCamstaBox.setText("Cambiar Estatus");
        btnCamstaBox.setActionCommand("Eliminar");
        btnCamstaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamstaBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Elemento a Modificar");

        cmBoxStatusMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));
        cmBoxStatusMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBoxStatusMarcaActionPerformed(evt);
            }
        });

        btnRegresarMarca.setText("Regresar");
        btnRegresarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(btnAgrMarca)))
                            .addComponent(txtActualizarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(124, 124, 124))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmBoxStatusMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(122, 122, 122)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCamstaBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresarMarca)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmBoxStatusMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgrMarca))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActualizarMarca)
                            .addComponent(jLabel4))
                        .addGap(3, 3, 3)
                        .addComponent(txtActualizarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCamstaBox)
                            .addComponent(btnRegresarMarca))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarMarcasOm(){
        ArrayList <SetGet> frmLista_Marcas_Om=ejecuInstrucOmar.listar_Marcas_Om();//Obtenemos nuestras marcas de la base de datos
        modTabMarcaOmar = (DefaultTableModel) tablaMarca.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_Marca[] = new Object [3];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_Marcas_Om.size();i++){
            llenar_Marca [0]=frmLista_Marcas_Om.get(i).getId();
            llenar_Marca [1]=frmLista_Marcas_Om.get(i).getNombre();
            llenar_Marca [2]=frmLista_Marcas_Om.get(i).getStatus();
            modTabMarcaOmar.addRow(llenar_Marca);//Añadimos una fila de marcas con todos los datos de la Marca
        }
        tablaMarca.setModel(modTabMarcaOmar);//Mandamos el modelo lleno a la tabla
    }
    private void txtNomMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomMarcaActionPerformed

    private void btnAgrMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgrMarcaActionPerformed
        String marcaAgregar = txtNomMarca.getText().toString();//Guardamos la marca agregar a una variable
        if(marcaAgregar.equals("")){
        }else{
        ejecuInstrucOmar.registrarMarca(marcaAgregar);//Mandamos a llamar la instancia ejecutar Intruccion, el cual manda a llamar el metodo registrar marca
        limpiarTabla();//Limpiamos la tabla
        mostrarMarcasOm();//Cragamos la tabla con el mnesaje nuevo 
        txtNomMarca.setText("");//Limpiamos la caja de texo
        }
    }//GEN-LAST:event_btnAgrMarcaActionPerformed

    private void txtActualizarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarMarcaActionPerformed

    private void btnCamstaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamstaBoxActionPerformed
       
        String statusmar=cmBoxStatusMarca.getSelectedItem().toString();
        ejecuInstrucOmar.estatusMarca(id_marca, statusmar);
        limpiarTabla();
        mostrarMarcasOm();
    }//GEN-LAST:event_btnCamstaBoxActionPerformed

    private void tablaMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMarcaMouseClicked
        int fila=tablaMarca.rowAtPoint(evt.getPoint());
        id_marca=(int) tablaMarca.getValueAt(fila,0);
        txtActualizarMarca.setText(tablaMarca.getValueAt(fila,1).toString());
        cmBoxStatusMarca.setSelectedItem(tablaMarca.getValueAt(fila,2));
    }//GEN-LAST:event_tablaMarcaMouseClicked

    private void btnActualizarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarMarcaActionPerformed
        String nombre_Marca = txtActualizarMarca.getText().toString();
        ejecuInstrucOmar.actualizarMarca(nombre_Marca, id_marca);
        limpiarTabla();
        mostrarMarcasOm();
        txtActualizarMarca.setText("");
    }//GEN-LAST:event_btnActualizarMarcaActionPerformed

    private void btnRegresarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMarcaActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMarcaActionPerformed

    private void cmBoxStatusMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxStatusMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmBoxStatusMarcaActionPerformed
    //Metodo para actualizar la tabla
    private void limpiarTabla(){
        for(int i=0; i<modTabMarcaOmar.getRowCount();i++){
            modTabMarcaOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
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
            java.util.logging.Logger.getLogger(SetGet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetGet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetGet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetGet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMarca_Omar().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarMarca;
    private javax.swing.JButton btnAgrMarca;
    private javax.swing.JButton btnCamstaBox;
    private javax.swing.JButton btnRegresarMarca;
    private javax.swing.JComboBox<String> cmBoxStatusMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaMarca;
    private javax.swing.JTextField txtActualizarMarca;
    private javax.swing.JTextField txtNomMarca;
    // End of variables declaration//GEN-END:variables
}
