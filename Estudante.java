package Media;

/**
 *
 * @author Gutem
 */
public class Estudante {
    private String nome;
    private float[] nota = new float[3];
    private float media;
    private float recuperacao = 0;
    
    public Estudante (String nome, float nota1, float nota2, float nota3){
        this.nome = nome;
        this.nota[1] = nota1;
        this.nota[2] = nota2;
        this.nota[3] = nota3;
    }
    
    void calcularMedia(){
        
        this.media = (nota[0] + nota[1] = nota[2]) / 3;
        
        if(media >= 7){
            System.out.println("APROVADO");
        }
        if(media >= 2.5 && media < 7){
            System.out.println("RECUPERAÇÃO");
        }
        if(media < 2.5){
            System.out.println("REPROVADO");
        }
    }
}
