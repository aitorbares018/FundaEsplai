import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n=========== MENÚ DE PERSONAS ===========");
            System.out.println("1. Crear nueva persona");
            System.out.println("2. Mostrar todas las personas");
            System.out.println("3. Modificar persona");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    mostrarPersonas();
                    break;
                case 3:
                    modificarPersona();
                    break;
                case 0:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
                    break;
            }

        } while (opcion != 0);
    }

    public static void crearPersona() {

        String nombre, correo;
        int edad;

        System.out.println("\n=========== CREAR NUEVA PERSONA ===========");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        Persona nueva = null;

        while (nueva == null) {
            System.out.print("Correo: ");
            correo = scanner.nextLine();

            try {
                nueva = new Persona(nombre, edad, correo);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        personas.add(nueva);
        System.out.println("✅ Persona creada con éxito.");
    }

    public static void mostrarPersonas() {

        System.out.println("\n=========== LISTA DE PERSONAS ===========");
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (int i = 0; i < personas.size(); i++) {
                System.out.println("Persona " + (i + 1) + ":");
                System.out.println(personas.get(i).toString());
                System.out.println("-----------------------------------------");
            }
        }
    }

    public static void modificarPersona() {

        String nuevoNombre, nuevoCorreo;
        int nuevaEdad, index, opcion;

        System.out.println("\n=========== MODIFICAR PERSONA ===========");
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
            return;
        }

        System.out.println("Personas disponibles:");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i).getNombre());
        }

        System.out.print("Selecciona el número de la persona a modificar (1-" + personas.size() + "): ");
        index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= personas.size()) {
            System.out.println("❌ Opción inválida.");
            return;
        }

        Persona persona = personas.get(index);
        System.out.println("Persona seleccionada: " + persona.getNombre());

        do {
            System.out.println("\n¿Qué quieres modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Edad");
            System.out.println("3. Correo");
            System.out.println("0. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo nombre (actual: " + persona.getNombre() + "): ");
                    nuevoNombre = scanner.nextLine();
                    persona.setNombre(nuevoNombre);
                    System.out.println("✅ Nombre actualizado.");
                    break;

                case 2:
                    System.out.print("Nueva edad (actual: " + persona.getEdad() + "): ");
                    nuevaEdad = scanner.nextInt();
                    scanner.nextLine();
                    persona.setEdad(nuevaEdad);
                    System.out.println("✅ Edad actualizada.");
                    break;

                case 3:
                    while (true) {
                        try {
                            System.out.print("Nuevo correo (actual: " + persona.getCorreo() + "): ");
                            nuevoCorreo = scanner.nextLine();
                            persona.setCorreo(nuevoCorreo);
                            System.out.println("✅ Correo actualizado.");
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

}
