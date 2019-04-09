package leetcode_amazon;

public class Q5_LongestPalindromicSubstring {
    public static String longestPalindrome(String s){
        if (s.length() == 0 || s == null) return s;
        boolean[][] isPalin = new boolean[s.length()][s.length()];

        for (int i = 0 ; i <s.length();i++){
            isPalin[i][i] = true;
            if(i+1<s.length() &&s.charAt(i)==s.charAt(i+1)) isPalin[i][i+1] = true;
        }

        for (int i = 2;i<=s.length();i++){
            for(int j = 0; j+i < s.length();j++){
                if (s.charAt(j) == s.charAt(j+i)) isPalin[j][j+i] = isPalin[j+1][j+i-1];
            }
        }

        for (boolean[] row:isPalin) {
            for (boolean val : row) {
                System.out.print(val);
            }
            System.out.println();
        }

        for (int i = s.length(); i>=1;i--){
            for(int j = 0;i+j<s.length();j++){
                if (isPalin[j][j+i]) return s.substring(j,j+i+1);
            }
        }
        return s.substring(0,1);
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("caba"));
    }
}
