import java.util.Scanner;

public class contarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.print("Ingresa el texto: ");
        texto = scanner.nextLine();

        String[] palabras = texto.trim().split("\\s+");
        int contador = palabras.length;

        System.out.println("Número de palabras: " + contador);
    }
}
