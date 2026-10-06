// Ejercicio 16: Ternario Anidado: Nota
import java.util.Scanner;

public class Estructurada16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota (0-10): ");
        // Ojo: en un equipo en español se escribe con coma decimal (7,5)
        double nota = sc.hasNextDouble() ? sc.nextDouble() : 0;

        String resultado = nota < 4 ? "Malo"
                : nota < 7 ? "Regular"
                : nota < 9 ? "Bueno"
                : "Excelente";

        System.out.println(nota + " → " + resultado);
    }
}
