package com.sofka.ddd.litrografiadomain.produccion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.produccion.values.Producto;

public class ProductoCambiado extends DomainEvent {
    private final Producto producto;

    public ProductoCambiado(Producto producto){
        super("litografia.produccion.productocambiado");
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }
}
