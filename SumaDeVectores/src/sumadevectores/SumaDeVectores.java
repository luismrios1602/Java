/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadevectores;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class SumaDeVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer=new Scanner(System.in);
       int[] vect1, vect2, vectSum;
       int cant,num;
       
        System.out.print("Ingrese la cantidad de valores del vector: ");
        cant = leer.nextInt();
        vect1 = new int[cant];
        vect2 = new int[cant];
        
        //Llenar Vector 1
        System.out.println("Vector 1:");
        for (int i = 0; i < vect1.length; i++) {
            System.out.print("Ingrese el valor en la posicion "+i+": ");
            vect1[i] = leer.nextInt();
        }
        
        //Llenar el Vector 2
        System.out.println("Vector 2:");
        for (int i = 0; i < vect2.length; i++) {
            System.out.print("Ingrese el valor en la posicion "+i+": ");
            vect2[i] = leer.nextInt();
        }
        
        //Mostrar el Vector 1
        System.out.println("Vector 1:");
        for (int i = 0; i < vect1.length; i++) {
            System.out.print("|"+vect1[i]+"|");
        }
        
        //Mostrar el Vector 2
        System.out.println("\nVector 2:");
        for (int i = 0; i < vect2.length; i++) {
            System.out.print("|"+vect2[i]+"|");
        }
        
        //Vector de la suma
        vectSum = new int[vect1.length];
        for (int i = 0; i < vectSum.length; i++) {
            vectSum[i] = vect1[i] + vect2[i];
        }
        
        //Mostrar Vector de la suma
        System.out.println("\nVector Suma:");
        for (int i = 0; i < vectSum.length; i++) {
            System.out.print("|"+vectSum[i]+"|");
        }
       
    }
    
}
