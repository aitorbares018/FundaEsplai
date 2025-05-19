import java.util.Scanner;

public class remplazarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        System.out.print("Ingresa el texto: ");
        texto = scanner.nextLine();

        String textoModificado = texto.replace("a", "@");

        System.out.println("Texto modificado: " + textoModificado);
    }
}
