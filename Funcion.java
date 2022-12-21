package Funciones;

public class Funcion {
    public static void main(String[] args) {
         String compra1 = compra(47.8,16.9);
         String compra2 = compra(99.33,7.3);
         String compra3 = compra(50.0,16.1);
         String compra4 = compra(500.48,16.7);
         System.out.println(compra1);
         System.out.println(compra2);
         System.out.println(compra3);
         System.out.println(compra4);

    }


    static String compra(double precio, double iva){
        double subTotal = precio;
        double totalIva = precio / iva;
        double total = totalIva + precio;
        return "Sub total: " + subTotal + "\n" + "IVA: " + totalIva + "\n" + "Total: " + total;
    }

}
