import java.util.ArrayList;

public class Encuesta {
    private String titulo;
    private Usuario autor;
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private ArrayList<String> usuariosRespondieron = new ArrayList<>();

    public Encuesta(String titulo, Usuario autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void agregarPregunta(Pregunta p) {
        preguntas.add(p);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public boolean yaRespondio(String nombreUsuario) {
        return usuariosRespondieron.contains(nombreUsuario);
    }

    public void registrarRespuesta(String nombreUsuario) {
        usuariosRespondieron.add(nombreUsuario);
    }

    public ArrayList<String> getUsuariosRespondieron() {
        return usuariosRespondieron;
    }
}
