
package programamedia;

import java.util.Scanner

 
public class ProgramaMedia {

    
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a nota da prova 1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a nota da prova 2: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: " + m);
        if (m>7){
            System.out.println("Aprovado com sucesso!");
        } else {
                    System.out.println("Recuperação");
        }
    }
    
}
