package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalShelterTest {
    public AnimalShelter shelter;
    private final ByteArrayOutputStream outputStream =new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outputStream);


    @BeforeEach
    void setUp() {
        shelter = new AnimalShelter();
        Monkey monkey = new Monkey("Mogli",12);
        Cat cat = new Cat("Miauw", 4);
        Dog dog = new Dog("George", 14);

        AnimalShelter.addAnimal(monkey);
        AnimalShelter.addAnimal(cat);
        AnimalShelter.addAnimal(dog);

        monkey.isVaccinated(Disease.POLIO);
        cat.isVaccinated(Disease.POLIO);
        dog.isVaccinated(Disease.POLIO);


    }
    @AfterEach
            void tearDown() {
        System.setOut(System.out);
    }




    @DisplayName("Test: Print animal")
    @Test
    void printAnimals() {
        shelter.printAnimals();
       String output = outputStream.toString();
       assertTrue(output.contains("Mogli"));
       assertTrue(output.contains("Miauw"));
       assertTrue(output.contains("George"));
    }

    @Test
    void sortAnimals() {
    }

    @Test
    void sortAnimalsByName() {
    }

    @Test
    void sortAnimalsByAge() {
    }

    @Test
    void printAnimalsNotVaccinated() {
    }

    @Test
    void findAnimal() {
    }

    @Test
    void testFindAnimal() {
    }

    @Test
    void treatAnimal() {
    }

    @Test
    void testTreatAnimal() {
    }

    @Test
    void treatAllAnimals() {
    }

    @Test
    void findOldestAnimal() {
    }

    @Test
    void countAnimals() {
    }

    @Test
    void addAnimal() {
    }

    @Test
    void testToString() {
    }
}