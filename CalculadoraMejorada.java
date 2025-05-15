import java.util.Scanner;

public class CalculadoraMejorada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        float resultado = 0;
        String operador;

        System.out.print("Ingresa la operación (ej. 4 2 *): ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        operador = scanner.next();

        switch (operador) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 != 0) {

                    resultado = (float) numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
                break;
            case "^":
                resultado = (float) Math.pow(numero1, numero2);
                break;
            case "sqrt":
                if (numero1 >= 0) {
                    resultado = (float) Math.sqrt(numero1);
                } else {
                    System.out.println("Error: Raíz cuadrada de un número negativo.");
                    return;
                }
                break;
            case "mod":
                if (numero2 != 0) {
                    resultado = numero1 % numero2;
                } else {
                    System.out.println("Error: Módulo por cero.");
                    return;
                }
                break;
            case "enc":
            
            

            default:
                System.out.println("Operador no válido.");
                System.out.println("Operadores válidos: +, -, *, /");
                return;
        }

        if (operador == "/") {
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + resultado);
        } else {
            System.out
                    .println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + (int) resultado);
        }
    }
}
