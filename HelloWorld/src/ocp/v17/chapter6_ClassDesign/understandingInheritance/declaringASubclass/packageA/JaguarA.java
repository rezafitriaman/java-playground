package ocp.v17.chapter6_ClassDesign.understandingInheritance.declaringASubclass.packageA;

public class JaguarA extends BigCat {
    public JaguarA() {
        size = 10.2; // from BigCat class
        name = "Jack"; // from BigCat class
    }

    public void printDetails() {
        System.out.println(size);
        System.out.println(weight);
        System.out.println(name);
    }

    public static void main(String[] args) {
        JaguarA j = new JaguarA();
        j.printDetails();

        BigCat b = new BigCat();
        System.out.println(b.size);
    }
}