import java.util.Scanner;

public class NumeroPrimos {
    public static void main(String[] args) {

        int numero;
        boolean primo=true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = true;
            } else {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }
}
