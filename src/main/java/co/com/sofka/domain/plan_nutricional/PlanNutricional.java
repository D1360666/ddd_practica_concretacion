package co.com.sofka.domain.plan_nutricional;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Descripcion;
import co.com.sofka.domain.indicacion.Indicacion;
import co.com.sofka.domain.plan_nutricional.value.plannutID;

public class PlanNutricional extends AggregateEvent<plannutID> {
    private Descripcion descripcion;
    private Long dias;
    private Indicacion indicacion;

    public PlanNutricional(plannutID entityId) {
        super(entityId);
    }
}
