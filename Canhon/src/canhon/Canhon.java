/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canhon;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author CBN
 */
public class Canhon {

    private int intentos, objt;
    int mensaje=0;
  public Canhon(){
       GeneradorDeNumerosAleatorios gen = new GeneradorDeNumerosAleatorios();
       objt = gen.getNumeroAleatorio();
       System.out.println(objt);
       intentos=0;
   }
  
  public void getLanzar(double Vo, double ang){
      boolean acierto=false;
      double x, g=9.8;
      x = (Math.pow(Vo, 2)*Math.sin(2*ang))/g;
          
          if (Math.abs(x-objt)<=5) {
              acierto = true;
              mensaje = 1;
      }
  
  }
    
}
