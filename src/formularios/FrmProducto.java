/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JOptionPane;
import sesion2508.Producto;

/**
 *
 * @author labc205
 */
public class FrmProducto extends javax.swing.JFrame {
    
    private static int max = 3;
    Producto productos[] = new Producto[10];
    int i = 0;
    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblId = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblExistencia = new javax.swing.JLabel();
        jTfId = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jTfExistencia = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaRegistros = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        jLblId.setText("Codigo:");

        jLblNombre.setText("Nombre:");

        jLblPrecio.setText("Precio:");

        jLblExistencia.setText("Existencia:");

        jTfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfIdActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jTaRegistros.setColumns(20);
        jTaRegistros.setRows(5);
        jScrollPane1.setViewportView(jTaRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblExistencia)
                                    .addComponent(jLblPrecio))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblId)
                                .addGap(18, 18, 18)
                                .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnGuardar)
                        .addGap(63, 63, 63)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblId)
                    .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblPrecio)
                    .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblExistencia)
                    .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfIdActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTfIdActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
       
    }//GEN-LAST:event_jbtnLimpiarActionPerformed
    private void limpiar(){
       jTfId.setText("");
       jTfNombre.setText("");
       jTfPrecio.setText("");
       jTfExistencia.setText("");
       jTfId.requestFocus();
    }
    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jTfId.getText());
        String nombre = jTfNombre.getText();
        double precio = Double.parseDouble(jTfPrecio.getText());
        int exist = Integer.parseInt(jTfExistencia.getText());
        
        if ( i < max){
            
            Producto prod = new Producto(id, nombre, precio, exist);
            productos[i] = prod;
            i++;
            JOptionPane.showMessageDialog(this, "Producto Guardado", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            mostrarRegistros();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se puede agregar mas producto", "Error", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void mostrarRegistros(){
        String reg = "";
        for (int cont = 0; cont < i; cont++){
            reg+=productos[cont].toString();
        }
        jTaRegistros.setText(reg);
    }
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblExistencia;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTaRegistros;
    private javax.swing.JTextField jTfExistencia;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    // End of variables declaration//GEN-END:variables
}
