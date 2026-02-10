package aplicacion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tamanos = {1000, 5000, 10000};

        System.out.println("===== QUICK SORT BENCHMARK =====");

        for (int n : tamanos) {

            int[] original = Analizador.generarArrayOrdenado(n);

            int[] copia1 = Arrays.copyOf(original, n);
            int[] copia2 = Arrays.copyOf(original, n);

            long tiempoPrimero = Analizador.medirPrimero(copia1);
            long tiempoCentral = Analizador.medirCentral(copia2);

            System.out.println("N = " + n);
            System.out.println("Pivote primero (ns): " + tiempoPrimero);
            System.out.println("Pivote central (ns): " + tiempoCentral);
            System.out.println("-----------------------------------");
        }
    }
}