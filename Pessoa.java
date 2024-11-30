/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String toString() {
        return nome + ", " + endereco + ", " + telefone + ", " + cpf;
    }
}

