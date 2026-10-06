// Ejercicio 22: Menú Repetitivo (Do-While)
import java.util.Scanner;

public class Estructurada22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Jugar");
            System.out.println("2. Opciones");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.hasNextInt() ? sc.nextInt() : 0;
            sc.nextLine(); // Descartar el resto de la línea (incluida una entrada no válida)

            if (opcion != 3)
                System.out.println("Seleccionaste: " + opcion);
        } while (opcion != 3);

        // Aquí solo llegamos si has seleccionado la opción 3,
        // es decir, salir del programa
        System.out.println("¡Hasta luego!");
    }
}
