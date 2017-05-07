package main;

import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.BinomialAzar;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Ruleta;

/**
 * Created by seba-note on 6/5/2017.
 */
public class Main {

    public static Double MIN_VAL_POSIBLE_X = 6.0;
    public static Double MAX_VAL_POSIBLE_X = 10.0;
    public static Double MIN_VAL_POSIBLE_Y = 5.0;
    public static Double MAX_VAL_POSIBLE_Y = 10.0;

    public static void main(String[] args) {

        AlgoritmoGenetico min = new AlgoritmoGenetico(new ConfiguracionPropia(),Cromosoma.class);
        Individuo x = min.ejecutar();

    }
}
