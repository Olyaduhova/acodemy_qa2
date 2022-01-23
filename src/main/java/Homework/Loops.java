package Homework;

public class Loops {

    public static void main(String[] args) {

        //1. If variable type is int = 10, print out: "Integer value is 10".

        int b = 10;
        if (b == 10) {
            System.out.println("Integer value is " + b);
        }
        System.out.println("\n");

        /*2. In int type variable are numbers from 18 to 65.
        Dry-cleaning discount:
        Years 18-21 = 10%
        Years 22-65 = 15%
        Years >65 = 20%
        Write code where variable value change allows to get to definite group
        and print message in which you will see in which age group you are and your discount rate size.
         */

        int myAge = 66;

        if (myAge >= 18 && myAge <= 21) {
            System.out.println("Your age: " + myAge + "\n" + "Your discount: " + "10 %");
        } else if (myAge >= 22 && myAge <= 65) {
            System.out.println("Your age: " + myAge + "\n" + "Your discount: " + "15 %");
        } else {
            if (myAge > 65) {
                System.out.println("Your age: " + myAge + "\n" + "Your discount: " + "20%");
            }
        }
        System.out.println("\n");

        /*3. Create a String array and add 10 animal names to it.
         a Loop through the array, find and print any animal.
         */

        String[] animals = {"elephant", "zebra", "lion", "monkey", "turtle", "camel", "dog", "cat", "wolf", "fox"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        String[] animals1 = {"elephant", "zebra", "lion", "monkey", "turtle", "camel", "dog", "cat", "wolf", "fox"};
        System.out.println("5th animal in array: " + animals1[4]);
        System.out.println("\n");


        //4. Create array with numbers from 0 to 10. Print all even numbers from the array.

        int[] numbers = new int[10];
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i + 1;
        }
        for (int even : numbers) {
            if (even % 2 == 0) {
                System.out.print(even + " ");
            }
        }
        System.out.println("\n");

        /*5. You need to choose transport to get to the office.
        Transport types: Car, public transport, taxi, bicycle and etc.
        Using switch operator teach the program to print which type of transport you will choose to get to the office,
        according to value in variable.
         */

        String weather = "Warm and sunny";
        switch (weather) {
            case "Freezing":
                System.out.println("You can take a taxi.");
                break;
            case "Snowstorm":
                System.out.println("Better take a bus.");
                break;
            case "Cold and sunny":
                System.out.println("You can go by car.");
                break;
            case "Cold and rainy":
                System.out.println("You can go by car.");
                break;
            case "Warm and sunny":
                System.out.println("It`s nice time for a bike ride!");
                break;
            case "Warm and rainy":
                System.out.println("It`s a nice time for a walk!");
                break;
            case "Very hot":
                System.out.println("Take a taxi with AC.");
                break;
            default:
                System.out.println("Probably you are on Mars");
                break;
        }
        System.out.println("\n");

        //6. Print numbers from 1 to 100

        int number1 = 0;
        for (int i = 0; i < 100; i++) {
            number1 += 1;
            System.out.print(number1 + " ");
        }
        System.out.println("\n");

        //7. Print numbers from 50 to 1

        for (int i = 50; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //8. Print multiplication table (from 1 to 10)

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();


        }

    }
}
