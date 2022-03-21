package co.com.sofka.domain.serie;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.serie.value.serieID;

public class Serie extends Entity<serieID> {

    private Long repeticion;
    private Long cantidad;

    public Serie(serieID serieID) {
        super(serieID);
    }
}
