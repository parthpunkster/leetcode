package leetcode_amazon;

public class Q8_StringtoIntegeratoi {
    public static int myAtoi(String str){
        if (str == null || str.length() == 0) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;
        int signFlag = 0;
        StringBuilder result = new StringBuilder();

        for (char c:str.toCharArray()){
            if (signFlag == 0 && (c == '+' || Character.isDigit(c) || c == '-')){
                signFlag = 1;
                result.append(c);
            }
            else if (signFlag != 1 && (c == '+' || c == '-' || !Character.isDigit(c))) return 0;
            else if (!Character.isDigit(c)) break;
            else result.append(c);
        }
        if ((result.charAt(0) == '+' || result.charAt(0) == '-')&&result.length()==1) return 0;
        try {
            int val = Integer.parseInt(result.toString());
            return val;
        }
        catch (NumberFormatException e){
            if (result.charAt(0) == '-') return Integer.MIN_VALUE;
            else return Integer.MAX_VALUE;
        }


    }

    public static void main(String[] args) {
        System.out.println(myAtoi("   +0 123"));
    }
}
