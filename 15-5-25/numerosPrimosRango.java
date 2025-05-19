import java.util.Scanner;

public class numerosPrimosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fin;

        System.out.print("Ingresa el inicio del rango: ");
        inicio = scanner.nextInt();
        System.out.print("Ingresa el fin del rango: ");
        fin = scanner.nextInt();

        System.out.println("Números primos entre " + inicio + " y " + fin + ":");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
