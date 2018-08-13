/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FRANCISCONAVA
 */
public class BDConect {
    
    public Connection conectar(){
        String direccion = "127.0.0.1";
        String puerto = "1433";
        String db = "DEVINFO";
        String usuario = "sa";
        String pass = "admin";
        String connectionUrl = "jdbc:sqlserver://" + direccion + ":" + puerto + ";"
                + "databaseName=" + db + ";user=" + usuario + ";password=" + pass + ";";
        
        //System.out.println(""+connectionUrl);
        // Declaramos los sioguientes objetos
        Connection con = null;
        try {
            //Establecemos la conexión
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }  
}
