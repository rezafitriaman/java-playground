package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater(); // it compile
        System.out.println(text); // it compiles - it has reference to Goose and Goose is a subclass of Bird
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater(); // does not compile
//        System.out.println(other.text); // does not compile
    }
}
