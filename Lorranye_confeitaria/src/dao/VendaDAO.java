/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import classes.Funcionário;
import classes.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class VendaDAO {
    private Connection conn;

    public VendaDAO(Connection conn) {
        this.conn = conn;
    }

    PreparedStatement ps;
    ResultSet rs;
        public int inserirVenda(Venda venda)
  {
   int status;
   
  
       
        try {
            ps = conn.prepareStatement("INSERT INTO venda (Funcionario_id, Clientes_id, data, valor_total, produto_nome) VALUES(?,?,?,?,?)");
            ps.setInt(1, venda.getFuncionario().getId());
            ps.setInt(2, venda.getCliente().getId()); 
            ps.setDate(3, new java.sql.Date(venda.getData().getTime()));
            ps.setDouble(4, venda.getValor_total());
            ps.setString(5,venda.getProdutoNome());
            
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



 