/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoupdate;

import java.util.*;

/**
 *
 * @author Lenovo
 */
public class BingoUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn=new Scanner(System.in);
        Random bombo = null; //Número para sacar las balotas al azar (75)
        int[][] tablero=new int[5][15];
        int[][] carton=new int[5][5];
        int balota=0, op;
        boolean continuar=true;
        
        
        
        MostrarTablero(tablero);
        System.out.print("Continuar... "); scn.nextLine();
        LlenarCarton(carton);
        System.out.println("CARTON!!");
        MostrarCarton(carton);
        System.out.print("Continuar... "); scn.nextLine();
        
        do {
            System.out.println("");
            balota = SacarBalotas();
            System.out.println("BALOTA: \t"+balota);
            System.out.println("");
            LlenarTablero(tablero, balota);
            MostrarTablero(tablero);
            
            MostrarCarton(carton);
            System.out.print("1. Continuar ...\t2. Marcar\t3. BINGO"); op= scn.nextInt();
            if (op==2) {
                Marcar(carton, balota);
            } else if(op==3){
                continuar=false;
                System.out.println("BINGO!! GANÓ ESTA GONORREA :V");
            }
        } while (continuar);
        
        
       
    }
    
    public static void MostrarTablero(int[][] tablero){
         for (int f = 0; f < tablero.length; f++) { //F por fila
            for (int c = 0; c < tablero[f].length; c++) { //C por columna
                if (f==0 && c==0) {
                    System.out.print("B");
                } else if (f==1 && c==0) {
                    System.out.print("I");
                } else if(f==2 && c==0){
                    System.out.print("N");
                } else if (f==3 && c==0) {
                    System.out.print("G");
                } else if(f==4 && c==0){
                    System.out.print("O");
                }
                System.out.print("["+tablero[f][c]+"]");
            }
            System.out.println("");
        }
    }
    
    public static void MostrarCarton(int[][] carton){
         System.out.println("B\tI\tN\tG\tO");
        for (int f = 0; f < carton.length; f++) { //F por fila
            for (int c = 0; c < carton[f].length; c++) { //C por columna
                System.out.print("["+carton[f][c]+"]\t");
            }
            System.out.println("");
            }
        }

    public static void LlenarCarton(int[][] carton){
        ArrayList balotas=new ArrayList();
        Random bombo =new Random();
        int balota=0;
        
        for (int f = 0; f < carton.length; f++) { //F por fila
            for (int c = 0; c < carton[f].length; c++) { //C por columna
                if (c==0) { //Balotas para la B
                    balota=0;
                    while (balota==0) { //Si la balota que sale es 0 que haga todo de nuevo
                        balota = bombo.nextInt(16);
                        for (int i = 0; i < balotas.size(); i++) { //Ciclo para revisar si la balota que salió ya está en el array de las balotas que van saliendo
                            if (balota==(int)balotas.get(i)) {
                                balota=0; //Si la balota ya la tengo, colocamos la balota como 0 para empezar de nuevo
                            } 
                        }
                    }
                    balotas.add(balota);
                    carton[f][c] = balota;
                    
                } else if (c==1) { //Balotas para la I
                    balota=0;
                    while (balota<16 || balota>30) { //Si la balota no está en el rango de la letra que lo haga de nuevo
                        balota = bombo.nextInt(31);
                        for (int i = 0; i < balotas.size(); i++) {
                            if (balota==(int)balotas.get(i)) {
                                balota=0;
                            } 
                        }
                    }
                    balotas.add(balota);
                    carton[f][c] = balota;
                                        
                } else if (c==2) { //Balotas para la N
                    balota=0;
                    while (balota<30 || balota>45) {
                        balota = bombo.nextInt(46);
                        for (int i = 0; i < balotas.size(); i++) {
                            if (balota==(int)balotas.get(i)) {
                                balota=0;
                            } 
                        }
                    }
                    balotas.add(balota);
                    carton[f][c] = balota;
                    
                } else if (c==3) { //Balotas para la G
                    balota=0;
                    while (balota<45 || balota>60) {
                        balota = bombo.nextInt(61);
                        for (int i = 0; i < balotas.size(); i++) {
                            if (balota==(int)balotas.get(i)) {
                                balota=0;
                            } 
                        }
                    }
                    balotas.add(balota);
                    carton[f][c] = balota;
                                        
                } else if (c==4) { //Balotas para la G
                    balota=0;
                    while (balota<60 || balota>75) {
                        balota = bombo.nextInt(76);
                        for (int i = 0; i < balotas.size(); i++) {
                            if (balota==(int)balotas.get(i)) {
                                balota=0;
                            } 
                        }
                    }
                    balotas.add(balota);
                    carton[f][c] = balota;
                    
                } 
                
            }
            }
            carton[2][2]=0; //Casilla del medio siempre libre
        }
    
    public static int SacarBalotas(){
        Random balotas=new Random();
        int balota = balotas.nextInt(76);
        return balota;
    }
    
    public static void LlenarTablero(int[][] tablero,int balota){
        if (balota<16) {
            for (int f = 0; f < 1; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    if (tablero[f][c]==0 || tablero[f][c]==balota) {
                        tablero[f][c] = balota;
                        break;
                    }
                }
            }
        } else if (balota<31) {
            for (int f = 1; f < 2; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    if (tablero[f][c]==0 || tablero[f][c]==balota) {
                        tablero[f][c] = balota;
                        break;
                    }
                }
            }
        } else if (balota<46) {
            for (int f = 2; f < 3; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    if (tablero[f][c]==0 || tablero[f][c]==balota) {
                        tablero[f][c] = balota;
                        break;
                    }
                }
            }
        } else if (balota<61) {
            for (int f = 3; f < 4; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    if (tablero[f][c]==0 || tablero[f][c]==balota) {
                        tablero[f][c] = balota;
                        break;
                    }
                }
            }
        } else if (balota<76) {
            for (int f = 4; f < 5; f++) {
                for (int c = 0; c < tablero[0].length; c++) {
                    if (tablero[f][c]==0 || tablero[f][c]==balota) {
                        tablero[f][c] = balota;
                        break;
                    }
                }
            }
        }
    }
    
    public static void Marcar(int[][] carton, int balota){
            for (int f = 0; f < carton.length; f++) {
                for (int c = 0; c < carton[0].length; c++) {
                    if (carton[f][c]==balota) {
                        carton[f][c] = 0;
                        break;
                    }
                }
            }
    }
}
