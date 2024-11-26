/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto;

/**
 *
 * @author Gutem
 */
class professor extends pessoa {
    int siape;

    professor(String nome, String cpf, String endereco, String telefone, int siape) {
        super(nome, cpf, endereco, telefone);
        this.siape = siape;
    }

    public void printDetails() {
        System.out.println("Professor " + nome + " - CPF: " + cpf + " - SIAPE: " + siape);
    }
}
