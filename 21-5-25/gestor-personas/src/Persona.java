public class Persona {
    private String nombre;
    private int edad;
    private String correo;

    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        setCorreo(correo);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
    if (!correo.contains("@")) {
        throw new IllegalArgumentException("❌ Correo inválido. Debe contener '@'.");
    }
    this.correo = correo;
}

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public String toString() {
        return "Nombre: " + nombre +
               "\nEdad: " + edad +
               "\nCorreo: " + correo +
               "\n¿Mayor de edad?: " + (esMayorDeEdad() ? "Sí" : "No");
    }
}
