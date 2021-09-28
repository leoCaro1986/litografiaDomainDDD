package com.sofka.ddd.litrografiadomain.produccion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.produccion.values.IdOperario;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionProducto;

public class ProductosActualizados extends DomainEvent {
    private final IdOperario idOperario;
    private final InformacionProducto informacionProducto;

    public ProductosActualizados(IdOperario idOperario, InformacionProducto informacionProducto){
        super("litografia.produccion.productosactualizados");
        this.idOperario = idOperario;
        this.informacionProducto = informacionProducto;
    }

    public InformacionProducto getInformacionProducto() {
        return informacionProducto;
    }
    public IdOperario getIdOperario(){
        return idOperario;
    }
}
