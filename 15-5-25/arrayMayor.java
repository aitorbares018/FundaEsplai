import java.util.Scanner;

public class arrayMayor {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[11];
        int mayor = 0, posicion = 0;

        System.out.print("Introduce 10 números enteros:");
        for (int i = 1; i < 11; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicion = i;
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("La posición del número mayor es: " + posicion);
    }
}
