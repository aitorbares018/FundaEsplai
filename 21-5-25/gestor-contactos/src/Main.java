import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Agenda agenda = new Agenda();

    public static void main(String[] args) throws Exception {

        int opcion;

        do {
            System.out.println("\n=========== 📘 MENÚ AGENDA DE CONTACTOS ===========");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto por nombre");
            System.out.println("3. Buscar contactos parcialmente");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarContacto();
                    break;
                case 2:
                    buscarPorNombre();
                    break;
                case 3:
                    buscarParcial();
                    break;
                case 4:
                    mostrarTodos();
                    break;
                case 0:
                    System.out.println("👋 Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void agregarContacto() {
        String nombre, telefono, email;

        System.out.println("\n=========== ➕ AGREGAR CONTACTO ===========");

        // Validar que el nombre no esté duplicado
        while (true) {
            System.out.print("🆔 Nombre: ");
            nombre = scanner.nextLine();

            if (!agenda.existeContacto(nombre)) {
                break;
            } else {
                System.out.println("⚠️ Ya existe un contacto con ese nombre. Intenta otro.");
            }
        }

        // Validación del teléfono
        while (true) {
            System.out.print("📞 Teléfono (9 dígitos): ");
            telefono = scanner.nextLine();
            if (telefono.matches("\\d{9}")) {
                break;
            } else {
                System.out.println("❌ Teléfono inválido. Debe tener exactamente 9 dígitos.");
            }
        }

        // Validación del email
        while (true) {
            System.out.print("📧 Email (debe contener '@'): ");
            email = scanner.nextLine();
            if (email.contains("@")) {
                break;
            } else {
                System.out.println("❌ Email inválido. Debe contener '@'.");
            }
        }

        Contacto nuevo = new Contacto(nombre, telefono, email);
        agenda.agregarContacto(nuevo);
        System.out.println("✅ Contacto agregado con éxito.");
    }

    public static void buscarPorNombre() {
        System.out.println("\n=========== 🔍 BUSCAR CONTACTO POR NOMBRE ===========");
        System.out.print("🔤 Nombre: ");
        String nombreBuscado = scanner.nextLine();

        Contacto encontrado = agenda.buscarContacto(nombreBuscado);

        System.out.println("-----------------------------------------------------");
        if (encontrado != null) {
            System.out.println("✅ Contacto encontrado:\n");
            System.out.println("🆔 Nombre:    " + encontrado.getNombre());
            System.out.println("📞 Teléfono:  " + encontrado.getTelefono());
            System.out.println("📧 Email:     " + encontrado.getEmail());
        } else {
            System.out.println("❌ No se encontró ningún contacto con ese nombre.");
        }
        System.out.println("-----------------------------------------------------");
    }

    public static void buscarParcial() {

        System.out.println("\n=========== 🔍 BUSCAR CONTACTO PARCIAL ===========");
        System.out.print("Introduce parte del nombre: ");
        String fragmento = scanner.nextLine();

        java.util.List<Contacto> resultados = agenda.buscarParcial(fragmento);
        if (resultados.isEmpty()) {
            System.out.println("❌ No se encontraron coincidencias.");
        } else {
            System.out.println("🔍 Contactos encontrados:");
            for (Contacto c : resultados) {
                System.out.println("----------------------------------");
                System.out.println(c);
            }
        }
    }

    public static void mostrarTodos() {
        java.util.List<Contacto> todos = agenda.getContactos();
        if (todos.isEmpty()) {
            System.out.println("📭 No hay contactos en la agenda.");
        } else {
            System.out.println("\n=========== 📒 TODOS LOS CONTACTOS ===========");
            for (Contacto c : todos) {
                System.out.println("----------------------------------");
                System.out.println(c);
            }
        }
    }

}
