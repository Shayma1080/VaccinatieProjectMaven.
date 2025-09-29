package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalShelter {
    private static List<Animal> animals= new ArrayList<>();
    private static int animalId= 1;

    public AnimalShelter() {}

    public AnimalShelter(List<Animal> animals) {
        this.animals = animals;
    }

    public void printAnimals(){
        animals.forEach(System.out::println);
    }
    public void sortAnimals(){
        animals.stream()
                .sorted(Comparator.comparing(Animal::getAnimalNumber))
                .forEach(e-> System.out.println(e));
    }
    public void sortAnimalsByName(){
        animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .forEach(e-> System.out.println(e));
    }
    public void sortAnimalsByAge(){
        animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .forEach(e-> System.out.println(e));
    }
    public void printAnimalsNotVaccinated(Disease disease){
        animals.stream()
                .filter(e-> !e.isVaccinated(disease))
                //.map((Animal::getIsVaccinated))
                .forEach(e-> System.out.println(e));
    }

    public Animal findAnimal(int number){
        return animals.stream()
                .filter(e->e.getAnimalNumber() == number)
                //.map(Animal::getAnimalNumber)
                .findFirst()
                .orElse(null); // null als lijst leeg is, gebruikt bij zoek of vergelijksoperaties

    }

    public Animal findAnimal(String name){
        return animals.stream()
                .filter(e->e.getName().equals(name))
                .findFirst()
                .orElse(null);


    }

    public void treatAnimal(int animalNumber){
        animalId+= animalNumber;
        animals.stream()
                .filter(e->e.equals(animalNumber))
                .forEach(e-> System.out.println(e));
    }
    public void treatAnimal(String name){
        animals.stream()
                .filter(e->e.isVaccinated.containsKey(name))
                .forEach(e-> System.out.println(e));
    }
    public void treatAllAnimals(){
        animals.stream()
                .forEach(Animal::treatAnimal);
    }

    public Animal findOldestAnimal(){
        return  animals.stream()
                .max(Comparator.comparingInt(Animal::getAge))
                .orElse(null);
    }

    public int countAnimals(){

        return (int)animals.stream()
                .count();
    }

    public static void addAnimal(Animal animal){
        animal.setAnimalNumber(animalId++);  // geeft het dier een uniek nummer
        animals.add(animal);
        //animalId++;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
