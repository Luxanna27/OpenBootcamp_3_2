public class Coche {
    int puertas = 4;
    int una = 1;

    public static void main(String[] args) {
        Coche miCoche = new Coche();

        int resultado = miCoche.puertas + miCoche.una;

        System.out.println("El coche tiene "+resultado+" puertas");

    }


}