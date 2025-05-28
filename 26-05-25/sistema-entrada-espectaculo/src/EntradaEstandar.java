public class EntradaEstandar extends Entrada {

    public EntradaEstandar(String evento, double precioBase) {
        super(evento, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase;
    }
}
