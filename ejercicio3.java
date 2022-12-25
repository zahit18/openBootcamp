public class ejercicio3 {
    public static void main(String[] args) {

        String[] nombrs = {"Sergio", "Pepe", "Dani", "Marcelo"};
        String concatenacion = "";
        for (int i = 0;  i <= nombrs.length; i++){
            if (i < nombrs.length){
                concatenacion += nombrs[i] + " ";
            } else {
                System.out.println(concatenacion);
            }
        }
    }
}
