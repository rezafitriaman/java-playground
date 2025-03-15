package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

public class ZooTicketsB {
    public static void main(String... patrons) { // 3
        System.out.println("+3+");
        System.out.print("main-");
        new ZooTicketsB();
    }
    public ZooTicketsB() { // 6
        System.out.println("+6+");
        System.out.print("z-");
    }
    private String name = "BestZoo"; // 4
    { // 5
        System.out.println("+5+");
        System.out.print(name + "-");
    }
    private static int COUNT = 0; // 0
    static { // 1
        System.out.println("+1+");
        System.out.print(COUNT + "-");
    }
    static { // 2
        System.out.println("+2+");
        COUNT+=10;
        System.out.print(COUNT+ "-");
    }


}

// OUTPUT: 0-10-main-BestZoo-z-
