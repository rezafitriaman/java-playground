package pond.inland;
import pond.shore.Bird;
public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // u cant access it here, because it has a protected modifier and is in different package, and it is not a subclass of Bird.
//        System.out.println(bird.text); // u cant access it here, because it has a protected modifier and it is in different package, and it is not a subclass of Bird.
    }
}
