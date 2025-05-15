import java.util.Scanner;

public class vocales {

    public static void main(String[] args) {
        String palabra;
        int contador = 0, contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase o palabra: ");
        palabra = scanner.nextLine();
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
        System.out.println("La palabra tiene " + contador + " vocales.");
        System.out.println("La palabra tiene " + contadorA + " letras 'a'.");
        System.out.println("La palabra tiene " + contadorE + " letras 'e'.");
        System.out.println("La palabra tiene " + contadorI + " letras 'i'.");
        System.out.println("La palabra tiene " + contadorO + " letras 'o'.");
        System.out.println("La palabra tiene " + contadorU + " letras 'u'.");
    }

}
