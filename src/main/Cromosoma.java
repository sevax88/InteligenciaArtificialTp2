package main;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

/**
 * Created by seba-note on 6/5/2017.
 */
public class Cromosoma extends Individuo {

    private Double x,y;

    @Override
    public double aptitud() {
//        esta por afuera de la zona Z1
        if (x>Main.MAX_VAL_POSIBLE_X ||
            x<Main.MIN_VAL_POSIBLE_X ||
            y>Main.MAX_VAL_POSIBLE_Y ||
            y<Main.MIN_VAL_POSIBLE_Y) {
        return 1000000.0;
        }else{
            return (200* Math.sqrt(Math.pow(x,2) + Math.pow((y-10),2)) +
                   170* Math.sqrt(Math.pow((x-5),2) + Math.pow((y-10),2)) +
                   150* Math.sqrt(Math.pow((x-5),2) + Math.pow((y-5),2)) +
                   300* Math.sqrt(Math.pow((x-20),2) + Math.pow(y,2)) +
                   100* Math.sqrt(Math.pow(x,2) + Math.pow((y-5),2)));

        }
    }

    @Override
    public boolean esMasAptoQue(Individuo otroIndividuo) {
        return this.aptitud()<otroIndividuo.aptitud();
    }

    @Override
    public Individuo generarRandom() {
        return super.generarRandom();
    }

    public Cromosoma() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Cromosoma{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
