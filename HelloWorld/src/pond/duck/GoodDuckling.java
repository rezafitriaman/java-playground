package pond.duck;
// package access
public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();
        System.out.println("From GoodDuckling: " + duck.noise);
    }
    public static void main(String[] args) {
        new GoodDuckling().makeNoise();
    }
}
