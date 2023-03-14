package krok1;

public class helper {

    /**
     * Функция fizzBuzz выводит числа от 1 до 100, но "Fizz" вместо числа, если значение кратно 3, "Buzz" - если 5
     * и "FizzBuzz - если одновременно и 3 и 5
     */
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
