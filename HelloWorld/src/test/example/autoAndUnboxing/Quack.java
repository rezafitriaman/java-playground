package test.example.autoAndUnboxing;

public class Quack {
    int quack = 5;
    Integer quackquack = Integer.valueOf(quack); //Convert int to Integer
    int quackquackquack = quackquack.intValue(); //Convert Integer to int
    public Quack() {
//        quackquackquack = quackquack.intValue(); //Convert Integer to int
    }
}

class Quack1 {
    int quack = 5;
    Integer quackquack = quack; // Autoboxing
    int quackquackquack = quackquack; // Unboxing
}

// this expression is all the same
class Tail {
    Short tail = 8; // autoboxing - first integer 8 is cast to short and then it outboxed to Short(wrapper object)
    Short tail1 = (short) 8;
    Short tail2 = Short.valueOf((short) 8);
}
