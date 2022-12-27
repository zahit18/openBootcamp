package poo;

public class smartPhone extends smartDevice{
    boolean huella;
    public smartPhone(){

    }

    public smartPhone(boolean huella) {
        this.huella = huella;
    }

    public smartPhone(String marca, String modelo, String color, Double pulgadas, String io, Double peso, String gama, boolean camara, boolean huella) {
        super(marca, modelo, color, pulgadas, io, peso, gama, camara);
        this.huella = huella;
    }

}
