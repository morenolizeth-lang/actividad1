package org.example;

public class Main {
    public static void main(String[] args) {

        carro c1 = new carro();
        c1.setMarca("Toyota");
        c1.setModelo("Corolla");
        c1.setColor("Rojo");

        carro c2 = new carro("Mazda", "CX-5", "Negro");

        Gasolina gasolina = new Gasolina("Extra");

        c1.conducir(gasolina);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
