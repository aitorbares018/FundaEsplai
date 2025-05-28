
import java.util.ArrayList;

public abstract class Receta {
    
    protected String nombre;
    protected ArrayList<Ingrediente> ingredientes;
    protected ArrayList<String> pasos;

    public Receta(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
        this.pasos = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarPaso(String paso) {
        pasos.add(paso);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadIngredientes() {
        return ingredientes.size();
    }

    public abstract String descripcionGeneral();

    public void mostrarDetalle() {
        System.out.println("\n📖 Receta: " + nombre);
        System.out.println("🍽 Ingredientes:");
        for (Ingrediente ing : ingredientes) {
            System.out.println("   " + ing);
        }
        System.out.println("🧾 Pasos:");
        for (int i = 0; i < pasos.size(); i++) {
            System.out.println("   Paso " + (i + 1) + ": " + pasos.get(i));
        }
    }
}
