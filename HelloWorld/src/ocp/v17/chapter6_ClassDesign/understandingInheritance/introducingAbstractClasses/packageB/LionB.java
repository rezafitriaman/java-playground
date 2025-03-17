package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageB;

public class LionB extends BigCatB{
    public LionB(String name) {
        super(name);
    }

    String getName(String name) {
        return "Lion";
    }
    public void roar() {
        System.out.println("a Big Roar!!!!!");
    }
    public static void main(String... args) {
        new LionB("Lion").roar();
    }

}
