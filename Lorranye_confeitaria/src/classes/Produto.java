/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author lorra
 */
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidade_disponivel;

    
    public Produto() 
    {
        
    }
    
    public Produto(int id, String nome, double preco, int quantidade_disponivel) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade_disponivel = quantidade_disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade_disponivel() {
        return quantidade_disponivel;
    }

    public void setQuantidade_disponivel(int quantidade_disponivel) {
        this.quantidade_disponivel = quantidade_disponivel;
    }
    
    @Override
public String toString() {
    return "Produto{" +
           "id=" + id + 
           ", nome='" + nome + '\'' + 
           ", preco=" + preco + 
           ", quantidade_disponivel=" + quantidade_disponivel + 
           '}';
}
}
