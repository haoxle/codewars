package org.example;


//  Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//  which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example (Input --> Output):
//
//        39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
//        999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
//        4 --> 0 (because 4 is already a one-digit number)

public class Persistence {

    public static int persistence(long n) {
        int count = 0;
        String n1 = String.valueOf(n);
        while(n1.length() > 1) {
          int sum = 1;
            for (int i = 0; i < n1.length(); i++) {
                sum = Integer.parseInt(String.valueOf(n1.charAt(i)));
            }
            count++;
            n1 = String.valueOf(sum);
        }
        return count;
    }

    public static int persistence1(long n) {
        int i = 0;
        while(n >= 10) {
            int m = 1;
            while (n > 0) {
                m *= (n % 10);
                n /= 10;
            }
            n = m;
            i += 1;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(persistence(15));
    }
}
