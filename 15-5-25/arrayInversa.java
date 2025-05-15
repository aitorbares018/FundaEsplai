import java.util.Scanner;

public class arrayInversa {

    public static void main(String[] args) {
       
        int numeros[] = new int[10];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Los números en orden inverso son: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");  
        }
    }

}
