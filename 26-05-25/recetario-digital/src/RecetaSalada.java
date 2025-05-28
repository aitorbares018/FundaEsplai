public class RecetaSalada extends Receta {

    public RecetaSalada(String nombre) {
        super(nombre);
    }

    @Override
    public String descripcionGeneral() {
        return "🥗 (Salada) " + nombre + " - Ingredientes: " + ingredientes.size();
    }
    
}
