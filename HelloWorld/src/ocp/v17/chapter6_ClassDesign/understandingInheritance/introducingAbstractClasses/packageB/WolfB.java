package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageA.CanineA;

public class WolfB extends CanineA {
    public String getSound() {
        return "Woooooof!";
    }
}
