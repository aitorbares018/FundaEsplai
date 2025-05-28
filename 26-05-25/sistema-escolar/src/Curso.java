import java.util.ArrayList;

public class Curso {
    
    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.estudiantes = new ArrayList<>();
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarParticipantes() {
        System.out.println("\n📚 Curso: " + nombreCurso);
        if (profesor != null) {
            System.out.println("👨‍🏫 Profesor: " + profesor);
        } else {
            System.out.println("⚠️ No hay profesor asignado.");
        }

        if (estudiantes.isEmpty()) {
            System.out.println("⚠️ No hay estudiantes inscritos.");
        } else {
            System.out.println("\n👥 Estudiantes:");
            for (Estudiante e : estudiantes) {
                System.out.println(" - " + e);
            }
        }
    }
}
