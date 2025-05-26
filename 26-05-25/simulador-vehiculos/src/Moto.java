public class Moto extends Vehiculo {
    public Moto(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void arrancar() {
        System.out.println("Moto lista para rodar.");
    }
}
