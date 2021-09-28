package com.sofka.ddd.litrografiadomain.produccion;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;
import com.sofka.ddd.litrografiadomain.produccion.values.IdMaquina;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionMaquina;

import java.util.Objects;

public class Maquina extends Entity<IdMaquina> {
    private InformacionMaquina informacionMaquina;

    public Maquina(IdMaquina idMaquina, InformacionMaquina informacionMaquina){
        super(idMaquina);
        this.informacionMaquina = informacionMaquina;
    }

    public  void imprimir(InformacionMaquina informacionMaquina){
        this.informacionMaquina = Objects.requireNonNull(informacionMaquina);
    }
    public InformacionMaquina informacionMaquina() {

        return informacionMaquina;
    }
}
