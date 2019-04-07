package t1_q350_intersectionoftwoarraysII;

import punksterUtils_new.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class T1_IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums1){
            if (map.containsKey(n)) map.put(n,map.get(n)+1);
            else map.put(n,1);
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int n : nums2){
            if(map.containsKey(n) && map.get(n)>0){
                map.put(n,map.get(n)-1);
                tmp.add(n);
            }
        }

        int[] res = new int[tmp.size()];
        for(int i = 0 ; i <tmp.size();i++){
            res[i] = tmp.get(i);
        }
        return res;
    }


    public static void main(String[] args) {
        ArrayUtils.printArray(intersect(new int[]{1,2,2,1},new int[]{2,2}));
    }
}
