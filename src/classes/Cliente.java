/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author lorra
 */
public class Cliente {
    private int id;
    private String nome;
    private int cpf;
    private String email;
    private String endereco;

public Cliente()
    {
        
    }

    public Cliente(int id, String nome, int cpf, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
public String toString() {
    return "Cliente{" + 
           "id=" + id + 
           ", nome='" + nome + '\'' + 
           ", cpf=" + cpf + 
           ", email='" + email + '\'' + 
           ", endereco='" + endereco + '\'' + 
           '}';
}
}

