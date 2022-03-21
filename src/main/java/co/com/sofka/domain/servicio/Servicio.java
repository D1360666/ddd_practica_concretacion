package co.com.sofka.domain.servicio;

import co.com.sofka.domain.servicio.value.servicioID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Descripcion;
import co.com.sofka.domain.generic.Importe;
import co.com.sofka.domain.horario.Horario;

public class Servicio extends AggregateEvent<servicioID> {

    private Descripcion descripcion;
    private Importe importe;
    private Horario horario;

    public Servicio(servicioID entityId) {
        super(entityId);
    }
}
