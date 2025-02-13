package example.accessModifier_one;

public class Dog {
    public static final void main(String[] args) {
        Animal dog = new Animal((byte) 3);

        System.out.println(dog.getAge());

        Animal.makeSound();
    }
}
