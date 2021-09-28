package com.sofka.ddd.litrografiadomain.diseño.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseño;

public class CambiarEspecificaciones extends Command {
    private final IdDiseño idDiseño;
    private final Especificaciones especificaciones;

    public CambiarEspecificaciones(IdDiseño idDiseño, Especificaciones especificaciones) {
        this.idDiseño = idDiseño;
        this.especificaciones = especificaciones;
    }

    public IdDiseño getIdDiseño() {
        return idDiseño;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
