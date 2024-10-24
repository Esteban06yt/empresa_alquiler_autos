package co.edu.uniquindio.poo.model;

public class Auto extends Vehiculo{
    private String numeroPuertas;

    public Auto (String numeroMatricula, String marca, String modelo, String anioFabricacion, String numeroPuertas){
        super(numeroMatricula, marca, modelo, anioFabricacion);
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroPuertas(){
        return numeroPuertas;
    }
    public void setNumeroPuertas(String numeroPuertas){
        this.numeroPuertas = numeroPuertas;
    }
}