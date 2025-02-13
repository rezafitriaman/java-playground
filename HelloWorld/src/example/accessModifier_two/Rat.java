package example.accessModifier_two;

import example.accessModifier_one.Animal;

public class Rat extends Animal {

    protected Rat(byte age) {
        super(age);
    }

    public static void main(String[] args) {
        Rat.makeSound();
        Rat rat = new Rat((byte) 1);
        System.out.println(rat.getAge());
        System.out.println(rat.getClass());
    }
}
