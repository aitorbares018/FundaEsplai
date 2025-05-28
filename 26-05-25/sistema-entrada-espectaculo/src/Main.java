import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Entrada> entradas = new ArrayList<>();

        entradas.add(new EntradaEstandar("Concierto Rock", 50.0));
        entradas.add(new EntradaEstandar("Teatro Clásico", 35.0));

        entradas.add(new EntradaVIP("Festival de Jazz", 70.0, 0.25));
        entradas.add(new EntradaVIP("Concierto Pop", 90.0, 0.30));

        entradas.add(new EntradaConDescuento("Cine Familiar", 20.0, 0.15));
        entradas.add(new EntradaConDescuento("Circo", 25.0, 0.10));

        System.out.println("🎟️ LISTADO DE ENTRADAS:");
        for (Entrada e : entradas) {
            System.out.println("\nTipo: " + e.getClass().getSimpleName());
            System.out.println("Evento: " + e.getEvento());
            System.out.printf("Precio Base: %.2f €\n", e.getPrecioBase());
            System.out.printf("Precio Final: %.2f €\n", e.calcularPrecioFinal());
        }
    }
}
