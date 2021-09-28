package com.sofka.ddd.litrografiadomain.produccion.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.produccion.values.IdMaquina;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionMaquina;

public class AsociarMaquina extends Command {
    private  final IdProduccion idProduccion;
    private  final IdMaquina idMaquina;
    private  final InformacionMaquina informacionMaquina;

    public AsociarMaquina(IdProduccion idProduccion, IdMaquina idMaquina, InformacionMaquina informacionMaquina) {
        this.idProduccion = idProduccion;
        this.idMaquina = idMaquina;
        this.informacionMaquina = informacionMaquina;
    }

    public IdProduccion getIdProduccion() {
        return idProduccion;
    }

    public IdMaquina getIdMaquina() {
        return idMaquina;
    }

    public InformacionMaquina getInformacionMaquina() {
        return informacionMaquina;
    }
}
