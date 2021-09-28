package com.sofka.ddd.litrografiadomain.diseño.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.values.IdCliente;
import com.sofka.ddd.litrografiadomain.diseño.values.InformacionCliente;

public class ClienteAsociado extends DomainEvent {
    private final IdCliente idCliente;
    private  final InformacionCliente informacionCliente;


    public  ClienteAsociado(IdCliente idCliente, InformacionCliente informacionCliente){
        super("litografia.diseño.clienteasociado");
        this.idCliente =idCliente;
        this.informacionCliente = informacionCliente;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public InformacionCliente getInformacionCliente() {

        return informacionCliente;
    }
}
