package ocp.v17.chapter6_ClassDesign.understandingInheritance.callingTheSuperReference.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.callingTheSuperReference.packageA.ReptileA;

public class CrocodileB extends ReptileA {
    protected final int speed = 20; // instance variable can have widening and more restrictive acces modifier
    public int getSpeed() {
        return super.speed;
    }
    public final static void main(String[] args) {
        var croc = new CrocodileB();
        System.out.println(croc.speed);
        System.out.println("get: " + croc.getSpeed());
    }
}