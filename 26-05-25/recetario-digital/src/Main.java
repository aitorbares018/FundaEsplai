import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Recetario recetario = new Recetario();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n=========== 📋 MENÚ DEL RECETARIO ===========");
            System.out.println("1. Añadir nueva receta");
            System.out.println("2. Ver resumen de recetas");
            System.out.println("3. Ver detalle de una receta");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    anadirReceta();
                    break;
                case 2:
                    recetario.mostrarResumen();
                    break;
                case 3:
                    verDetalleReceta();
                    break;
                case 0:
                    System.out.println("👋 ¡Hasta luego, chef!");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void anadirReceta() {

        String nombre, tipo, nomIng, unidad;
        Receta receta;
        int numIng, numPasos;
        double cant;

        System.out.print("\nNombre de la receta: ");
        nombre = scanner.nextLine();

        System.out.print("¿Es dulce o salada? (dulce/salada): ");
        tipo = scanner.nextLine().toLowerCase();

        if (tipo.equals("dulce")) {
            receta = new RecetaDulce(nombre);
        } else {
            receta = new RecetaSalada(nombre);
        }

        System.out.print("¿Cuántos ingredientes quieres añadir? ");
        numIng = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numIng; i++) {
            System.out.print("Ingrediente " + (i + 1) + " - Nombre: ");
            nomIng = scanner.nextLine();
            System.out.print("Cantidad: ");
            cant = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Unidad: ");
            unidad = scanner.nextLine();

            receta.agregarIngrediente(new Ingrediente(nomIng, cant, unidad));
        }

        System.out.print("¿Cuántos pasos de preparación quieres añadir? ");
        numPasos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPasos; i++) {
            System.out.print("Paso " + (i + 1) + ": ");
            receta.agregarPaso(scanner.nextLine());
        }

        recetario.agregarReceta(receta);
        System.out.println("✅ Receta añadida con éxito.");
    }

    public static void verDetalleReceta() {
         
        int indice;

        recetario.mostrarResumen();
        System.out.print("Selecciona el número de receta para ver el detalle: ");
        indice = scanner.nextInt() - 1;
        scanner.nextLine();
        recetario.mostrarDetalleReceta(indice);
    }
}
