// Ejercicio 7: División Entera y Resto (Aritmética)
import java.util.Scanner;

public class Estructurada07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dividendo: ");
        int a = sc.hasNextInt() ? sc.nextInt() : 0;
        System.out.print("Divisor: ");
        int b = sc.hasNextInt() ? sc.nextInt() : 0;

        // Si el divisor es 0, la división entera lanza ArithmeticException
        System.out.println(a + " / " + b + " = " + (a / b)); // 3 / 2 = 1
        System.out.println(a + " % " + b + " = " + (a % b)); // 3 % 2 = 1
    }
}
