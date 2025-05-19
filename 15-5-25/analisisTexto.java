import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class analisisTexto {
    public static void main(String[] args) throws IOException {

        String texto, palabraLarga = "";
        int vocales = 0, caracteres = 0, palabras = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        texto = scanner.nextLine();
        String textoOriginal = texto;
        texto = texto.toLowerCase();
        String[] palabrasTexto = texto.split(" ");
        for (String palabra : palabrasTexto) {
            if (palabra.length() > 0) {
                palabras++;
                caracteres += palabra.length();
                if (palabra.length() > palabraLarga.length()) {
                    palabraLarga = palabra;
                }
            }
            for (char c : palabra.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    vocales++;
                }
            }
        }

        String textoSinEspacios = texto.replaceAll("[^a-z]", "");
        boolean palindromo = esPalindromo(textoSinEspacios);

        String resultado = 
            "Texto introducido: " + textoOriginal + "\n" +
            "Número de caracteres: " + caracteres + "\n" +
            "Número de palabras: " + palabras + "\n" +
            "Palabra más larga: " + palabraLarga + "\n" +
            "Número de vocales: " + vocales + "\n" +
            (palindromo ? "La frase es un palíndromo." : "La frase no es un palíndromo.") + "\n";

        System.out.println(resultado);

        // Guardar en archivo (modo append y con salto de línea antes)
        File archivo = new File("analizarTexto.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        FileWriter escritor = new FileWriter(archivo, true);
        escritor.write("\n");
        escritor.write(resultado);
        escritor.close();

        System.out.println("Resultado guardado en 'analizarTexto.txt'.");
    }

    public static boolean esPalindromo(String texto) {
        int longitud = texto.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
