package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingOverloadedConstructor.packageB;

public class HamsterB {
    private String color;
    private int weight;
    public HamsterB(String color, int weight) {
        this.color = color;
        this.weight = weight;
//        this(weight);
//        this.color = color;
    }
    public HamsterB(int weight) {
//        this.weight = weight;
//        this.color = "brown";
        this("brown", weight); // this is better and no duplication
    }
    public static void main(String... args) {
        HamsterB hamsterB = new HamsterB(10);
        System.out.println(hamsterB.color);
        System.out.println(hamsterB.weight);
    }
}
