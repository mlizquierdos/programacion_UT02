// Ejercicio 45: Break y Continue Juntos
public class Estructurada45 {

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("Break en " + i);
                break;
            }
            if (i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
