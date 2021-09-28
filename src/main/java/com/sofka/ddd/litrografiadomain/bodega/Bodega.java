package com.sofka.ddd.litrografiadomain.bodega;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.litrografiadomain.bodega.values.IdBodega;
import com.sofka.ddd.litrografiadomain.bodega.values.InformacionBodega;

public class Bodega extends AggregateEvent<IdBodega> {

    public Bodega(IdBodega entityId, InformacionBodega informacionBodega){
        super(entityId);
    }
}
