public class GatoVirtual extends MascotaVirtual {

    public GatoVirtual(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        energia += 20;
        System.out.println(nombre + " comió como un gato perezoso. 🐱 Energía aumentada mucho.");
    }
}