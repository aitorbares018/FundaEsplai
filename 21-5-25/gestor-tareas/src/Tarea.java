public class Tarea {

    public enum Estado {
        PENDIENTE, FINALIZADA
    }

    private String titulo;
    private String descripcion;
    private Estado estado;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = Estado.PENDIENTE;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void marcarComoFinalizada() {
        this.estado = Estado.FINALIZADA;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + (estado == Estado.PENDIENTE ? "⌛ PENDIENTE" : "✅ FINALIZADA") +
                '}';
    }
}
