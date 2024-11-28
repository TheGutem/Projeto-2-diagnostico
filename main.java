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
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar Cursos
        System.out.print("Digite o nome do curso 1: ");
        String nomeCurso1 = scanner.nextLine();
        System.out.print("Digite a quantidade de semestres do curso 1: ");
        int semestresCurso1 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do curso 2: ");
        String nomeCurso2 = scanner.nextLine();
        System.out.print("Digite a quantidade de semestres do curso 2: ");
        int semestresCurso2 = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        curso curso1 = new curso(nomeCurso1, semestresCurso1);
        curso curso2 = new curso(nomeCurso2, semestresCurso2);

        // Criar Professores
        List<professor> professores = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("\nDigite o nome do professor " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF do professor: ");
            String cpf = scanner.nextLine();
            System.out.print("Digite o endereço do professor: ");
            String endereco = scanner.nextLine();
            System.out.print("Digite o telefone do professor: ");
            String telefone = scanner.nextLine();
            System.out.print("Digite o SIAPE do professor: ");
            int siape = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            professores.add(new professor(nome, cpf, endereco, telefone, siape));
        }

        // Criar Estudantes
        List<estudante> estudantes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("\nDigite o nome do estudante " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF do estudante: ");
            String cpf = scanner.nextLine();
            System.out.print("Digite o endereço do estudante: ");
            String endereco = scanner.nextLine();
            System.out.print("Digite o telefone do estudante: ");
            String telefone = scanner.nextLine();
            System.out.print("Digite a matrícula do estudante: ");
            String matricula = scanner.nextLine();
            System.out.print("Escolha o curso do estudante (1 ou 2): ");
            int cursoEscolhido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            curso curso = (cursoEscolhido == 1) ? curso1 : curso2;
            estudantes.add(new estudante(nome, cpf, endereco, telefone, matricula, curso));
        }

        // Criar Turmas e Vincular Professores e Estudantes
        List<turma> turmas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("\nDigite a identificação da turma " + (i + 1) + ": ");
            String identificacao = scanner.nextLine();
            turma turma = new turma(identificacao);

            System.out.print("Escolha o curso para a turma (1 ou 2): ");
            int cursoEscolhido = scanner.nextInt();
            turma.curso = (cursoEscolhido == 1) ? curso1 : curso2;

            System.out.print("Digite o semestre da turma: ");
            turma.semestre = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Escolha o professor para a turma (1 ou 2): ");
            int professorEscolhido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            turma.professor = professores.get(professorEscolhido - 1);

            // Adicionar estudantes à turma
            System.out.println("Adicione estudantes à turma. Digite o número de cada estudante (1 a 5), ou 0 para finalizar:");
            while (true) {
                int estudanteEscolhido = scanner.nextInt();
                if (estudanteEscolhido == 0) break;
                turma.addEstudante(estudantes.get(estudanteEscolhido - 1));
            }
            scanner.nextLine(); // Consumir a quebra de linha
            turmas.add(turma);
        }

        // Exibir Estudantes e Professores das Turmas
        for (turma turma : turmas) {
            turma.exibirEstudantesEProfessores();
        }

        scanner.close();
    }
}

