package pond.duck;

import pond.goose.Goose;
import pond.shore.Bird;

public class GooseWatcher extends Bird {
    public void watch() {
        Goose goose = new Goose();
        goose.helpGooseSwim();
        goose.helpOtherGooseSwim();
//        goose.floatInWater(); // Does not compile because u call Goose.floatInWater() in the GooseWatcher
//        - .floatInWater() is an Bird methode - a caller of Goose (the GooseWatcher) cannot call .floatInWater()
    }
    public void watchGooseWatcher() {
        GooseWatcher gooseWatcher = new GooseWatcher();
        gooseWatcher.floatInWater(); // this will compile because the GooseWatcher extends B
    }
}
