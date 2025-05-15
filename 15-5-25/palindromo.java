import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        String palabra;
        String palabraInvertida = "";
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        palabra = scanner.nextLine();

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        if (palabra.equalsIgnoreCase(palabraInvertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
    
}
