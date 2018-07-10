package q349_intersectionoftwoarrays;

import com.sun.deploy.util.ArrayUtil;
import punksterutils.ArrayUtilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums1){
            set.add(num);
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums2){
            if (set.remove(num)){
                list.add(num);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        ArrayUtilities.printArray(intersection(new int[]{1,2,2,1},new int[]{2,2}));
    }
}
