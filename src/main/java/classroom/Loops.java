package classroom;

public class Loops {

    public static void main(String[] args) {

        // Loops (for, while, do ... while)

        /*
        for(initialize counter; condition; counter change) {
        }
        // i = 0;
        // 0 < 5 (true)
        // System.out.println("Hello World");
        // i = 1
        // 1 < 5 (true)
        // System.out.println("Hello World");
        // i = 2
        // 2 < 5 (true)
        // System.out.println("Hello World");
        // i = 5;
        // 5 < 5 (false)
        // end of loop
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("This is: " + i + " iteration");
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World");
        }

        String[] fruits = {"apple", "kiwi", "banana", "strawberry", "lemon"};
        // fruits.length = 5;
        // fruits[0] = apple
        // fruits[1] = kiwi
        // fruits[4] = lemon

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        /*
        7, 14, 21, 28, 35 .. * 10
        0, +7 + 7 + 7 + 7
         */

        int number = 0;

        for (int i = 0; i < 10; i++) {
            number += 7;
            System.out.print(number + " ");
        }


        // i = 0;
        // i < 5 (0 < 5) = true
        // System.out.println(fruits[i]);
        // fruits[0] = apple

        // i = 1;
        // i < 5 (1 < 5) = true
        // System.out.println(fruits[i]);
        // fruits[1] = kiwi

        int[] numbers = new int[10];

        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i + 1;
        }

        for(int num : numbers) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }

        int x = 10;
        do {
            System.out.println("Hello World");
            x--;
        } while (x > 0);

        System.out.println("Nikita");

        while (x > 0) {
            System.out.println("Hello World");
            x--;
        }
    }
}