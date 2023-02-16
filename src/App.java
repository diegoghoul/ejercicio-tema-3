
public class App {
    public static void main(String[] args) {
        System.out.println("La suma es: " + sumade3(5, 5, 5));
        coche miCoche = new coche();
        System.out.println( "El numero de puertas inicial es: " + miCoche.puertas);
        miCoche.aumentarPuerta();
        System.out.println( "El numero de puertas es: " + miCoche.puertas);
    }

    public static int sumade3(int a, int b, int c) {
        return a + b + c;
    }
}

class coche {
    public int puertas;

    public void aumentarPuerta() {
        this.puertas++;
    }


}