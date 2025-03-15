package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA;

public class HippoA extends AnimalA {
    public static void main(String[] args) {
        System.out.print("C");
//        new HippoA();
//        new HippoA();
    }

    static {
        System.out.print("B");
    }
}
