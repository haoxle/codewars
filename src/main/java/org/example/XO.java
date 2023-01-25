package org.example;

public class XO {
    public static boolean getXO(String str) {
        int x = 0, o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') x++;
            if (str.toLowerCase().charAt(i) == 'o') o++;
        }
        return x == o;
    }

    public static boolean getXO2 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }

    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
    }
}
