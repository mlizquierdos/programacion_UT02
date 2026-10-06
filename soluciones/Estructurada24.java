// Ejercicio 24: Validar Contraseña (Do-While)
import java.util.Scanner;

public class Estructurada24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        do {
            System.out.print("Introduce contraseña (mín. 8 caracteres): ");
            password = sc.nextLine();
        } while (password.length() < 8);

        System.out.println("Contraseña aceptada");
    }
}
