import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {
        String palabra;
        int contador = 0, contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejecutando tests...");
        testContarVocales(contador, contadorA, contadorE, contadorI, contadorO, contadorU);
       

        System.out.print("Introduce una frase o palabra: ");
        palabra = scanner.nextLine();
        contarVocales(palabra, contador, contadorA, contadorE, contadorI, contadorO, contadorU);
       
    }

    public static int contarVocales(String palabra, int contador, int contadorA, int contadorE, int contadorI,
            int contadorO, int contadorU) {
        palabra = palabra.toLowerCase(); 
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
            if (letra == 'a') {
                contadorA++;
            }
            if (letra == 'e') {
                contadorE++;
            }
            if (letra == 'i') {
                contadorI++;
            }
            if (letra == 'o') {
                contadorO++;
            }
            if (letra == 'u') {
                contadorU++;
            }
        }
        System.out.println("Número total de vocales: " + contador);
        System.out.println("Número de 'a': " + contadorA);  
        System.out.println("Número de 'e': " + contadorE);
        System.out.println("Número de 'i': " + contadorI);
        System.out.println("Número de 'o': " + contadorO);
        System.out.println("Número de 'u': " + contadorU);
        return contador;
    }

    public static boolean assertEquals(int esperado, int actual) {
        return esperado == actual;
    }
    public static void testContarVocales(int contador, int contadorA, int contadorE, int contadorI, int contadorO,
            int contadorU) {
        if (!assertEquals(5, contarVocales("Hola Mundo", contador, contadorA, contadorE, contadorI, contadorO, contadorU))) {
            System.err.println("Test fallido: contarVocales debe ser 5");
        }
        if (!assertEquals(2, contarVocales("Java", contador, contadorA, contadorE, contadorI, contadorO, contadorU))) {
            System.err.println("Test fallido: contarVocales debe ser 2");
        }
        if (!assertEquals(3, contarVocales("Programación", contador, contadorA, contadorE, contadorI, contadorO,
                contadorU))) {
            System.err.println("Test fallido: contarVocales debe ser 3");
        }
        System.out.println("Tests completados.");
    }

}
