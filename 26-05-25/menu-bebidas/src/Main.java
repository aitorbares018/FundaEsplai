import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bebida> menu = new ArrayList<>();

        menu.add(new Refresco("Coca-Cola", "Mediano", true));
        menu.add(new Zumo("Zumo de naranja", "Grande", "Naranja"));
        menu.add(new Agua("Agua mineral", "Pequeño", true));
        menu.add(new Refresco("Sprite", "Grande", false));
        menu.add(new Zumo("Zumo tropical", "Mediano", "Mango y piña"));
        menu.add(new Agua("Agua purificada", "Grande", false));

        for (Bebida bebida : menu) {
            System.out.println(bebida.getDescripcion());
        }
    }
}
