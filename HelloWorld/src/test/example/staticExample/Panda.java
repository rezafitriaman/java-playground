package test.example.staticExample;
// All static initializers run when the class is frist used, in the order they are defined.
public class Panda {
    final static String name = "Ronda";
    int bamboo;
    final int door;
    static final double height; // static variable need to initiate - u can initiate it in a static initializer
//    final double width; // final variables must be initialized with a value.
    static {height = 1;} // static initializers
    {bamboo=5;} // instance initializer
//    {door=6}
    public Panda() { // constructor
       this.bamboo = 9;
       this.door = 2;
    }

    public static void main(String[] args) {
        int bambooValue = new Panda().bamboo;
        System.out.println(bambooValue);
        System.out.println(height);
    }
}