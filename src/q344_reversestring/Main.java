package q344_reversestring;

public class Main {
    public static String reverseString(String s){
        StringBuilder str = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--){
            str.append(s.charAt(i));
        }
        return str.toString();
    }

    public static void main(String[] args){
        System.out.println(reverseString("hello"));
    }
}
