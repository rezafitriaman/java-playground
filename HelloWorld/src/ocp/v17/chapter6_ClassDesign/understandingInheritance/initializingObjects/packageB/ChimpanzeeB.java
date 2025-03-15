package ocp.v17.chapter6_ClassDesign.understandingInheritance.initializingObjects.packageB;

public class ChimpanzeeB extends ApeB {
    public ChimpanzeeB() {
        //super(2);
        System.out.print("Chimpanzee-");
    }
    public static void main(String... args) {
        System.out.print("main-");
        new ChimpanzeeB();
    }
    static {
        System.out.print("ChimpanzeeB-");
    }
    public String sound = "WaaWaWaa";
    {
        System.out.print(sound+"-");
    }
}

// OUTPUT: main-Primate-Apa1-Chimpanzee-
// OUTPUT: primate-jungle-ChimpanzeeB-main-0-Primate-Blue-Ape2-WaaWaWaa-Chimpanzee-
