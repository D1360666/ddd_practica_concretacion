package co.com.sofka.domain.maquina;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Descripcion;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.tipoMaquina.TipoMaquina;

public class Maquina extends AggregateEvent {

    private Descripcion descripcion;
    private TipoMaquina tipoMaquina;



    public Maquina(Identity entityId) {
        super(entityId);
    }
}
