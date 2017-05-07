package main;

import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.Cruzamiento;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.Simple;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.Mutacion;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.CantidadDeCiclos;
import main.java.ar.edu.utn.frba.ia.ag.paro.CriterioDeParo;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Ranking;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Seleccion;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Torneo;

/**
 * Created by seba-note on 7/5/2017.
 */
public class ConfiguracionPropia extends Configuracion {

    public ConfiguracionPropia() {

        super(new CantidadDeCiclos(99L), // criterio de paro
                500, // cantIndividuosIniciales
                new Ranking(10), // seleccion
                new Simple(), // cruzamiento
                new MutacionSimple(0.2)); // mutacion
    }
}
