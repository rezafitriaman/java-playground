package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA.MarsupialA;
// public - protected - package - private
public class KangarooB extends MarsupialA {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }
    public String getName() {
        return "KangarooB";
    }
    public int getAge() {
        return super.getAge()+9;
    }
    final static public void main(String... args) {
//        System.out.println(new MarsupialA().getAverageWeight()); // 50.0
//        System.out.println(new KangarooB().getAverageWeight()); // 70.0

        KangarooB k = new KangarooB();
        System.out.println(k.getAverageWeight());
        System.out.println(k.getName());
        System.out.println(k.getAge());
        System.out.println("---");
        MarsupialA m = new MarsupialA();
//        System.out.println(m.getAverageWeight());
//        System.out.println(m.getName());
//        System.out.println(m.getAge());
    }
}
