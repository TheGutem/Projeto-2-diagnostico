/*
 Estr programa foi feito com ajuda do chatgpt. Não coloquei ele pra fazer tudo,cclaro,
ele foi me ajudando a entender (mas não entendi exatamente) como seria implementado as funções como o ArrayList,
List, a interface printable, e métodos.
 */
package Main;

/**
 *
 * @author Gutem
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Printable {
    void printDetails();
}

abstract class Pessoa implements Printable {
    String nome, cpf, endereco, telefone;

    Pessoa(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}

class Professor extends Pessoa {
    int siape;

    Professor(String nome, String cpf, String endereco, String telefone, int siape) {
        super(nome, cpf, endereco, telefone);
        this.siape = siape;
    }

    public void printDetails() {
        System.out.println("Professor " + nome + " - CPF: " + cpf + " - SIAPE: " + siape);
    }
}

class Estudante extends Pessoa {
    String matricula;
    Curso curso;

    Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void printDetails() {
        System.out.println("Estudante " + nome + " - CPF: " + cpf + " - Matrícula: " + matricula);
    }
}

class Curso {
    String nomeCurso;
    int quantidadeSemestres;

    Curso(String nomeCurso, int quantidadeSemestres) {
        this.nomeCurso = nomeCurso;
        this.quantidadeSemestres = quantidadeSemestres;
    }
}

class Turma {
    String identificacao;
    Curso curso;
    int semestre;
    Professor professor;
    List<Estudante> estudantes = new ArrayList<>();

    Turma(String identificacao) {
        this.identificacao = identificacao;
    }

    void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    void exibirEstudantesEProfessores() {
        System.out.println("\nTurma: " + identificacao);
        if (professor != null) professor.printDetails();
        for (Estudante estudante : estudantes) estudante.printDetails();
    }
}

public class Main {
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

        Curso curso1 = new Curso(nomeCurso1, semestresCurso1);
        Curso curso2 = new Curso(nomeCurso2, semestresCurso2);

        // Criar Professores
        List<Professor> professores = new ArrayList<>();
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

            professores.add(new Professor(nome, cpf, endereco, telefone, siape));
        }

        // Criar Estudantes
        List<Estudante> estudantes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
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

            Curso curso = (cursoEscolhido == 1) ? curso1 : curso2;
            estudantes.add(new Estudante(nome, cpf, endereco, telefone, matricula, curso));
        }

        // Criar Turmas e Vincular Professores e Estudantes
        List<Turma> turmas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.print("\nDigite a identificação da turma " + (i + 1) + ": ");
            String identificacao = scanner.nextLine();
            Turma turma = new Turma(identificacao);

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
        for (Turma turma : turmas) {
            turma.exibirEstudantesEProfessores();
        }

        scanner.close();
    }
}
