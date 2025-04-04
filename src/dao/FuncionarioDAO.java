/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import classes.Funcionário;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
    private Connection conn;

    public FuncionarioDAO(Connection conn) {
        this.conn = conn;
    }

    PreparedStatement ps;
    ResultSet rs;
        public int inserirFuncionario(Funcionário funcionario)
  {
   int status;
   
  
       
        try {
            ps = conn.prepareStatement("INSERT INTO funcionario (nome, login, endereco, telefone, cpf, email ) VALUES(?,?,?,?,?,?)");
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getLogin());
            ps.setString(3,funcionario.getEndereco());
            ps.setString(4,funcionario.getTelefone());
            ps.setInt(5,funcionario.getCpf());
            ps.setString(6,funcionario.getEmail());
            
           
           
            
            status = ps.executeUpdate();
            
            return status; 
            
        }
        
        catch (SQLException ex) 
        {
            System.out.println("Erro ao salvar dados : " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
}
