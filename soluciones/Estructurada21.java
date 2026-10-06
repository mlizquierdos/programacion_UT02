// Ejercicio 21: Cuenta Atrás (While)
public class Estructurada21 {

    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("¡Lanzamiento!");

        // Alternativa con for
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }
        System.out.println("¡Lanzamiento!");
    }
}
