/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiroalblanco;

import java.util.*;

/**
 *
 * @author CBN
 */
public class TiroAlBlanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Random posFila = new Random();
        Random posCol = new Random();
        
        int[][] tablero=new int[11][11];
        
        //Ciclo para llenar con puntos: 
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if ((i==0 || j==0) || (i==10 || j==10)) { //Recuadro 20 puntos
                    tablero[i][j]=20;
                    System.out.print("|20|");
                } else if ((i==1 && (j>0&&j<10)) || (i==9 && (j>0&&j<10))) { //Recuadro 30 puntos
                    tablero[i][j]=30;
                    System.out.print("|30|");
                } else if((j==1 && (i>0&&i<10))||(j==9 && (i>0&&i<10))){ 
                    tablero[i][j]=30;
                    System.out.print("|30|");
                } else if ((i==2 && (j>1&&j<9)) || (i==8 && (j>1&&j<9))) { //Recuadro 50 puntos
                    tablero[i][j]=50;
                    System.out.print("|50|");
                } else if((j==2 && (i>1&&i<9))||(j==8 && (i>1&&i<9))){ 
                    tablero[i][j]=50;
                    System.out.print("|50|");
                }else if ((i==3 && (j>2&&j<8)) || (i==7 && (j>2&&j<8))) { //Recuadro 70 puntos
                    tablero[i][j]=70;
                    System.out.print("|70|");
                } else if((j==3 && (i>2&&i<8))||(j==7 && (i>2&&i<8))){ 
                    tablero[i][j]=70;
                    System.out.print("|70|");
                }else if ((i==4 && (j>3&&j<7)) || (i==6 && (j>3&&j<7))) { //Recuadro 90 puntos
                    tablero[i][j]=90;
                    System.out.print("|90|");
                } else if((j==4 && (i>3&&i<7))||(j==6 && (i>3&&i<7))){ 
                    tablero[i][j]=90;
                    System.out.print("|90|");
                }else {
                    tablero[i][j]=100;
                    System.out.print("|XX|");
                }  
            }
            System.out.println("");
        }
        
        int puntos;
        int totalPuntos = 0;
        int filaTiro, colTiro;
        //Ciclo para tirar
        for (int i = 1; i <= 2; i++) {
            System.out.print("Intento "+(i)+": ");
            scn.nextLine();
            filaTiro = posFila.nextInt(11);
            colTiro = posCol.nextInt(11);
            System.out.println("Posición: ["+filaTiro+"]["+colTiro+"]");
            if (tablero[filaTiro][colTiro]==100) {
                System.out.println("BLANCO!!");
            }
            puntos = tablero[filaTiro][colTiro];
            System.out.println("Puntos: "+puntos);
            totalPuntos += puntos;
        }
        
        System.out.println("El total de puntos es: "+totalPuntos);
    }
    
}
