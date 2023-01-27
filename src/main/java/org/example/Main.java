package org.example;

import java.util.Arrays;

public class Main {
    public static int convertToMins(double x) {
        String str = String.format("%.2f", x);
        System.out.println(str);
        int minutes = 0;
        String[] arr = str.split("[.]");
        System.out.println(Arrays.toString(arr));
        if (arr.length == 2) {
            minutes = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
        }
        return minutes;
    }

    public static void main(String[] args) {
        System.out.println(convertToMins(1.30));
    }
}