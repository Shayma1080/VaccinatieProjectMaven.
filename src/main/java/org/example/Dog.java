package org.example;

public class Dog extends Animal{
    private boolean hasFoulBreath= false;

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void treatAnimal() {
        super.treatAnimal();
    }

    @Override
    public Boolean getClean() {
        return super.getClean();
    }

    @Override
    public String toString() {
        return " name= " + name +
                " age= " + age;
    }
}
