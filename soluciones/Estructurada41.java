// Ejercicio 41: Break en Bucle (While)
import java.util.Scanner;

public class Estructurada41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Introduce un número: ");
            numero = sc.hasNextInt() ? sc.nextInt() : 0;
            sc.nextLine(); // Descartar el resto de la línea (incluida una entrada no válida)
        } while (numero != 42);

        System.out.println("¡Encontrado!");
    }
}
