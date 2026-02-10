package org.example;

public class carro {
    //Atributos

    private String nombre;
    private String edad;
    private String genero;

    //constructor basio
    public carro() {
    }

    //metodos
    public carro(String nombre, String edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    // GET -SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    public int calcularPasos(){
        return 0;
    }

    public double calcularSalario(){
        return 0.0;
    }
}


