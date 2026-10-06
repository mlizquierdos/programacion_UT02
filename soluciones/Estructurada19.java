// Ejercicio 19: Tipo de Sangre (Switch expresión, Java 14+)
import java.util.Scanner;

public class Estructurada19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo (1-4): ");
        int num = sc.hasNextInt() ? sc.nextInt() : 0;

        String tipo = switch (num) {
            case 1 -> "A+";
            case 2 -> "A-";
            case 3 -> "B+";
            case 4 -> "O+";
            default -> "Desconocido";
        };

        System.out.println("Tipo de sangre: " + tipo);
    }
}
