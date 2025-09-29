package org.example;

public class Cat extends Animal{
    private boolean hasLongNails= false;

    public Cat(String name, int age) {
        super(name, age);
    }

    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
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
