// Ejercicio 36: Tabla Completa (For Anidado)
public class Estructurada36 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.printf("%4d", i * j); // %4d: entero alineado en 4 posiciones
            System.out.println();
        }
    }
}
