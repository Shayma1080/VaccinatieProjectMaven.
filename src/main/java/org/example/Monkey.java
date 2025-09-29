package org.example;

public class Monkey extends Animal{
    private boolean isHyperActive= false;

    public Monkey(String name, int age) {
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
