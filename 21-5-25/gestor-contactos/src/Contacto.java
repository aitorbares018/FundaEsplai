public class Contacto {
    public String nombre;
    public String telefono;
    public String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "📇 Nombre: " + nombre +
                "\n📞 Teléfono: " + telefono +
                "\n✉️ Email: " + email;
    }


}
