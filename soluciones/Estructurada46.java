// Ejercicio 46: Números Primos (For con anidado)
public class Estructurada46 {

    public static void main(String[] args) {
        for (int num = 2; num <= 50; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo)
                System.out.println(num + " es primo");
        }
    }
}
