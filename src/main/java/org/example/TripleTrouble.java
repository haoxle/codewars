package org.example;

public class TripleTrouble {
    public static int TripleDouble(long num1, long num2) {
        int count = 0;
        int count2 = 0;
        String[] array = new String[1];
        String numS = String.valueOf(num1);
        String numS2 = String.valueOf(num2);
        for (int i = 0; i < numS.length() - 1; i++) {
            if(numS.charAt(i) == numS.charAt(i+1) && count != 3){
                count += 1;
                array[0] = String.valueOf(numS.charAt(i));
            }
        } System.out.println(count);
        for (int i = 0; i < numS2.length() - 1; i++) {
            if(numS2.charAt(i) == numS2.charAt(i+1) && String.valueOf(numS2.charAt(i)).equals(array[0])){
                count2 ++;
            }
        }
        return (count > 0 && count2 > 0) ? 1 : 0;
    }

    public static int TripleDouble2(long num1, long num2)
    {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for(int i=0;i<10;i++) {
            String n = String.valueOf(i);
            if( n1str.contains(n+n+n) && n2str.contains(n+n) ) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(TripleDouble(451999277L, 41177722899L));
    }
}
