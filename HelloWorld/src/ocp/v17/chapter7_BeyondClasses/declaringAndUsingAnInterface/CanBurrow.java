package ocp.v17.chapter7_BeyondClasses.declaringAndUsingAnInterface;

public abstract interface CanBurrow {
    // public abstract = implicit modifiers
    public abstract Float getSpeed(int age); // Abstract interface methode
    // public static final = Implicit modifiers = interface variable
    public static final int MINIMUM_DEPTH = 2; // Constant variable
}

// An implicit modifier is a modifier that the compiler automatically inserts into the code.
// For Example, an interface is always considered to be abstract, even if it is not marked so.

