/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Date;

/**
 *
 * @author lorra
 */
public class Venda {
   
    private int id;
    private Cliente cliente;
    private Funcionário funcionario;
    private Date data;
    private String produtoNome;
    private double valor_total;
    
    public Venda() {
      
    }

    public Venda(int id, Cliente cliente, Funcionário funcionario, Date data, String produtoNome, double valor_total) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = data;
        this.produtoNome = produtoNome;
        this.valor_total = valor_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionário getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionário funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    @Override
public String toString() {
    return "Venda{" +
           "id=" + id + 
           ", cliente=" + cliente + 
           ", funcionario=" + funcionario + 
           ", data=" + data + 
           ", valor_total=" + valor_total + 
           '}';
}
}
