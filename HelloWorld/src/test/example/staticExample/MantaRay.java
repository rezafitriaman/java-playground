package test.example.staticExample;
// A static method or instance methode can call a static method. Static methods don't require an object to use.
// Only an instance method can call another instance method in the same class without using a reference variable, because instance methods do require an object.
// Similar logic applies for instance and static variables
public class MantaRay {
    private String name = "Sammy";
    private int age = 18;
    private static String hobby = "Listen Music";
    public static void first(){
//        System.out.println(age); // static method cannot call an instance variable
//        third(); // static method cannot call an instance methode
        new MantaRay().third(); // static method must create/instantiate the object then call the method
        second(); // static method can call another static method
        System.out.println(hobby); // static method can call a static variable
    } // static method
    public static void second(){}
    public void third(){ // instance method
        second(); // so an instance method can call a static method.
        System.out.println(hobby); // an instance method can call a static variable
        System.out.println(name); // an instance methode can call an instance variable
    }
    public void fourth(){ // instance method
        third(); // call another instance method in the same class without using a reference variable
        System.out.println("fourth");
        System.out.println(name); // an instance method can call instance variable
        System.out.println(hobby); // an instance method can call a static variable

    }
    public static void main(String... args){
        first(); // a static method can call another static method
        second(); // a static method can call another static method
        new MantaRay().third(); // instance methode need an object
    }
}
