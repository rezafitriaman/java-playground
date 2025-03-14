package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageA.AnimalA;

public class GorillaB extends AnimalA {
    public GorillaB(int age) {
        super(age, "Gorilla");
    }
    public GorillaB() {
        super(5);
    }
}
