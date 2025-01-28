package test.example.staticExample;

public class Gorilla {
    public static int count; // a static variable
    public static void addGorilla() {count++;} // a static method can call a static variable
    public void babyGorilla() {count++;} // instance methode can call a static variable
    public void announceBabies() { // this is an instance variable
        addGorilla(); // an instance variable can call a static variable
        babyGorilla(); // an instance variable can call another instance variable
    }
    public static void announceBabiesToEveryone() { // this is a static variable
        addGorilla(); // a static variable can call another static variable
//        babyGorilla(); // an static methode cannot call an instance methode
    }
    public int total; // instance variable
//    public static double average = total/count; // a static variable cannot call an instance variable - total is an instance variable
}
