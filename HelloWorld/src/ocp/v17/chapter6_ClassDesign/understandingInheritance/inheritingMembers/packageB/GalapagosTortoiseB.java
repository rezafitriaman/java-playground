package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageB;


import ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA.ReptileA;

import java.io.FileNotFoundException;
import java.io.IOException;

public class GalapagosTortoiseB extends ReptileA {
    public void sleep() throws FileNotFoundException {}

    // public void hide() throws FileNotFoundException {} // it does not compile - it implements a new checked exception

    // public void exitShell() throws IOException {} // it does not compile - it implements a broader checked exception

    public String getName() {
        return "GalapagosTortoiseB";
    }

    public String getColor() {
        return "red";
    }

    public StringBuilder getDescription() {
        return new StringBuilder("A Big GalapagosTortoiseB");
    }



}
