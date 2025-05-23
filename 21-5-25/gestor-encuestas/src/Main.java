import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Encuesta> encuestas = new ArrayList<>();
    static Usuario usuarioActual;

    public static void main(String[] args) {
        int opcionInicio;

        do {
            System.out.println("\n=========== BIENVENIDO AL SISTEMA DE ENCUESTAS ===========");
            System.out.println("1. Iniciar sesión");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcionInicio = scanner.nextInt();
            scanner.nextLine();

            switch (opcionInicio) {
                case 1:
                    iniciarSesion();
                    mostrarMenuPrincipal();
                    break;
                case 0:
                    System.out.println("👋 ¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcionInicio != 0);
    }

    public static void iniciarSesion() {

        String nombreUsuario;
        System.out.println("\n👤 INICIAR SESIÓN");
        System.out.print("👤 Ingresa tu nombre para iniciar sesión: ");
        nombreUsuario = scanner.nextLine();
        usuarioActual = new Usuario(nombreUsuario);
        System.out.println("✅ Sesión iniciada como: " + usuarioActual.getNombre());
    }

    public static void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("\n=========== MENÚ PRINCIPAL ===========");
            System.out.println("1. Crear nueva encuesta");
            System.out.println("2. Responder encuesta");
            System.out.println("3. Ver estadísticas");
            System.out.println("0. Cerrar sesión");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearEncuesta();
                    break;
                case 2:
                    responderEncuesta();
                    break;
                case 3:
                    verEstadisticas();
                    break;
                case 0:
                    System.out.println("👋 Sesión cerrada.");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void crearEncuesta() {

        String titulo, texto;
        int numeroPreguntas, numeroOpciones;

        System.out.println("\n📝 CREAR NUEVA ENCUESTA");
        System.out.print("\n📝 Título de la nueva encuesta: ");
        titulo = scanner.nextLine();
        Encuesta encuesta = new Encuesta(titulo, usuarioActual);

        System.out.print("¿Cuántas preguntas quieres agregar? ");
        numeroPreguntas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroPreguntas; i++) {
            System.out.print("Pregunta " + (i + 1) + ": ");
            texto = scanner.nextLine();

            System.out.print("Número de opciones: ");
            numeroOpciones = scanner.nextInt();
            scanner.nextLine();
            String[] opciones = new String[numeroOpciones];

            for (int j = 0; j < numeroOpciones; j++) {
                System.out.print("   Opción " + (j + 1) + ": ");
                opciones[j] = scanner.nextLine();
            }

            encuesta.agregarPregunta(new Pregunta(texto, opciones));
        }

        encuestas.add(encuesta);
        System.out.println("✅ Encuesta creada con éxito.");
    }

    public static void responderEncuesta() {

        int seleccionEncuesta, eleccion;

        if (encuestas.isEmpty()) {
            System.out.println("❌ No hay encuestas disponibles.");
            return;
        }

        System.out.println("\n📋 ENCUESTAS DISPONIBLES:");
        for (int i = 0; i < encuestas.size(); i++) {
            Encuesta e = encuestas.get(i);
            System.out.println((i + 1) + ". " + e.getTitulo() + " (creada por: " + e.getAutor() + ")");
        }

        System.out.print("Selecciona el número de la encuesta a responder: ");
        seleccionEncuesta = scanner.nextInt() - 1;
        scanner.nextLine();

        if (seleccionEncuesta < 0 || seleccionEncuesta >= encuestas.size()) {
            System.out.println("❌ Opción inválida.");
            return;
        }

        Encuesta encuesta = encuestas.get(seleccionEncuesta);

        if (encuesta.yaRespondio(usuarioActual.getNombre())) {
            System.out.println("⚠️ Ya has respondido esta encuesta.");
            return;
        }

        for (Pregunta p : encuesta.getPreguntas()) {
            System.out.println("\n📌 " + p.getTexto());
            String[] opciones = p.getOpciones();

            for (int i = 0; i < opciones.length; i++) {
                System.out.println("   " + (i + 1) + ". " + opciones[i]);
            }

            do {
                System.out.print("Elige una opción (1-" + opciones.length + "): ");
                eleccion = scanner.nextInt();
                scanner.nextLine();
            } while (eleccion < 1 || eleccion > opciones.length);

            p.votar(opciones[eleccion - 1]);
        }

        encuesta.registrarRespuesta(usuarioActual.getNombre());
        System.out.println("✅ Encuesta respondida con éxito.");
    }

    public static void verEstadisticas() {
        if (encuestas.isEmpty()) {
            System.out.println("❌ No hay encuestas creadas aún.");
            return;
        }

        for (Encuesta e : encuestas) {
            System.out
                    .println("\n📊 Resultados de la encuesta: " + e.getTitulo() + " (creada por " + e.getAutor() + ")");

            for (Pregunta p : e.getPreguntas()) {
                System.out.println("📌 " + p.getTexto());

                for (String opcion : p.getOpciones()) {
                    int votos = p.getVotos().get(opcion);
                    System.out.println("   🔹 " + opcion + ": " + votos + " votos");
                }

                System.out.println("🏆 Opción más votada: " + p.obtenerOpcionMasVotada());
                System.out.println("----------------------------------");
            }
        }
    }
}
