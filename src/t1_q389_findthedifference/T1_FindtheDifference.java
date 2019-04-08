package t1_q389_findthedifference;

import java.util.HashSet;

public class T1_FindtheDifference {
    public static char findTheDifference_usingSet(String s, String t){
        int sum1 = 0;
        int sum2 = 0;
        for(char c:s.toCharArray()) sum1 += (int) c;
        for (char c:t.toCharArray()) sum2 += (int) c;
        return (char)(sum2-sum1);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference_usingSet("abcd","abcde"));
    }
}
