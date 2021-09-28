package com.sofka.ddd.litrografiadomain.produccion.comands;

import co.com.sofka.domain.generic.Command;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;
import com.sofka.ddd.litrografiadomain.produccion.values.Producto;

public class CambiarProducto extends Command {
    private  final IdProduccion idProduccion;
    private final Producto producto;

    public CambiarProducto(IdProduccion idProduccion, Producto producto) {
        this.idProduccion = idProduccion;
        this.producto = producto;
    }

    public IdProduccion getIdProduccion() {
        return idProduccion;
    }

    public Producto getProducto() {
        return producto;
    }
}

