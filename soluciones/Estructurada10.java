// Ejercicio 10: Par o Impar (Condicionales simples)
import java.util.Scanner;

public class Estructurada10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.hasNextInt() ? sc.nextInt() : 0;

        if (num % 2 == 0)
            System.out.println(num + " es par");
        else
            System.out.println(num + " es impar");
    }
}
