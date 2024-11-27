/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author Gutem
 */
import java.util.ArrayList;
import java.util.List;

class estudante extends pessoa {
    String matricula;
    curso curso;
    private List<notas> notas;     

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public curso getCurso() {
        return curso;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }

    public List<notas> getNotas() {
        return notas;
    }

    public void setNotas(List<notas
            > notas) {
        this.notas = notas;
    }

    estudante(String nome, String cpf, String endereco, String telefone, String matricula, curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void exibirDados(){
        for (notas n : notas) {
            System.out.println(getNome() + " - Cpf: " + getCpf() + " - End. " + getEndereco() + " - Tel.: " + getTelefone() + ". Matricula: " + matricula);
            n.exibirDados();
        }
    }

    public void printDetails() {
        System.out.println("Estudante " + nome + " - CPF: " + cpf + " - Matrícula: " + matricula);
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

