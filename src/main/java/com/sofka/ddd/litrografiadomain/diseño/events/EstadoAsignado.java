package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseñador;

public class EstadoAsignado extends DomainEvent {
    private final Especificaciones especificaciones;
    public EstadoAsignado(IdDiseñador entityId, Especificaciones especificaciones){
        super("litografia.diseño.estadoasignado");
        this.especificaciones = especificaciones;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
