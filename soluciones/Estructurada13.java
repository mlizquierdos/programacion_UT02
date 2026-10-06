// Ejercicio 13: Consola de Gaming (Switch)
import java.util.Scanner;

public class Estructurada13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Consola (1=PS, 2=Xbox, 3=Nintendo, 4=PC): ");
        int op = sc.hasNextInt() ? sc.nextInt() : 0;

        // switch clásico: cada case termina con break para evitar el fall-through
        switch (op) {
            case 1: System.out.println("PlayStation"); break;
            case 2: System.out.println("Xbox"); break;
            case 3: System.out.println("Nintendo"); break;
            case 4: System.out.println("PC"); break;
            default: System.out.println("Inválido"); break;
        }
    }
}
