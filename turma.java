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

class turma {
    String identificacao;
    curso curso;
    int semestre;
    professor professor;
    List<estudante> estudantes = new ArrayList<>();

    turma(String identificacao) {
        this.identificacao = identificacao;
    }

    void addEstudante(estudante estudante) {
        estudantes.add(estudante);
    }

    void exibirEstudantesEProfessores() {
        System.out.println("\nTurma: " + identificacao);
        if (professor != null) professor.printDetails();
        for (estudante estudante : estudantes) estudante.printDetails();
    }
}

