public class HamsterVirtual extends MascotaVirtual {

    public HamsterVirtual(String nombre) {
        super(nombre);
    }

    @Override
    public void jugar() {
        energia -= 20;
        felicidad += 10;
        System.out.println(nombre + " corrió en su rueda. 🐹 Energía bajó mucho.");
    }
}