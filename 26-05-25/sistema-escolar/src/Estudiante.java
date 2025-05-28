public class Estudiante extends Persona {
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    @Override
    public String toString() {
        return "👨‍🎓 " + nombre + " | Edad: " + edad + " | Grado: " + grado;
    }
}
