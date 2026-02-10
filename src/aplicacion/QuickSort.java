package aplicacion;

public class QuickSort {
    // QuickSort con primer elemento.
    public static void quickSortPrimero(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionPrimero(array, low, high);
            quickSortPrimero(array, low, pivotIndex - 1);
            quickSortPrimero(array, pivotIndex + 1, high);
        }
    }

    private static int partitionPrimero(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && array[i] <= pivot) i++;
            while (array[j] > pivot) j--;

            if (i < j) {
                swap(array, i, j);
            }
        }

        swap(array, low, j);
        return j;
    }

    // QuickSort con pivote central.
    public static void quickSortCentral(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partitionCentral(array, low, high);
            quickSortCentral(array, low, pivotIndex - 1);
            quickSortCentral(array, pivotIndex + 1, high);
        }
    }

    private static int partitionCentral(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        swap(array, low, mid); // Muevo el pivote al inicio.
        return partitionPrimero(array, low, high);
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}