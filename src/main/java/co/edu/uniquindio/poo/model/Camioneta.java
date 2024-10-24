package co.edu.uniquindio.poo.model;

public class Camioneta extends Vehiculo{
    private Double capacidadCargaTonelada;

    public Camioneta (String numeroMatricula, String marca, String modelo, String anioFabricacion, Double capacidadCargaTonelada){
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.capacidadCargaTonelada = capacidadCargaTonelada;
    }

    public Double getCapacidadCargaTonelada(){
        return capacidadCargaTonelada;
    }
    public void setCapacidadCargaTonelada(Double capacidadCargaTonelada){
        this.capacidadCargaTonelada = capacidadCargaTonelada;
    }
}