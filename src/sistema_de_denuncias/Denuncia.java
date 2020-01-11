/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_de_denuncias;

import Conexion.Conexion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sistema_de_denuncias.Form_Denuncia.actualizado;

/**
 *
 * @author Robyng
 */
public class Denuncia extends javax.swing.JInternalFrame{

    /**
     * Creates new form Denuncia
     */
    public Denuncia() {
        initComponents();
        actualizar_combo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox7 = new javax.swing.JComboBox();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        cb_tipo_de_delito = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_lugar_afectado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_direccion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cb_lugar = new javax.swing.JComboBox();
        cb_municipio = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_territorio = new javax.swing.JComboBox();
        CkbRangoFecha = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dc_fecha_del_delito = new datechooser.beans.DateChooserCombo();
        jThora = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_sitesis = new javax.swing.JTextArea();
        bt_siguiente = new javax.swing.JButton();

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(153, 153, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Denuncia");

        cb_tipo_de_delito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipo_de_delitoItemStateChanged(evt);
            }
        });
        cb_tipo_de_delito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipo_de_delito_CheckedChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Delito:");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Lugar Afectado:");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("Estado:");

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "OCURRIDO", "Item 2", "Item 3", "Item 4" }));

        ta_direccion.setColumns(20);
        ta_direccion.setRows(5);
        jScrollPane1.setViewportView(ta_direccion);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(1, 1, 1)), "Localización", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 1));
        jPanel1.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Municipio:");

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel8.setText("Territorio:");

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setText("Lugar:");

        cb_territorio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_lugar, 0, 148, Short.MAX_VALUE)
                    .addComponent(cb_municipio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_territorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_territorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(204, 204, 204))
        );

        CkbRangoFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha/Hora del Delito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        CkbRangoFecha.setForeground(new java.awt.Color(0, 0, 1));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel7.setText("Hora:");

        javax.swing.GroupLayout CkbRangoFechaLayout = new javax.swing.GroupLayout(CkbRangoFecha);
        CkbRangoFecha.setLayout(CkbRangoFechaLayout);
        CkbRangoFechaLayout.setHorizontalGroup(
            CkbRangoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CkbRangoFechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CkbRangoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CkbRangoFechaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(dc_fecha_del_delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CkbRangoFechaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jThora)))
                .addContainerGap())
        );
        CkbRangoFechaLayout.setVerticalGroup(
            CkbRangoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CkbRangoFechaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CkbRangoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dc_fecha_del_delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(CkbRangoFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jThora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel10.setText("Ingrese los Datos de la Denuncia");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Síntesis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N

        ta_sitesis.setColumns(20);
        ta_sitesis.setRows(5);
        jScrollPane2.setViewportView(ta_sitesis);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        bt_siguiente.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        bt_siguiente.setText("Siguiente>>");
        bt_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siguiente_Click(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CkbRangoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bt_siguiente)
                                .addGap(43, 43, 43))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_lugar_afectado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_tipo_de_delito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo_de_delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_lugar_afectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CkbRangoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_tipo_de_delito_CheckedChanged(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipo_de_delito_CheckedChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipo_de_delito_CheckedChanged

    private void Siguiente_Click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siguiente_Click
        // TODO add your handling code here:
        
        int tipo_delito=1;
        String direccion=ta_direccion.getText();
        int lugar_afectado=1; 
        Object e = cb_estado.getSelectedItem(); 
        String estado=String.valueOf(e);
        Object d= cb_municipio.getSelectedItem(); 
        String municipio=String.valueOf(d);
        Object s = cb_territorio.getSelectedItem(); 
        String territorio=String.valueOf(s);
        Object o = cb_lugar.getSelectedItem(); 
        String lugar=String.valueOf(o);
        String fecha=dc_fecha_del_delito.getText();
        String hora=jThora.getText();
        
        String sintesis=ta_sitesis.getText();
        String fechahora="2016-06-26"+" 02:23:12";
         int cf=0,cm=0,cd=0,retorno;
         int ifk=2; 
         if(sintesis==null){
             JOptionPane.showMessageDialog(null, sintesis);
                      }
         if (direccion.equals(" ") || estado.equals(" ") || municipio.equals(" ") || territorio.equals(" ") || fecha.equals(" ") || hora.equals(" ") || sintesis.equals(" ") ){
             JOptionPane.showMessageDialog(null, "Porfavor ingrese todos los datos");
         }else{
         String insertar = "insert into denuncia values("+null+",'"+fechahora+"','"+estado+"','"+direccion+"',"
                        + "'"+sintesis+"','"+cf+"','"+cm+"','"+cd+"','"+1+"',"
                        + "'"+lugar_afectado+"','"+tipo_delito+"');";
            
            retorno = Conexion.ejecutar_comando(insertar);
               if(retorno==0){
               JOptionPane.showMessageDialog(null,"No se han insertado correctamente los datos ");
            } else{
                   ta_direccion.setText("");
                   jThora.setText("");
                   ta_sitesis.setText(" ");
                JOptionPane.showMessageDialog(null,"Se han insertado los datos correctamente  ");
                
                
            }
        
        frmDatosPresuntoAutor autor = new frmDatosPresuntoAutor();
        this.getDesktopPane().add(autor);
        autor.show();}
    }//GEN-LAST:event_Siguiente_Click

    private void actualizar_combo(){
                if(!actualizado){
            actualizado = true;
            ArrayList<ArrayList<String>> dato_delito = new ArrayList<ArrayList<String>>();
            ArrayList<ArrayList<String>> dato_lugar = new ArrayList<ArrayList<String>>();
            ArrayList<ArrayList<String>> dato_localidad = new ArrayList<ArrayList<String>>();
            ArrayList<ArrayList<String>> dato_municipio = new ArrayList<ArrayList<String>>();
            
            /*Consultamos por el usuario logueado*/
            String consulta_delito = "SELECT NombreTipoDelito FROM delitotipo;";
            String consulta_lugar = "SELECT NombreTipoLugar FROM TipoLugar;";
            String consulta_localidad = "SELECT NombreLocalidad FROM Localidad;";
            String consulta_municipio = "SELECT Municipio FROM Localidad;";
            
            dato_delito = Conexion.ejecutar_consulta(consulta_delito);
            
            if(!dato_delito.isEmpty()){
                Iterator<ArrayList<String>> nombreIterator = dato_delito.iterator();
                while(nombreIterator.hasNext()){
                    ArrayList<String> datos_especificos = nombreIterator.next();
                    Iterator<String> datos_individuales = datos_especificos.iterator();
                    while(datos_individuales.hasNext()){
                      String cadena_dato = datos_individuales.next();
                      System.out.println(cadena_dato + " /");
                      cb_tipo_de_delito.addItem(cadena_dato);
                    }
                
                }
            
                
            } else{
                return;
            }
            
            dato_lugar = Conexion.ejecutar_consulta(consulta_lugar);
            if(!dato_lugar.isEmpty()){
                Iterator<ArrayList<String>> nombreIterator = dato_lugar.iterator();
                while(nombreIterator.hasNext()){
                    ArrayList<String> datos_especificos = nombreIterator.next();
                    Iterator<String> datos_individuales = datos_especificos.iterator();
                    while(datos_individuales.hasNext()){
                      String cadena_lugar = datos_individuales.next();
                      System.out.println(cadena_lugar + " /");
                      cb_lugar_afectado.addItem(cadena_lugar);
                    }
                
                }
            
                
            } else{
                return;
            }
            
            dato_localidad = Conexion.ejecutar_consulta(consulta_localidad);
            if(!dato_localidad.isEmpty()){
                Iterator<ArrayList<String>> nombreIterator = dato_localidad.iterator();
                while(nombreIterator.hasNext()){
                    ArrayList<String> datos_especificos = nombreIterator.next();
                    Iterator<String> datos_individuales = datos_especificos.iterator();
                    while(datos_individuales.hasNext()){
                      String cadena_lugar = datos_individuales.next();
                      System.out.println(cadena_lugar + " /");
                      cb_lugar.addItem(cadena_lugar);
                    }
                
                }
            
                
            } else{
                return;
            }
            
            dato_municipio = Conexion.ejecutar_consulta(consulta_municipio);
            if(!dato_municipio.isEmpty()){
                Iterator<ArrayList<String>> nombreIterator = dato_municipio.iterator();
                while(nombreIterator.hasNext()){
                    ArrayList<String> datos_especificos = nombreIterator.next();
                    Iterator<String> datos_individuales = datos_especificos.iterator();
                    while(datos_individuales.hasNext()){
                      String cadena_lugar = datos_individuales.next();
                      System.out.println(cadena_lugar + " /");
                      cb_municipio.addItem(cadena_lugar);
                    }
                
                }
            
                
            } else{
                return;
            }
            
            
        } else {
            return;
        }
    }
    
    private void cb_tipo_de_delitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipo_de_delitoItemStateChanged
        // TODO add your handling code here:
        actualizar_combo();
    }//GEN-LAST:event_cb_tipo_de_delitoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CkbRangoFecha;
    private javax.swing.JButton bt_siguiente;
    private javax.swing.JComboBox cb_estado;
    private javax.swing.JComboBox cb_lugar;
    private javax.swing.JComboBox cb_lugar_afectado;
    private javax.swing.JComboBox cb_municipio;
    private javax.swing.JComboBox cb_territorio;
    private javax.swing.JComboBox cb_tipo_de_delito;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dc_fecha_del_delito;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jThora;
    private javax.swing.JTextArea ta_direccion;
    private javax.swing.JTextArea ta_sitesis;
    // End of variables declaration//GEN-END:variables
}