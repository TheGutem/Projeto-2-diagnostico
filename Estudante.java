/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class Estudante extends Pessoa {
    private String numeroMatricula;
    private Notas notas;

    public Estudante(String nome, String endereco, String telefone, String cpf, String numeroMatricula) {
        super(nome, endereco, telefone, cpf);
        this.numeroMatricula = numeroMatricula;
        this.notas = new Notas();
        Logger.log("Estudante criado: " + nome + ", Matrícula: " + numeroMatricula);
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public Notas getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
        Logger.log("Média calculada para " + getNome() + ": " + media);
        return media;
    }

    public String toString() {
        return super.toString() + ", Matricula: " + numeroMatricula + ", Media: " + calcularMedia();
    }
}
