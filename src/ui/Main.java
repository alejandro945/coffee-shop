package ui;

import java.io.*;

import model.Cases;

public class Main {
    public static final String SEPARATOR = "\\ ";
    private static Cases es = new Cases();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int option;
        bw.write("1. Competition (Copy and Paste)" + "\n");
        bw.write("2. Import and Export" + "\n");
        bw.write("Enter the option: ");
        bw.flush();
        option = Integer.parseInt(br.readLine());
        menu(option);
    }

    public static void initialize() throws IOException {
        int size = Integer.parseInt(br.readLine());
        double[] cases = new double[size];
        for (int i = 0; i < cases.length; i++) {
            String[] parts = br.readLine().split(SEPARATOR);
            double[] ages = new double[parts.length];
            for (int j = 0; j < ages.length; j++) {
                ages[j] = Double.parseDouble(parts[j]);
            }
            es.addCases(ages);
        }
        br.close();
        bw.write(es.showDataSets());
        bw.flush();
    }

    public static void importAndExportData() throws IOException {
        // IMPORT
        BufferedReader brf = new BufferedReader(new FileReader("data/Input2.txt"));
        brf.readLine();
        String line = brf.readLine();
        while (line != null) {
            String[] parts = line.split(SEPARATOR);
            double[] ages = new double[parts.length];
            for (int i = 0; i < ages.length; i++) {
                ages[i] = Double.parseDouble(parts[i]);
            }
            es.addCases(ages);
            line = brf.readLine();
        }
        brf.close();
        // EXPORT
        BufferedWriter bwf = new BufferedWriter(new FileWriter("data/Output.txt"));
        bwf.write(es.showDataSets());
        bwf.close();
        bw.write("Data have been imported and exported succesfully, CHECK OUTPUT.TXT IN DATA FOLDER");
        bw.flush();
    }

    public static void menu(int option) throws IOException {
        switch (option) {
            case 1:
                initialize();
                break;
            case 2:
                importAndExportData();
                break;
        }
    }
}
