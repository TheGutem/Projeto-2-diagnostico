/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class estudante extends pessoa {
    private String numeroMatricula;
    private notas notas;

    public estudante(String nome, String endereco, String telefone, String cpf, String numeroMatricula) {
        super(nome, endereco, telefone, cpf);
        this.numeroMatricula = numeroMatricula;
        this.notas = new notas();
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public notas getNotas() {
        return notas;
    }

    public double calcularMedia() {
        return (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
    }

    public String toString() {
        return super.toString() + ", Matricula: " + numeroMatricula + ", Média: " + calcularMedia();
    }
}

