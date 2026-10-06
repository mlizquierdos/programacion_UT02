// Ejercicio 33: Factorial (For)
import java.util.Scanner;

public class Estructurada33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int num = sc.hasNextInt() ? sc.nextInt() : 0;

        // long admite hasta 20!; a partir de 21! se desborda sin avisar
        long factorial = 1;
        for (int i = 2; i <= num; i++)
            factorial *= i;

        System.out.println(num + "! = " + factorial);
    }
}
