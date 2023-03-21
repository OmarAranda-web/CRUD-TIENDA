package View;

import Model.Familia_DB_Omar;
import Model.SetGet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omara
 */
public class FrmFamilia_Omar extends javax.swing.JFrame {

    DefaultTableModel modTabFamOmar = new DefaultTableModel();
    SetGet conexionFamiliaO = new SetGet();
    Familia_DB_Omar ejecuInstrucOmar = new Familia_DB_Omar();
    int id_familia;
    
    public FrmFamilia_Omar() {
        initComponents();
        mostrarFamOm();
    }
    private void mostrarFamOm(){
        ArrayList <SetGet> frmLista_Fam_Om=ejecuInstrucOmar.listar_Familia_Om();//Obtenemos nuestras familias de la base de datos
        modTabFamOmar = (DefaultTableModel) tablaFamilia.getModel();//Obtenemos el modelo de la tabla.
        Object llenar_Fami[] = new Object [3];
        //Recorremos todas las listas de la tabla y las llenaremos las columnas
        for (int i=0;i<frmLista_Fam_Om.size();i++){
            llenar_Fami [0]=frmLista_Fam_Om.get(i).getId();
            llenar_Fami [1]=frmLista_Fam_Om.get(i).getNombre();
            llenar_Fami [2]=frmLista_Fam_Om.get(i).getStatus();
            modTabFamOmar.addRow(llenar_Fami);//Añadimos una fila de familias con todos los datos de la familia
        }
        tablaFamilia.setModel(modTabFamOmar);//Mandamos el modelo lleno a la tabla
    }
    
    private void limpiarTabla(){
        for(int i=0; i<modTabFamOmar.getRowCount();i++){
            modTabFamOmar.removeRow(i);//Removemos cada registro.
            i--;//Decrementamos el nuemro de registros
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAgregarFam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarFam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFamilia = new javax.swing.JTable();
        txtActualizarFam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btbActualizarFam = new javax.swing.JButton();
        btnCamStatusFam = new javax.swing.JButton();
        jCbEstatusFam = new javax.swing.JComboBox<>();
        btnRegresarFam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Tablas de Familia");

        jLabel2.setText("Coloque la familia");

        btnAgregarFam.setText("Agregar");
        btnAgregarFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFamActionPerformed(evt);
            }
        });

        tablaFamilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Familia", "Estatus"
            }
        ));
        tablaFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFamiliaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFamilia);

        jLabel3.setText("Elemento a modificar");

        btbActualizarFam.setText("Actualizar");
        btbActualizarFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbActualizarFamActionPerformed(evt);
            }
        });

        btnCamStatusFam.setText("Cambiar Estatus");
        btnCamStatusFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamStatusFamActionPerformed(evt);
            }
        });

        jCbEstatusFam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        btnRegresarFam.setText("Regresar");
        btnRegresarFam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarFamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtAgregarFam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarFam, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtActualizarFam))
                                    .addComponent(jCbEstatusFam, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCamStatusFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btbActualizarFam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addComponent(btnRegresarFam, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregarFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarFam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActualizarFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbActualizarFam))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCamStatusFam)
                    .addComponent(jCbEstatusFam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarFam))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarFamActionPerformed
        new Main_Omar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarFamActionPerformed

    private void btnAgregarFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFamActionPerformed
        String familiaAgregar = txtAgregarFam.getText().toString();//Guardamos la marca agregar a una variable
        if(familiaAgregar.equals("")){
        }else{
        ejecuInstrucOmar.registrarFamilia(familiaAgregar);//Mandamos a llamar la instancia ejecutar Intruccion, el cual manda a llamar el metodo registrar marca
        limpiarTabla();//Limpiamos la tabla
        mostrarFamOm();//Cragamos la tabla con el mensaje nuevo 
        txtAgregarFam.setText("");//Limpiamos la caja de texo
        }
    }//GEN-LAST:event_btnAgregarFamActionPerformed

    private void btbActualizarFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbActualizarFamActionPerformed
        String descripcion_familia = txtActualizarFam.getText().toString();
        ejecuInstrucOmar.actualizarFamilia(descripcion_familia, id_familia);
        limpiarTabla();
        mostrarFamOm();
        txtActualizarFam.setText("");
    }//GEN-LAST:event_btbActualizarFamActionPerformed

    private void tablaFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFamiliaMouseClicked
        int fila=tablaFamilia.rowAtPoint(evt.getPoint());
        id_familia=(int) tablaFamilia.getValueAt(fila,0);
        txtActualizarFam.setText(tablaFamilia.getValueAt(fila,1).toString());
        jCbEstatusFam.setSelectedItem(tablaFamilia.getValueAt(fila,2));
    }//GEN-LAST:event_tablaFamiliaMouseClicked

    private void btnCamStatusFamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamStatusFamActionPerformed
        String statusfam=jCbEstatusFam.getSelectedItem().toString();
        ejecuInstrucOmar.estatusFamilia(id_familia, statusfam);
        limpiarTabla();
        mostrarFamOm();
    }//GEN-LAST:event_btnCamStatusFamActionPerformed


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
            java.util.logging.Logger.getLogger(FrmFamilia_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFamilia_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFamilia_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFamilia_Omar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFamilia_Omar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbActualizarFam;
    private javax.swing.JButton btnAgregarFam;
    private javax.swing.JButton btnCamStatusFam;
    private javax.swing.JButton btnRegresarFam;
    private javax.swing.JComboBox<String> jCbEstatusFam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFamilia;
    private javax.swing.JTextField txtActualizarFam;
    private javax.swing.JTextField txtAgregarFam;
    // End of variables declaration//GEN-END:variables
}
