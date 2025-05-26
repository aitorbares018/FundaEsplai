public class Vehiculo {
    protected String marca;
    protected int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    public void arrancar() {
        System.out.println("Vehículo arrancando...");
    }

    public void detener() {
        System.out.println("Vehículo detenido.");
    }
}
