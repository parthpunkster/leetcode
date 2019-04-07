package t1_q344_reversestring;

public class T1_ReverseString {
    public static void reverseString(char[] s){
        for (int i = 0 ; i<=(0+(s.length-1)/2);i++){
            char tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }


    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l'};
        reverseString(s);
        for (char c: s) System.out.print(c);
    }
}
