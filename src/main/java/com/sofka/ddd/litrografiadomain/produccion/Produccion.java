package com.sofka.ddd.litrografiadomain.produccion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.ddd.litrografiadomain.produccion.events.MaquinaAsociada;
import com.sofka.ddd.litrografiadomain.produccion.events.ProduccionCreada;
import com.sofka.ddd.litrografiadomain.produccion.events.ProductoCambiado;
import com.sofka.ddd.litrografiadomain.produccion.events.ProductosActualizados;
import com.sofka.ddd.litrografiadomain.produccion.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Produccion extends AggregateEvent<IdProduccion> {
    protected Producto producto;
    protected Set<Operario> operarios;
    protected Maquina maquina;
    protected IdMaquina idMaquina;
    protected IdOperario idOperario;

    public Produccion(IdProduccion entityId, Producto producto){
        super(entityId);
        appendChange(new ProduccionCreada(producto)).apply();
    }

    private Produccion(IdProduccion entityId){
        super(entityId);
        subscribe(new ProduccionChange(this));
    }

    public  static Produccion from(IdProduccion idProduccion, List<DomainEvent> events){
        var produccion = new Produccion(idProduccion);
        events.forEach(produccion::applyEvent);
        return produccion;
    }

    public void actualizarProducto(IdOperario idOperario, InformacionProducto informacionProducto){
        Objects.requireNonNull(idOperario);
        Objects.requireNonNull(informacionProducto);
        appendChange(new ProductosActualizados(idOperario, informacionProducto)).apply();
    }

    public  void asociarMaquina(IdMaquina idMaquina, InformacionMaquina informacionMaquina){
        appendChange(new MaquinaAsociada(idMaquina)).apply();
    }

    public  void cambiarProducto(Producto producto){
        appendChange(new ProductoCambiado(producto)).apply();
    }

    public Optional<Operario> getOperarioPorId(IdOperario idOperario){
        return  operarios()
                .stream()
                .filter(operario -> operario.identity().equals(idOperario))
                .findFirst();
    }

    public Producto producto(){
        return producto;
    }
    public IdMaquina idMaquina(){
        return idMaquina;
    }

    public Set<Operario> operarios(){
        return operarios;
    }

}
