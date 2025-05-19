import java.util.Scanner;

public class arrayMayor {
    public static void main(String[] args) {

        int numeros[] = new int[11];
        int mayor = 0, posicion = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejecutando tests...");
        testArrayMayor();

        System.out.print("Introduce 10 números enteros:");
        for (int i = 1; i < 11; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicion = i;
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("La posición del número mayor es: " + posicion);
    }

    private static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    private static void testArrayMayor() {
        if (!assertEquals(5, arrayMayor(5, 3, 2, 1, 4))) {
            System.err.println("Test fallido: arrayMayor debe ser 5");
        }
        if (!assertEquals(10, arrayMayor(10, 9, 8, 7, 6))) {
            System.err.println("Test fallido: arrayMayor debe ser 10");
        }
        if (!assertEquals(15, arrayMayor(15, 14, 13, 12, 11))) {
            System.err.println("Test fallido: arrayMayor debe ser 15");
        }
        System.out.println("Tests completados.");
    }

    private static int arrayMayor(int a, int b, int c, int d, int e) {
        int mayor = a;
        if (b > mayor)
            mayor = b;
        if (c > mayor)
            mayor = c;
        if (d > mayor)
            mayor = d;
        if (e > mayor)
            mayor = e;
        return mayor;
    }
}
