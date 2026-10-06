// Ejercicio 29: Media con Centinela (While)
import java.util.Scanner;

public class Estructurada29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int count = 0;
        double nota;

        do {
            System.out.print("Nota (-1 para salir): ");
            // Ojo: en un equipo en español se escribe con coma decimal (7,5)
            boolean input = sc.hasNextDouble();
            nota = input ? sc.nextDouble() : 0;
            sc.nextLine(); // Descartar el resto de la línea (incluida una entrada no válida)

            if (input && nota >= 0) {
                suma += nota;
                count++;
            }
        } while (nota >= 0);

        if (count > 0)
            System.out.printf("Media: %.2f%n", suma / count);
        else
            System.out.println("No se introdujeron notas");
    }
}
