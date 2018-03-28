package q28_implementstrsstr;

public class Main {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 && haystack.length()==0 || needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        boolean found = false;
        while (i < haystack.length()) {
            int k = 0;
            j = i;
            while (j<haystack.length() && k<needle.length() && haystack.charAt(j) == needle.charAt(k)) {
                j++;
                k++;
            }
            if (k == needle.length()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        String haystack = "ParthParth";

        String needle = "rth";
        System.out.println(strStr(haystack,needle));
    }
}
