package com.sofka.ddd.litrografiadomain.diseño.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.diseño.values.Especificaciones;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseñador;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseño;

public class AsignarEstadoDeDiseño extends Command {
    private final IdDiseño idDiseño;
    private final IdDiseñador entityId;
    private final Especificaciones especificaciones;


    public AsignarEstadoDeDiseño(IdDiseño idDiseño, IdDiseñador entityId, Especificaciones especificaciones) {
        this.idDiseño = idDiseño;
        this.entityId = entityId;
        this.especificaciones = especificaciones;
    }

    public IdDiseño getIdDiseño() {
        return idDiseño;
    }

    public IdDiseñador getEntityId() {
        return entityId;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
