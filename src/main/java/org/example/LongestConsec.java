package org.example;

//strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
//
//        Concatenate the consecutive strings of strarr by 2, we get:
//
//        treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
//        folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
//        trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
//        blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
//        abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
//
//        Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
//        The first that came is "folingtrashy" so
//        longest_consec(strarr, 2) should return "folingtrashy".
//
//        In the same way:
//        longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"


import java.util.ArrayList;
import java.util.Arrays;


public class LongestConsec {
    static ArrayList<String> n = new ArrayList<>();

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) {
            return "";
        }
        String consec = "";
        boolean stop = false;
        int maxlength = 0;
        String maxConsec = "";
        for (int i = 0; i < strarr.length; i++) {
            consec = "";
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    stop = true;
                    break;
                }
                consec += strarr[i + j];
            }
            if (stop) {
                break;
            } else if (consec.length() > maxlength) {
                maxlength = consec.length();
                maxConsec = consec;
            }

        }
        return maxConsec;
    }

    public static String longestConsec2(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";
        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            System.out.println(index + " this is index");
            for (int i = index; i < index + k; i++) {
                System.out.println(i + " this is i");
                sb.append(strarr[i]);
            }
            System.out.println(sb);

            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec2(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3));

    }
}

//        System.out.println("longestConsec Fixed Tests");
//                testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2), "abigailtheta");
//                testing(LongestConsec.longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
//                testing(LongestConsec.longestConsec(new String[] {}, 3), "");
//                testing(LongestConsec.longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2), "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
//                testing(LongestConsec.longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2), "wlwsasphmxxowiaxujylentrklctozmymu");
//                testing(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2), "");
//                testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3), "ixoyx3452zzzzzzzzzzzz");
//                testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15), "");
//                testing(LongestConsec.longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0), "");