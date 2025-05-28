public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "👨‍🏫 " + nombre + " | Edad: " + edad + " | Especialidad: " + especialidad;
    }
}
