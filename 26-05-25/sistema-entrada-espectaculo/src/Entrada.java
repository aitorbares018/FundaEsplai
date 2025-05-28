public abstract class Entrada{
    protected String evento;
    protected double precioBase;

    public Entrada(String evento, double precioBase) {
        this.evento = evento;
        this.precioBase = precioBase;
    }
    public String getEvento() {
        return evento;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public abstract double calcularPrecioFinal();
}