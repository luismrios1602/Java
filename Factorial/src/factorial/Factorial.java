/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num, fact=1, acum;
        System.out.print("Ingrese el número: ");
        num = leer.nextInt();
        
        //Ciclo para mostrar el final del factial:
        for (int i = 1; i <= num; i++) {
            //Ciclo para hallar del factorial en base al número por donde va:
            
           for (int j = i; j <= 1; j--) {
                fact = (fact) * j;
            }
            System.out.println(i+"! = "+fact);
        }
    }
    
}
