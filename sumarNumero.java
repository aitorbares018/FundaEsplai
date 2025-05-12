import java.util.Scanner;

public class sumarNumero {
    public static void main(String[] args) {
    
        int numero1,numero2,resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un primer numero: ");
        numero1=scanner.nextInt();
         System.out.print("Introduce un segundo numero: ");
        numero2=scanner.nextInt();

        resultado=numero1+numero2;

        System.out.println("El resultado entre la suma de numero es "+ resultado);
    }
    
}
