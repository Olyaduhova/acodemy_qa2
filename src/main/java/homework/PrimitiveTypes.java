package homework;

public class PrimitiveTypes {
    public static void main(String[] args) {
/*1. Create 10 variables.
     Variable should have:
        a. variable name should have minimum 2 words
        b. the value of the variable should be as logical as the name
        c. all variables must be displayed
*/

        //Floating point

        //Double

        double distanceOfPanAmericanHighway = 30577.536D;
        System.out.println(distanceOfPanAmericanHighway);

        //Float

        float oneMileInMeters = 1609.34F;
        System.out.println(1609.34F);
        System.out.println(oneMileInMeters);

        float averageWaterTemperatureOfThePacificOcean = 3.5F;
        System.out.println(averageWaterTemperatureOfThePacificOcean + " " + "°C");

        //Integer
        //Long

        long starsCountInMilkyWayGalaxy = 400000000000L;
        System.out.println(starsCountInMilkyWayGalaxy);

        //Integer

        int populationOfBalticStates = 6195000;
        System.out.println(6195000);
        System.out.println(populationOfBalticStates);

        //Char

        char q = 'Q';
        System.out.println(q);

        char dollarUniCode = '\u0024';
        System.out.println(dollarUniCode);

        //Short

        short depthOfThePacificOcean = 11022;
        System.out.println(depthOfThePacificOcean + " " + "meters");

        short voltageInEuropeanOutlet = 220;
        System.out.println(voltageInEuropeanOutlet);

        //Byte

        byte averageSunnyDaysInRiga = 104;
        System.out.println(averageSunnyDaysInRiga);

//2. Display the minimum and maximum values for each data type.

        System.out.println("Double minimal value:" + Double.MIN_VALUE);
        System.out.println("Double maximal value:" + Double.MAX_VALUE);

        System.out.println("Float minimal value:" + Float.MIN_VALUE);
        System.out.println("Float maximal value:" + Float.MAX_VALUE);

        System.out.println("Long minimal value:" + Long.MIN_VALUE);
        System.out.println("Long maximal value:" + Long.MAX_VALUE);

        System.out.println("Integer minimal value:" + Integer.MIN_VALUE);
        System.out.println("Integer maximal value:" + Integer.MAX_VALUE);

        System.out.println("Char minimal value:" + Character.MIN_VALUE);
        System.out.println("Char maximal value:" + Character.MAX_VALUE);

        System.out.println("Short minimal value:" + Short.MIN_VALUE);
        System.out.println("Short maximal value:" + Short.MAX_VALUE);

        System.out.println("Byte minimal value:" + Byte.MIN_VALUE);
        System.out.println("Byte maximal value:" + Byte.MAX_VALUE);

//3. Create two examples for each arithmetic operator

        //Addition (+)

        int a = -15;
        int b = 15;
        System.out.println(a + b);

        int sumOfThreeNumbers = 12 + 45 + 16;
        System.out.println(sumOfThreeNumbers);

        //Subtraction (−)

        int c = 6;
        int d = 200;
        System.out.println(c - d);

        int e = 88;
        System.out.println(e - sumOfThreeNumbers);

        //Multiplication (*)

        int generationOfTwoNumbers = 5 * 5;
        System.out.println(generationOfTwoNumbers);

        System.out.println(generationOfTwoNumbers * sumOfThreeNumbers);

        //Division (/)

        int f = 77;
        int g = generationOfTwoNumbers - sumOfThreeNumbers;
        System.out.println(g);
        System.out.println(g / f);

        int divOfTwoNumbers = 88 / 8;
        System.out.println(divOfTwoNumbers);

        //exponentiation (^)

        System.out.println(g ^ sumOfThreeNumbers);

        int k = 5;
        int j = sumOfThreeNumbers ^ 2;
        System.out.println(k ^ j);

//4. Create 5 String variables and print their value to screen

        String s = "Sky";
        String i = "Is";
        String n = "Not";
        String t = "The";
        String l = "Limit";
        System.out.println(s);
        System.out.println(i);
        System.out.println(n);
        System.out.println(t);
        System.out.println(l);

/*5. Write one sentence (as long as possible) about yourself as a comment.
Then assign each word to a new variable and print the sentence on one line.
Use also System.out.printf (format).
 */

        /*“A wonderful fact to reflect upon, that every human creature is constituted to be that profound secret and mystery to every other.”
        Charles Dickens, A Tale of Two Cities
         */

        String evidence = "fact";
        String consequentTo = "upon";
        String everyHuman = "every human";
        String livingThing = "creature";
        String subtle = "profound";
        String sam = "secret and mystery";
        String teo = "to every other";
        System.out.printf("A wonderful %s to reflect %s, that %s %s is constituted to be that %s %s %s.", evidence,consequentTo, everyHuman, livingThing, subtle, sam, teo);

        String space = " ";
        System.out.println(space);

        String author = "Charles Dickens";
        String poem = "A Tale of Two Cities";
        System.out.println(poem + ", " + author);
      }


}
