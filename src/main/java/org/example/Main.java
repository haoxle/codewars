package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int convertToMins(double x) {
        String str = String.format("%.2f", x);
        int minutes = 0;
        String[] arr = str.split("[.]");
        if (arr.length == 2) {
            minutes = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
        }
        return minutes;
    }

    public static Double[][] convertDouble(String[][] a){
        ArrayList<Double> c = new ArrayList<>();
        Double[][] b = new Double[a.length][2];
        for (String[] strings : a) {
            for (String strings2 : strings) {
                c.add(Double.parseDouble(strings2.replace(':', '.')));
            }
        }
        int n = 0;
        int m = 0;
        for (int i = 0; i < c.size(); i++) {
            b[n][m] = c.get(i);
            if(m == 1 && n < a.length){
                m = 0;
                n++;
            } else {
                m++;
            }
        }
        System.out.println(Arrays.deepToString(b));
        return b;
    }

    public static void main(String[] args) {
        String[][] a = new String[][]{{"9:00", "10:00"}, {"11:00", "12:00"},{"14:00", "18:00"}};
        System.out.println(Arrays.deepToString(convertDouble(new String[][]{new String[]{"9:00", "10:00"}, {"11:00", "12:00"},{"14:00", "18:00"}})));
    }
}