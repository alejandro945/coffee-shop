package model;

import java.util.ArrayList;

public class CoffeeShop {
    private ArrayList<Double> ages;
    private double prom;

    public CoffeeShop() {
        this.ages = new ArrayList<Double>();
    }

    public ArrayList<Double> getAges() {
        return ages;
    }

    public String addAges(double[] renderAges) {
        for (var age : renderAges) {
            ages.add(age);
        }
        return "The children ages have been added succesfully";
    }

    public String deleteAges() {
        ages.clear();
        return "The Ages List have been deleted succesfully";
    }

    public String showData() {
        String msg = "";
        for (var age : this.ages) {
            msg += age + " ";
        }
        return msg;
    }

    public void bubbleSort(ArrayList<Double> ages) {
        int cont = 0;
        for (int i = ages.size(); i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (ages.get(j) > ages.get(j + 1)) {
                    double temp = ages.get(j);
                    ages.set(j, ages.get(j + 1));
                    ages.set(j + 1, temp);
                    cont++;
                }
            }
        }
        double prom = (cont / (ages.size() - 1));
        this.prom = prom;
    }

    public String showAgesSorted() {
        return prom + "-" + showData();
    }
}
