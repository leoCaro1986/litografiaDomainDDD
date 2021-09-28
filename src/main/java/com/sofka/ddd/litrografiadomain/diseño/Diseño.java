package com.sofka.ddd.litrografiadomain.diseño;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.diseño.events.*;
import com.sofka.ddd.litrografiadomain.diseño.values.*;
import com.sofka.ddd.litrografiadomain.produccion.values.IdProduccion;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Diseño extends AggregateEvent<IdDiseño> {

    protected Especificaciones especificaciones;
    protected Set<Diseñador> diseñadores;
    protected Set<Cliente> clientes;
    protected IdProduccion idProduccion;
    protected IdCliente idCliente;
    protected IdDiseñador idDiseñador;


    public Diseño(IdDiseño entityId, Especificaciones especificaciones){
        super(entityId);
        appendChange(new DiseñoCreado(especificaciones)).apply();
    }

    private Diseño(IdDiseño entityId){
        super(entityId);
        subscribe(new DiseñoChange(this));
    }

    public  static Diseño from(IdDiseño idDiseño, List<DomainEvent> events){
        var diseño = new Diseño(idDiseño);
        events.forEach(diseño::applyEvent);
        return diseño;
    }


    public void asignarEstadoDeDiseño(IdDiseñador entityId, Especificaciones especificaciones){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(especificaciones);
        appendChange(new EstadoAsignado(entityId, especificaciones)).apply();
    }
    public void asociarCliente(IdCliente idCliente, InformacionCliente informacionCliente){
        Objects.requireNonNull(idCliente);
        appendChange(new ClienteAsociado(idCliente, informacionCliente)).apply();
    }

    public void cambiarEspecificaciones (Especificaciones especificaciones){
        appendChange(new EspecificacionesCambiadas(especificaciones)).apply();
    }

    public  void actualizarInformacionDiseño (IdDiseñador idDiseñador, InformacionDiseño informacionDiseño){
        appendChange(new InformacionDiseñoActualizado(idDiseñador, informacionDiseño)).apply();
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
