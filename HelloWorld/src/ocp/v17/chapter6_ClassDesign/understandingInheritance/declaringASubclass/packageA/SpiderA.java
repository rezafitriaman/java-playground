package ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageA;

public class SpiderA {
    public void printDetails() {}
    public static void  main(String... args) {
        BigCat b = new BigCat(); // BigCat is in the same package
        // all of this compile because there are not private
        System.out.println("SpiderA: " + b.size);
        System.out.println("SpiderA: " + b.weight);
        System.out.println("SpiderA: " + b.name);
    }
}
