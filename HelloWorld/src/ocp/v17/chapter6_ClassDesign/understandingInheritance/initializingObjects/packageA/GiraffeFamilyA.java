package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA;

public class GiraffeFamilyA {
    static { System.out.print("A"); }
    {System.out.print("B"); }

    public GiraffeFamilyA(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamilyA() {
        System.out.print("D");
    }

    public GiraffeFamilyA(int stripes) {
        System.out.print("E");
    }
}
