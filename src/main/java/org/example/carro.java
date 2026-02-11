package org.example;

// La clase carro HEREDA de Vehiculo
public class carro extends Vehiculo {

    // Atributo propio del carro
    private String color;

    // Constructor vacío
    public carro() {
        super(); // Llama al constructor de la clase padre
    }

    // Constructor con parámetros
    public carro(String marca, String modelo, String color) {
        super(marca, modelo); // HERENCIA: usa atributos del padre
        this.color = color;
    }

    // Métodos GET y SET
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // DEPENDENCIA:
    // El carro usa la clase Gasolina SOLO como parámetro
    // No es un atributo permanente
    public void conducir(Gasolina gasolina) {
        System.out.println("El carro conduce usando gasolina tipo: " + gasolina.getTipo());
    }

    // Método para mostrar la información del carro
    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
