package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageA;

public class AfricanElephantA extends ElephantA {
    // the compiler inserts automatically a no-argument constructor with a call to super()
//   public AfricanElephantA() {
//       super();
//   }
    // the compiler inserts automatically a super() in the constructor
    public AfricanElephantA() {
//        super();
    }
}
