/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class curso {
    private String nome;
    private turma turma;
    private professor coordenador;

    public curso(String nome, turma turma, professor coordenador) {
        this.nome = nome;
        this.turma = turma;
        this.coordenador = coordenador;
    }

    public void imprimirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Coordenador: " + coordenador);
        turma.imprimir();
    }

    public void vincularCoordenador(professor coordenador) {
        this.coordenador = coordenador;
    }
}

