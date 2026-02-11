package org.example;

// Clase padre que representa un vehículo en general
public class Vehiculo {

    // Atributos comunes a todos los vehículos
    protected String marca;
    protected String modelo;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método común a todos los vehículos
    public void encender() {
        System.out.println("El carro esta encendido");
    }
}
