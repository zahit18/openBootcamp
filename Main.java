package poo;

public class Main {

    public static void main(String[] args) {
        smartDevice pc = new smartDevice("msi","katana","negra",14.7,"Windows",2.5,"media",true);
        System.out.println(pc.marca);
        System.out.println(pc.modelo);
        System.out.println(pc.color);

        smartPhone samsung = new smartPhone(true);
        samsung.marca = "Samsung";
        samsung.modelo = "S22";
        samsung.color = "Golden";
        samsung.pulgadas = 6.7;
        samsung.io = "Android";
        samsung.peso = 0.450;
        samsung.gama = "alta";
        samsung.camara = true;


        System.out.println(samsung.marca);
        System.out.println(samsung.huella);
        System.out.println(samsung.color);
        System.out.println(samsung.io);
        System.out.println(samsung.camara);

        smartWatch appleWatch = new smartWatch(true);
        appleWatch.marca = "Apple";
        appleWatch.modelo = "14";
        appleWatch.color = "Negro";
        appleWatch.pulgadas = 1.6;
        appleWatch.io = "IOS";
        appleWatch.peso = 0.22;
        appleWatch.gama = "media";
        appleWatch.camara = false;

        System.out.println(appleWatch.marca);
        System.out.println(appleWatch.gps);
        System.out.println(appleWatch.io);
        System.out.println(appleWatch.camara);

    }
}
