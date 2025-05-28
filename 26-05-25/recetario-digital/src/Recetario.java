import java.util.ArrayList;

public class Recetario {
    
    private ArrayList<Receta> recetas;

    public Recetario() {
        recetas = new ArrayList<>();
    }
    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }
    public void mostrarResumen() {
        System.out.println("\n📚 RESUMEN DE RECETAS:");
        for (int i = 0; i < recetas.size(); i++) {
            System.out.println((i + 1) + ". " + recetas.get(i).descripcionGeneral());
        }
    }
    public void mostrarDetalleReceta(int indice) {
        if (indice < 0 || indice >= recetas.size()) {
            System.out.println("❌ Índice inválido.");
            return;
        }
        recetas.get(indice).mostrarDetalle();
    }
    public int getCantidadRecetas() {
        return recetas.size();
    }
}
