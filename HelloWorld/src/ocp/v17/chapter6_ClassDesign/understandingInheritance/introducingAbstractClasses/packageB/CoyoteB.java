package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageA.CanineA;

public class CoyoteB extends CanineA {
    public String getSound() {
        return "Roar!";
    }

    public static void main(String[] args) {
        CanineA w = new CoyoteB();
        w.bark();
    }
}
