package example.accessModifier_one;

public class Animal {
    private final byte age;

    protected Animal(byte age) { // this constructor has package access
        this.age = age;
    }

    protected byte getAge() {
        return age;
    }

    public static void makeSound() {
        System.out.println("grrrr");
    }
}
