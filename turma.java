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

public class turma implements printable {
    private List<estudante> estudantes;
    private professor professor;
    private List<String> logs;

    public turma(professor professor) {
        this.professor = professor;
        this.estudantes = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public void adicionarEstudante(estudante estudante) {
        estudantes.add(estudante);
        logs.add("Adicionado aluno: " + estudante.getNome());
    }

    public List<estudante> getEstudantes() {
        return estudantes;
    }

    public professor getProfessor() {
        return professor;
    }

    public void imprimir() {
        System.out.println("Turma com Professor: " + professor.getNome());
        for (estudante estudante : estudantes) {
            System.out.println(estudante);
        }
    }

    public void gerarRelatorio() {
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        List<String> recuperacaoList = new ArrayList<>();
        List<String> reprovadosList = new ArrayList<>();
        
        for (estudante estudante : estudantes) {
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
    }

    public List<String> getLogs() {
        return logs;
    }
}

