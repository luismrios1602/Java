/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocicloaninado;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cant;
        
        System.out.println("Ingresar la cantidad de números: ");
        cant = leer.nextInt();
             
         for (int i = 1; i <= cant; i++) {
             if (i==1 || i==cant) {
                 for (int j = 1; j < cant; j++) {
                     System.out.print("*");
                 }
             } else {
                 for (int j = 1; j < cant; j++) {
                     if (j==(cant)) {
                        System.out.print("*");
                     } else if (j==1) {
                        System.out.print("*");
                     }else{
                         System.out.print(" ");
                     }
                 }
                 
             }
             System.out.println("*");
        }
    }
    
}
