package com.sofka.ddd.litrografiadomain.produccion;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;
import com.sofka.ddd.litrografiadomain.produccion.values.Producto;

public class Produccion extends AggregateEvent<IdProduccion> {

    public Produccion(IdProduccion entityId, Producto producto){
        super(entityId);
    }

}
