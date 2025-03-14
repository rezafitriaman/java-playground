package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.callingParentConstructors.packageA.AnimalA;

// So each constructor must finally calls the parent/super()
// U can do it either a call to overloaded/another constructor with a super() in it or call the super() directly
public class ZebraB extends AnimalA {
   public ZebraB(int age) {
       super(age);
   }
   public ZebraB() {
       this(4);
       //or a call to super() directly
//       super(4);
   }
}
