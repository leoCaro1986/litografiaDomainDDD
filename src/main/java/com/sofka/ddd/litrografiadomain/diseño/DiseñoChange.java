package com.sofka.ddd.litrografiadomain.diseño;

import com.sofka.ddd.litrografiadomain.diseño.events.ClienteAsociado;
import com.sofka.ddd.litrografiadomain.diseño.events.EspecificacionesCambiadas;
import com.sofka.ddd.litrografiadomain.diseño.events.EstadoAsignado;
import com.sofka.ddd.litrografiadomain.diseño.events.InformacionDiseñoActualizado;

import java.util.HashSet;

public class DiseñoChange extends co.com.sofka.domain.generic.EventChange {
    public DiseñoChange(Diseño diseño){

        apply((EstadoAsignado event) ->{
            diseño.especificaciones = event.getEspecificaciones();
            diseño.diseñadores = new HashSet<>();
        });

        apply((ClienteAsociado event)->{
            diseño.idCliente = event.getIdCliente();
        });

        apply((EspecificacionesCambiadas event) ->{
            diseño.especificaciones = event.getEspecificaciones();
        });

        apply((InformacionDiseñoActualizado event) ->{
           diseño.idDiseñador = event.getEntityId();
        });



    }
}
