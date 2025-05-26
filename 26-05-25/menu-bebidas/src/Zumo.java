public class Zumo extends Bebida {
    private String fruta;

    public Zumo(String nombre, String tamaño, String fruta) {
        super(nombre, tamaño);
        this.fruta = fruta;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Fruta: " + fruta;
    }
}
