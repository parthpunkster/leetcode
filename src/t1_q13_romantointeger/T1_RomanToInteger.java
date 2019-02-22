package t1_q13_romantointeger;

import java.util.HashMap;

public class T1_RomanToInteger {
    public static final HashMap<Character,Integer> map = new HashMap<Character, Integer>();
    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }
    public static int romantoInt(String s){
        int value = 0;
        for (int i=0;i<s.length()-1;i++){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) value+= map.get(s.charAt(i));
            else value -= map.get(s.charAt(i));
        }
        return value+map.get(s.charAt(s.length()-1));
    }

    public static void main(String[] args){
        System.out.println(romantoInt("IV"));
    }
}
