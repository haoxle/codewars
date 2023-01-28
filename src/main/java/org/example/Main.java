package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Double.parseDouble;

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

    public static void main(String[] args) {


        String[][] a = new String[][]{{"9:00", "10:00"}, {"11:00", "12:00"}};
        ArrayList<Double> c = new ArrayList<>();
        Double[][] b = new Double[a.length][2];
        Double[] e ;

        for (String[] strings : a) {
            for (String strings2 : strings) {
                c.add(Double.parseDouble(strings2.replace(':', '.')));
            }
        }

        System.out.println(Arrays.toString(new ArrayList[]{c}));


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][0] = c.get(i);
                b[i][1] = c.get(j);

            }
        }



        System.out.println(Arrays.deepToString(b));
    }
}