package pond.swan;
import pond.duck.MotherDuck;
public class BadCygnet {
    public void makeNoise(){
        var duck = new MotherDuck();
//        duck.quack(); // Does not compile - .quack() has an package modifier - meaning only available in the same package
//        System.out.println(duck.noise); // Does not compile - it has package modifier
    }
    public static void main(String[] args) {
        new BadCygnet().makeNoise();
    }

}
