/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class Curso {
    private String nome;
    private Turma turma;
    private Professor coordenador;

    public Curso(String nome, Turma turma, Professor coordenador) {
        this.nome = nome;
        this.turma = turma;
        this.coordenador = coordenador;
        Logger.log("Curso criado: " + nome + ", Coordenador: " + coordenador.getNome());
    }

    public void imprimirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Coordenador: " + coordenador);
        turma.imprimir();
    }

    public void vincularCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
        Logger.log("Coordenador vinculado ao curso: " + coordenador.getNome());
    }
}


