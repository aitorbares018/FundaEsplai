import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i);
            }
        }
    }
}
