package model;

import java.util.ArrayList;

public class Cases {
    private ArrayList<Ages> agesSet;

    public Cases() {
        agesSet = new ArrayList<Ages>();

    }

    public ArrayList<Ages> getSet() {
        return agesSet;
    }

    public String addCases(double[] ages) {
        String msg = "Edades repetidas error 404";
        // if (!repeated(ages)) {
        Ages cs = new Ages();
        agesSet.add(cs);
        msg = cs.addAges(ages);
        // }
        return msg;
    }

    public String deleteCases() {
        String data = "";
        for (var set : agesSet) {
            data += set.deleteAges() + "\n";
        }
        return data;
    }

    public String showDataSets() {
        String data = "Cantidad de casos: " + countCases() + "\n";
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

    public boolean repeated(double[] ages) {
        boolean repeat = false;
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                repeat = ((ages[j] == ages[i]) ? true : false);
            }
        }
        return repeat;
    }

    public int countCases() {
        int cont = 0;
        for (int i = 0; i < agesSet.size(); i++) {
            cont++;
        }
        return cont;
    }

}
