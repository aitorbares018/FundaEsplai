public class EntradaConDescuento extends Entrada {
    
    private double porcentajeDescuento;

    public EntradaConDescuento(String evento, double precioBase, double porcentajeDescuento) {
        super(evento, precioBase);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase - (precioBase * porcentajeDescuento);
    }
}
