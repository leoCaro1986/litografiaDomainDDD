package com.sofka.ddd.litrografiadomain.produccion;

import co.com.sofka.domain.generic.Entity;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionDiseño;
import com.sofka.ddd.litrografiadomain.produccion.values.IdOperario;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionProducto;

import java.util.Objects;

public class Operario extends Entity<IdOperario> {
    private InformacionProducto informacionProducto;

    public Operario (IdOperario idOperario, InformacionProducto informacionProducto){
        super(idOperario);
        this.informacionProducto=informacionProducto;
    }

    public void operarMaquina(InformacionProducto informacionProducto) {
        this.informacionProducto = Objects.requireNonNull(informacionProducto);
    }

    public  InformacionProducto informacionProducto(){
        return  informacionProducto;
    }
}
