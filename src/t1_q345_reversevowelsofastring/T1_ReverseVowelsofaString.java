package t1_q345_reversevowelsofastring;

import java.util.HashSet;

public class T1_ReverseVowelsofaString {
    public static String reverseVowels(String s){
        int i  = 0, j = s.length()-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] array = s.toCharArray();

        while (i<j){
            while (i<j && !set.contains(array[i])) i++;
            while (i<j && !set.contains(array[j])) j--;

            if (set.contains(array[i])&&set.contains(array[j])) {
                char tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String s = reverseVowels(" ");
        System.out.println(s);
    }
}
