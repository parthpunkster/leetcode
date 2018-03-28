package q88_mergesortedarray;
import punksterutils.ArrayUtilities;

public class Main {

    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i >=0 && j >=0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--]:nums2[j--];
        }
        while (j>=0){
            nums1[k--] = nums2[j--];
        }

    }

    public static void main(String[] args){
        int[] a = new int[1];
        int[] b = new int[]{1};
        merge(a,0,b,b.length);
        ArrayUtilities.printArray(a);
    }
}
