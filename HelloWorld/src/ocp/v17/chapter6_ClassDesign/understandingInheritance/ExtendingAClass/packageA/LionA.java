package ocp.v17.chapter6_ClassDesign.understandingInheritance.ExtendingAClass.packageA;

public class LionA extends AnimalA {
    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }
    public void roar() {
        System.out.println(name + ", age" + getAge() + ", says: Roar!");
    }
    public static void main(String[] args) {
        var lionA = new LionA();
        lionA.setProperties(3, "kion");
        lionA.roar();
    }
}