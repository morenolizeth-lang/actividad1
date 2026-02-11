package org.example;

// Clase Gasolina
// El carro DEPENDE de esta clase para funcionar
public class Gasolina {

    // Tipo de gasolina
    private String tipo;

    // Constructor
    public Gasolina(String tipo) {
        this.tipo = tipo;
    }

    // Método GET
    public String getTipo() {
        return tipo;
    }
}
