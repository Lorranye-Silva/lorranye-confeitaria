/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDAO {
    private Connection conn;

    public ClienteDAO(Connection conn) {
        this.conn = conn;
    }


    
    PreparedStatement ps;
    ResultSet rs;
 

public int inserirCliente(Cliente cliente)
  {
   int status;
   
  
       
        try {
            ps = conn.prepareStatement("INSERT INTO cliente (nome, cpf, email, endereco) VALUES(?,?,?,?)");
            ps.setString(1,cliente.getNome());
            ps.setInt(2,cliente.getCpf());
            ps.setString(3,cliente.getEmail());
            ps.setString(4,cliente.getEndereco());
           
           
            
            status = ps.executeUpdate();
            
            return status; 
            
        }
        
        catch (SQLException ex) 
        {
            System.out.println("Erro ao salvar dados: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
}