// Ejercicio 18: Menú con Opciones (Switch)
import java.util.Scanner;

public class Estructurada18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Jugar");
        System.out.println("2. Opciones");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        int op = sc.hasNextInt() ? sc.nextInt() : 0;

        switch (op) {
            case 1: System.out.println("Iniciando juego..."); break;
            case 2: System.out.println("Abriendo opciones..."); break;
            case 3: System.out.println("Saliendo..."); break;
            default: System.out.println("Opción no válida"); break;
        }
    }
}
