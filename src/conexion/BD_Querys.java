/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gloria y valeria
 */
public class BD_Querys 
{   
    
   //ESTE METODO ES UTILIZADO PARA RETORNAR TODO LOS ID SEGUN LA TABLA DESEADA
    public static ArrayList<Integer> Retornar_ALL_ID(String id,String tabla)
    {
        Conexion conect=new Conexion();
        Connection con=conect.getConnection();
        ArrayList<Integer> num=new ArrayList<Integer>();
        try {
            String sql = "select DISTINCT "+id+" from "+ tabla;
            Statement enviar = con.createStatement();
            ResultSet rs = enviar.executeQuery(sql);
           
            while(rs.next())
            {
                num.add(rs.getInt(id));
            }
            conect.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    //METODO PARA EJECUTAR UNA CONSULTA EN GENERAL
    
    //METODO UTILIZADO PARA ACTUALIZAR O AÑADIR UN REGISTRO SEGUN LA TABLA DE LA BD  CORRESPONDIENTE
    public static void  ADD_CAMBIAR_REGISTRO(String sql)
    {
  
        try {
              Conexion conect=new Conexion();
              Connection con=conect.getConnection();
              Statement stm = con.createStatement();
              if(stm.execute(sql))
              {
                JOptionPane.showMessageDialog(null,"ACTIVIDAD ERRONEA");    
              }
              else
              {
                JOptionPane.showMessageDialog(null,"ACTIVIDAD EXITOSA");
              }
            } catch (SQLException ex) 
            {
                   System.out.println(ex);
            }
    }
    
    
    //METODO UTILIZADO PARA SELECCIONAR UN REGISTRO ESPECIFICO DE UN TABLA DE LA BD DESEADA
    public static String[] SELECCIONAR_REGISTRO(String sql,String[] attr)
    {
        Conexion conect=new Conexion();
        Connection con=conect.getConnection();
    
        String[] fil = new String[attr.length];
        try {
            Statement enviar = con.createStatement();
            ResultSet rs = enviar.executeQuery(sql);
           
            while(rs.next())
            {
              for(int i=0;i<attr.length;i++)
              {
                fil[i] = rs.getString(attr[i]);
              }
            }
            conect.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fil;
    }
    
    
  //METODO UTILIZADO PARA ELIMINAR UN REGISTRO SEGUN LA TABLA DESEADA
    public static int Eliminar_Registro(String sql)
    {
        Conexion conect=new Conexion();
        Connection con=conect.getConnection();
        int i=0;
        try {
             Statement comando=con.createStatement();
             i = comando.executeUpdate(sql);
             conect.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
    
    
  //METODO UTILIZADO PARA CARGAR EL JTABLE SEGUN LA TABLA DE LA BASE DE DATOS CORRESPONDIENTE
  public static DefaultTableModel Mostrar_Datos_tabla(String[] items,String[] attr,String tabla)
    {
        Conexion conect=new Conexion();
        Connection con=conect.getConnection();
        DefaultTableModel model = null;
        model=new DefaultTableModel(null,items);
        try {
            String sql = "select * from "+tabla;
            Statement enviar = con.createStatement();
            ResultSet rs = enviar.executeQuery(sql);
            
            String[] fil = new String[attr.length];
            while(rs.next())
            {
              for(int i=0;i<attr.length;i++)
              {
                fil[i] = rs.getString(attr[i]);
              }
              model.addRow(fil);
            }
            conect.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        } 
       return model;
    }

}
