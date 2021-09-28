package com.sofka.ddd.litrografiadomain.diseño.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.diseño.values.IdCliente;
import com.sofka.ddd.litrografiadomain.diseño.values.IdDiseño;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionCliente;

public class AsociarCliente extends Command {
    private final IdDiseño idDiseño;
    private final IdCliente idCliente;
    private final InformacionCliente informacionCliente;


    public AsociarCliente(IdDiseño idDiseño, IdCliente idCliente, InformacionCliente informacionCliente) {
        this.idDiseño = idDiseño;
        this.idCliente = idCliente;
        this.informacionCliente = informacionCliente;
    }

    public IdDiseño getIdDiseño() {
        return idDiseño;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public InformacionCliente getInformacionCliente() {
        return informacionCliente;
    }
}
