package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA;

public class PrimateA {
    protected static String name = "Primate";
    static {
        System.out.print(name+"-");
    }
    protected int age = 0;
    public PrimateA() { // default no-argument constructor
        System.out.print("Primate-");
    }
    {
        System.out.print(age + "-");
    }
}
