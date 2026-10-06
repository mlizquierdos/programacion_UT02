// Ejercicio 31: Tabla de Multiplicar (For)
import java.util.Scanner;

public class Estructurada31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int num = sc.hasNextInt() ? sc.nextInt() : 0;

        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
    }
}
