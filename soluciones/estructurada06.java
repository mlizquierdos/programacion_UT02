// Ejercicio 6: Precio con IVA (Operaciones básicas)
import java.util.Scanner;

public class Estructurada06 {

    static final double IVA = 0.21;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio base: ");
        // Si no es un número válido, el precio queda en 0
        // Ojo: en un equipo en español se escribe con coma decimal (19,99)
        double precio = sc.hasNextDouble() ? sc.nextDouble() : 0;

        // Usamos double para simplificar; para dinero real se usaría BigDecimal
        double iva = precio * IVA;
        double total = precio + iva;

        System.out.printf("%.2f€ + %.2f€ IVA = %.2f€%n", precio, iva, total);
    }
}
