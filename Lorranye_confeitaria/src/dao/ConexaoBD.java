/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBD {

     Connection conn = null;
    PreparedStatement ps;
    ResultSet rs;
 
      public boolean conectar(){
       
        
        // Criando conexão com o driver //
         try {
            
            Class.forName( "com.mysql.cj.jdbc.Driver" );
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lorranye_confeitaria","root","admin123");
            System.out.println( "Conexao estabelecida com sucesso!" );
            return true;
        } 
         catch ( ClassNotFoundException | SQLException ex) 
        {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
        
      }
      public Connection getConnection() {
        return conn;
      }
}