/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combate;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Combatiente {
    
    public String nombrePj , raza;
    public int vida, ataque, defensa;

        
    Combatiente (String nombre, String raza, int vida, int ataque, int defensa) {
    
        this.nombrePj = nombre;
        this.raza = raza;
        this.vida= vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public int Atacar(int ataque){
       Random valAgresion= new Random();
        int agresion = valAgresion.nextInt(ataque);
       return agresion;
    }
    
    public int Defender(int defensa){
        Random valProteccion = new Random();
        int proteccion = valProteccion.nextInt(defensa);
        return proteccion;
    }
    
    public int Combatir(int agresion, int proteccion){
        int danho = agresion - proteccion;
        
        if (danho<0) { //Si el valor de la proteccion es mayor al de la agresion, entonces el daño es 0
            danho = 0;
        }
        
        if (danho>(ataque-10)) { //Si el daño está dentro del rango de punto entre el daño y el ataque maximo, será daño critico, si por elcontrario está entre 0 y 10 será fallo critico
            System.out.println("++++ DAÑO CRÍTICO! :D ");
        } else if(danho<11){
            System.out.println("---- FALLO CRÍTICO! >:( ");
        }
        this.vida = this.vida - danho;
        
        return danho;
    }
    
}
