// Ejercicio 14: Día de la Semana (Switch con agrupación)
import java.util.Scanner;

public class Estructurada14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Día (1-7): ");
        int dia = sc.hasNextInt() ? sc.nextInt() : 0;

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: case 7: System.out.println("¡Fin de semana!"); break; // el 6 "cae" al 7 a propósito
            default: System.out.println("No válido"); break;
        }

        // Versión con la sintaxis de flecha (Java 14+): sin break y sin fall-through
        // switch (dia) {
        //     case 1 -> System.out.println("Lunes");
        //     ...
        //     case 6, 7 -> System.out.println("¡Fin de semana!");
        //     default -> System.out.println("No válido");
        // }
    }
}
