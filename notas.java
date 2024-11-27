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

public class notas {
    
    private float nota1, nota2, nota3, media;
    private int apr = 0, rec = 0, rep = 0;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double Nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double Nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double Nota3) {
        this.nota3 = nota3;
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double Media) {
        this.media = media;
    }
    
    public void exibirDados() {
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Nota 3: " + getNota3());
        System.out.println("Media: " + getMedia());
        media = (nota1 + nota2 + nota3) / 3;
        
        if(media>=7){
            System.out.println("Aprovado!");
        } else if(media >= 2.5){
            System.out.println("Recuperação!");
        } else if(media < 2.5){
            System.out.println("Reprovado!");
        }
    }
    
    public notas(float nota1, float nota2, float nota3) {
        
    }
    
    public void exibirStatus() {
        
        //media = (nota1 + nota2 + nota3) / 3;
        if(media>=7){
            apr += 1;
        } else if(media >= 2.5){
            rec += 1;
        } else if(media < 2.5){
            rep += 1;
        }
    }
}