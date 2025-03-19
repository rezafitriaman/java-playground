package ocp.v17.chapter6_ClassDesign.understandingInheritance.creatingImmutableObjects.packageD;

import java.util.ArrayList;

public final class AnimalD {
    private final ArrayList<String> favoriteFoods;

    public AnimalD(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.isEmpty()) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods); // make the class instance immutable
//        this.favoriteFoods = favoriteFoods; // class instance is not immutable
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }

    public static void main(String[] args) {
        var favorites = new ArrayList<String>();
        favorites.add("Bread");
        System.out.println(favorites);

        var zebra = new AnimalD(favorites);
        System.out.println(zebra.getFavoriteFoodsCount());
        System.out.println(zebra.getFavoriteFoodsItem(0));

        favorites.clear();
        System.out.println(favorites);

        favorites.add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoodsItem(0));
    }
}
