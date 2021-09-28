package com.sofka.ddd.litrografiadomain.produccion.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.produccion.values.IdOperario;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionProducto;

public class ActualizarProducto extends Command {
    private final IdProduccion idProduccion;
    private final IdOperario idOperario;
    private final InformacionProducto informacionProducto;

    public ActualizarProducto(IdProduccion idProduccion, IdOperario idOperario, InformacionProducto informacionProducto) {
        this.idProduccion = idProduccion;
        this.idOperario = idOperario;
        this.informacionProducto = informacionProducto;
    }

    public IdProduccion getIdProduccion() {
        return idProduccion;
    }

    public IdOperario getIdOperario() {
        return idOperario;
    }

    public InformacionProducto getInformacionProducto() {
        return informacionProducto;
    }
}
