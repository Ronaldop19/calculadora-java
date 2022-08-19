
package contadorcomwhile;

public class ContadorComWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        while (cont<10) {
            cont++;
            if (cont == 3 || cont == 6 || cont == 9){
                continue;
            }            
            System.out.println(cont);             
        }               
    }
    
}
