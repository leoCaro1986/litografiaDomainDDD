package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;

import java.util.UUID;

public class DiseñoCreado extends DomainEvent {
    private final Especificaciones especificaciones;

    public DiseñoCreado(Especificaciones especificaciones) {
        super("litografia.diseño.diseñocreado");
        this.especificaciones = especificaciones;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
