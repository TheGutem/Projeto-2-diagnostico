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

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Professores
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = entrada.nextLine();
        System.out.print("Digite o endereço do professor: ");
        String enderecoProfessor = entrada.nextLine();
        System.out.print("Digite o telefone do professor: ");
        String telefoneProfessor = entrada.nextLine();
        System.out.print("Digite o CPF do professor: ");
        String cpfProfessor = entrada.nextLine();
        System.out.print("Digite o SIAPE do professor: ");
        String siape = entrada.nextLine();
        System.out.println("\n");
        
        Professor professor = new Professor(nomeProfessor, enderecoProfessor, telefoneProfessor, cpfProfessor, siape);
        
        // Turma
        Turma turma = new Turma(professor);
        
        // Estudantes
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite os dados do estudante " + (i + 1));
            System.out.print("Nome: ");
            String nomeEstudante = entrada.nextLine();
            System.out.print("Endereço: ");
            String enderecoEstudante = entrada.nextLine();
            System.out.print("Telefone: ");
            String telefoneEstudante = entrada.nextLine();
            System.out.print("CPF: ");
            String cpfEstudante = entrada.nextLine();
            System.out.print("Número de matrícula: ");
            String matriculaEstudante = entrada.nextLine();
            System.out.println("\n");
            
            Estudante estudante = new Estudante(nomeEstudante, enderecoEstudante, telefoneEstudante, cpfEstudante, matriculaEstudante);
            
            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("\n");
            
            
            estudante.getNotas().setNotas(nota1, nota2, nota3);
            turma.adicionarEstudante(estudante);
        }

        // Gerar relatório
        turma.gerarRelatorio();
        
        // Imprimir informações da Turma
        turma.imprimir();
        
        // Informações do Curso
        Curso curso = new Curso("Curso de Programação OO2", turma, professor);
        curso.imprimirInformacoes();
        
        entrada.close();
    }
}

