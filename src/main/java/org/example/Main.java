package org.example;

// Clase principal donde se crean los objetos
public class Main {
    public static void main(String[] args) {

        // Creación de un objeto carro usando constructor vacío
        carro c1 = new carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setColor("Rojo");

        // Creación de un objeto carro usando constructor con parámetros
        carro c2 = new carro("Mazda", "CX-5", "Negro");

        // Objeto Gasolina (DEPENDENCIA)
        Gasolina gasolina = new Gasolina("Extra");

        // Uso de métodos
        c1.encender();          // Método heredado
        c1.conducir(gasolina); // Método con dependencia

        // Mostrar información
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
