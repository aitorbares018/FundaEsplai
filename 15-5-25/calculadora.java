import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        int numero1, numero2;  
        float resultado = 0;   
        char operador;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejecutando tests...");
        testCalculadora();
        
        System.out.print("Ingresa la operación (ej. 4 2 *): ");
        numero1 = scanner.nextInt();  
        numero2 = scanner.nextInt();  
        operador = scanner.next().charAt(0);
        resultado = calculadora(numero1, numero2, operador);        
        

        
        if (operador == '/') {
           
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + resultado);
        } else {
           
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " + (int) resultado);
        }
    }
    private static boolean assertEquals(float expected, float actual) {
        return expected == actual;
    }
    private static void testCalculadora() {
        if (!assertEquals(5, calculadora(2, 3, '+'))) {
            System.err.println("Test fallido: calculadora debe ser 5");
        }
        if (!assertEquals(1, calculadora(3, 2, '-'))) {
            System.err.println("Test fallido: calculadora debe ser 1");
        }
        if (!assertEquals(6, calculadora(2, 3, '*'))) {
            System.err.println("Test fallido: calculadora debe ser 6");
        }
        if (!assertEquals(2, calculadora(4, 2, '/'))) {
            System.err.println("Test fallido: calculadora debe ser 2");
        }
        System.out.println("Tests completados.");
    }
    private static float calculadora(int a, int b, char operador) {
        float resultado = 0;
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = (float) a / b;
                } else {
                    System.out.println("Error: División por cero.");
                    return 0;  
                }
                break;
            default:
                System.out.println("Operador no válido.");
                return 0;  
        }
        return resultado;
    }
}
