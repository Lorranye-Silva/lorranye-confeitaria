/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProdutoDAO {
    
  private Connection conn;

    PreparedStatement ps;
    ResultSet rs;
    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }

  
   
        public int inserirProduto(Produto produto)
  {
   int status;
   
  
       
        try {
            ps = conn.prepareStatement("INSERT INTO produto (nome, preco, quantidade_disponivel ) VALUES(?,?,?)");
            ps.setString(1,produto.getNome());
            ps.setDouble(2,produto.getPreco());
            ps.setInt(3,produto.getQuantidade_disponivel());

            
           
           
            
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
