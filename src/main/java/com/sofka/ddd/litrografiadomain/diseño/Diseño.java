package com.sofka.ddd.litrografiadomain.diseño;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.ddd.litrografiadomain.diseño.events.ClienteAsociado;
import com.sofka.ddd.litrografiadomain.diseño.events.DiseñoCreado;
import com.sofka.ddd.litrografiadomain.diseño.events.EstadoAsignado;
import com.sofka.ddd.litrografiadomain.diseño.values.*;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Diseño extends AggregateEvent<IdDiseño> {

    protected Especificaciones especificaciones;
    protected Set<Diseñador> diseñadores;
    protected Set<Cliente> clientes;
    protected IdProduccion idProduccion;
    protected IdCliente idCliente;


    public Diseño(IdDiseño entityId, Especificaciones especificaciones){
        super(entityId);
        appendChange(new DiseñoCreado(especificaciones)).apply();
    }

    public void asignarEstadoDeDiseño(IdDiseñador entityId, Especificaciones informacionDiseño){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacionDiseño);
        appendChange(new EstadoAsignado(entityId, informacionDiseño)).apply();
    }
    public void asociarCliente(IdCliente idCliente, InformacionCliente informacionCliente){
        Objects.requireNonNull(idCliente);
        appendChange(new ClienteAsociado(idCliente, informacionCliente)).apply();
    }

    public void cambiarEspecificaciones (Especificaciones especificaciones){
        appendChange(new EspecificacionesCambiadas(especificaciones)).apply();
    }

    public  void actualizarInformacionDiseño (IdDiseñador entityId, InformacionDiseño informacionDiseño){
        appendChange(new InformacionDiseñoActualizado(entityId, informacionDiseño)).apply();
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }

    public void Especificaciones(Especificaciones especificaciones) {
        this.especificaciones = especificaciones;
    }



    public IdCliente idCliente() {
        return idCliente;
    }

    public Especificaciones especificaciones() {
        return especificaciones;
    }

    public Set<Diseñador> diseñadores() {
        return diseñadores;
    }


    public Optional<Diseñador> getDiseñadorPorId(IdDiseñador entityId) {
        return diseñadores()
                .stream()
                .filter(diseñador -> diseñador.identity().equals(entityId))
                .findFirst();
    }



    public Set<Cliente> clientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setIdCliente(IdCliente idCliente) {
        this.idCliente = idCliente;
    }
}
