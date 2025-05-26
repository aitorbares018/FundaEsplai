import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Toyota", 2020));
        vehiculos.add(new Moto("Yamaha", 2018));
        vehiculos.add(new Bicicleta("Bianchi", 2022));
        vehiculos.add(new Coche("Ford", 2015));
        vehiculos.add(new Moto("Ducati", 2023));

        for (Vehiculo v : vehiculos) {
            v.arrancar();
            v.detener();
            System.out.println(); // Línea en blanco para mejor visualización
        }
    }
}
