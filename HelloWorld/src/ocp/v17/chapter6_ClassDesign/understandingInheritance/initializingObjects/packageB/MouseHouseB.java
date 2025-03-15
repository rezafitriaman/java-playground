package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

public class MouseHouseB {
    private final int volume;
    private final String type;
    {
        this.volume = 10;
    }

    public MouseHouseB(String type) {
        this.type = type;
    }

    public MouseHouseB() {
//        this.volume = 2;
//        this.type = ""; // u need to initiate a final in each constructor
//        or u can do this
        this(null);
    }
}
