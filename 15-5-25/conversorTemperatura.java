import java.util.Scanner;

public class conversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura;

        System.out.println("Conversor de Temperatura");
        System.out.println("----------------------");
        System.out.println("Seleccione la conversión que desea:");
        System.out.println("1. Celsius a Fahrenheit y Kelvin");
        System.out.println("2. Fahrenheit a Celsius y Kelvin");
        System.out.println("3. Kelvin a Celsius y Fahrenheit");
        System.out.print("Opción (1-3): ");
        opcion = scanner.nextInt();

        System.out.print("Ingrese el valor de temperatura: ");
        temperatura = scanner.nextDouble();

        switch (opcion) {
            case 1:
                convertirDesdeCelsius(temperatura);
                break;
            case 2:
                convertirDesdeFahrenheit(temperatura);
                break;
            case 3:
                convertirDesdeKelvin(temperatura);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void convertirDesdeCelsius(double c) {
        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;
        System.out.printf("%.2f °C = %.2f °F y %.2f K\n", c, f, k);
    }

    public static void convertirDesdeFahrenheit(double f) {
        double c = (f - 32) * 5 / 9;
        double k = c + 273.15;
        System.out.printf("%.2f °F = %.2f °C y %.2f K\n", f, c, k);
    }

    public static void convertirDesdeKelvin(double k) {
        double c = k - 273.15;
        double f = (c * 9 / 5) + 32;
        System.out.printf("%.2f K = %.2f °C y %.2f °F\n", k, c, f);
    }
}
