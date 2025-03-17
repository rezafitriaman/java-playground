package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageA;

abstract public class MammalA {
    abstract void showHorn();
    abstract void eatLeaf();
    abstract CharSequence chew();
    public MammalA() {
        System.out.println(chew());
    }
}
