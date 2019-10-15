/*
 *Crear una aplicación que muestre 10 números aleatorios basado en un límite :v 
 */
package funcionrandom;

import java.util.*;

/**
 *
 * @author CBN
 */
public class FuncionRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int num;
        System.out.print("Ingrese el límite: ");
        num = leer.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println((r.nextInt(num)+1));
        }
    }
    
}
