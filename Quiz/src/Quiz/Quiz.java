/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;
import java.util.*;
/**
 *
 * @author CBN
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
       String[] nombres;
       double[] n1,n2,n3, acum;
       double promCurso=0, sumAcum=0;
       int cant;
       System.out.print("Ingrese la cantidad de estudiantes: ");
       cant = leer.nextInt();
       
       nombres = new String[cant];
       n1 = new double[cant];
       n2 = new double[cant];
       n3 = new double[cant];
       acum = new double[cant];
       
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese los datos del "+(i+1)+"° estudiante: ");
            System.out.print("Nombre: ");
            nombres[i]=leer.next();
            System.out.print("Nota 1: ");
            n1[i]=leer.nextDouble();
            System.out.print("Nota 2: ");
            n2[i]=leer.nextDouble();
            System.out.print("Nota 3: ");
            n3[i]=leer.nextDouble();
            acum[i]=(n1[i]*0.3)+(n2[i]*0.3)+(n3[i]*0.4);
            sumAcum += acum[i];
        }
        
        System.out.println("\nNOTAS FINALES: ");
        System.out.println("Nombre:\tNota1\tNota2\tNota3\tAcumulado");
        for (int i = 0; i < cant; i++) {
            System.out.println(nombres[i]+"\t"+n1[i]+"\t"+n2[i]+"\t"+n3[i]+"\t"+acum[i]);
        }
        
        promCurso = sumAcum / cant;
        System.out.println("\nPromedio del salón: "+promCurso);
    }
    
}
