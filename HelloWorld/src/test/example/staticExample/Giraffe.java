package test.example.staticExample;

public class Giraffe {
    public void eat(Giraffe g){
        allGiraffeComeOut(); // an instance methode can call a static method
        drink(); // an instance method can call another instance methode
        g.eat(new Giraffe()); // an instance methode calls another eat methode in another object
        eat(new Giraffe()); // an instance methode can call the same methode
    }
    public void drink(){};
    public static void allGiraffeGoHome(Giraffe g){
        allGiraffeComeOut(); // static method calls another static method
//        drink(); // static method cannot call an instance method
        g.eat(new Giraffe()); //.eat methode is an instance methode, so u need t instantiate that if u want to call it from a static methode.
    }
    public static void allGiraffeComeOut(){};
    public static void main(String... args) {

    }
}
