package org.example;

public class carro {
    // Atributos del carro
    private String marca;
    private String modelo;
    private String color;

    // constructor vacío
    public carro() {
    }

    // constructor con parámetros
    public carro(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    // GET - SET
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

    // DEPENDENCIA
    public void conducir(Gasolina gasolina) {
        System.out.println("El carro conduce usando gasolina tipo: " + gasolina.getTipo());
    }

    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
