package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;

public class EstadoDeDiseñoAsignado extends DomainEvent {
    private final Especificaciones especificaciones;

    public EstadoDeDiseñoAsignado(Especificaciones especificaciones){
        super("litografia.diseño.estadodeldiseñoasignado");
        this.especificaciones = especificaciones;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
