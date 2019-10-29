/*
LUIS MIGUEL RIOS DERECHOS RESERVADOS. Cualquier cosa es copia y robo, saludos :v 
 */
package parqueadero;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author CBN
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> placas= new ArrayList();
        ArrayList<String> horaEntrada = new ArrayList();
        ArrayList<String> puestoParqueo  = new ArrayList();
        ArrayList<String> horaSalida  = new ArrayList();
        boolean ejecucion=true;
        int seleccion=0;
        
        while (ejecucion) {
           Menu();
           seleccion = leer.nextInt();
           
           switch(seleccion){
            
                case 1:
                    Agregar(placas, horaEntrada, puestoParqueo, horaSalida);
                    break;

                case 2:
                    Modificar(placas, horaEntrada, puestoParqueo, horaSalida);
                    break;

                case 3:
                    Mostrar(placas, horaEntrada, puestoParqueo, horaSalida);
                    break;

                case 4:
                    ejecucion = false;
                    break;
                default:
                    System.out.println("ERRORZAZO DE ÉLITE!");
            }
           System.out.println("");
        }
        
    }
    
    static void Menu(){
        System.out.println("1. Ingresar Vehículo"
                + "\n2. Salida de Vehículo"
                + "\n3. Mostrar Vehículos en el parqueadero"
                + "\n4. Cerrar Programa");
    }
    
    static void Agregar(ArrayList<String> placas,
                        ArrayList<String> horaEntrada,
                        ArrayList<String> puestoParqueo,
                        ArrayList<String> horaSalida){
    
        String placa, puesto;
        int puestoOcupado;
        boolean guardar=false;
        System.out.print("Ingrese la placa del vehículo: ");
        placa = leer.next();
        System.out.print("Ingrese el puesto de parqueo: ");
        puesto = leer.next();
        
        placas.add(placa.toUpperCase());
        horaEntrada.add(obtenerFecha());
        
        
          while (!guardar) {
              puestoOcupado = puestoParqueo.indexOf(puesto.toUpperCase());
            if (puestoOcupado!=-1) {
                System.out.println("Puesto Ocupado, seleccionar uno nuevo");
                System.out.print("Ingrese el puesto de parqueo: ");
                puesto = leer.next();
                guardar = false;
                
            } else {
                puestoParqueo.add(puesto.toUpperCase());
                guardar = true;

            }
            
        }
            
        
        horaSalida.add("");
        System.out.println("Dato ingresado con éxito!");
        
    }
    
    static String obtenerFecha(){
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date fecha=new Date();
        return df.format(fecha);
    }
    
    static void Mostrar(ArrayList<String> placas,
                        ArrayList<String> horaEntrada,
                        ArrayList<String> puestoParqueo,
                        ArrayList<String> horaSalida){
        
        System.out.println("PLACA:\t"
                                +"HORA DE ENTRADA:\t"
                                +"PUESTO \t"
                                +"HORA DE SALIDA: \t");
        for (int i = 0; i < placas.size(); i++) {
            System.out.println(placas.get(i)+"\t"
                                +horaEntrada.get(i)+"\t"
                                +puestoParqueo.get(i)+"\t"
                                +horaSalida.get(i));
        }
        System.out.println("");
    
    }
    
    
    static void Modificar(ArrayList<String> placas,
                        ArrayList<String> horaEntrada,
                        ArrayList<String> puestoParqueo,
                        ArrayList<String> horaSalida){
        String placa, hSalida;
        int pos;
        System.out.print("Ingrese la placa: ");
        placa = leer.next();
        pos = placas.indexOf(placa.toUpperCase());
        if (pos!=-1) {
            horaSalida.set(pos, obtenerFecha());
            puestoParqueo.set(pos, "0");
            System.out.println("Salida de Vehículo registrada! ");
        } else {
            System.out.println("Vehúculo no se encuentra en el Parqueadero");
        }
    }
}
