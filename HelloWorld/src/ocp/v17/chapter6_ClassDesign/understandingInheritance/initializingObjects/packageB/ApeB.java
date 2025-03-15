package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA.PrimateA;

public class ApeB extends PrimateA { // PrimateA has a default no-argument constructor,
// so u need to create an super() with no argument or let the compiler instantiate it
    public ApeB(int fur) {
        // the compiler put super() init
        System.out.print("Ape1-");
    }
    public ApeB() {
        // the compiler put super() init
        System.out.print("Ape2-");
    }
    public static String home = "Jungle";
    static {
        System.out.print(home + "-");
    }
    protected String color = "Blue";
    {
        System.out.print(color + "-");
    }
}
