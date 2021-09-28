package com.sofka.ddd.litrografiadomain.diseño.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseñador;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseño;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;

public class ActualizarInformacioDiseño extends Command {
    private final IdDiseño idDiseño;
    private final IdDiseñador idDiseñador;
    private final InformacionDiseño informacionDiseño;


    public ActualizarInformacioDiseño(IdDiseño idDiseño, IdDiseñador idDiseñador, InformacionDiseño informacionDiseño) {
        this.idDiseño = idDiseño;
        this.idDiseñador = idDiseñador;
        this.informacionDiseño = informacionDiseño;
    }

    public IdDiseño getIdDiseño() {
        return idDiseño;
    }

    public IdDiseñador getIdDiseñador() {
        return idDiseñador;
    }

    public InformacionDiseño getInformacionDiseño() {
        return informacionDiseño;
    }
}
