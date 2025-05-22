import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Alumne> alumnos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        int opcion;

        do {
            System.out.println("\n========== 🎓 MENÚ ALUMNOS ==========");
            System.out.println("1. Crear nuevo alumno");
            System.out.println("2. Añadir nota a un alumno");
            System.out.println("3. Mostrar todos los alumnos");
            System.out.println("4. Mostrar mejor alumno");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    agregarNota();
                    break;
                case 3:
                    mostrarAlumnos();
                    break;
                case 4:
                    mostrarMejorAlumno();
                    break;
                case 0:
                    System.out.println("👋 Saliendo...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void crearAlumno() {
        String nombreAlumno;
        System.out.print("🆕 Nombre del alumno: ");
        nombreAlumno = scanner.nextLine();
        alumnos.add(new Alumne(nombreAlumno));
        System.out.println("✅ Alumno creado con éxito.");
    }

    public static void agregarNota() {

        int index;
        double nota;

        if (alumnos.isEmpty()) {
            System.out.println("❌ No hay alumnos registrados.");
            return;
        }
        System.out.println("📚 Selecciona un alumno:");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + ". " + alumnos.get(i).getNombre());
        }
        System.out.print("Selecciona el número del alumno: ");
        index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= alumnos.size()) {
            System.out.println("❌ Opción inválida.");
            return;
        }
        System.out.print("📥 Introduce la nota: ");
        nota = Double.parseDouble(scanner.nextLine());
        if (nota < 0 || nota > 10) {
            System.out.println("❌ Nota inválida. Debe estar entre 0 y 10.");
            return;
        }
        alumnos.get(index).agregarNota(nota);
        System.out.println("✅ Nota añadida con éxito.");
    }

    public static void mostrarAlumnos() {
        System.out.println("\n🧑‍🎓=========== LISTA DE ALUMNOS ===========");

        if (alumnos.isEmpty()) {
            System.out.println("⚠️ No hay alumnos registrados.");
        } else {
            for (int i = 0; i < alumnos.size(); i++) {
                Alumne a = alumnos.get(i);
                System.out.println("🔹 Alumno #" + (i + 1));
                System.out.println("   📛 Nombre: " + a.getNombre());
                System.out.println("   📚 Notas: " + a.getNotas());
                System.out.println("   📊 Promedio: " + String.format("%.2f", a.calcularPromedio()));
                System.out.println("   " + (a.aprueba() ? "✅ Aprueba" : "❌ No aprueba"));
                System.out.println("------------------------------------------");
            }
        }
    }

    public static void mostrarMejorAlumno() {
    if (alumnos.isEmpty()) {
        System.out.println("❌ No hay alumnos registrados.");
        return;
    }

    Alumne mejorAlumno = alumnos.get(0);
    for (Alumne a : alumnos) {
        if (a.calcularPromedio() > mejorAlumno.calcularPromedio()) {
            mejorAlumno = a;
        }
    }

    System.out.println("\n🎖️ ========== MEJOR ALUMNO ========== ");
    System.out.println("📛 Nombre: " + mejorAlumno.getNombre());
    System.out.println("📚 Notas: " + mejorAlumno.getNotas());
    System.out.println("📊 Promedio: " + String.format("%.2f", mejorAlumno.calcularPromedio()));
    System.out.println("=====================================");
}


}
