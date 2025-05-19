import java.util.Scanner;

public class buscarPalabra {
    public static void main(String[] args) {
        String text,palabra;
        boolean contador = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el texto: ");
        text = scanner.nextLine();
        System.out.print("Ingresa la palabra a buscar: ");
        palabra = scanner.nextLine();
        contador = contarPalabra(text, palabra, contador);
        if (contador) {
            encontrarPosicion(text, palabra);
            System.out.println("La palabra '" + palabra + "' se encuentra en el texto.");
        } else {
            System.out.println("La palabra '" + palabra + "' NO se encuentra en el texto.");
        }
    }
    public static boolean contarPalabra(String text, String palabra, boolean contador) {
        String[] palabras = text.split(" ");
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador = true;
            }
        }
        return contador;
    }
    public static void encontrarPosicion(String text, String palabra) {
        String[] palabras = text.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.println("La palabra '" + palabra + "' se encuentra en la posición " + (i + 1) + ".");
            }
        }
    }
    
}
