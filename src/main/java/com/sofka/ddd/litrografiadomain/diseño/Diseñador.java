package com.sofka.ddd.litrografiadomain.diseño;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.litrografiadomain.diseño.values.CorreoDiseñador;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseñador;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;

import java.util.Objects;

public class Diseñador extends Entity<IdDiseñador> {

    private InformacionDiseño informacionDiseño;


    public Diseñador(IdDiseñador entityId, InformacionDiseño informacionDiseño){
        super(entityId);
        this.informacionDiseño=informacionDiseño;

    }

    public void realizaDiseño(InformacionDiseño informacionDiseño) {
        this.informacionDiseño = Objects.requireNonNull(informacionDiseño);
    }

    public InformacionDiseño informacionDiseño() {
        return informacionDiseño;
    }


}
