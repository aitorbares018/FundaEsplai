import java.util.Scanner;

public class remplazarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto,texto2;
        char letra,simbolo;

        System.out.print("Ingresa el texto: ");
        texto = scanner.nextLine();
        System.out.print("Ingresa la letra a reemplazar: ");
        letra = scanner.next().charAt(0);
        System.out.print("Ingresa el simbolo por el que quieres reemplazar la letra: ");
        simbolo = scanner.next().charAt(0);
       
        String textoModificado = texto.replaceAll(String.valueOf(letra), String.valueOf(simbolo));
        System.out.println("Texto original: " + texto);
        System.out.println("Texto modificado: " + textoModificado);
    }
}
