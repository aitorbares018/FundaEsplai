import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Laika", 3));
        animales.add(new Gato("Mishi", 2));
        animales.add(new Pajaro("Piolin", 1));
        animales.add(new Perro("Rex", 5));
        animales.add(new Gato("Oreo", 4));

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}

class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido() {

    }
}

class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Miau!");
    }
}

class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Pío pío!");
    }
}
