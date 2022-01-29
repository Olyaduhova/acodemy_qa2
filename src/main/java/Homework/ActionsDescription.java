package Homework;

import lombok.extern.slf4j.Slf4j;

public class ActionsDescription {
    public static void main(String[] args) {

        //Create 6 objects based on the Animal class

        Animal animalPet = new Animal("Cat");
        animalPet.setName("Cat");
        System.out.println(animalPet.getName());
        animalPet.setWeight(6.5);
        System.out.println("Weight: " + animalPet.getWeight());
        animalPet.setFood("Dry food.");
        System.out.println("Food type: " + animalPet.getFood());
        animalPet.setSound("Meowing.");
        System.out.println("Sound: " + animalPet.getSound() + "\n");

        Animal animalPet1 = new Animal("Dog");
        animalPet1.setName("Dog");
        System.out.println(animalPet1.getName());
        animalPet1.setWeight(12);
        System.out.println("Weight: " + animalPet1.getWeight());
        animalPet1.setFood("Dry food and meat.");
        System.out.println("Food type: " + animalPet1.getFood());
        animalPet1.setSound("Barking.");
        System.out.println("Sound: " + animalPet1.getSound() + "\n");

        Animal animalPet2 = new Animal("Hamster");
        animalPet2.setName("Hamster");
        System.out.println(animalPet2.getName());
        animalPet2.setWeight(0.2);
        System.out.println("Weight: " + animalPet2.getWeight());
        animalPet2.setFood("Dry Food, grass and vegetables");
        System.out.println("Food type: " + animalPet2.getFood());
        animalPet2.setSound("Squeaking.");
        System.out.println("Sound: " + animalPet2.getSound() + "\n");

        Animal farmAnimal = new Animal("Cow");
        farmAnimal.setName("Cow");
        System.out.println(farmAnimal.getName());
        farmAnimal.setWeight(720);
        System.out.println("Weight: " + farmAnimal.getWeight());
        farmAnimal.setFood("Grass");
        System.out.println("Food type: " + farmAnimal.getFood());
        farmAnimal.setSound("Moo.");
        System.out.println("Sound: " + farmAnimal.getSound() + "\n");

        Animal wildAnimal = new Animal("Wolf");
        wildAnimal.setName("Wolf");
        System.out.println(wildAnimal.getName());
        wildAnimal.setWeight(30);
        System.out.println("Weight: " + wildAnimal.getWeight());
        wildAnimal.setFood("Wild meat");
        System.out.println("Food type: " + wildAnimal.getFood());
        wildAnimal.setSound("Howling.");
        System.out.println("Sound: " + wildAnimal.getSound() + "\n");

        Animal seaMammal = new Animal("Sea Lion");
        seaMammal.setName("Sea Lion");
        System.out.println(seaMammal.getName());
        seaMammal.setWeight(30);
        System.out.println("Weight: " + seaMammal.getWeight());
        seaMammal.setFood("Fish.");
        System.out.println("Food type: " + seaMammal.getFood());
        seaMammal.setSound("Roar.");
        System.out.println("Sound: " + seaMammal.getSound() + "\n");

        Animal marley = new Animal("marley");
        marley.wakieTime();
        marley.walkTime();
        marley.trainTime();
        marley.playTime();
        marley.playTime();
        marley.energyZero();
        marley.feedTime();
        //Teach the program to send the animal to sleep
        marley.napTime = true;
        System.out.println("It's nap time. Z - z - z");

    }
}
