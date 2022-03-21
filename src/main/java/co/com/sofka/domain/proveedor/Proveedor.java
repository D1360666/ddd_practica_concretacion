package co.com.sofka.domain.proveedor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Nombre;
import co.com.sofka.domain.proveedor.value.proveedorID;

public class Proveedor extends Entity<proveedorID> {

    private Nombre nombre;

    public Proveedor(proveedorID entityId) {
        super(entityId);
    }
}
