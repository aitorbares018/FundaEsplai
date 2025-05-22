
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public boolean agregarContacto(Contacto nuevo) {
        if (!contactos.contains(nuevo)) {
            contactos.add(nuevo);
            return true;
        }
        return false;
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public ArrayList<Contacto> buscarParcial(String fragmento) {

        ArrayList<Contacto> resultado = new ArrayList<>();

        for (Contacto c : contactos) {
            if (c.getNombre().toLowerCase().contains(fragmento.toLowerCase())) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public boolean existeContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

}
