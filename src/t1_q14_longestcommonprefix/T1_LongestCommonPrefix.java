package t1_q14_longestcommonprefix;

public class T1_LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
            return "";
        }
        String lcp = strs[0];
        for (int i =1; i<strs.length;i++){
            while (strs[i].indexOf(lcp) != 0){
                lcp = lcp.substring(0,lcp.length()-1);
                if (lcp.isEmpty()) return "";
            }
        }
        return lcp;
    }

    public static void main(String[] args){
        String[] s = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}
