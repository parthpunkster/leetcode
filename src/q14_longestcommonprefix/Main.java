package q14_longestcommonprefix;

public class Main {

    public static String longestCommonPrefix(String[] strings) {
        String pre = strings[0];
        for (int i = 1; i< strings.length; i++) {
            while (strings[i].indexOf(pre) != 0) {
                pre = pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        // write your code here
        String[] strings = new String[]{"par","pare","pa"};
        System.out.println(longestCommonPrefix(strings));

    }
}
