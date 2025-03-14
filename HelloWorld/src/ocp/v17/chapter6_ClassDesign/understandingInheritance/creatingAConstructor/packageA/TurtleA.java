package ocp.v17.chapter6_ClassDesign.understandingInheritance.creatingAConstructor.packageA;

public class TurtleA {
    private String name;
    public TurtleA() {
        name = "John Doe";
    }
    public TurtleA(int age) {

    }
    public TurtleA(long age) {

    }
    public TurtleA(String newName, String... favoriteFoods) {
        name = newName;
    }
}
