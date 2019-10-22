/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora;
import java.util.*;
/**
 *
 * @author CBN
 */
public class CajaRegistradora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        ArrayList<String> productos= new ArrayList();
        ArrayList<Integer> precios= new ArrayList();
        int total=0, decision=1;
        boolean cliente=false; //Variable para controlar la cantidad de productos
        while(!cliente){
            System.out.print("Ingrese el nombre del producto: ");
            productos.add(leer.next());
            System.out.print("Ingrese el precio del producto: ");
            precios.add(leer.nextInt());
            System.out.println("¿Desea ingresar más productos?");
            decision = leer.nextInt();
            
            if (decision==0) {
                cliente=true;
            }
        }
        
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i)+"\t"+precios.get(i));
            total += precios.get(i);
        }
        System.out.println("Total: \t"+total);
        System.out.println("Cantidad de Artículos: \t"+productos.size());
    }
    
}
