import java.util.ArrayList;

public class Alumne {
    private String nombre;
    private ArrayList<Double> notas;

    public Alumne(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        if (notas.isEmpty())
            return 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
    public boolean aprueba() {
        return calcularPromedio() >= 5.0;
    }
    public ArrayList<Double> getNotas() {
    return notas;
}

     public String toString() {
        return "👨‍🎓 Alumno: " + nombre +
               "\n📚 Notas: " + notas +
               "\n📊 Promedio: " + String.format("%.2f", calcularPromedio()) +
               "\n✅ ¿Aprueba?: " + (aprueba() ? "Sí" : "No");
    }

}
