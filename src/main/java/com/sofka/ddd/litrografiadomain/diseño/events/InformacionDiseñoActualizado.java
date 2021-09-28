package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseñador;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;

public class InformacionDiseñoActualizado extends DomainEvent {
    private final IdDiseñador entityId;
    private final InformacionDiseño informacionDiseño;

    public InformacionDiseñoActualizado(IdDiseñador entityId, InformacionDiseño informacionDiseño){
        super("litografia.diseño.informaciondiseñoactualizado");
        this.entityId = entityId;
        this.informacionDiseño =informacionDiseño;
    }

    public IdDiseñador getEntityId() {
        return entityId;
    }

    public InformacionDiseño getInformacionDiseño() {

        return informacionDiseño;
    }
}
