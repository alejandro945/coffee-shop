package ui;

import java.io.*;

import model.EssentialShop;

public class Main {
    public static final int EXIT_OPTION = 5;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        EssentialShop es = new EssentialShop();
        int option;
        do {
            bw.write("1. Add Ages to Sets" + "\n");
            bw.write("2. Show Data Sets" + "\n");
            bw.write("3. Clear Data Sets" + "\n");
            bw.write("4. Ordenar Data Sets" + "\n");
            bw.write("5. Exit" + "\n");
            bw.write("Enter the option: ");
            bw.flush();
            option = Integer.parseInt(br.readLine());
            switch (option) {
                case 1:
                    bw.write("Cantidad de casos a agregar: ");
                    bw.flush();
                    int cases = Integer.parseInt(br.readLine());
                    for (int i = 0; i < cases; i++) {
                        bw.write("Cantidad de edades a agregar caso " + (i + 1) + ": ");
                        bw.flush();
                        int ages = Integer.parseInt(br.readLine());
                        double[] agesF = new double[ages];
                        for (int j = 0; j < ages; j++) {
                            bw.write("Edad boy " + (j + 1) + ": ");
                            bw.flush();
                            double age = Double.parseDouble(br.readLine());
                            agesF[j] = age;
                        }
                        bw.write(es.addCases(agesF) + "\n");
                        bw.flush();
                    }
                    break;
                case 2:
                    bw.write(es.showDataSets() + "\n");
                    bw.flush();
                    break;
                case 3:
                    bw.write(es.deleteCases() + "\n");
                    bw.flush();
                    break;
                case 4:
                    bw.write(es.sort() + "\n");
                    bw.flush();
                    break;
                case 5:
                    bw.write("Gracias!!");
                    bw.flush();
                    break;
                default:
                    bw.write("Opcion invalida");
                    bw.flush();
            }

        } while (option != EXIT_OPTION);
    }
}
