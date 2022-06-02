/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ferreteria;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {
 
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultSet;

    
    

    
    
     public Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver" );
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaferreteria","root","");
            sentencia = conexion.createStatement();
         } catch (ClassNotFoundException | SQLException ex) {
             JOptionPane.showMessageDialog(null,ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
          }
       
       
     }
     
      public Connection getConnection(){
      return conexion;
   }
      
      
 
}
