public class Coche extends Vehiculo {
    public Coche(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arrancando...");
    }
}
