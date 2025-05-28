public abstract class MascotaVirtual {
    
    protected String nombre;
    protected int energia;
    protected int felicidad;

    public MascotaVirtual(String nombre) {
        this.nombre = nombre;
        this.energia = 50;
        this.felicidad = 50;
    }

    public void comer() {
        energia += 10;
        System.out.println(nombre + " ha comido. 🍖 Energía aumentada.");
    }

    public void jugar() {
        energia -= 10;
        felicidad += 10;
        System.out.println(nombre + " ha jugado. 🎾 Energía disminuida, felicidad aumentada.");
    }

    public void mostrarEstado() {
        System.out.println("\n📋 Estado de " + nombre + ":");
        System.out.println("🔋 Energía: " + energia);
        System.out.println("😊 Felicidad: " + felicidad);
    }
}
