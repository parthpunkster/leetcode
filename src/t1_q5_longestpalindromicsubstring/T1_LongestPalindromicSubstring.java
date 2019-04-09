package t1_q5_longestpalindromicsubstring;

public class T1_LongestPalindromicSubstring {
    public static boolean isPalindrome(String s, int start, int end){
        StringBuilder str = new StringBuilder(s.substring(start,end));
        return str.reverse().toString().equals(s.substring(start,end));
    }

    public static String longestPalindrome_bruteforce(String s){
        int start = 0;
        int end = 0;
        int maxlength = 0;
        for(int i = 0 ; i < s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                if (isPalindrome(s,i,j) && j-i > maxlength){
                    maxlength = j-i;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start,end);
    }

    public static String longestPalindrome_dp(String s){
        if(s.length() == 0) return s;
        boolean[][] array = new boolean[s.length()][s.length()];
        for (int i = 0; i<s.length();i++){
            array[i][i] = true;
            if (i+1<s.length()) array[i][i+1] = (s.charAt(i) == s.charAt(i+1));
        }

        for (int i = 2; i <= s.length();i++){
            for(int j = 0;j+i<s.length();j++){
                if (s.charAt(j)==s.charAt(j+i)){
                    array[j][j+i] = array[j+1][j+i-1];
                }
                else array[j][j+i] = false;
            }
        }

        for(int i = s.length();i>=1;i--){
            for (int j = 0;i+j<s.length();j++){
                if (array[j][j+i]) return s.substring(j,j+i+1);
            }
        }
        return s.substring(0,1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome_dp("cbbd"));
    }
}
