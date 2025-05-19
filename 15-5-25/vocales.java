import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {
        String palabra;
        int contador = 0, contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra: ");
        palabra = scanner.nextLine();
        contarVocales(palabra, contador, contadorA, contadorE, contadorI, contadorO, contadorU);
        System.out.println("Número total de vocales: " + contador);
        System.out.println("Número de 'a': " + contadorA);
        System.out.println("Número de 'e': " + contadorE);
        System.out.println("Número de 'i': " + contadorI);
        System.out.println("Número de 'o': " + contadorO);
        System.out.println("Número de 'u': " + contadorU);
    }

    // Método que cuenta las vocales en una palabra
    // y las vocales individuales
    public static void contarVocales(String palabra, int contador, int contadorA, int contadorE, int contadorI,
            int contadorO, int contadorU) {
        palabra = palabra.toLowerCase(); // Convertir a minúsculas para simplificar la comparación
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

    }

}
