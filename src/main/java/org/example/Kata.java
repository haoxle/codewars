package org.example;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        return "(" + String.valueOf(numbers[0]) + String.valueOf(numbers[1]) + String.valueOf(numbers[2]) + ") " + String.valueOf(numbers[3]) + String.valueOf(numbers[4]) + String.valueOf(numbers[5]) + "-" + String.valueOf(numbers[6]) + String.valueOf(numbers[7]) + String.valueOf(numbers[8])+ String.valueOf(numbers[9]);
    }

    public static String createPhoneNumber1(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }

    public static String createPhoneNumber2(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{5}));
    }
}
