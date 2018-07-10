package q350_intersectionoftwoarraysII;

import punksterutils.ArrayUtilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num: nums1){
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int num: nums2){
            if (map.containsKey(num)&&map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        ArrayUtilities.printArray(intersect(new int[]{1,2,2,1}, new int[]{2,2,}));
    }
}
