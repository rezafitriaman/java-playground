package pond.shore;
// protected access - u can access it on the same package.
public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
