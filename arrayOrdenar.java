import java.util.Scanner;

public class arrayOrdenar {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int opcion;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        do {
            System.out.println("\nElija una opción:");
            System.out.println("1. Bubble sort");
            System.out.println("2. Merge sort");
            System.out.println("3. Quick sort");
            System.out.println("0. Salir");
            System.out.print("Su opción: ");
            opcion = scanner.nextInt();

            int[] clonarNumeros = numeros.clone();

            switch (opcion) {
                case 1:
                    System.out.println("\nOrdenando con Bubble Sort...");
                    bubbleSort(clonarNumeros);
                    mostrarResultado(clonarNumeros);
                    break;
                case 2:
                    System.out.println("\nOrdenando con Merge Sort...");
                    mergeSort(clonarNumeros, 0, clonarNumeros.length - 1);
                    mostrarResultado(clonarNumeros);
                    break;
                case 3:
                    System.out.println("\nOrdenando con Quick Sort...");
                    quickSort(clonarNumeros, 0, clonarNumeros.length - 1);
                    mostrarResultado(clonarNumeros);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);
            merge(arr, izquierda, medio, derecha);
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[izquierda + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort
    public static void quickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(arr, bajo, alto);
            quickSort(arr, bajo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }

    public static int particion(int[] arr, int bajo, int alto) {
        int pivot = arr[alto];
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    public static void mostrarResultado(int[] arr) {
        System.out.println("Resultado ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
