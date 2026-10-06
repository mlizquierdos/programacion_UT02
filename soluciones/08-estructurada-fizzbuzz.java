// 08 - Estructurada: FizzBuzz — El clásico interview question
// Consigna: Del 1 al 100, si es múltiplo de 3 imprime "Fizz", si es múltiplo de 5 imprime "Buzz",
// si es múltiplo de ambos imprime "FizzBuzz", si no imprime el número.
public class Estructurada08FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}

// Salida del 1 al 30
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz    *
// 16
// 17
// Fizz
// 19
// Buzz
// Fizz
// 22
// 23
// Fizz
// Buzz
// 26
// Fizz
// 28
// 29
// FizzBuzz    *
