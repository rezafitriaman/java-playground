package ocp.v17.chapter6_ClassDesign.understandingInheritance.ExtendingAClass.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.ExtendingAClass.packageA.AnimalA;

public class LionB {
    public LionB() {
//        name = "LionB";
    }
    public static final void main(String... args) {
        AnimalA animalA;
        animalA = new AnimalA();
        animalA.setAge(10);
    }
}