package t1_q349_intersectionoftwoarrays;

import punksterUtils_new.ArrayUtils;

import java.util.HashSet;

public class T1_IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num:nums2) set2.add(num);
        set1.retainAll(set2);
        int[] result = new int[set1.size()];
        int i = 0;
        for (int n : set1){
            result[i++] = n;
        }
        return result;
    }


    public static void main(String[] args) {
        ArrayUtils.printArray(intersection(new int[]{1,2,2,1},new int[]{2,2}));
    }
}
