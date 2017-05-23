/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Landson
 */
public class ConectaBanco {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/lol";
    private static final String USER = "root";
    private static final String SENHA = "";
    
    public static Connection getConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(HOST, USER, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}
