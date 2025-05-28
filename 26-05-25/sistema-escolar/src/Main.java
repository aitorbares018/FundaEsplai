
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Curso curso;

    public static void main(String[] args) throws Exception {

        int opcion;
        String nombreCurso;

        System.out.print("📘 Nombre del curso: ");
        nombreCurso = scanner.nextLine();
        curso = new Curso(nombreCurso);

        do {
            System.out.println("\n========== MENÚ ==========");
            System.out.println("1. Asignar profesor");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Ver participantes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    asignarProfesor();
                    break;
                case 2:
                    agregarEstudiante();
                    break;
                case 3:
                    curso.mostrarParticipantes();
                    break;
                case 0:
                    System.out.println("👋 Saliendo del sistema escolar...");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }
    public static void asignarProfesor(){

        String nombre,especialidad;
        int edad;

        System.out.print("👤 Nombre del profesor: ");
        nombre = scanner.nextLine();
        System.out.println("🎂 Edad del profesor: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("📚 Especialidad del profesor: ");
        especialidad = scanner.nextLine();

        Profesor profesor = new Profesor(nombre, edad, especialidad);
        curso.asignarProfesor(profesor);
        System.out.println("✅ Profesor asignado: " + profesor);
    }
    public static void agregarEstudiante(){

        String nombre, grado;
        int edad;

        System.out.print("👤 Nombre del estudiante: ");
        nombre = scanner.nextLine();
        System.out.print("🎂 Edad del estudiante: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("📚 Grado del estudiante: ");
        grado = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, grado);
        curso.agregarEstudiante(estudiante);
        System.out.println("✅ Estudiante agregado: " + estudiante);
    }

}
