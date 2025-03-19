package ocp.v17.chapter6_ClassDesign.understandingInheritance.creatingImmutableObjects.packageC;

import java.util.ArrayList;

final public class AnimalC {
    private final ArrayList<String> favFoods;

    public AnimalC() {
        this.favFoods = new ArrayList<String>();
        this.favFoods.add("Ribs");
    }

    public ArrayList<String> getFavFoods() {
        return new ArrayList<String>(this.favFoods);
    }

    public static void main(String[] args) {
        var c = new AnimalC();
        System.out.println(c.getFavFoods());

        c.getFavFoods().clear(); // it changed nothing
        System.out.println(c.getFavFoods());
    }
}
