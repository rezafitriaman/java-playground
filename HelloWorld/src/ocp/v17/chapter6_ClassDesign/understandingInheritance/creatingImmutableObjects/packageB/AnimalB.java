package ocp.v17.chapter6_ClassDesign.understandingInheritance.creatingImmutableObjects.packageB;

import java.util.ArrayList;
import java.util.List;

public final class AnimalB {
    private final List<String> favoriteFoods;
    public AnimalB() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodItem(int index) {
        return favoriteFoods.get(index);
    }
    final public static void main(String... args) {
       var zebra = new AnimalB();
        System.out.println(zebra.getFavoriteFoodsCount());
        System.out.println(zebra.getFavoriteFoodItem(zebra.getFavoriteFoodsCount() - 1));
    }
}
