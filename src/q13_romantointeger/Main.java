package q13_romantointeger;

import java.util.HashMap;

public class Main {

    public static int romanToString(String s) {
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100 );
        map.put('D',500);
        map.put('M',1000);
        int[] array = new int[s.length()];
        for (int i = 0; i < s.length()-1;i++) {
            array[i] = map.get(s.charAt(i));
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
                result += map.get(s.charAt(i));
            }
            else {
                result -= map.get(s.charAt(i));
            }
        }
        return result+map.get(s.charAt(s.length()-1));

    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(romanToString("MCMXIV"));
    }
}
