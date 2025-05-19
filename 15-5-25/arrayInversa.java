import java.util.Scanner;

public class arrayInversa {

    public static void main(String[] args) {
       
        int numeros[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejecutando tests...");
        testArrayInversa();

        System.out.print("Introduce 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Los números en orden inverso son: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");  
        }
    }
    private static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
    private static void testArrayInversa() {
        if (!assertEquals(5, arrayInversa(5, 3, 2, 1, 4))) {
            System.err.println("Test fallido: arrayInversa debe ser 5");
        }
        if (!assertEquals(10, arrayInversa(10, 9, 8, 7, 6))) {
            System.err.println("Test fallido: arrayInversa debe ser 10");
        }
        if (!assertEquals(15, arrayInversa(15, 14, 13, 12, 11))) {
            System.err.println("Test fallido: arrayInversa debe ser 15");
        }
        System.out.println("Tests completados.");
    }
    private static int arrayInversa(int a, int b, int c, int d, int e) {
        int inversa = a;
        if (b > inversa)
            inversa = b;
        if (c > inversa)
            inversa = c;
        if (d > inversa)
            inversa = d;
        if (e > inversa)
            inversa = e;
        return inversa;
    }

}
