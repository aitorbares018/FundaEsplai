import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;  
        float resultado = 0;   
        char operador;

        System.out.print("Ingresa la operación (ej. 4 2 *): ");
        numero1 = scanner.nextInt();  
        numero2 = scanner.nextInt();  
        operador = scanner.next().charAt(0);  

        
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                   
                    resultado = (float) numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;  
                }
                break;
            default:
                System.out.println("Operador no válido.");
                System.out.println("Operadores válidos: +, -, *, /");
                return;  
        }

        
        if (operador == '/') {
           
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + resultado);
        } else {
           
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + (int) resultado);
        }
    }
}
