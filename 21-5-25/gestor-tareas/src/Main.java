import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Tarea> tareas = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        int opcion;

        do {
            System.out.println("\n=========== MENÚ DE TAREAS ===========");
            System.out.println("1. Crear nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Marcar tarea como finalizada");
            System.out.println("4. Mostrar solo tareas pendientes");
            System.out.println("5. Contar tareas finalizadas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearTarea();
                    break;
                case 2:
                    mostrarTareas();
                    break;
                case 3:
                    marcarTareaComoFinalizada();
                    break;
                case 4:
                    mostrarTareasPendientes();
                    break;
                case 5:
                    contarTareasFinalizadas();
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

    public static void crearTarea() {

        String titulo, descripcion;

        System.out.println("\n=========== CREAR NUEVA TAREA ===========");
        System.out.print("Título: ");
        titulo = scanner.nextLine();
        System.out.print("Descripción: ");
        descripcion = scanner.nextLine();
        Tarea nueva = new Tarea(titulo, descripcion);
        tareas.add(nueva);
        System.out.println("✅ Tarea creada con estado PENDIENTE.");
    }

    public static void mostrarTareas() {
        System.out.println("\n=========== 📋 LISTA DE TAREAS ===========");
        if (tareas.isEmpty()) {
            System.out.println("⚠️  No hay tareas registradas.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                Tarea tarea = tareas.get(i);
                System.out.println("📝 Tarea " + (i + 1));
                System.out.println("   Título      : " + tarea.getTitulo());
                System.out.println("   Descripción : " + tarea.getDescripcion());
                System.out.println("   Estado      : "
                        + (tarea.getEstado() == Tarea.Estado.PENDIENTE ? "⌛ PENDIENTE" : "✅ FINALIZADA"));
                System.out.println("----------------------------------------");
            }
        }
    }

    public static void marcarTareaComoFinalizada() {

        ArrayList<Integer> indicesPendientes = new ArrayList<>();
        int index, opcion, tareaIndex;

        System.out.println("\n=========== MARCAR TAREA COMO FINALIZADA ===========");
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getEstado() == Tarea.Estado.PENDIENTE) {
                indicesPendientes.add(i);
            }
        }

        if (indicesPendientes.isEmpty()) {
            System.out.println("🎉 No hay tareas pendientes para finalizar.");
            return;
        }

        for (int i = 0; i < indicesPendientes.size(); i++) {
            index = indicesPendientes.get(i);
            System.out.println((i + 1) + ". " + tareas.get(index).getTitulo());
        }

        System.out.print("Selecciona el número de la tarea a marcar como finalizada: ");
        opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > indicesPendientes.size()) {
            System.out.println("❌ Selección inválida.");
            return;
        }

        tareaIndex = indicesPendientes.get(opcion - 1);
        tareas.get(tareaIndex).marcarComoFinalizada();
        System.out.println("✅ Tarea marcada como FINALIZADA.");
    }

    public static void mostrarTareasPendientes() {
        boolean hayPendientes = false;

        System.out.println("\n=========== ⏳ TAREAS PENDIENTES ===========");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            if (t.getEstado() == Tarea.Estado.PENDIENTE) {
                hayPendientes = true;
                System.out.println("🔸 Tarea " + (i + 1));
                System.out.println("   Título      : " + t.getTitulo());
                System.out.println("   Descripción : " + t.getDescripcion());
                System.out.println("   Estado      : ⌛ PENDIENTE");
                System.out.println("----------------------------------------");
            }
        }

        if (!hayPendientes) {
            System.out.println("🎉 No hay tareas pendientes.");
        }
    }

    public static void contarTareasFinalizadas() {
    int contador = 0;

    System.out.println("\n=========== ✅ TAREAS FINALIZADAS ===========");

    for (int i = 0; i < tareas.size(); i++) {
        Tarea t = tareas.get(i);
        if (t.getEstado() == Tarea.Estado.FINALIZADA) {
            contador++;
            System.out.println("✔️ Tarea " + (i + 1));
            System.out.println("   Título      : " + t.getTitulo());
            System.out.println("   Descripción : " + t.getDescripcion());
            System.out.println("   Estado      : ✅ FINALIZADA");
            System.out.println("----------------------------------------");
        }
    }

    if (contador == 0) {
        System.out.println("📭 No hay tareas finalizadas.");
    }

    System.out.println("🧮 Total de tareas finalizadas: " + contador);
}

}
