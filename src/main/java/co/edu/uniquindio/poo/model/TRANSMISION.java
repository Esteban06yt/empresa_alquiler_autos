package co.edu.uniquindio.poo.model;

public enum TRANSMISION {
    MANUAL("Manual"),
    AUTOMATICA("Automatica");

    private String tipo;
    
    TRANSMISION(String tipo) {
        this.tipo = tipo;        
    }

    public String getTipo() {
        return tipo;
    }
}