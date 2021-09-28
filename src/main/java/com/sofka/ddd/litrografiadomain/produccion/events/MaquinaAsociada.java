package com.sofka.ddd.litrografiadomain.produccion.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.produccion.values.IdMaquina;
import com.sofka.ddd.litrografiadomain.produccion.values.IdOperario;
import com.sofka.ddd.litrografiadomain.produccion.values.InformacionProducto;

public class MaquinaAsociada extends DomainEvent {
    private final IdMaquina idMaquina;

    public MaquinaAsociada(IdMaquina idMaquina){
        super("litografia.produccion.maquinaasociada");
        this.idMaquina = idMaquina;

    }

    public IdMaquina getIdMaquina() {
        return idMaquina;
    }
}
