package co.edu.uniquindio.poo.model;

public class Vehiculo{
    private String numeroMatricula;
    private String marca;
    private String modelo;
    private String anioFabricacion;

    public Vehiculo(String numeroMatricula, String marca, String modelo, String anioFabricacion){
        this.numeroMatricula = numeroMatricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getAnioFabricacion(){
        return anioFabricacion;
    }
    public void setAnioFabricacion(String anioFabricacion){
        this.anioFabricacion = anioFabricacion;
    }
}