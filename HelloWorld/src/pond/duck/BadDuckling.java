package pond.duck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck(); // FatherDuck is in the same package
//        duck.quack(); // does not compile - .quack() is private
//        System.out.println(duck.noise); // does not compile - noise is private
    }
}
