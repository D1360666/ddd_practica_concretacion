package co.com.sofka.domain.tipoMaquina;

import co.com.sofka.domain.generic.Descripcion;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class TipoMaquina extends Entity {

    private Descripcion descripcion;
    public TipoMaquina(Identity entityId) {
        super(entityId);
    }
}
