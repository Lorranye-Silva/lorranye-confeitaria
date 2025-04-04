/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author lorra
 */
public class Funcionário {
    private int id;
    private String nome;
    private String login;
    private String endereco;
    private String telefone;
    private int cpf;
    private String email;

     public Funcionário() {
       
    }

    public Funcionário(int id, String nome, String login, String endereco, String telefone, int cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
    @Override
public String toString() {
    return "Funcionário{" +
           "id=" + id + 
           ", nome='" + nome + '\'' + 
           ", login='" + login + '\'' + 
           ", endereco='" + endereco + '\'' + 
           ", telefone='" + telefone + '\'' + 
           ", cpf=" + cpf + 
           ", email='" + email + '\'' + 
           '}';
}
}
