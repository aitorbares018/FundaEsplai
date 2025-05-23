import java.util.HashMap;

public class Pregunta {

    private String texto;
    private String[] opciones;
    private HashMap<String, Integer> votos = new HashMap<>();

    public Pregunta(String texto, String[] opciones) {
        this.texto = texto;
        this.opciones = opciones;
        for (String opcion : opciones) {
            votos.put(opcion, 0);
        }
    }

    public String getTexto() {
        return texto;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void votar(String opcion) {
        if (votos.containsKey(opcion)) {
            votos.put(opcion, votos.get(opcion) + 1);
        }
    }

    public HashMap<String, Integer> getVotos() {
        return votos;
    }

    public String obtenerOpcionMasVotada() {
        return votos.entrySet().stream()
                .max((a, b) -> a.getValue() - b.getValue())
                .map(entry -> entry.getKey())
                .orElse("Ninguna");
    }
}
