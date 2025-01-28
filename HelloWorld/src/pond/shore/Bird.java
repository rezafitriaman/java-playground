package pond.shore;
// protected access - you can access it within the same package and subclass
public class Bird {
    protected String text = "floating";
    protected void floatInWater(){
        System.out.println("From Bird: " + text);
    }
}