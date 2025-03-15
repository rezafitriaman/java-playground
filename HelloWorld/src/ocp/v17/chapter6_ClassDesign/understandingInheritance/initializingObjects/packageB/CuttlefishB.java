package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

public class CuttlefishB {
    private String name = "swimmy";
    {System.out.println(name);}
    private static int COUNT = 0;
    static {System.out.println(COUNT);}
    {COUNT++;System.out.println(COUNT);}

    public CuttlefishB() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new CuttlefishB();
    }
}

// OUTPUT: 0 Ready swimmy 1 Constructor