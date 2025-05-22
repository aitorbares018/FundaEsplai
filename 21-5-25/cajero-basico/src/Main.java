import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static CuentaBancaria cuenta;

    public static void main(String[] args) throws Exception {
       
        int opcion;
        String titular;
        double saldoInicial;

       System.out.println("========== BIENVENIDO AL CAJERO ==========");
       System.out.print("Ingrese el nombre del titular de la cuenta: ");
        titular = scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldoInicial = scanner.nextDouble();
        scanner.nextLine(); 

        cuenta = new CuentaBancaria(titular, saldoInicial);
        
        do { 
            System.out.println("\n========== MENÚ DEL CAJERO ==========");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Ver resumen final");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    retirar();
                    break;
                case 4:
                    mostrarResumen();
                    break;
                case 0:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 0);

    }
    public static void consultarSaldo() {
        System.out.println("💰 Saldo actual: " + cuenta.getSaldo());
    }
    public static void depositar() {
        System.out.print("💵 Ingrese cantidad a depositar: ");
        double cantidad = scanner.nextDouble();
        if (cantidad > 0) {
            cuenta.depositar(cantidad);
            System.out.println("✅ Depósito exitoso.");
        } else {
            System.out.println("❌ La cantidad debe ser mayor que cero.");
        }
    }
    public static void retirar() {
        System.out.print("💵 Ingrese cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        if (cuenta.retirar(cantidad)) {
            System.out.println("✅ Retiro exitoso.");
        } else {
            System.out.println("❌ Fondos insuficientes o cantidad no válida.");
        }
    }
    public static void mostrarResumen() {
        System.out.println("\n" + cuenta.resumen());
    }
}
