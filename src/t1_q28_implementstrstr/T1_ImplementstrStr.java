package t1_q28_implementstrstr;

public class T1_ImplementstrStr {
    public static int strStr_using_Java8(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static int strStr_Scratch(String haystack, String needle){
        if (haystack.length() == 0 && needle.length() == 0 || needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        int i = 0;
        while (i<haystack.length()){
            int k = 0;
            int j = i;
            while (j<haystack.length() && k<needle.length() && haystack.charAt(j) == needle.charAt(k)){
                j++;
                k++;
            }
            if (k == needle.length()) return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr_Scratch("hello","ll"));
    }
}
