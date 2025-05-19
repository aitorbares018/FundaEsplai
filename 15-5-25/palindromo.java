import java.util.Scanner;

public class palindromo {

    public static boolean esPalindromo(String palabra) {
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        return palabra.equalsIgnoreCase(palabraInvertida);
    }

    
    private static void testEsPalindromo() {
        if (!assertEquals(true, esPalindromo("reconocer"))) {
            System.err.println("Fallo: 'reconocer' debería ser palíndromo");
        }
        if (!assertEquals(true, esPalindromo("Ana"))) {
            System.err.println("Fallo: 'Ana' debería ser palíndromo");
        }
        if (!assertEquals(false, esPalindromo("hola"))) {
            System.err.println("Fallo: 'hola' NO debería ser palíndromo");
        }
        if (!assertEquals(true, esPalindromo("oso"))) {
            System.err.println("Fallo: 'oso' debería ser palíndromo");
        }

        System.out.println("Tests completados.");
    }

    private static boolean assertEquals(boolean esperado, boolean actual) {
        return esperado == actual;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }

        System.out.println("\nEjecutando tests...");
        testEsPalindromo();
    }
}
