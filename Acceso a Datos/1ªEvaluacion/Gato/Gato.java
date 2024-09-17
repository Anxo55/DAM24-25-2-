// package Gato;

public class Gato {

    private String nombre;
    private int numeroPatas;
    private String color;
    private int peso;


    public Gato() {
        this.nombre = "stitch";
        this.numeroPatas = 4;
        this.color = "naranja";
        this.peso = 10;
    }
    
    public Gato(String nombre, int numeroPatas, String color, int peso) { 
        this.nombre = nombre;
        this.numeroPatas = numeroPatas;
        this.color = color;
        this.peso = peso;
    }

    public void numeroPatas() {
        if(numeroPatas<0 || numeroPatas>4) {
            
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "El Gato " + nombre + ", de " + numeroPatas + " patas y de color " + color + " tiene un peso de " + peso + " kilos";
    }

    
}
