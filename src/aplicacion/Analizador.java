package aplicacion;

public class Analizador {

    public static int[] generarArrayOrdenado(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static long medirPrimero(int[] array) {
        long inicio = System.nanoTime();
        QuickSort.quickSortPrimero(array, 0, array.length - 1);
        long fin = System.nanoTime();
        return fin - inicio;
    }

    public static long medirCentral(int[] array) {
        long inicio = System.nanoTime();
        QuickSort.quickSortCentral(array, 0, array.length - 1);
        long fin = System.nanoTime();
        return fin - inicio;
    }
}