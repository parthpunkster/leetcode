package q345_reversevowelsofastring;

public class Main {
    public static String reverseVowels(String s){
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
                vowels.append(s.charAt(i));
            }
        }
        int j = vowels.length()-1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                result.append(vowels.charAt(j));
                j--;
            }
            else result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(reverseVowels("leetcode"));
    }
}
