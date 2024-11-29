/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Professores
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        System.out.print("Digite o endereço do professor: ");
        String enderecoProfessor = sc.nextLine();
        System.out.print("Digite o telefone do professor: ");
        String telefoneProfessor = sc.nextLine();
        System.out.print("Digite o CPF do professor: ");
        String cpfProfessor = sc.nextLine();
        System.out.print("Digite o SIAPE do professor: ");
        String siape = sc.nextLine();
        
        professor professor = new professor(nomeProfessor, enderecoProfessor, telefoneProfessor, cpfProfessor, siape);
        
        // Turma
        turma turma = new turma(professor);
        
        // Estudantes
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os dados do estudante " + (i + 1));
            System.out.print("Nome: ");
            String nomeEstudante = sc.nextLine();
            System.out.print("Endereço: ");
            String enderecoEstudante = sc.nextLine();
            System.out.print("Telefone: ");
            String telefoneEstudante = sc.nextLine();
            System.out.print("CPF: ");
            String cpfEstudante = sc.nextLine();
            System.out.print("Número de matrícula: ");
            String matriculaEstudante = sc.nextLine();
            
            estudante estudante = new estudante(nomeEstudante, enderecoEstudante, telefoneEstudante, cpfEstudante, matriculaEstudante);
            
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha
            
            estudante.getNotas().setNotas(nota1, nota2, nota3);
            turma.adicionarEstudante(estudante);
        }

        // Gerar relatório
        turma.gerarRelatorio();
        
        // Imprimir informações da turma
        turma.imprimir();
        
        // Informações do curso
        curso curso = new curso("Curso de Programação", turma, professor);
        curso.imprimirInformacoes();
        
        sc.close();
    }
}

