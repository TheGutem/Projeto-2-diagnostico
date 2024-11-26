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
    List<Double> notas = new ArrayList<>();

    estudante(String nome, String cpf, String endereco, String telefone, String matricula, curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void printDetails() {
        System.out.println("Estudante " + nome + " - CPF: " + cpf + " - Matrícula: " + matricula);
    }
}

