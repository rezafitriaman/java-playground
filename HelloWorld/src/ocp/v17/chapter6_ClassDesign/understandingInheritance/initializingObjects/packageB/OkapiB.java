package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

import ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageA.GiraffeFamilyA;

public class OkapiB extends GiraffeFamilyA {
    static {System.out.print("F");}

    public OkapiB(int stripes) {
        //super("sugar");
        System.out.print("G");
    }
    {System.out.print("H");}

    final static public void main(String[] args) {
       new OkapiB(1);
       System.out.println();
       new OkapiB(2);
    }
}

//OUTPUT: AFBECHG - BECHG
//OUTPUT: AFBDHG - BDHG
