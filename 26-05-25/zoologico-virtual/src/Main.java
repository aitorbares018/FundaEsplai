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
