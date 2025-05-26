public class Refresco extends Bebida {
    private boolean conGas;

    public Refresco(String nombre, String tamaño, boolean conGas) {
        super(nombre, tamaño);
        this.conGas = conGas;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Con gas: " + (conGas ? "Sí" : "No");
    }
}
