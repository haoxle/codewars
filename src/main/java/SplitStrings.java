import java.util.ArrayList;
import java.util.Arrays;


//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//        Examples:
//        * 'abc' =>  ['ab', 'c_']
//        * 'abcdef' => ['ab', 'cd', 'ef']


public class SplitStrings {

    public static String[] solution(String string) {
        ArrayList<String> pair = new ArrayList<>();
        if (string.length() % 2 == 1) {
            string += "_";
        }
        for (int i = 0; string.length() > i; i+= 2) {
            if (i != string.length() - 1) {
                pair.add(string.substring(i, i + 2));
            }
        }
        System.out.println(Arrays.toString(pair.toArray(new String[0])));
        return pair.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));

    }
}
