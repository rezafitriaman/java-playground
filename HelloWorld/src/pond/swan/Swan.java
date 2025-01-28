package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater(); // protected access
        System.out.println(text); // protected access
    }
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();; // subclass access
        System.out.println(other.text); // subclass access
    }
    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater(); // does not compile - it uses Bird reference - and this is on another package then Bird
//        System.out.println(other.text); // does not compile - it uses Bird reference
    }
}
