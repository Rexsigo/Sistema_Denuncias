/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_denuncias;

import Conexion.BD_Querys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author vallecillo
 */
public class frmPersona extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPersona
     */
    public frmPersona() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tb_Nombre = new javax.swing.JTextField();
        Tb_Identificacion = new javax.swing.JTextField();
        Bt_Aceptar = new javax.swing.JButton();
        Bt_Cancelar = new javax.swing.JButton();
        Cb_sexo = new javax.swing.JComboBox<>();
        Sp_Edad = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("frmPersona");

        jLabel1.setText("Nombre");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Sexo");

        jLabel4.setText("Edad");

        Tb_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tb_NombreActionPerformed(evt);
            }
        });

        Bt_Aceptar.setText("Aceptar");
        Bt_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_AceptarActionPerformed(evt);
            }
        });

        Bt_Cancelar.setText("Cancelar");
        Bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CancelarActionPerformed(evt);
            }
        });

        Cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino" }));

        Sp_Edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tb_Nombre)
                    .addComponent(Cb_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tb_Identificacion)
                    .addComponent(Sp_Edad))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Bt_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(Bt_Cancelar)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tb_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Sp_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Aceptar)
                    .addComponent(Bt_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tb_Nombre.getAccessibleContext().setAccessibleName("TbNombre");
        Tb_Identificacion.getAccessibleContext().setAccessibleName("TbIdentificacion");
        Cb_sexo.getAccessibleContext().setAccessibleName("CbSexo");
        Sp_Edad.getAccessibleContext().setAccessibleName("NudEdad");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_AceptarActionPerformed
       String nombre=Tb_Nombre.getText();
       String identificacion=Tb_Identificacion.getText();
       Object d= Cb_sexo.getSelectedItem(); 
        String sexo=String.valueOf(d);
      String edad=  Sp_Edad.getValue().toString();
        int id_denuncia=6;
        int retorno=0;
        
        if (nombre.equals(" ") || identificacion.equals(" ") || sexo.equals(" ") || edad.equals(" ")){
            JOptionPane.showMessageDialog(null,"Porfavor ingrese todos los datos" );
        }else{
       String insertar = "insert into victima values("+null+",'"+nombre+"','"+identificacion+"',"
               + "'"+sexo+"','"+edad+"','"+id_denuncia+"');";
       Conexion.Conexion.ejecutar_comando(insertar);
       if(retorno==0){
               JOptionPane.showMessageDialog(null,"No se han insertado correctamente los datos ");
            } else{
       
         Tb_Nombre.setText("");
         Tb_Identificacion.setText("");
         Sp_Edad.setValue("");
        JOptionPane.showMessageDialog(null,"Se han insertado los datos correctamente  ");
            }
       
        }
    }//GEN-LAST:event_Bt_AceptarActionPerformed

    private void Bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_Bt_CancelarActionPerformed

    private void Tb_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tb_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tb_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Aceptar;
    private javax.swing.JButton Bt_Cancelar;
    private javax.swing.JComboBox<String> Cb_sexo;
    private javax.swing.JSpinner Sp_Edad;
    private javax.swing.JTextField Tb_Identificacion;
    private javax.swing.JTextField Tb_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
