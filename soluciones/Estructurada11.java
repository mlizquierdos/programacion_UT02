// Ejercicio 11: Clasificación por Edad (if-else if-else)
import java.util.Scanner;

public class Estructurada11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.hasNextInt() ? sc.nextInt() : 0;

        if (edad < 12)
            System.out.println("Niño");
        else if (edad < 18)
            System.out.println("Adolescente");
        else if (edad < 65)
            System.out.println("Adulto");
        else
            System.out.println("Mayor");
    }
}
