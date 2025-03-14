package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageA;

public class AnimalA {
    private int age;
    private String name;
    public AnimalA(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
        this.name = null;
    }
    public AnimalA(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
}
