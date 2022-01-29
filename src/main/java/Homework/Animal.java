package Homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {

    //Create an Animal class and describe the properties that each animal has.

    private double weight;
    private String food;
    private String sound;
    private String name;

    //Create an empty constructor, with all fields and selectively


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Animal() {
    }

/* Teach the program to feed the animal
(imagine the animal has 4 energy charges for the whole day, doing some activities,
he spends energy, feeding the animal, he gets all 4 energy charges)
 • Teach the program to send an animal (using methods):
  ◦ Walk (-1 energy Charge)
  ◦ play (-1 energy charge)
  ◦ exercise (-1 energy charge)
 */

    private int energyLevel = 4;
    private String petName;
    boolean napTime = true;

    public Animal(String petName) {
        this.petName = petName;
    }

    public void wakieTime() {
        log.info("Wake time.");
        if (energyLevel == 4) {
            System.out.println("Wakie, wakie, let's go for a walk! " + "\n" + "Energy left: " + energyLevel);
        }
    }

    public void walkTime() {
        log.info("Walk time.");
        if (energyLevel == 0) {
            log.info("Walk time.");
            System.out.println("Please feed me!");
        } else {
            energyLevel--;
            System.out.println("It was a good walk! " + "\n" + "Energy left: " + energyLevel);
        }
    }

    public void trainTime() {
        log.info("Training time.");
        if (energyLevel == 0) {
            System.out.println("Please feed me!");
        } else {
            energyLevel--;
            System.out.println("I'm a good boy! Let's play now! " + "\n" + "Energy left: " + energyLevel);
        }
    }

    public void playTime() {
        log.info("Play time.");
        if (energyLevel == 0) {
            log.info("Play time.");
            System.out.println("Please feed me!");
        } else {
            energyLevel--;
            System.out.println("It was so funny! Let's play again. " + "\n" + "Energy left: " + energyLevel);
        }
    }

    public void feedTime() {
        log.info("Feed time.");
        if (energyLevel == 4) {
            System.out.println("No need to feed me! I'm full!");
        } else {
            energyLevel++;
            energyLevel++;
            energyLevel++;
            energyLevel++;
            System.out.println("Thank you for feeding me! " + "\n" + "Energy left: " + energyLevel);
        }
    }

/*Set a check that the animal cannot execute any commands if it has 0 energy level,
then the program should tell you to send the animal to eat!
 */

    public void energyZero() {
        log.info("Energy is empty.");
        if (energyLevel == 0) {
            System.out.println("I'm hungry. Please feed me!");
        }
    }


}

