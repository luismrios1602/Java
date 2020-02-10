/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combate;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class Combate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        String nombrePj, raza;
        int vida, ataque, defensa, danho=0, opTurno, vidaRestante=0;
        boolean combatir=true;
        
        System.out.println("REGISTRAR EL PLAYER 1:");
       
        System.out.print("Nombre PJ: ");
        nombrePj = scn.next().toUpperCase();
        System.out.print("Raza: ");
        raza = scn.next();
        System.out.print("Vida: ");
        vida = scn.nextInt();
        System.out.print("Ataque: ");
        ataque = scn.nextInt();
        System.out.print("Defensa: ");
        defensa = scn.nextInt();
        
        Combatiente p1=new Combatiente(nombrePj, raza, vida, ataque, defensa);
        System.out.println("_____________________________\n");
        
        System.out.println("REGISTRAR EL PLAYER 2:");
       
        System.out.print("Nombre PJ: ");
        nombrePj = scn.next().toUpperCase();
        System.out.print("Raza: ");
        raza = scn.next();
        System.out.print("Vida: ");
        vida = scn.nextInt();
        System.out.print("Ataque: ");
        ataque = scn.nextInt();
        System.out.print("Defensa: ");
        defensa = scn.nextInt();
        
        Combatiente p2=new Combatiente(nombrePj, raza, vida, ataque, defensa);
        System.out.println("_____________________________\n");
        do{ // Ciclo para controlar la batalla
            System.out.println("|"+p1.nombrePj+": "+p1.vida+"|\t"+"|"+p2.nombrePj+": "+p2.vida+"|\n"); //Para mostrar la vida de los jugadores
            
            System.out.println("_____________________________\n");
            System.out.println("Turno de "+p1.nombrePj);
            System.out.println("1. Atacar \t2. Pasar turno\t3. Abandonar"); //Opciones para el menú de turno
            opTurno = scn.nextInt();
            
            switch (opTurno) {
                case 1:
                     System.out.println(p1.nombrePj+" Ataca! --->");
                     
                    danho = p2.Combatir(p1.Atacar(p1.ataque), p2.Defender(p2.defensa)); //Si la opcion es atacar, llamo al método combatir del otro jugador para ver cuanta vida le voy a quitar.

                    System.out.println("Daño Causado: -"+danho);
                    if (p2.vida>0) { //Si la vida es mayor a 0 y sigue vivo, que la mueste, sino ya valió 
                        vidaRestante = p2.vida;
                    } else {
                        vidaRestante = 0;
                    }
                    System.out.println(p2.nombrePj+", vida restante: "+vidaRestante+"\n");   
                    break;
                case 2:
                    System.out.println("Daño Causado: -"+0);
                    System.out.println(p2.nombrePj+", vida restante: "+p2.vida+"\n");  
                    break;
                case 3:
                    p1.vida = 0; //Si abandona le coloco la vida en 0 para que el juego dé ganador al otro.
                    nombrePj = p2.nombrePj; //Nombre del otro jugador para mostrar el nombre del ganador
                    combatir = false;
                    break;
                default:
                    System.out.println("OPCION INVÁLIDA");
                   nombrePj = p2.nombrePj;
                    combatir = false;
            }  
            
            if (p2.vida>0 && combatir) { //Si el men 2 sigue con vida y no abandonó el 1 que muestre las opciones. 

                System.out.println("|"+p1.nombrePj+": "+p1.vida+"|\t"+"|"+p2.nombrePj+": "+p2.vida+"|\n"); //Para mostrar la vida de los jugadores
                System.out.println("_____________________________\n");
                System.out.println("Turno de "+p2.nombrePj);
                System.out.println("1. Atacar \t2. Pasar turno\t3. Abandonar"); //Opciones para el menú de turno
                opTurno = scn.nextInt();

                switch (opTurno) {
                    case 1:
                         System.out.println(p2.nombrePj+" Ataca! --->");

                        danho = p1.Combatir(p2.Atacar(p2.ataque), p1.Defender(p1.defensa)); //Si la opcion es atacar, llamo al método combatir del otro jugador para ver cuanta vida le voy a quitar.
                        //Variable Daño para almacenar el valor de la resta entre la agresion y la proteccion del metodo Combatir.
                        
                        System.out.println("Daño Causado: -"+danho);
                        if (p1.vida>0) { //Si la vida es mayor a 0 y sigue vivo, que la mueste, sino ya valió 
                        vidaRestante = p1.vida;
                    } else {
                            vidaRestante = 0;
                        }
                    System.out.println(p1.nombrePj+", vida restante: "+vidaRestante+"\n");   
                        break;
                    case 2:
                        System.out.println("Daño Causado: -"+0);
                        System.out.println(p1.nombrePj+", vida restante: "+p1.vida+"\n");  
                        break;
                    case 3:
                        p2.vida = 0; //Si abandona le coloco la vida en 0 para que el juego dé ganador al otro.
                        nombrePj = p1.nombrePj; //Nombre del otro jugador para mostrar el nombre del ganador
                        combatir = false;
                        break;
                    default:
                        System.out.println("OPCION INVÁLIDA");
                       nombrePj = p1.nombrePj;
                        combatir = false; 
                }
            }
            
            if (p1.vida<=0) {
                    nombrePj = p2.nombrePj;
                    combatir=false;
                } else if(p2.vida<=0){
                    combatir=false;
                    nombrePj = p1.nombrePj;
                } else {
                    combatir=true;
                }
            
        }while(combatir);
        
        System.out.println("GANADOR: "+nombrePj);
    }
    
    
}
