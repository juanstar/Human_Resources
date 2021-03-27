/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author j_sta
     */
public class conexion {

    public static void main(String[] args) {
        //. Requerimientos
        String driver = "com.mysql.jdbc.Driver";
        //2. URL (CADENA DE CONEXION)
        String url = "jdbc:mysql://localhost:3306/hr";//ip 198.201.33.05

        try {
            Class.forName(driver);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.err.println("Error de conexion" + e.getMessage());
            return;

        }
        try {
            Connection cn = DriverManager.getConnection(url, "root", "potter01");
            System.out.println("conectado a la base de datos MYSQL");
            System.out.println("-------------------------");
            
            String sql ="select * from employee";
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
           while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getInt(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getInt(6));
                System.out.println(rs.getDouble(7));
                System.out.println(rs.getString(8));
                System.out.println("--------------");
            }
            
        } catch (Exception e) {
            System.err.println("Sin conexion a la base de datos");
            return;

        }
    }
}
