package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageA;

public abstract class CanineA {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }
}
