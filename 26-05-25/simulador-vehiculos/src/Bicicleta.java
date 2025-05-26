public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void arrancar() {
        System.out.println("No necesita arrancar.");
    }
}
