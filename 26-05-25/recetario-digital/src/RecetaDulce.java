public class RecetaDulce extends Receta {

    public RecetaDulce(String nombre) {
        super(nombre);
    }

    @Override
    public String descripcionGeneral() {
       return "🍰 (Dulce) " + nombre + " - Ingredientes: " + ingredientes.size();
    } 
}
