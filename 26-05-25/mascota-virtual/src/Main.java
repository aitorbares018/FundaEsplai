import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MascotaVirtual mascota = null;
        String nombre;
        int opcion,accion;

        System.out.println("🐾 Bienvenido al mundo de Mascotas Virtuales 🐾");
        System.out.print("¿Cómo se llamará tu mascota? ");
        nombre = scanner.nextLine();

        System.out.println("\nElige una mascota:");
        System.out.println("1. Perro 🐶");
        System.out.println("2. Gato 🐱");
        System.out.println("3. Hámster 🐹");
        System.out.print("Opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                mascota = new PerroVirtual(nombre);
                break;
            case 2:
                mascota = new GatoVirtual(nombre);
                break;
            case 3:
                mascota = new HamsterVirtual(nombre);
                break;
            default:
                System.out.println("Opción inválida. Se asignará un Gato por defecto.");
                mascota = new GatoVirtual(nombre);
        }

        do {
            System.out.println("\n====== MENÚ DE INTERACCIÓN ======");
            System.out.println("1. Comer 🍖");
            System.out.println("2. Jugar 🎾");
            System.out.println("3. Ver estado 📋");
            System.out.println("0. Salir 🚪");
            System.out.print("Elige una acción: ");
            accion = scanner.nextInt();
            scanner.nextLine();

            switch (accion) {
                case 1:
                    mascota.comer();
                    break;
                case 2:
                    mascota.jugar();
                    break;
                case 3:
                    mascota.mostrarEstado();
                    break;
                case 0:
                    System.out.println("👋 ¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (accion != 0);

    }
}
