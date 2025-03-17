package ocp.v17.chapter6_ClassDesign.understandingInheritance.introducingAbstractClasses.packageB;

public abstract class AnimalB {
    abstract String getName(String name); // it has default acces modifier - the same as normal methode
    // so the compiler inserts the default non-argument constructor automatically
    public AnimalB(String name) {
       System.out.println("name: " + getName(name));
    }
}

