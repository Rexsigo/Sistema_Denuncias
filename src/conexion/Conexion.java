package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gloria y valeria
 */
public class Conexion 
{
	/**Parametros de conexion*/
	   public static String bd = "sistema_denuncias";
	   public static String login = "root";
	   public static String password = "root";
	   public static String url = "jdbc:mysql://localhost/"+bd;
	 
	   public static Connection connection = null;
	 
	   /** Constructor de Cconexion  */
	   public static void Conectar() 
	   {
              if(connection != null) {
                   return;
               }
	      try{ 
	         //obtenemos el driver de para mysql
	         Class.forName("com.mysql.jdbc.Driver");
	         
	         //obtenemos la conexión
	         connection = DriverManager.getConnection(url,login,password);
               	if (connection!=null){
	            System.out.println("Conexión a base de datos "+bd+" realizada con exito\n");
                }
	      }
	      catch(SQLException e){
	         System.out.println(e);
	         JOptionPane.showMessageDialog(null,e.toString());
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	         JOptionPane.showMessageDialog(null,e.toString());
	      }catch(Exception e){
	         System.out.println(e);
	         JOptionPane.showMessageDialog(null,e.toString());
	      }
	   }
           
           /**Ejucutar consulta para cualquier tipo de select**/
    @SuppressWarnings("CallToThreadDumpStack")
           public static ArrayList<ArrayList<String>> ejecutar_consulta(String consulta){
               ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
               int i;
               Conectar();
               if(connection == null) {
                   return datos;
               }
               try{
                   Statement enviar = connection.createStatement();
                   ResultSet rs = enviar.executeQuery(consulta);
                   ResultSetMetaData datos_resultado = rs.getMetaData();
                   int numero_columnas = datos_resultado.getColumnCount();
     
                   while(rs.next()){
                        ArrayList<String> item = new ArrayList<>();
                       for(i=0;i<numero_columnas;i++){
                           item.add(rs.getObject(i+1).toString());
                       }
                       datos.add(item);
                   }
               }catch(SQLException e){
                   JOptionPane.showMessageDialog(null,"No se ha podido hacer la consulta de la base de datos: "+e.getMessage(),"Error de consulta",ERROR_MESSAGE);
               }
               catch(Exception e){
                   e.printStackTrace();
               }
               
               return datos;
           }
           
           /*Ejecutar comando para insert, update, delete */
           public static int ejecutar_comando(String consulta){
               int filas_afectadas = 0;
               try{
                    Conectar();
                    if(connection==null) {
                       return 0;
                   }
                    Statement stm = connection.createStatement();
                    filas_afectadas = stm.executeUpdate(consulta);
                    if(filas_afectadas == 0){
                        JOptionPane.showMessageDialog(null, "ACTIVIDAD ERRONEA");
                    } else{                        
                        JOptionPane.showMessageDialog(null, "ACTIVIDAD EXITOSA");    
                    }
               }catch(SQLException e){
                   JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
               }
               
               
               return filas_afectadas;
           }
           
            /*public static DefaultTableModel Mostrar_Datos_tabla(String consulta)
            {
                Conectar();
                DefaultTableModel model=new DefaultTableModel();
                JTable datos_tabla = new JTable(model);
                Object[] etiquetas = null;
                try {
                    Statement enviar = connection.createStatement();///1
                    ResultSet rs = enviar.executeQuery(consulta);
                    ResultSetMetaData metadatos = rs.getMetaData();
                    //numero de columnas del result set
                    int numero_columnas = metadatos.getColumnCount();
                    //objeto de los datos
                    etiquetas = new Object[numero_columnas];
                    int k=0;
                    while(rs.next())
                    {
                        for(int i=0; i<numero_columnas;i++){
                            if(k==0){etiquetas[i] = metadatos.getColumnLabel(i);}
                            else{
                                etiquetas[i] = rs.getObject(i+1);
                            }                           
                        }
                        model.addRow(etiquetas);
                        k++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                model.setColumnIdentifiers(etiquetas);
               return model;
            }*/
	   
	   
	   /**Permite retornar la conexión*/
	   public Connection getConnection(){
	      return connection;
	   }
	 
	   public void desconectar(){
	      connection = null;
	   }
	}
