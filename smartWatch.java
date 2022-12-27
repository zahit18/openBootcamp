package poo;

public class smartWatch extends smartDevice{
    boolean gps;
    public smartWatch(){

    }

    public smartWatch(boolean gps) {
        this.gps = gps;
    }

    public smartWatch(String marca, String modelo, String color, Double pulgadas, String io, Double peso, String gama, boolean camara, boolean gps) {
        super(marca, modelo, color, pulgadas, io, peso, gama, camara);
        this.gps = gps;
    }

}
