import java.util.Scanner;

public class factorial {
    
        public static int calcularFactorial(int numero) {
            if (numero <= 1) {
                return 1;
            }
            return numero * calcularFactorial(numero - 1);
        }
    public static void main(String[] args) {
        
        int numero;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        /* Versión recursiva */
        factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
