public class Agua extends Bebida {
    private boolean mineral;

    public Agua(String nombre, String tamaño, boolean mineral) {
        super(nombre, tamaño);
        this.mineral = mineral;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Mineral: " + (mineral ? "Sí" : "No");
    }
}
