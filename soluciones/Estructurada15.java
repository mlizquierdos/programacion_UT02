// Ejercicio 15: Mayor de Edad con Ternario
import java.util.Scanner;

public class Estructurada15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.hasNextInt() ? sc.nextInt() : 0;

        String msg = edad >= 18 ? "Puedes votar" : "Todavía no puedes votar";
        System.out.println(msg);
    }
}
