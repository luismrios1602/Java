/*
 Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. 
Para esto, se registran los días que laboró y las horas de cada día. 
Realice un programa en Java para determinar el sueldo semanal de N trabajadores y además calcule cuánto pagó la empresa por los N empleados.
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantTrab, cantDias, cantHoras,totalTrab=0, totalEmpresa=0, valorHora;
        String nombre;
        
        System.out.println("Ingrese la cantidad de Trabajadores: ");
        cantTrab = leer.nextInt();
        
        //Ciclo de trabajadores:
        for (int i = 1; i <= cantTrab; i++) {
            System.out.print("Ingrese el nombre del "+i+"° Trabajador: ");
            nombre = leer.next();
            System.out.print("Ingrese la cantidad de días laborados por "+nombre+": ");
            cantDias = leer.nextInt();
            System.out.print("Ingrese el valor por hora: ");
            valorHora = leer.nextInt();
            
            //Ciclo de días: 
            for (int j = 1; j <= cantDias; j++) {
                System.out.print("Ingrese la cantidad de horas laboradas en el "+j+"° día: ");
                cantHoras = leer.nextInt();
                totalTrab += (cantHoras * valorHora);
            }
            totalEmpresa += totalTrab;
            System.out.println(nombre+" ganó: $"+totalTrab);
            totalTrab = 0;
        }
        System.out.println("El valor total de la nómina es: $"+totalEmpresa);
    }
    
}
