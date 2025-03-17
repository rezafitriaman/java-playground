package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA.BearA;

public class PandaB extends BearA {
    public static void eat() {
        System.out.println("PandaB is chewing");
    }
    public static void main(String[] args) {
        eat();
    }
}
