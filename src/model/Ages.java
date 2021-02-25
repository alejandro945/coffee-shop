package model;

import java.util.ArrayList;

public class Ages {
    private ArrayList<Double> ages;
    private double prom;

    public Ages() {
        this.ages = new ArrayList<Double>();
    }

    public ArrayList<Double> getAges() {
        return ages;
    }

    public String addAges(double[] renderAges) {
        for (var age : renderAges) {
            ages.add(age);
        }
        return "The children ages have been added succesfully" + "\n";
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
        double prom = ((ages.size() == 1) ? Math.rint((cont / ((double) (ages.size()))) * 100) / 100
                : Math.rint((cont / ((double) (ages.size() - 1))) * 100) / 100);
        this.prom = prom;
    }

    public String showAgesSorted() {
        bubbleSort(ages);
        return prom + "-" + showData();
    }
}
