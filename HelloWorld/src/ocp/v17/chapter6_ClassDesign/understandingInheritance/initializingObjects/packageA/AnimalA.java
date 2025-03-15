package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA;

public class AnimalA {
    private int age;
    protected String name;
    {
        System.out.println();
        System.out.println(this.name);
    }
    static {
        System.out.print("A");
    }
}