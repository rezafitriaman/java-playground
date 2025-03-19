package ocp.v17.chapter6_ClassDesign.understandingInheritance.creatingImmutableObjects.packageA;

import java.util.ArrayList;
import java.util.List;

public final class AnimalA {
    private final ArrayList<String> favoriteFoods;

    public AnimalA() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Burger");
    }
    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public static void main(String... args) {
        var zebra = new AnimalA();
        System.out.println(zebra.getFavoriteFoods());

        zebra.getFavoriteFoods().clear();
        System.out.println(zebra.getFavoriteFoods());
        zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoods());
    }
}
