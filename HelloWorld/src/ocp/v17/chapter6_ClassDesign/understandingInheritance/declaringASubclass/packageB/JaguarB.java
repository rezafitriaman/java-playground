package ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageB;
import ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageA.BigCat;

public class JaguarB extends BigCat {
    public JaguarB() {
        size = 11.2;
        name = "jacB";
//        weight = 20.2; // package modifier - u cant access it hier
    }

    public void printDetails() {
        System.out.println("Jaguar B: " + size);
        System.out.println("Jaguar B: " + name);
    }
    public final static void main(String[] args) {
        JaguarB j = new JaguarB();
        j.printDetails();
    }
}
