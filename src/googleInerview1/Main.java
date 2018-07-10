package googleInerview1;

import java.util.HashMap;

public class Main {
    public static boolean isTripletSumEqualsN(int[] array,int n){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i< array.length; i++){
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }

        for (int i = 0; i<array.length-2; i++){
            map.put(array[i],map.get(array[i])-1);
            for (int j = i+1; j<array.length-1; j++){
                if (map.containsKey(-(array[i]+array[j])) && map.get(-(array[i]+array[j]))>0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isTripletSumEqualsN(new int[]{100,200,-1-1-1-1-1,-300},0));
    }
}
