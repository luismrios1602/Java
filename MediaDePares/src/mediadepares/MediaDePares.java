/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediadepares;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class MediaDePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int[] numeros, suma;
        int cant, pares=0;
        
        System.out.print("Ingrese la cantidad de números: ");
        cant = leer.nextInt();
        
        numeros =new int[cant];
        suma =new int[cant];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el "+i+"° número: ");
            numeros[i] = leer.nextInt();
            if (numeros[i]%2==0) {
                suma[pares] = numeros[i];
                pares ++;
            }
            
        }
        
        for (int i = 0; i < pares; i++) {
            System.out.print("|"+suma[i]+"|");
        }
    }
    
}
