package ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageB;
import ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageA.BigCat;

public class SpiderB {
    public static final void main(String... args) {
        BigCat b = new BigCat(); // BigCat is in another package - packageA
        b.name = "Spaceder";
        System.out.println("SpiderB: " + b.name); // it compile because name has public modifier
        //System.out.println("SpiderB: " + b.size); // cant compile because size has protected modifier
        //System.out.println("SpiderB: " + b.weight); // cant compile because weight has package modifier

    }
}
