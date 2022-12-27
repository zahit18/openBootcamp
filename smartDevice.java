package poo;

public class smartDevice {
    String marca;
    String modelo;
    String color;
    Double pulgadas;
    String io;
    Double peso;
    String gama;
    boolean camara;

    public smartDevice(){

    }

    public smartDevice(String marca, String modelo, String color, Double pulgadas, String io, Double peso, String gama, boolean camara) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pulgadas = pulgadas;
        this.io = io;
        this.peso = peso;
        this.gama = gama;
        this.camara = camara;
    }
}
