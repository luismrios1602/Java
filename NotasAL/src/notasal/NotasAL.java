/*
    Realice un programa en JAVA que reciba las notas de N estudiantes y calcule el promedio individual y del curso.
    Tener en cuenta que las notas serán las del 1°, 2° y 3° seguimiento. 
 */
package notasal;
import java.util.*;
/**
 *
 * @author CBN
 */
public class NotasAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        ArrayList<String> nombres=new ArrayList();
        ArrayList<Double> n1=new ArrayList();
        ArrayList<Double> n2=new ArrayList();   
        ArrayList<Double> n3=new ArrayList();  
        ArrayList<Double> prom=new ArrayList();
        double PromCurso=0;
        int x=0, decision=0;
        boolean ingreso=true;
        
        while(ingreso){
            System.out.print("Ingrese el nombre: ");
            nombres.add(leer.next());
            System.out.print("1° seguimiento: ");
            n1.add(leer.nextDouble());
            System.out.print("2° seguimiento: ");
            n2.add(leer.nextDouble());
            System.out.print("3° seguimiento: ");
            n3.add(leer.nextDouble());
            prom.add((n1.get(x)*0.3)+(n2.get(x)*0.3)+(n3.get(x)*0.4));
            x++; 
            
            System.out.println("¿Desea ingresar más datos?");
            decision = leer.nextInt();
            if (decision==0) {
                ingreso = false;
            }
        }
        System.out.println("Nombre\t1° Seg\t2° Seg\t3° Seg\tAcum");
        for (int i = 0; i < prom.size(); i++) {
            System.out.println(nombres.get(i)+"\t"+n1.get(i)+"\t"+n2.get(i)+"\t"+n3.get(i)+"\t"+prom.get(i));
            PromCurso += prom.get(i);
        }
        
        System.out.println("Promedio del curso: "+(PromCurso/prom.size()));
    }
    
}
