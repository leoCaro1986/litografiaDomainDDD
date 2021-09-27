package com.sofka.ddd.litrografiadomain.diseño;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseño;

public class Diseño extends AggregateEvent<IdDiseño> {

    public Diseño(IdDiseño entityId, Especificaciones especificaciones){
        super(entityId);
    }
}
