package leetcode_amazon;

import java.util.ArrayList;
import java.util.List;

public class Q4_MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i <nums1.length || j<nums2.length){
            if (i == nums1.length && j != nums2.length) list.add(nums2[j++]);
            else if(i != nums1.length && j == nums2.length) list.add(nums1[i++]);
            else if (nums1[i] < nums2[j])list.add(nums1[i++]);
            else list.add(nums2[j++]);
        }
        System.out.println(list);
        if (list.size()%2 == 0) {
            int mid = list.size()/2;
            double val = (double)(list.get(mid) + list.get(mid-1)) / 2;
            return val;
        }
        return (double) list.get(list.size()/2);
    }


    public static double findMedianSortedArrays_binary_recc(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;

        if (m>n){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;

            int tmp = m;
            m = n;
            n = tmp;
        }

        int iMin = 0;
        int iMax = m;

        while (iMin <= iMax){
            int i = iMin + (iMax - iMin) / 2;
            int j = (m+n+1)/2 - i;

            if (i < iMax && nums2[j-1] > nums1[i]){
                iMin = i + 1;
            }
            else if(i>iMin && nums1[i-1] > nums2[j]){
                iMax = i-1;
            }
            else {
                int maxLeft = 0;
                int minRight = 0;
                if (i == 0) maxLeft = nums2[j-1];
                else if(j == 0)  maxLeft = nums1[i-1];
                else {
                    maxLeft = Math.max(nums1[i-1],nums2[j-1]);
                }
                if ( (m + n) % 2 == 1 ) { return maxLeft; }

                if(i == m) minRight = nums2[j];
                else if(j == n) minRight = nums1[i];
                else minRight = Math.min(nums1[i],nums2[j]);

                return (maxLeft+minRight)/2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays_binary_recc(new int[]{1,2},new int[]{3,4}));
    }
}
