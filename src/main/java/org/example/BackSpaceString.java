package org.example;


import java.util.Stack;

public class BackSpaceString {

    public static String cleanString(String S) {
        Stack<Character> q = new Stack<Character>();
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) != '#')
                q.push(S.charAt(i));
            else if (!q.isEmpty())
                q.pop();
        }
        String ans = "";
        while (!q.isEmpty()) {
            ans += q.pop();
        }
        String answer = "";
        for (int j = ans.length() - 1; j >= 0; j--) {
            answer += ans.charAt(j);
        }
        return answer;
    }

    public String cleanString1(String s) {
        while (s.matches(".*[^#]#.*")) s = s.replaceAll("[^#]#", "");
        return s.replaceAll("#","");
    }

    public String cleanString2(String s) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); ++i) {
            char c = s.charAt(i);
            if(c=='#') b.setLength(Math.max(b.length()-1,0));
            else b.append(c);
        }
        return b.toString();
    }

    public static void main(String[] args) {
        System.out.println(cleanString("abc#d##c"));
    }
}
