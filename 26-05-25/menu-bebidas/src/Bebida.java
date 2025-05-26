public class Bebida {
    protected String nombre;
    protected String tamaño;

    public Bebida(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return "Nombre: " + nombre + ", Tamaño: " + tamaño;
    }
}
