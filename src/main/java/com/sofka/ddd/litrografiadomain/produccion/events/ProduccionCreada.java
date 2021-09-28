package com.sofka.ddd.litrografiadomain.produccion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.produccion.values.Producto;

import java.util.UUID;

public class ProduccionCreada extends DomainEvent {
    private  final Producto producto;

    public ProduccionCreada(Producto producto) {
        super("litografia.produccion.produccioncreada");
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }
}
