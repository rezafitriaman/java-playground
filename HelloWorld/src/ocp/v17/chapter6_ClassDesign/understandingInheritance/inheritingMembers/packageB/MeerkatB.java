package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA.CarnivoreA;

public class MeerkatB extends CarnivoreA {
    protected boolean hasFur = true;
    public void printMe() {
        MeerkatB m = new MeerkatB(); // an object is created with MeerkatB
        CarnivoreA c = m; // c is CarnivoreA now
        System.out.println(super.getName()); // a variable is hidden - so it still has the parent variable
        System.out.println(m.hasFur); // a variable is hidden - so it still has the parent variable
        System.out.println(c.hasFur);
        System.out.println(hasFur);
        System.out.println("super : " + super.hasFur);
        System.out.println(getAge());
        System.out.println("parent? age: " + c.getAge()); // .getAge() is overridden - so it does not matter
        System.out.println("super: " + super.getAge());
    }

    public int getAge() {
        return super.getAge() + 2;
    }

    protected static String getName() {
        return "MeerkatB";
    }

    public static void main(String[] args) {
        new MeerkatB().printMe();
        CarnivoreA m = new MeerkatB();
        System.out.println(MeerkatB.getName());
//        System.out.println(m.getAge());
    }
}
