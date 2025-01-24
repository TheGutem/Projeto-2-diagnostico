/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto2;

/**
 *
 * @author Gutem
 */
public class Professor extends Pessoa {
    private String siape;

    public Professor(String nome, String endereco, String telefone, String cpf, String siape) {
        super(nome, endereco, telefone, cpf);
        this.siape = siape;
        Logger.log("Professor criado: " + nome + ", SIAPE: " + siape);
    }

    public String getSiape() {
        return siape;
    }

    public String toString() {
        return super.toString() + ", SIAPE: " + siape;
    }
}

