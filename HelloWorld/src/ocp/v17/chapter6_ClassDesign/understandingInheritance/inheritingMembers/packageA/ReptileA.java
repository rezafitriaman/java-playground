package ocp.v17.chapter6_ClassDesign.understandingInheritance.inheritingMembers.packageA;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReptileA {
    protected void sleep() throws IOException {}

    protected void hide() {}

    protected void exitShell() throws FileNotFoundException {}

    protected CharSequence getName() {
        return "ReptileA";
    }
    protected String getColor() {
        return "red";
    }
    protected CharSequence getDescription() {
        return new StringBuilder("A Big GalapagosTortoiseB");
    }
}

