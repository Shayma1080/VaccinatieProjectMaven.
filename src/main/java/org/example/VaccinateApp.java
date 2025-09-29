package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class VaccinateApp {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.addAnimal(new Cat("Minoes", 4));
        shelter.addAnimal(new Cat("Nina" ,2));
        shelter.addAnimal(new Dog("Bello", 6));
        shelter.addAnimal(new Monkey("Mogli",8));
        shelter.addAnimal(new Monkey("George", 10));



        System.out.println("Behandelt alle dieren: ");
        shelter.treatAllAnimals();
        System.out.println("\nSorteer dieren op leeftijd: ");
        shelter.sortAnimalsByAge();
        System.out.println("\nAantal dieren niet gevaccineerd tegen ziekte: ");
        shelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        System.out.println("\nWelke dier wordt behandelt? ");
        shelter.treatAnimal("Bello");

        Animal oudste = shelter.findOldestAnimal();
        System.out.println("Oudste dier: " + oudste);
        System.out.println("Aantal dieren in het asiel: " + shelter.countAnimals());

        Cat cat = new Cat("Nina" ,2);
        cat.vaccinateAnimal(Disease.CHICKENPOCKS);
        System.out.println(cat.isVaccinated(Disease.CHICKENPOCKS));
        System.out.println(shelter.countAnimals());
        System.out.println(shelter.findAnimal(3));









    }
}
