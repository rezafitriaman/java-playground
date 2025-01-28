package pond.goose;
import pond.shore.Bird;
// floatInWater() and test has protected modifier, so u can access it in the subclass and on the same package
public class Gosling extends Bird {
    public void swim(){
        floatInWater();
        System.out.println("From Gosling: " + text);
    }
    public static void main(String[] args) {
        new Gosling().swim();
    }
}
