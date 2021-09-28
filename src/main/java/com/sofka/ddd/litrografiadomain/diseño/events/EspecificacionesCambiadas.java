package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;

public class EspecificacionesCambiadas  extends DomainEvent {
    private  final Especificaciones especificaciones;

    public EspecificacionesCambiadas (Especificaciones especificaciones){
        super("litografia.diseño.especificacionescambiadas");
        this.especificaciones = especificaciones;
    }
    public Especificaciones getEspecificaciones(){

        return especificaciones;
    }
}
