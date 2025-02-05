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
import java.util.Scanner;

public class Turma {
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
        
        System.out.println("Relatório Inicial:");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Estudantes em recuperação: " + recuperacaoList);
        System.out.println("Estudantes reprovados: " + reprovadosList);
    }

    public void aplicarRecuperacao(Scanner scanner) {
        List<String> aprovadosRecuperacao = new ArrayList<>();
        List<String> reprovadosFinais = new ArrayList<>();
        
        for (Estudante estudante : estudantes) {
            double media = estudante.calcularMedia();
            if (media > 2.5 && media < 7) {
                System.out.println("Digite a nota de recuperação para " + estudante.getNome() + ": ");
                double notaRecuperacao = scanner.nextDouble();
                
                double novaMedia = (media + notaRecuperacao) / 2;
                
                if (novaMedia >= 5) {
                    aprovadosRecuperacao.add(estudante.getNome());
                } else {
                    reprovadosFinais.add(estudante.getNome());
                }
                
                Logger.log("Nota de recuperação aplicada para " + estudante.getNome() + ": " + notaRecuperacao + " - Nova média: " + novaMedia);
            }
        }
        
        System.out.println("Lista final após recuperação:");
        System.out.println("Aprovados após recuperação: " + aprovadosRecuperacao);
        System.out.println("Reprovados finais: " + reprovadosFinais);
    }
}
