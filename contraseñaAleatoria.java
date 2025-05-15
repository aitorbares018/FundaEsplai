import java.util.Scanner;

public class contraseñaAleatoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", caracteresEspeciales="!@#$%^&*()_+[]{}|;:,.<>?";
        int longitud;
        String respuesta;

        System.out.print("¿Cuántos caracteres quieres que tenga la contraseña? ");
        longitud = scanner.nextInt();
        System.out.print("¿Quieres incluir caracteres especiales? (s/n): ");
        respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("s")) {
            caracteres += caracteresEspeciales;
        }

        StringBuilder contraseña = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = (int) (Math.random() * caracteres.length());
            contraseña.append(caracteres.charAt(indiceAleatorio));
        }
        System.out.println("La contraseña aleatoria es: " + contraseña.toString());

    }
}
