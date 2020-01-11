
package sistema_de_denuncias;
import Conexion.Conexion;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

public class Form_Denuncia extends javax.swing.JInternalFrame {

    public Form_Denuncia() {
        initComponents();
        actualizar_datos_combo();
    }

   public static boolean actualizado = false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_tipo_delito = new javax.swing.JLabel();
        lb_tipo_lugar = new javax.swing.JLabel();
        lb_estado = new javax.swing.JLabel();
        cb_tipo_delito = new javax.swing.JComboBox();
        cb_lugar = new javax.swing.JComboBox();
        cb_estado = new javax.swing.JComboBox();
        lb_municipio = new javax.swing.JLabel();
        lb_localidad = new javax.swing.JLabel();
        tb_municipio = new javax.swing.JTextField();
        tb_localidad = new javax.swing.JTextField();
        min_max_distrito = new javax.swing.JSpinner();
        bt_buscar = new javax.swing.JToggleButton();
        bt_agregar_denuncia = new javax.swing.JButton();
        bt_modificar_denuncia = new javax.swing.JButton();
        bt_eliminar_denuncia = new javax.swing.JButton();
        gb_fechas = new javax.swing.JPanel();
        lb_fecha_inicial = new javax.swing.JLabel();
        lb_fecha_final = new javax.swing.JLabel();
        dc_fecha_inicial = new datechooser.beans.DateChooserCombo();
        dc_fecha_final = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        dg_resultados = new javax.swing.JTable();
        ckb_distrito = new javax.swing.JCheckBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);

        lb_tipo_delito.setText("Tipo de delito");

        lb_tipo_lugar.setText("Tipo de lugar ");

        lb_estado.setText("Estado");

        cb_tipo_delito.setEditable(true);
        cb_tipo_delito.setToolTipText("Armas");
        cb_tipo_delito.setToolTipText("");
        cb_tipo_delito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipo_delitoItemStateChanged(evt);
            }
        });

        cb_lugar.setEditable(true);
        cb_lugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_lugarItemStateChanged(evt);
            }
        });

        cb_estado.setEditable(true);
        cb_estado.setToolTipText("");

        lb_municipio.setText("Municipio");

        lb_localidad.setText("Localidad");

        min_max_distrito.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        min_max_distrito.setEnabled(false);

        bt_buscar.setText("Buscar denuncias");
        bt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_denuncias_clic(evt);
            }
        });

        bt_agregar_denuncia.setText("Agregar denuncia");
        bt_agregar_denuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregar_denunciaActionPerformed(evt);
            }
        });

        bt_modificar_denuncia.setText("Modificar denuncia ");

        bt_eliminar_denuncia.setText("Eliminar denuncia");

        gb_fechas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("eve"), "Rango de fechas"));

        lb_fecha_inicial.setText("Fecha inicial ");

        lb_fecha_final.setText("Fecha final");

        javax.swing.GroupLayout gb_fechasLayout = new javax.swing.GroupLayout(gb_fechas);
        gb_fechas.setLayout(gb_fechasLayout);
        gb_fechasLayout.setHorizontalGroup(
            gb_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gb_fechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gb_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gb_fechasLayout.createSequentialGroup()
                        .addComponent(lb_fecha_final)
                        .addGap(18, 18, 18)
                        .addComponent(dc_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(gb_fechasLayout.createSequentialGroup()
                        .addComponent(lb_fecha_inicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dc_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        gb_fechasLayout.setVerticalGroup(
            gb_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gb_fechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gb_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_fecha_inicial)
                    .addComponent(dc_fecha_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(gb_fechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_fecha_final)
                    .addComponent(dc_fecha_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        dg_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dg_resultados.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(dg_resultados);

        ckb_distrito.setText("Distrito");
        ckb_distrito.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ckb_distritoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(bt_agregar_denuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(bt_modificar_denuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gb_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_estado)
                                            .addComponent(lb_tipo_lugar)
                                            .addComponent(lb_tipo_delito))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cb_tipo_delito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_lugar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_localidad)
                                            .addComponent(lb_municipio))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tb_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(min_max_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tb_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(bt_eliminar_denuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ckb_distrito)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(bt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gb_fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb_tipo_delito)
                                .addComponent(cb_tipo_delito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lb_municipio)
                                .addComponent(tb_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tb_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lb_tipo_lugar)
                                        .addComponent(cb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lb_localidad)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(min_max_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_estado)
                                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ckb_distrito))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_agregar_denuncia)
                    .addComponent(bt_modificar_denuncia)
                    .addComponent(bt_eliminar_denuncia))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckb_distritoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ckb_distritoItemStateChanged
        min_max_distrito.setEnabled(true);
    }//GEN-LAST:event_ckb_distritoItemStateChanged

    @SuppressWarnings("UnnecessaryReturnStatement")
    private void buscar_denuncias_clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_denuncias_clic
        // TODO add your handling code here:
        //Obtenemos los datos a buscar
        //Fecha inicial
        int anyo_inicial = dc_fecha_inicial.getDateFormat().getCalendar().get(Calendar.YEAR);
        int mes_inicial = dc_fecha_inicial.getDateFormat().getCalendar().get(Calendar.MONTH)+1;
        int dia_inicial = dc_fecha_inicial.getDateFormat().getCalendar().get(Calendar.DAY_OF_MONTH);
        //Fecha Final
        int anyo_final = dc_fecha_final.getDateFormat().getCalendar().get(Calendar.YEAR);
        int mes_final = dc_fecha_final.getDateFormat().getCalendar().get(Calendar.MONTH)+1;
        int dia_final = dc_fecha_final.getDateFormat().getCalendar().get(Calendar.DAY_OF_MONTH);
        //tipo de delito
        String tipo_de_delito = cb_tipo_delito.getSelectedItem().toString();
        //tipo de lugar
        String tipo_de_lugar = cb_lugar.getSelectedItem().toString();
        //Estado
        String estado = cb_estado.getSelectedItem().toString();
        //Nombre municipio
        String municipio = tb_municipio.getText();
        //Nombre localidad
        String localidad = tb_localidad.getText();
        //Numero de distrito;
        int num_distrito = Integer.valueOf(min_max_distrito.getValue().toString());
        
        //Declaramos una variable que obtiene los datos
        
        //Realizamos la consulta a la base de datos
        String Consulta = "select idDenuncia,FechaHoraOcurrido,Estado,Direccion,Sintesis,CuantosFemeninos,CuantosMasculinos,CuantosDesconocidos,NombreTipoDelito,NombreTipoLugar,NombreLocalidad,Municipio,NoDistrito\n"+
       " from localidad as l inner join denuncia as d inner join delitotipo as td inner join tipolugar as tl on l.idLocalidad = d.idLocalidad\n" +
       " and d.TipoDelito = td.idDelito and tl.idTipoLugar = d.LugarAfectado  where NombreTipoDelito='"+tipo_de_delito+"' and NombreTipoLugar='"+tipo_de_lugar+"' and \n" +
       " Estado='"+estado+"' and Municipio='"+municipio+"' and NombreLocalidad='"+localidad+"' and NoDistrito='"+num_distrito+"'; ";
       // String Consulta = "SELECT * FROM usuario;";
        DefaultTableModel modelo;
        ArrayList<ArrayList<String>> dato_consulta = Conexion.ejecutar_consulta(Consulta);
        
        if(!dato_consulta.isEmpty()){
            modelo= new DefaultTableModel();
            modelo.addColumn("IdDenuncia");
            modelo.addColumn("FechaHoraOcurrido");
            modelo.addColumn("Estado");
            modelo.addColumn("Direccion");
            modelo.addColumn("Sintesis");
            modelo.addColumn("NumeroMujeres");
            modelo.addColumn("NumeroVarones");
            modelo.addColumn("NumeroDesconocidos");
            modelo.addColumn("NombreDelito");
            modelo.addColumn("NombreLugar");
            modelo.addColumn("NombreLocalidad");
            modelo.addColumn("Municipio");
            modelo.addColumn("NoDistrito");
            dg_resultados.setModel(modelo);
            if(Consulta.equals("")){
             Consulta="SELECT * from Denuncia";
            }
             try {
                 Statement stmt = Conexion.connection.createStatement();
                 ResultSet rs = stmt.executeQuery(Consulta);
                 ResultSetMetaData metadatos = rs.getMetaData();
                 int numero_columnas = metadatos.getColumnCount();
                 String []datos =new String [13];
                 while(rs.next())
                 {
                     for(int i=0; i < numero_columnas; i++){
                         datos[i] = rs.getString(i+1);
                     }
                 modelo.addRow(datos);
                 }
                dg_resultados.setModel(modelo);

             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Error en la consulta: "+ex.getMessage());
             }
                } else {
                    return;
                }
    }//GEN-LAST:event_buscar_denuncias_clic

    private void actualizar_datos_combo(){
        if(!actualizado){
            actualizado = true;
            ArrayList<ArrayList<String>> dato_delito = new ArrayList<ArrayList<String>>();
            ArrayList<ArrayList<String>> dato_lugar = new ArrayList<ArrayList<String>>();
            /*Consultamos por el usuario logueado*/
            String consulta_delito = "SELECT NombreTipoDelito FROM delitotipo;";
            String consulta_lugar = "SELECT NombreTipoLugar FROM TipoLugar;";
            
            dato_delito = Conexion.ejecutar_consulta(consulta_delito);
            
            if(!dato_delito.isEmpty()){
                Iterator<ArrayList<String>> nombreIterator = dato_delito.iterator();
                while(nombreIterator.hasNext()){
                    ArrayList<String> datos_especificos = nombreIterator.next();
                    Iterator<String> datos_individuales = datos_especificos.iterator();
                    while(datos_individuales.hasNext()){
                      String cadena_dato = datos_individuales.next();
                      System.out.println(cadena_dato + " /");
                      cb_tipo_delito.addItem(cadena_dato);
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
                      cb_lugar.addItem(cadena_lugar);
                    }
                
                }
            
                
            } else{
                return;
            }
            
            
        } else {
            return;
        }
         
    }
    
    private void cb_tipo_delitoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipo_delitoItemStateChanged
        // TODO add your handling code here:
        actualizar_datos_combo();        
    }//GEN-LAST:event_cb_tipo_delitoItemStateChanged

    private void cb_lugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_lugarItemStateChanged
        // TODO add your handling code here:
        actualizar_datos_combo();
    }//GEN-LAST:event_cb_lugarItemStateChanged

    private void bt_agregar_denunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregar_denunciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_agregar_denunciaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar_denuncia;
    private javax.swing.JToggleButton bt_buscar;
    private javax.swing.JButton bt_eliminar_denuncia;
    private javax.swing.JButton bt_modificar_denuncia;
    private javax.swing.JComboBox cb_estado;
    private javax.swing.JComboBox cb_lugar;
    private javax.swing.JComboBox cb_tipo_delito;
    private javax.swing.JCheckBox ckb_distrito;
    private datechooser.beans.DateChooserCombo dc_fecha_final;
    private datechooser.beans.DateChooserCombo dc_fecha_inicial;
    private javax.swing.JTable dg_resultados;
    private javax.swing.JPanel gb_fechas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_fecha_final;
    private javax.swing.JLabel lb_fecha_inicial;
    private javax.swing.JLabel lb_localidad;
    private javax.swing.JLabel lb_municipio;
    private javax.swing.JLabel lb_tipo_delito;
    private javax.swing.JLabel lb_tipo_lugar;
    private javax.swing.JSpinner min_max_distrito;
    private javax.swing.JTextField tb_localidad;
    private javax.swing.JTextField tb_municipio;
    // End of variables declaration//GEN-END:variables
}
