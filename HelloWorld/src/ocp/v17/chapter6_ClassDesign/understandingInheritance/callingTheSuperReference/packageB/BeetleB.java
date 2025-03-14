package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingTheSuperReference.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.callingTheSuperReference.packageA.InsectA;

public class BeetleB extends InsectA {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData() {
        //System.out.println(this.label); // label has package modifier on the parent, cant access it from another package.
        //System.out.println(super.label); // the same here, u cant use "super" also.
        System.out.println(this.age);
        //System.out.println(super.age); // parent does not have an age variable.
        System.out.println(this.numberOfLegs);
        System.out.println("super: " + super.numberOfLegs);
    }
    public static void main(String []n) {
        new BeetleB().printData();
    }
}
