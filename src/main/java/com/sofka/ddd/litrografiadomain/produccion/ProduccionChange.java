package com.sofka.ddd.litrografiadomain.produccion;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.ddd.litrografiadomain.produccion.events.MaquinaAsociada;
import com.sofka.ddd.litrografiadomain.produccion.events.ProduccionCreada;
import com.sofka.ddd.litrografiadomain.produccion.events.ProductoCambiado;
import com.sofka.ddd.litrografiadomain.produccion.events.ProductosActualizados;

import java.util.HashSet;

public class ProduccionChange extends EventChange {
    public ProduccionChange(Produccion produccion) {

        apply((ProduccionCreada event)->{
            produccion.producto = event.getProducto();
            produccion.operarios = new HashSet<>();
        });

        apply((MaquinaAsociada event)->{
            produccion.idMaquina = event.getIdMaquina();
        });

        apply((ProductosActualizados event) ->{
            produccion.idOperario = event.getIdOperario();
        });

        apply((ProductoCambiado event) ->{
            produccion.producto = event.getProducto();
        });
    }
}
