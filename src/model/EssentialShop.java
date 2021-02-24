package model;

import java.util.ArrayList;

public class EssentialShop {
    private ArrayList<CoffeeShop> agesSet;

    public EssentialShop() {
        agesSet = new ArrayList<CoffeeShop>();

    }

    public ArrayList<CoffeeShop> getSet() {
        return agesSet;
    }

    public String addCases(double[] ages) {
        CoffeeShop cs = new CoffeeShop();
        agesSet.add(cs);
        return cs.addAges(ages);
    }

    public String deleteCases() {
        String data = "";
        for (var set : agesSet) {
            data += set.deleteAges() + "\n";
        }
        return data;
    }

    public String showDataSets() {
        String data = "";
        for (var set : agesSet) {
            data += set.showAgesSorted() + "\n";
        }
        return data;
    }

    public String sort() {
        String data = "No hay datos en el set";
        for (var set : agesSet) {
            if (set != null) {
                set.bubbleSort(set.getAges());
                data = "Se han ordenado las edades";
            }
        }
        return data;
    }

}
