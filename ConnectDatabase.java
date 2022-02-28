/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AD
 */
public class ConnectDatabase {
    public static Connection getConnectionDatabase() throws SQLException{
    try{
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String dbUrl = "jdbc:jtds:sqlserver://ADMIN:1433/SinhVien";
        return DriverManager.getConnection(dbUrl);
    } catch(ClassNotFoundException e){
        e.printStackTrace();
    } catch(SQLException e){
        e.printStackTrace();
    }
    
    return null;
    }
    public static void main(String[] args) throws SQLException {

       Connection connection = getConnectionDatabase();
       if (connection !=  null){
           System.out.println("thanh cong");
       }
       else 
            System.out.println("that bai");
    }
}
