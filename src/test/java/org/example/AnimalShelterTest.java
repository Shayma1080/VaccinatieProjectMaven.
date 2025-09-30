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

        shelter.addAnimal(monkey);
        shelter.addAnimal(cat);
        shelter.addAnimal(dog);

        monkey.isVaccinated(Disease.POLIO);
        cat.isVaccinated(Disease.CHICKENPOCKS);
        dog.isVaccinated(Disease.HEPATITISA);
        System.setOut(printStream);


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

    @DisplayName("Test: sort1 animal")
    @Test
    void sortAnimals1() {
        shelter.sortAnimals();
        String output = outputStream.toString();
        assertTrue(output.indexOf("Mogli") < output.indexOf("Miauw"));

    }
    @DisplayName("Test: sort2 animal")
    @Test
    void sortAnimals2() {
        shelter.sortAnimals();
        String output = outputStream.toString();
        assertTrue(output.indexOf("Miauw") < output.indexOf("George"));
    }

    @DisplayName("Test: sort Mogli animal by name")
    @Test
    void sortAnimalsByName1() {
        Animal a = shelter.findAnimal(1);
        assertNotNull(a);
        assertEquals("Mogli",a.getName());
    }

    @DisplayName("Test: sort  Miauw animal by name")
    @Test
    void sortAnimalsByName2() {
        Animal a = shelter.findAnimal(2);
        assertNotNull(a);
        assertEquals("Miauw",a.getName());
    }

    @DisplayName("Test: sort animal by age")
    @Test
    void sortAnimalsByAge() {
        shelter.sortAnimalsByAge();
        String output = outputStream.toString();
        assertTrue(output.indexOf("Miauw") < output.indexOf("Mogli"));
    }

    @DisplayName("Test: Print Miauw not vaccinated")
    @Test
    void printAnimalsNotVaccinated1() {
        shelter.printAnimalsNotVaccinated(Disease.POLIO);
        String output = outputStream.toString();
        assertTrue(output.contains("Miauw"));
    }

    @DisplayName("Test: Print George not vaccinated")
    @Test
    void printAnimalsNotVaccinated2() {
        shelter.printAnimalsNotVaccinated(Disease.POLIO);
        String output = outputStream.toString();
        assertTrue(output.contains("George"));
    }

    @DisplayName("Test: Print Mogli not vaccinated")
    @Test
    void printAnimalsNotVaccinated3() {
        shelter.printAnimalsNotVaccinated(Disease.POLIO);
        String output = outputStream.toString();
        assertTrue(output.contains("Mogli"));
    }

    @DisplayName("Test: find George")
    @Test
    void findAnimal1() {
        Animal a = shelter.findAnimal("George");
        assertNotNull(a);
        assertEquals("George", a.getName());
    }

    @DisplayName("Test: find  Mogli")
    @Test
    void findAnimal2() {
        Animal a = shelter.findAnimal("Mogli");
        assertNotNull(a);
        assertEquals("Mogli",a.getName());
    }

    @DisplayName("Test: find  Miauw")
    @Test
    void findAnimal3() {
        Animal a = shelter.findAnimal("Miauw");
        assertNotNull(a);
        assertEquals("Miauw",a.getName());
    }

    @DisplayName("Test: treat animal1")
    @Test
    void treatAnimal() {
        shelter.treatAnimal(2);
        String output = outputStream.toString();
        assertTrue(output.contains("Miauw"));
    }

    @DisplayName("Test: treat animal2")
    @Test
    void testTreatAnimal() {
        shelter.treatAnimal("Miauw");
        String output = outputStream.toString();
        assertTrue(output.contains("Miauw"));

    }

    @DisplayName("Test: treat all animal")
    @Test
    void treatAllAnimals() {
        shelter.treatAllAnimals();
        String output = outputStream.toString();
        assertTrue(output.contains("Mogli"));
        assertTrue(output.contains("Miauw"));
        assertTrue(output.contains("George"));
    }

    @DisplayName("Test: find old animal")
    @Test
    void findOldestAnimal() {
        Animal a = shelter.findOldestAnimal();
        assertNotNull(a);
        assertEquals("George",a.getName());
    }

    @DisplayName("Test: count animal")
    @Test
    void countAnimals() {
        assertEquals(3,shelter.countAnimals());
    }

    @DisplayName("Test: add Felix animal")
    @Test
    void addAnimal1() {
        shelter.addAnimal(new Cat("Felix",2));
        assertEquals(4,shelter.countAnimals());
    }
    @DisplayName("Test: add  Loulou animal")
    @Test
    void addAnimal2() {
        shelter.addAnimal(new Cat("Loulou",4));
        assertEquals(4,shelter.countAnimals());
    }

    @DisplayName("Test: toString animal")
    @Test
    void testToString() {
        String str = shelter.toString();
        assertTrue(str.contains("Mogli"));
        assertTrue(str.contains("Miauw"));
        assertTrue(str.contains("George"));
    }
}