package org.example;

public class Main {
    public static void main(String[] args) {

        // Crear un objeto carro usando el constructor vacío
        carro c1 = new carro();

        // Usar los métodos set para asignar los valores a los atributos del carro c1
        c1.setMarca("Toyota");      // Marca = "Toyota"
        c1.setModelo("Corolla");    // Modelo = "Corolla"
        c1.setColor("Rojo");        // Color = "Rojo"

        // Crear un segundo carro usando el constructor con parámetros
        // Los atributos se asignan directamente en la creación del objeto
        carro c2 = new carro("Mazda", "CX-5", "Negro");

        // Crear un objeto Gasolina con tipo "Extra"
        Gasolina gasolina = new Gasolina("diesel");

        // Hacer que el carro c1 conduzca usando la gasolina creada
        // Esto llama al método conducir() de c1
        c1.conducir(gasolina);

        // Imprimir los datos de c1 usando toString()
        System.out.println(c1.toString());

        // Imprimir los datos de c2 usando toString()
        System.out.println(c2.toString());
    }
}
