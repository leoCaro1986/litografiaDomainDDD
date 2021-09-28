package com.sofka.ddd.litrografiadomain.diseño;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.litrografiadomain.diseño.values.IdCliente;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionCliente;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;

import java.util.Objects;

public class Cliente extends Entity<IdCliente> {
    private InformacionDiseño informacionDiseño;


    public Cliente(IdCliente entityId, InformacionDiseño informacionDiseño){
        super(entityId);
        this.informacionDiseño=informacionDiseño;

    }

    public void revisarDiseño(InformacionDiseño informacionDiseño) {
        this.informacionDiseño = Objects.requireNonNull(informacionDiseño);
    }

    public InformacionDiseño informacionDiseño() {
        return informacionDiseño;
    }
}
