package co.com.sofka.domain.rutina;

import co.com.sofka.domain.ejercicio.Ejercicio;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Descripcion;
import co.com.sofka.domain.serie.Serie;

import java.util.Map;



public class Rutina extends AggregateEvent<rutinaID> {


    private Descripcion descripcion;
    private Map<Ejercicio, Serie> ejercicios;

    public Rutina(rutinaID entityId) {
        super(entityId);
    }
}
