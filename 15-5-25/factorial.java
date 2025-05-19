import java.util.Scanner;

public class factorial {

    public static int calcularFactorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * calcularFactorial(numero - 1);
    }

    private static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    private static void testCalcularFactorial() {
        if (!assertEquals(1, factorial.calcularFactorial(0))) {
            System.err.println("Test fallido: factorial(0) debe ser 1");
        }
        if (!assertEquals(1, factorial.calcularFactorial(1))) {
            System.err.println("Test fallido: factorial(1) debe ser 1");
        }
        if (!assertEquals(2, factorial.calcularFactorial(2))) {
            System.err.println("Test fallido: factorial(2) debe ser 2");
        }
        if (!assertEquals(6, factorial.calcularFactorial(3))) {
            System.err.println("Test fallido: factorial(3) debe ser 6");
        }
        if (!assertEquals(120, factorial.calcularFactorial(5))) {
            System.err.println("Test fallido: factorial(5) debe ser 120");
        }

        System.out.println("Todos los tests terminados.");
    }

    public static void main(String[] args) {

        int numero;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        
        testCalcularFactorial();

        System.out.print("Introduce un número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        /* Versión recursion */
        factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
