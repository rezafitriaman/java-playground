package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingOverloadedConstructor.packageA;

// this has duplication
public class HamsterA {
    private String color;
    private int weight;
    public HamsterA(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public HamsterA(int weight) {
        this.weight = weight;
        color = "brown";
    }
}
