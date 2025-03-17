package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageA;

public class BlackRhinoA extends RhinoA {
    String chew() {
        return "Yummyyyy!!";
    }
    @Override
    void eatLeaf() {}
    public static void main(String[] args) {
        BlackRhinoA blackRhinoA = new BlackRhinoA();
    }
}
