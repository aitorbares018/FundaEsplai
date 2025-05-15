import java.util.Scanner;

public class palindromoFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        System.out.print("Ingresa una frase: ");
        frase = scanner.nextLine();
        String fraseSinEspacios = frase.replaceAll("\\s+", "").toLowerCase();
        StringBuilder fraseReversa = new StringBuilder(fraseSinEspacios);
        
        fraseReversa.reverse();
        if (fraseSinEspacios.equals(fraseReversa.toString())) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
        
    }
}
