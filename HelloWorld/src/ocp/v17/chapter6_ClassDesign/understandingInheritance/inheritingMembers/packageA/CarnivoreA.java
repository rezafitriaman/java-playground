package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA;

public class CarnivoreA {
    public boolean hasFur = false;

    public int getAge() {
        return 18;
    }
    protected static String getName() {
        return "CarnivoreA";
    }
}
