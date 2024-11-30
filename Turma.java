/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
import java.util.ArrayList;
import java.util.List;

public class Turma implements Printable {
    private List<Estudante> estudantes;
    private Professor professor;
    private List<String> logs;

    public Turma(Professor professor) {
        this.professor = professor;
        this.estudantes = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
        logs.add("Adicionado aluno: " + estudante.getNome());
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void imprimir() {
        System.out.println("Turma com Professor: " + professor.getNome());
        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }
    }

    public void gerarRelatorio() {
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        List<String> recuperacaoList = new ArrayList<>();
        List<String> reprovadosList = new ArrayList<>();
        
        for (Estudante estudante : estudantes) {
            double media = estudante.calcularMedia();
            if (media >= 7) {
                aprovados++;
            } else if (media < 2.5) {
                reprovados++;
                reprovadosList.add(estudante.getNome());
            } else {
                recuperacao++;
                recuperacaoList.add(estudante.getNome());
            }
        }
        
        System.out.println("Relatório: ");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Estudantes em recuperação: " + recuperacaoList);
        System.out.println("Estudantes reprovados: " + reprovadosList);
        System.out.println("\n");
    }

    public List<String> getLogs() {
        return logs;
    }
}

