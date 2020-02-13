package canhon;
import java.util.Random;

class GeneradorDeNumerosAleatorios {
    private Random rnd;
    private int limiteRango1;
    private int limiteRango2;

    GeneradorDeNumerosAleatorios() {
        rnd = new Random();
        this.limiteRango1 = 100;
        this.limiteRango2 = 1000;
    }

    int getNumeroAleatorio() {
        if(limiteRango1 < limiteRango2) {
            return rnd.nextInt(limiteRango2 - limiteRango1 + 1) + limiteRango1;
        } else {
            return rnd.nextInt(limiteRango1 - limiteRango2 + 1) + limiteRango2;
        }
    }
}